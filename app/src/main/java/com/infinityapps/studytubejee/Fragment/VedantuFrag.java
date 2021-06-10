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
import com.infinityapps.studytubejee.PlaylistVideoActivity;
import com.infinityapps.studytubejee.R;

public class VedantuFrag extends Fragment {
    Context context;
    private static final String ARG_COUNT = "param1";
    private Integer counter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        //show life-cycle event in LogCat console...
        context = getActivity().getApplicationContext();
        View thisScreensView = inflater.inflate(R.layout.fragment_vedantu, container, false);
        //Physics Class 11
        Button physics11 = thisScreensView.findViewById(R.id.Physics11Ved);
        physics11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), PlaylistVideoActivity.class);
                intent.putExtra("PLAYLISTID","PLCtUyOrCJbxx_AQfr0QK38kBFE3GVWXXu");
                startActivity(intent);
            }
        });
        //Class 11 Chemistry
        Button chemistry11 = thisScreensView.findViewById(R.id.Chemistry11Ved);
        chemistry11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),PlaylistVideoActivity.class);
                intent.putExtra("PLAYLISTID","PLCtUyOrCJbxyU8mDYt3jmTTLMQrMM7ECb");
                startActivity(intent);
            }
        });
        //Class 11 Maths
        Button maths11 = thisScreensView.findViewById(R.id.Maths11Ved);
        maths11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),PlaylistVideoActivity.class);
                intent.putExtra("PLAYLISTID","PLCtUyOrCJbxz9xheItUyFC0s3Mcuh35RQ");
                startActivity(intent);
            }
        });
        //Class 12 Physics
        Button physics12 = thisScreensView.findViewById(R.id.Physics12Ved);
        physics12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),PlaylistVideoActivity.class);
                intent.putExtra("PLAYLISTID","PLCtUyOrCJbxwNqOsLAmZW1X1EcW4h_X6f");
                startActivity(intent);
            }
        });
        //Class 12 Chemistry
        Button chemistry12 = thisScreensView.findViewById(R.id.Chemistry12Ved);
        chemistry12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), PlaylistVideoActivity.class);
                intent.putExtra("PLAYLISTID","PLCtUyOrCJbxyx5ay0Zfh8UgdCzitoP-IL");
                startActivity(intent);
            }
        });
        //Class 12 Maths
        Button maths12 = thisScreensView.findViewById(R.id.Maths12Ved);
        maths12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),PlaylistVideoActivity.class);
                intent.putExtra("PLAYLISTID","PLCtUyOrCJbxw_AY9bMltLTQzb6R2Tk8yP");
                startActivity(intent);
            }
        });

        //PhysicsWallah Playlist Search
        Button searchPlaylist = thisScreensView.findViewById(R.id.vedantu_playlist_search);
        searchPlaylist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, PlaylistActivity.class);
                intent.putExtra("CHANNEL_ID","UClaQJq84XMtMkL44zDmL-Tg");
                startActivity(intent);
            }
        });

        //Physics Wallah Youtube
        TextView youtubeLinkPW = thisScreensView.findViewById(R.id.Vedantu_Youtube);
        youtubeLinkPW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.youtube.com/channel/UClaQJq84XMtMkL44zDmL-Tg";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        //Vedantu Website
        TextView websiteLinkPW = thisScreensView.findViewById(R.id.Vedantu_Website);
        websiteLinkPW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.vedantu.com/";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        // Vedantu App
        TextView appLinkPW = thisScreensView.findViewById(R.id.Vedantu_App);
        appLinkPW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://play.google.com/store/apps/details?id=com.vedantu.app&hl=en_IN&gl=US";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        return thisScreensView;
    }
}
