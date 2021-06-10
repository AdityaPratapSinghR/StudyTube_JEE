package com.infinityapps.studytubejee.Playlist;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.infinityapps.studytubejee.R;
import com.infinityapps.studytubejee.WebViewActivity;

import java.util.List;

/**
 * Created by christophercoffee on 12/17/16.
 */

public class video_recycler_adapter extends RecyclerView.Adapter<video_recycler_adapter.MyViewHolder> {

    private List<Videos> videoList;
    String key;
    Activity activity;
    private int REQ_PLAYER_CODE  = 1;
    int cornerRadius;
    int cardColor;
    int textColor;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView name;
        public ImageView imageView;



        public MyViewHolder(View view) {
            super(view);


            imageView = (ImageView)view.findViewById(R.id.imageView) ;


            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Videos video = videoList.get(getAdapterPosition());

                    Intent intent = new Intent(activity,WebViewActivity.class);
                    intent.putExtra("WEBVIDEO",video.getVideoID());
                    activity.startActivity(intent);
                    
                }
            });


            CardView cardView = (CardView) view.findViewById(R.id.card_view);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                   /* Videos video = videoList.get(getAdapterPosition());
                    Intent videoIntent = new Intent(activity, VideoDetailedActivity.class);
                    videoIntent.putExtra("VIDEOID",video.getVideoID());
                    videoIntent.putExtra("TITLE",video.getTitle());
                    activity.startActivity(videoIntent);*/
                    Videos video = videoList.get(getAdapterPosition());

                    Intent intent = new Intent(activity, WebViewActivity.class);
                    intent.putExtra("WEBVIDEO",video.getVideoID());
                    activity.startActivity(intent);

                }
            });

            LinearLayout videoLayout = view.findViewById(R.id.videoLinear);
            videoLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                  /*  Videos video = videoList.get(getAdapterPosition());
                    Intent videoIntent = new Intent(activity, VideoDetailedActivity.class);
                    videoIntent.putExtra("VIDEOID",video.getVideoID());
                    videoIntent.putExtra("TITLE",video.getTitle());
                    activity.startActivity(videoIntent);*/
                }
            });
            cardView.setCardBackgroundColor(cardColor);
            cardView.setRadius(cornerRadius);


            name = (TextView) view.findViewById(R.id.name);
            name.setTextColor(textColor);
            name.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                   /* Videos video = videoList.get(getAdapterPosition());
                    Intent videoIntent = new Intent(activity, VideoDetailedActivity.class);
                    videoIntent.putExtra("VIDEOID",video.getVideoID());
                    videoIntent.putExtra("TITLE",video.getTitle());
                    activity.startActivity(videoIntent);*/
                    Videos video = videoList.get(getAdapterPosition());

                    Intent intent = new Intent(activity, WebViewActivity.class);
                    intent.putExtra("WEBVIDEO",video.getVideoID());
                    activity.startActivity(intent);
                }
            });



        }
    }


    public video_recycler_adapter(List<Videos> videoList, String yt_key, Activity activity, int cornerRadius, int cardColor, int textColor) {
        this.activity  = activity;
        this.key = yt_key;
        this.videoList = videoList;
        this.cornerRadius = cornerRadius;
        this.cardColor = cardColor;
        this.textColor = textColor;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.video_list_items, parent, false);


        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Videos video = videoList.get(position);
        holder.name.setText(video.getTitle());


        Glide.with(activity)
                .load(video.getThumbnailUrl() ) // Uri of the picture
                .apply(new RequestOptions().override(600, 200))
                .into(holder.imageView);


    }

    @Override
    public int getItemCount() {
        return videoList.size();
    }
}
