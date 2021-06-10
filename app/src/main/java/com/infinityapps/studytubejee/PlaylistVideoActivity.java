package com.infinityapps.studytubejee;

import android.app.ProgressDialog;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.infinityapps.studytubejee.Playlist.Videos;
import com.infinityapps.studytubejee.Playlist.video_recycler_adapter;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class PlaylistVideoActivity extends AppCompatActivity {
    List<Videos> displaylistArray = new ArrayList<Videos>();
    private RecyclerView mVideoRecyclerView;
    private video_recycler_adapter mVideoAdapter;
    private String playlist_id;
    private String browserKey;
    String loadMsg;
    String loadTitle;
    String nextPageToken;
    String thumbUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist_video);

        int cornerRadius = 20;
        int cardColor = Color.parseColor("#FFFFFFFF");
        int recyclerColor = Color.parseColor("#FFFFFFFF");
        browserKey = "AIzaSyBURViMCgdBTr5FMB2yNOgNxv-4sM3V238";
        int videoTxtColor = Color.parseColor("#000000");

        playlist_id = getIntent().getStringExtra("PLAYLISTID");
        loadTitle = "Loading...";
        loadMsg = "Loading your videos...";
        browserKey = "AIzaSyBURViMCgdBTr5FMB2yNOgNxv-4sM3V238";


        mVideoRecyclerView = (RecyclerView) findViewById(R.id.Playlist);
        mVideoRecyclerView.setBackgroundColor(recyclerColor);
        mVideoRecyclerView.setLayoutManager(new LinearLayoutManager(PlaylistVideoActivity.this));
        mVideoAdapter = new video_recycler_adapter(displaylistArray, browserKey, PlaylistVideoActivity.this, cornerRadius,cardColor, videoTxtColor);
        mVideoRecyclerView.setAdapter(mVideoAdapter);

        new TheTask().execute();

        mVideoAdapter.notifyDataSetChanged();


        String url = "https://youtube.googleapis.com/youtube/v3/playlists?part=snippet%2CcontentDetails&channelId=UCiGyWN6DEbnj2alu7iapuKQ&key=AIzaSyBURViMCgdBTr5FMB2yNOgNxv-4sM3V238";
    }

    private class TheTask extends AsyncTask<Void,Void,Void>
    {

        Videos displaylist;
        private ProgressDialog dialog;
        @Override
        protected void onPreExecute() {
            // TODO Auto-generated method stub
            super.onPreExecute();
            dialog = new ProgressDialog(PlaylistVideoActivity.this);
            dialog.setTitle("Please Wait");
            dialog.setMessage("Loading Video....");
            dialog.show();
        }
    @Override
    protected Void doInBackground(Void... params) {
        // TODO Auto-generated method stub

        try {
            nextPageToken = "";
            String Url2 = "https://www.googleapis.com/youtube/v3/playlistItems?part=snippet&playlistId=" + playlist_id+ "&key=" + browserKey + "&maxResults=50";
            String Response1 = getUrlString(Url2);
          //  Log.d("This is url",Url2);

            JSONObject Json1 = new JSONObject(Response1.toString());

            String jsonResult = Json1.getJSONObject("pageInfo").getString("totalResults");
            int totalResultInt = Integer.parseInt(jsonResult);

            for (int k=0;k<(totalResultInt+50)/50;k++){

            String url = "https://www.googleapis.com/youtube/v3/playlistItems?part=snippet&playlistId=" + playlist_id+ "&key=" + browserKey + "&maxResults=50"+"&pageToken="+nextPageToken;

            String response = getUrlString(url);

            JSONObject json = new JSONObject(response.toString());

            JSONArray jsonArray = json.getJSONArray("items");

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);

                JSONObject video = jsonObject.getJSONObject("snippet").getJSONObject("resourceId");
                String title = jsonObject.getJSONObject("snippet").getString("title");

                String id = video.getString("videoId");

                try{
                    thumbUrl = jsonObject.getJSONObject("snippet").getJSONObject("thumbnails").getJSONObject("default").getString("url");
                }catch(JSONException e){
                    e.printStackTrace();
                }
                //String thumbUrl = jsonObject.getJSONObject("snippet").getJSONObject("thumbnails").getJSONObject("default").getString("url");

                displaylist = new Videos(title, thumbUrl ,id);
                displaylistArray.add(displaylist);
            }
                try {
                    nextPageToken = json.getString("nextPageToken");
                }catch (JSONException e){
                    e.printStackTrace();
                }
           // String url = "https://youtube.googleapis.com/youtube/v3/playlists?part=snippet%2CcontentDetails&channelId=UCiGyWN6DEbnj2alu7iapuKQ&key=AIzaSyBURViMCgdBTr5FMB2yNOgNxv-4sM3V238&maxResults=50";

          /*  String url = "https://www.googleapis.com/youtube/v3/playlistItems?part=snippet&playlistId=" + playlist_id + "&key=" + browserKey + "&maxResults=50";

            String response = getUrlString(url);

            JSONObject json = new JSONObject(response.toString());

            JSONArray jsonArray = json.getJSONArray("items");
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);

               // JSONObject video = jsonObject.getJSONObject("snippet").getJSONObject("contentDetails");
                String title = jsonObject.getJSONObject("snippet").getString("title");
                String id = video.getString("itemCount");
                String thumbUrl = jsonObject.getJSONObject("snippet").getJSONObject("thumbnails").getJSONObject("default").getString("url");
                displaylist = new Videos(title, thumbUrl ,id);
                displaylistArray.add(displaylist);*/
            }
        }catch(IOException | JSONException e){
                e.printStackTrace();
            }
          return null;
        }
    @Override
    protected void onPostExecute(Void result) {
        // TODO Auto-generated method stub
        super.onPostExecute(result);

        mVideoAdapter.notifyDataSetChanged();

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