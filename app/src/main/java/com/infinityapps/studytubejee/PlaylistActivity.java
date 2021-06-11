package com.infinityapps.studytubejee;

import android.app.ProgressDialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.JsonArray;
import com.infinityapps.studytubejee.Adapter.PlaylistAdapter;
import com.infinityapps.studytubejee.Adapter.PlaylistItemAdapter;
import com.infinityapps.studytubejee.Playlist.Videos;
import com.infinityapps.studytubejee.Playlist.video_recycler_adapter;

import org.imaginativeworld.oopsnointernet.callbacks.ConnectionCallback;
import org.imaginativeworld.oopsnointernet.dialogs.signal.DialogPropertiesSignal;
import org.imaginativeworld.oopsnointernet.dialogs.signal.NoInternetDialogSignal;
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

public class PlaylistActivity extends AppCompatActivity {

    List<PlaylistItemAdapter> displaylistArray = new ArrayList<PlaylistItemAdapter>();
    private RecyclerView mVideoRecyclerView;
    private PlaylistAdapter mPlaylistAdapter;
  //  private List<PlaylistItemAdapter> playList;
    private String channel_id;
    private String browserKey;
    String loadMsg;
    String loadTitle;
    String nextPageToken;
    String Url;
    String thumbUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        int cornerRadius = 20;
        int cardColor = Color.parseColor("#FFFFFFFF");
        int recyclerColor = Color.parseColor("#FFFFFFFF");
        browserKey = "AIzaSyBURViMCgdBTr5FMB2yNOgNxv-4sM3V238";
        int videoTxtColor = Color.parseColor("#000000");

        channel_id = getIntent().getStringExtra("CHANNEL_ID");
        loadTitle = "Loading...";
        loadMsg = "Loading your videos...";
        browserKey = "AIzaSyBURViMCgdBTr5FMB2yNOgNxv-4sM3V238";


        mVideoRecyclerView = (RecyclerView) findViewById(R.id.Playlist_Recycler);
        mVideoRecyclerView.setBackgroundColor(recyclerColor);
        mVideoRecyclerView.setLayoutManager(new LinearLayoutManager(PlaylistActivity.this));
        mPlaylistAdapter = new PlaylistAdapter(displaylistArray, browserKey, PlaylistActivity.this, cornerRadius,cardColor, videoTxtColor);
        mVideoRecyclerView.setAdapter(mPlaylistAdapter);

        new PlaylistActivity.TheTask().execute();

        mPlaylistAdapter.notifyDataSetChanged();

        // No Internet Dialog: Signal
        NoInternetDialogSignal.Builder builder = new NoInternetDialogSignal.Builder(
                this,
                getLifecycle()
        );

        DialogPropertiesSignal properties = builder.getDialogProperties();

        properties.setConnectionCallback(new ConnectionCallback() { // Optional
            @Override
            public void hasActiveConnection(boolean hasActiveConnection) {
                // ...
            }
        });

        properties.setCancelable(false); // Optional
        properties.setNoInternetConnectionTitle("No Internet"); // Optional
        properties.setNoInternetConnectionMessage("Check your Internet connection and try again"); // Optional
        properties.setShowInternetOnButtons(true); // Optional
        properties.setPleaseTurnOnText("Please turn on"); // Optional
        properties.setWifiOnButtonText("Wifi"); // Optional
        properties.setMobileDataOnButtonText("Mobile data"); // Optional

        properties.setOnAirplaneModeTitle("No Internet"); // Optional
        properties.setOnAirplaneModeMessage("You have turned on the airplane mode."); // Optional
        properties.setPleaseTurnOffText("Please turn off"); // Optional
        properties.setAirplaneModeOffButtonText("Airplane mode"); // Optional
        properties.setShowAirplaneModeOffButtons(true); // Optional

        builder.build();



        // String url = "https://youtube.googleapis.com/youtube/v3/playlists?part=snippet%2CcontentDetails&channelId=UCiGyWN6DEbnj2alu7iapuKQ&key=AIzaSyBURViMCgdBTr5FMB2yNOgNxv-4sM3V238"+"&nextPageToken=CDIQAA";
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // below line is to get our inflater
        MenuInflater inflater = getMenuInflater();

