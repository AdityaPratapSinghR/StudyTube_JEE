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

import org.w3c.dom.Text;

public class UnacademyFrag extends Fragment {
    Context context;
    private static final String ARG_COUNT = "param1";
    private Integer counter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        //show life-cycle event in LogCat console...
        context = getActivity().getApplicationContext();
        View thisScreensView = inflater.inflate(R.layout.fragment_unacademy, container, false);
         //Physics Class 11
        Button physics11 = thisScreensView.findViewById(R.id.Physics11Un);
        physics11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             Intent intent = new Intent(getActivity(),ChapterActivity.class);
             intent.putExtra("CLASS",02.1101);
             startActivity(intent);
            }
        });
        //Class 11 Chemistry
        Button chemistry11 = thisScreensView.findViewById(R.id.Chemistry11Un);
        chemistry11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),ChapterActivity.class);
                intent.putExtra("CLASS",02.1102);
                startActivity(intent);
            }
        });
        //Class 11 Maths
        Button maths11 = thisScreensView.findViewById(R.id.Maths11Un);
        maths11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),ChapterActivity.class);
                intent.putExtra("CLASS",02.1103);
                startActivity(intent);
            }
        });
        //Class 12 Physics
        Button physics12 = thisScreensView.findViewById(R.id.Physics12Un);
        physics12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),ChapterActivity.class);
                intent.putExtra("CLASS",02.1201);
                startActivity(intent);
            }
        });
        //Class 12 Chemistry
        Button chemistry12 = thisScreensView.findViewById(R.id.Chemistry12Un);
        chemistry12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),ChapterActivity.class);
                intent.putExtra("CLASS",02.1202);
                startActivity(intent);
            }
        });
        //Class 12 Maths
        Button maths12 = thisScreensView.findViewById(R.id.Maths12Un);
        maths12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),ChapterActivity.class);
                intent.putExtra("CLASS",02.1203);
                startActivity(intent);
            }
        });

        //Unacademy Playlist Search
        Button searchPlaylist = thisScreensView.findViewById(R.id.unacademy_playlist_search);
        searchPlaylist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, PlaylistActivity.class);
                intent.putExtra("CHANNEL_ID","UCZNNx4KYmCkwxCLdsHyWqQA");
                startActivity(intent);
            }
        });
        //Unacademy Jee Live Website2
       TextView unacadWeb2 = thisScreensView.findViewById(R.id.Unacademy_Website2);
        unacadWeb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://docs.google.com/spreadsheets/d/e/2PACX-1vQUwyeyCbReMBmABf-Q-XqG40oB5KrDQoUlLMpDZhBu18YasgWI72pAyH4beYolw95ylxQJdPqSWcig/pubhtml";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        //Unacademy Jee Youtube
        TextView unacadYoutube = thisScreensView.findViewById(R.id.Unacademy_Youtube);
        unacadYoutube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.youtube.com/channel/UCZNNx4KYmCkwxCLdsHyWqQA";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        //Unacademy Jee Website
        TextView unacadWeb1 = thisScreensView.findViewById(R.id.Unacademy_Website);
        unacadWeb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://unacademy.com";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        //Unacademy Jee App
        TextView unacadApp = thisScreensView.findViewById(R.id.Unacademy_App);
        unacadApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://play.google.com/store/apps/details?id=com.unacademyapp&hl=en_IN&gl=US";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        return thisScreensView;
  }
}

