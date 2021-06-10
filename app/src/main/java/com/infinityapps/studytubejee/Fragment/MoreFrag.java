package com.infinityapps.studytubejee.Fragment;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.youtube.player.internal.r;
import com.infinityapps.studytubejee.Adapter.PlaylistAdapter;
import com.infinityapps.studytubejee.Adapter.PlaylistItemAdapter;
import com.infinityapps.studytubejee.ChapterHandler.ChapterActivity;
import com.infinityapps.studytubejee.ChapterHandler.ChapterAdapter;
import com.infinityapps.studytubejee.ChapterHandler.ChapterListAdapterData;
import com.infinityapps.studytubejee.MainActivity;
import com.infinityapps.studytubejee.MoreFragRecycler.MoreFragAdapter;
import com.infinityapps.studytubejee.MoreFragRecycler.MoreFragItem;
import com.infinityapps.studytubejee.R;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoreFrag extends Fragment {
    Context context;
    MoreFragAdapter MyAdapter;
    ArrayList<MoreFragItem> moreFragItems;
   // String channelUrl; //"https://www.googleapis.com/youtube/v3/channels?part=snippet&id=SWMb9NxQL9I6c&key=AIzaSyBURViMCgdBTr5FMB2yNOgNxv-4sM3V238";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //show life-cycle event in LogCat console...
        context = getActivity().getApplicationContext();
        View thisScreensView = inflater.inflate(R.layout.fragment_more, container, false);

        // below line we are creating a new array list
        moreFragItems = new ArrayList<>();

        // below line is to add data to our array list.
       // moreFragItems.add(new MoreFragItem("https://yt3.ggpht.com/ytc/AAUvwngsH6uw4qYGIePuSBHf_hE5KKWabU3vRE9Q8Qw6tw=s176-c-k-c0x00ffffff-no-rj", "Physics Wallah","UCiGyWN6DEbnj2alu7iapuKQ"));
       // moreFragItems.add(new MoreFragItem("", "Learnohub","ExamFearVideos"));
        moreFragItems.add(new MoreFragItem("https://yt3.ggpht.com/ytc/AAUvwng4SPqkSChe07eJdcMLg-hsLDEWVmEPhRzL1jIyQg=s176-c-k-c0x00ffffff-no-rj", "LearnoHub","UCEg3PHVR0vt3azbs_Qk_6cw","https://www.examfear.com/","https://play.google.com/store/apps/details?id=com.examfear.app&hl=en_IN&gl=US"));
        moreFragItems.add(new MoreFragItem("https://yt3.ggpht.com/ytc/AAUvwngyXJ8Lcxbt4m55sAiiXH1GGeBIIh9BQ3Mqx760Jw=s176-c-k-c0x00ffffff-no-rj", "CrashUp","UCzU720DtlTk77Ux-FUf_Tmw","https://www.notion.so/7e34669b762b4978961ae6a7680c4623?v=0c9a2472e7d14d0fb49e187028aafac5","none"));
        moreFragItems.add(new MoreFragItem("https://yt3.ggpht.com/ytc/AAUvwni7rZd-GiE5zYfoOpwK_Tfafk1od20mi_pnrhJpwic=s176-c-k-c0x00ffffff-no-rj","Pankaj Sir Chemistry","UCMMlYN-EhNrt0eoEDUK0bdg","none","none"));
        moreFragItems.add(new MoreFragItem("https://yt3.ggpht.com/ytc/AAUvwnhQUzYe5PHnWiReKuA-g4aUelh3aWk93gmjmcfMwA=s176-c-k-c0x00ffffff-no-rj", "Mohit Tyagi","UCpyc1eTpM1cA3P0ZWym4clw","https://www.competishun.com/landing-page","https://play.google.com/store/apps/details?id=xyz.penpencil.competishun"));
        moreFragItems.add(new MoreFragItem("https://yt3.ggpht.com/ytc/AAUvwnja-HE-lErBOzBQ5FQD0AbuwguNFiPZgZLIZjruBw=s176-c-k-c0x00ffffff-no-rj", "Neha Aggarwal Mathematics","UCfSUSGxsZBBE3o8bCQpqYgw","none","none"));
        moreFragItems.add(new MoreFragItem("https://yt3.ggpht.com/-NJhWVwg4Nd08KygQz24NQxojkTFSSc-NjQF5hveE09DJ7Nw4nMnM-ny-nQXk9kv5qXDUxjjpA=s176-c-k-c0x00ffffff-no-rj-mo","JEE Wallah","UCVJU_IChPMOe8RWkdVQjtfQ","https://physicswallahalakhpandey.com/","https://play.google.com/store/apps/details?id=xyz.penpencil.physicswala"));
      /*  moreFragItems.add(new MoreFragItem("", "game",""));
        moreFragItems.add(new MoreFragItem("", "hshkddh",""));
        moreFragItems.add(new MoreFragItem("", "DSA Self Paced Course",""));*/

        // initializing our adapter class.
        MyAdapter = new MoreFragAdapter(moreFragItems, context);

        RecyclerView recyclerView = thisScreensView.findViewById(R.id.Channel_recycler);

        // adding layout manager to our recycler view.
        LinearLayoutManager manager = new LinearLayoutManager(context);
        recyclerView.setHasFixedSize(true);

        // setting layout manager
        // to our recycler view.
        recyclerView.setLayoutManager(manager);

        // setting adapter to
        // our recycler view.
        recyclerView.setAdapter(MyAdapter);



       // channelUrl = "https://www.googleapis.com/youtube/v3/channels?part=snippet&id="+moreFragItems.get(0)/*SWMb9NxQL9I6c*/+"&key=AIzaSyBURViMCgdBTr5FMB2yNOgNxv-4sM3V238";


        /* MoreFragItem[] myListData = new MoreFragItem[]{
                new MoreFragItem(R.drawable.ic_launcher_background,"Hello",""),
                 new MoreFragItem(R.drawable.ic_launcher_background,"NEET",""),
                 new MoreFragItem(R.drawable.ic_launcher_background,"jee",""),
                 new MoreFragItem(R.drawable.ic_launcher_background,"welo",""),
                 new MoreFragItem(R.drawable.ic_launcher_background,"hola",""),
                 new MoreFragItem(R.drawable.ic_launcher_background,"welcome",""),
                 new MoreFragItem(R.drawable.ic_launcher_background,"lix",""),
                 new MoreFragItem(R.drawable.ic_launcher_background,"kisj",""),
                 new MoreFragItem(R.drawable.ic_launcher_background,"ldks",""),
        };
        RecyclerView recyclerView = (RecyclerView) thisScreensView.findViewById(R.id.Channel_recycler);
        MyAdapter= new MoreFragAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setAdapter(MyAdapter);*/

        EditText editText = thisScreensView.findViewById(R.id.search_channel);

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                // TODO Auto-generated method stub
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                // TODO Auto-generated method stub
            }

            @Override
            public void afterTextChanged(Editable s) {

                // filter your list from your input
                //filter(s.toString());
                filter(s.toString());
               // return false;
                //you can use runnable postDelayed like 500 ms to delay search text
            }
        });
        return thisScreensView;
    }
    private void filter(String text) {
        // creating a new array list to filter our data.
        ArrayList<MoreFragItem> filteredlist = new ArrayList<>();

        // running a for loop to compare elements.
        for (MoreFragItem item : moreFragItems) {
            // checking if the entered string matched with any item of our recycler view.
            if (item.getChannelName().toLowerCase().contains(text.toLowerCase())) {
                // if the item is matched we are
                // adding it to our filtered list.
                filteredlist.add(item);
            }
        }
        if (filteredlist.isEmpty()) {
            // if no item is added in filtered list we are
            // displaying a toast message as no data found.
            Toast.makeText(context, "No Data Found..", Toast.LENGTH_SHORT).show();
        } else {
            // at last we are passing that filtered
            // list to our adapter class.
            MyAdapter.filterList(filteredlist);
        }
    }
}