        // inside inflater we are inflating our menu file.
        inflater.inflate(R.menu.search_menu, menu);

        // below line is to get our menu item.
        MenuItem searchItem = menu.findItem(R.id.actionSearch);

        // getting search view of our item.
        SearchView searchView = (SearchView) searchItem.getActionView();

        // below line is to call set on query text listener method.
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                // inside on query text change method we are
                // calling a method to filter our recycler view.
                filter(newText);
                return false;
            }
        });
        return true;
    }

    private void filter(String text) {
        // creating a new array list to filter our data.
        ArrayList<PlaylistItemAdapter> filteredlist = new ArrayList<>();

        // running a for loop to compare elements.
        for (PlaylistItemAdapter item : displaylistArray) {
            // checking if the entered string matched with any item of our recycler view.
            if (item.getTitle().toLowerCase().contains(text.toLowerCase())) {
                // if the item is matched we are
                // adding it to our filtered list.
                filteredlist.add(item);
            }
        }
        if (filteredlist.isEmpty()) {
            // if no item is added in filtered list we are
            // displaying a toast message as no data found.
            Toast.makeText(this, "No Data Found..", Toast.LENGTH_SHORT).show();
        } else {
            // at last we are passing that filtered
            // list to our adapter class.
            mPlaylistAdapter.filterList(filteredlist);
        }
    }






    private class TheTask extends AsyncTask<Void,Void,Void>
    {

        PlaylistItemAdapter displaylist;
        private ProgressDialog dialog;
        @Override
        protected void onPreExecute() {
            // TODO Auto-generated method stub
            super.onPreExecute();
            dialog = new ProgressDialog(PlaylistActivity.this);
            dialog.setTitle("Please Wait");
            dialog.setMessage("Loading Playlists.....");
            dialog.show();
        }
        @Override
        protected Void doInBackground(Void... params) {
            // TODO Auto-generated method stub
            try {
                nextPageToken ="";

               String Url2 = "https://youtube.googleapis.com/youtube/v3/playlists?part=snippet%2CcontentDetails&channelId="+channel_id+"&key=AIzaSyBURViMCgdBTr5FMB2yNOgNxv-4sM3V238&maxResults=50";
                String Response1 = getUrlString(Url2);
                Log.d("This is url",Url2);

                JSONObject Json1 = new JSONObject(Response1.toString());

                String jsonResult = Json1.getJSONObject("pageInfo").getString("totalResults");
                int totalResultInt = Integer.parseInt(jsonResult);

                for (int k=0;k<(totalResultInt+50)/50;k++){
                    Url = "https://youtube.googleapis.com/youtube/v3/playlists?part=snippet%2CcontentDetails&channelId="+channel_id+"&key=AIzaSyBURViMCgdBTr5FMB2yNOgNxv-4sM3V238&maxResults=50"+"&pageToken="+nextPageToken;
                    String Response = getUrlString(Url);
                  //  Log.d("This is url",Url);

                    JSONObject Json = new JSONObject(Response.toString());

                    JSONArray jsonArray = Json.getJSONArray("items");

                    for (int i = 0; i < jsonArray.length(); i++) {
                        JSONObject jsonObject = jsonArray.getJSONObject(i);
                        String title = jsonObject.getJSONObject("snippet").getString("title");
                        String playListId = jsonObject.getString("id");
                        try {
                            thumbUrl = jsonObject.getJSONObject("snippet").getJSONObject("thumbnails").getJSONObject("default").getString("url");
                        }catch (JSONException e){
                            e.printStackTrace();
                        }
                       // String thumbUrl = jsonObject.getJSONObject("snippet").getJSONObject("thumbnails").getJSONObject("default").getString("url");
                        displaylist = new PlaylistItemAdapter(title, thumbUrl,playListId);
                        displaylistArray.add(displaylist);
                       // Log.d("List Size ", String.valueOf(displaylistArray.size()));
                    }
                    //next PageToken error handling
                    try {
                        nextPageToken = Json.getString("nextPageToken");
                    }catch (JSONException e){
                        e.printStackTrace();
                    }
                }
            }
            catch(IOException | JSONException e){
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void result) {
            // TODO Auto-generated method stub
            super.onPostExecute(result);

            mPlaylistAdapter.notifyDataSetChanged();

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

