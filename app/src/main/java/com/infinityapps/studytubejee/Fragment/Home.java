package com.infinityapps.studytubejee.Fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.infinityapps.studytubejee.PlaylistActivity;
import com.infinityapps.studytubejee.PlaylistVideoActivity;
import com.infinityapps.studytubejee.R;


public class Home extends Fragment {
    Context context;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        //show life-cycle event in LogCat console...
        context = getActivity().getApplicationContext();
        View thisScreensView = inflater.inflate(R.layout.fragment_home, container, false);

        Button channelId = thisScreensView.findViewById(R.id.Channel);
        channelId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, PlaylistActivity.class);
                intent.putExtra("CHANNEL_ID","UCiGyWN6DEbnj2alu7iapuKQ");
                startActivity(intent);
            }
        });
        Button videoBtn = thisScreensView.findViewById(R.id.Video_Test);
        videoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, PlaylistVideoActivity.class);
                intent.putExtra("PLAYLISTID","PLYVDsiuOZP5oNMA20ENGpMZn205nKjp6t");
                startActivity(intent);
            }
        });
        return thisScreensView;
    }

}