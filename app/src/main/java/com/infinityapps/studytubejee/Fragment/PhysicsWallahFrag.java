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

public class PhysicsWallahFrag extends Fragment {
    Context context;
    private static final String ARG_COUNT = "param1";
    private Integer counter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        //show life-cycle event in LogCat console...
        context = getActivity().getApplicationContext();
        View thisScreensView = inflater.inflate(R.layout.fragment_physicswallah, container, false);

        String physicsWallahId = "01.";

        //Class 11 Physics
        Button class11p = thisScreensView.findViewById(R.id.Physics11PW);
        class11p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),ChapterActivity.class);
                intent.putExtra("CLASS",01.1101);
                startActivity(intent);
            }
        });

        //Class 11 Chemistry
        Button class11c = thisScreensView.findViewById(R.id.Chemistry11PW);
        class11c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),ChapterActivity.class);
                intent.putExtra("CLASS",01.1102);
                startActivity(intent);
            }
        });

        //Class 11 Maths Pace
        Button class11m = thisScreensView.findViewById(R.id.Maths11_PacePW);
        class11m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),ChapterActivity.class);
                intent.putExtra("CLASS",01.1103);
                startActivity(intent);
            }
        });

        //Class 11 Physics Pace
        Button class11pacePhy = thisScreensView.findViewById(R.id.Physics11_PacePW);
        class11pacePhy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),ChapterActivity.class);
                intent.putExtra("CLASS",01.1104);
                startActivity(intent);
            }
        });

        //Class 11 Chemistry Pace
        Button class11paceChem = thisScreensView.findViewById(R.id.Chemistry11_PacePW);
        class11paceChem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),ChapterActivity.class);
                intent.putExtra("CLASS",01.1105);
                startActivity(intent);
            }
        });

        //Class 12 Physics
        Button class12p = thisScreensView.findViewById(R.id.Physics12PW);
        class12p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),ChapterActivity.class);
                intent.putExtra("CLASS",01.1201);
                startActivity(intent);
            }
        });
        //Class 12 Chemistry
        Button class12c = thisScreensView.findViewById(R.id.Chemistry12PW);
        class12c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),ChapterActivity.class);
                intent.putExtra("CLASS",01.1202);
                startActivity(intent);
            }
        });
        //PhysicsWallah Playlist Search
        Button searchPlaylist = thisScreensView.findViewById(R.id.physicsWallah_playlist_search);
        searchPlaylist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, PlaylistActivity.class);
                intent.putExtra("CHANNEL_ID","UCiGyWN6DEbnj2alu7iapuKQ");
                startActivity(intent);
            }
        });

        //Physics Wallah Youtube
        TextView youtubeLinkPW = thisScreensView.findViewById(R.id.PhysicsWallah_Youtube);
        youtubeLinkPW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.youtube.com/channel/UCiGyWN6DEbnj2alu7iapuKQ";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        //Physics Wallah Website
        TextView websiteLinkPW = thisScreensView.findViewById(R.id.PhysicsWallah_Website);
        websiteLinkPW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.physicswallahalakhpandey.com/";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        //Physics Wallah Website2
        TextView websiteLink2PW = thisScreensView.findViewById(R.id.PhysicsWallah_Website2);
        websiteLink2PW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.physicswallah.live/";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        //Physics Wallah App
        TextView appLinkPW = thisScreensView.findViewById(R.id.PhysicsWallah_App);
        appLinkPW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://play.google.com/store/apps/details?id=xyz.penpencil.physicswala&hl=en_IN&gl=US";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        return thisScreensView;
    }

}
