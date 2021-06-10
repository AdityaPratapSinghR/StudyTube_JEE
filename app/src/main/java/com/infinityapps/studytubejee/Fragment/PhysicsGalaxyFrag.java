package com.infinityapps.studytubejee.Fragment;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.infinityapps.studytubejee.ChapterHandler.ChapterActivity;
import com.infinityapps.studytubejee.PlaylistActivity;
import com.infinityapps.studytubejee.R;

public class PhysicsGalaxyFrag extends Fragment {
    Context context;
    private static final String ARG_COUNT = "param1";
    private Integer counter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        //show life-cycle event in LogCat console...
        context = getActivity().getApplicationContext();
        View thisScreensView = inflater.inflate(R.layout.fragment_physics_galaxy, container, false);
        //Physics Class 11
        Button physics11 = thisScreensView.findViewById(R.id.Physics11PG);
        physics11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),ChapterActivity.class);
                intent.putExtra("CLASS",04.1101);
                startActivity(intent);
            }
        });
        //Class 11 Physics Adv
        Button maths11 = thisScreensView.findViewById(R.id.Physics11PG_Adv);
        maths11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),ChapterActivity.class);
                intent.putExtra("CLASS",04.1103);
                startActivity(intent);
            }
        });
        //Class 12 Physics
        Button physics12 = thisScreensView.findViewById(R.id.Physics12PG);
        physics12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),ChapterActivity.class);
                intent.putExtra("CLASS",04.1201);
                startActivity(intent);
            }
        });

        //Class 12 Physics Adv
        Button maths12 = thisScreensView.findViewById(R.id.Physics12PG_Adv);
        maths12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),ChapterActivity.class);
                intent.putExtra("CLASS",04.1203);
                startActivity(intent);
            }
        });
        //Physics Galaxy Playlist Search
        Button searchPlaylist = thisScreensView.findViewById(R.id.physicsgalaxy_playlist_search);
        searchPlaylist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, PlaylistActivity.class);
                intent.putExtra("CHANNEL_ID","UCgBmfNILAlXmGv3CsJ8oFJA");
                startActivity(intent);
            }
        });

        //Physics Galaxy Youtube
        TextView youtubeLinkPW = thisScreensView.findViewById(R.id.PhysicsGalaxy_Youtube);
        youtubeLinkPW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.youtube.com/channel/UCgBmfNILAlXmGv3CsJ8oFJA";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        //Physics Galaxy Website
        TextView websiteLinkPW = thisScreensView.findViewById(R.id.PhysicsGalaxy_Website);
        websiteLinkPW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.physicsgalaxy.com/home";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        //Physics Galaxy Website2
       /* TextView websiteLink2PW = thisScreensView.findViewById(R.id.PhysicsWallah_Website2);
        websiteLink2PW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.physicswallah.live/";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });*/
        //Physics Galaxy App
        TextView appLinkPW = thisScreensView.findViewById(R.id.PhysicsGalaxy_App);
        appLinkPW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://play.google.com/store/apps/details?id=com.physicsgalaxy.www&hl=en_IN&gl=US";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        return thisScreensView;
    }
}
