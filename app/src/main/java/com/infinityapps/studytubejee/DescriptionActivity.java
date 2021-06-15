package com.infinityapps.studytubejee;

import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.infinityapps.studytubejee.Playlist.Videos;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class DescriptionActivity extends AppCompatActivity {
    String videoId;
    String browserKey;
    String descriptionText;
    String  title;
    TextView descText;
    TextView titleText;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        new DescriptionActivity.TheTask().execute();
        browserKey = "AIzaSyBURViMCgdBTr5FMB2yNOgNxv-4sM3V238";

        videoId = getIntent().getStringExtra("DESC");
        Toast.makeText(this, videoId, Toast.LENGTH_SHORT).show();


        descText = findViewById(R.id.description_text);
        titleText = findViewById(R.id.title_text);


        //Like Button
        Button likeBtn = findViewById(R.id.like_button);
        likeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.youtube.com/video/"+videoId;
                Intent i = new Intent(Intent.ACTION_VIEW);
                //i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        //Dislike Button
        Button dislikeBtn = findViewById(R.id.dislike_button);
        dislikeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.youtube.com/video/"+videoId;
                Intent i = new Intent(Intent.ACTION_VIEW);
                //i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        //Comment Button
        Button commentBtn = findViewById(R.id.comment_button);
        commentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.youtube.com/video/"+videoId;
                Intent i = new Intent(Intent.ACTION_VIEW);
                //i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        //Share Button
        Button shareBtn = findViewById(R.id.share_button);
        shareBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.youtube.com/video/"+videoId;
                Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
               // String shareBody = "Here is the share content body";
               // sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Share);
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, url);
                startActivity(Intent.createChooser(sharingIntent, "Share via"));
            }
        });

    }
    private class TheTask extends AsyncTask<Void,Void,Void>
    {

        private ProgressDialog dialog;
        @Override
        protected void onPreExecute() {
            // TODO Auto-generated method stub
            super.onPreExecute();
            dialog = new ProgressDialog(DescriptionActivity.this);
            dialog.setTitle("Please Wait");
            dialog.setMessage("Loading Video....");
            dialog.setCanceledOnTouchOutside(false);
            dialog.show();
        }
        @Override
        protected Void doInBackground(Void... params) {
            // TODO Auto-generated method stub

            try {

                   // String url = "https://www.googleapis.com/youtube/v3/playlistItems?part=snippet&videoId=" +videoId+ "&key=" + browserKey ;

                String url ="https://www.googleapis.com/youtube/v3/videos?part=snippet&id="+videoId+"&key="+browserKey;
                    String response = getUrlString(url);

                    JSONObject json = new JSONObject(response.toString());

                    JSONArray jsonArray = json.getJSONArray("items");
                for (int i = 0; i < jsonArray.length(); i++) {
                    JSONObject jsonObject = jsonArray.getJSONObject(i);
                    Log.d("Results for API", String.valueOf(jsonObject));

                    title = jsonObject.getJSONObject("snippet").getString("title");
                    descriptionText = jsonObject.getJSONObject("snippet").getString("description");
               }

               // JSONObject video = jsonObject.getJSONObject("snippet").getJSONObject("resourceId");
                //String title = jsonObject.getJSONObject("snippet").getString("title");


            }catch(IOException | JSONException e){
                e.printStackTrace();
            }
            return null;
        }
        @Override
        protected void onPostExecute(Void result) {
            // TODO Auto-generated method stub
            super.onPostExecute(result);


            descText.setText(descriptionText);
            titleText.setText(title);

          //  mVideoAdapter.notifyDataSetChanged();

            if (dialog.isShowing()) {
                dialog.dismiss();
            }

        }

        private byte[] getUrlBytes(String urlSpec) throws IOException {
            URL url = new URL(urlSpec);
            HttpURLConnection connection = (HttpURLConnection)url.openConnection();
            try {
                ByteArrayOutputStream out = new ByteArrayOutputStream();
                InputStream in = connection.getInputStream();
                if (connection.getResponseCode() != HttpURLConnection.HTTP_OK) {
                    throw new IOException(connection.getResponseMessage() +
                            ": with " +
                            urlSpec);
                }
                int bytesRead = 0;
                byte[] buffer = new byte[1024];
                while ((bytesRead = in.read(buffer)) > 0) {
                    out.write(buffer, 0, bytesRead);
                }
                out.close();
                return out.toByteArray();
            } finally {
                connection.disconnect();
            }
        }
        private String getUrlString(String urlSpec) throws IOException {
            return new String(getUrlBytes(urlSpec));
        }
    }
}
