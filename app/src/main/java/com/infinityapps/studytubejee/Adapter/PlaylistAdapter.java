package com.infinityapps.studytubejee.Adapter;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.GlideContext;
import com.bumptech.glide.GlideExperiments;
import com.bumptech.glide.request.RequestOptions;
import com.infinityapps.studytubejee.PlaylistVideoActivity;
import com.infinityapps.studytubejee.R;
import com.infinityapps.studytubejee.WebViewActivity;

import java.util.ArrayList;
import java.util.List;

public class PlaylistAdapter extends RecyclerView.Adapter<PlaylistAdapter.ViewHolder> {
    private List<PlaylistItemAdapter> playList;
    //private ArrayList<PlaylistItemAdapter> playlistItemAdapters;
    String key;
    Activity activity;
    private int REQ_PLAYER_CODE  = 1;
    int cornerRadius;
    int cardColor;
    int textColor;

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView playlistText;
        public ImageView playlistImage;

        public ViewHolder(View view) {
            super(view);

            playlistImage = (ImageView)view.findViewById(R.id.playlist_image) ;

            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    PlaylistItemAdapter playlistItemAdapter = playList.get(getAdapterPosition());

                    Intent intent = new Intent(activity, PlaylistVideoActivity.class);
                    intent.putExtra("PLAYLISTID",playlistItemAdapter.getPlaylistId());
                    activity.startActivity(intent);

                }
            });


            CardView cardView = (CardView) view.findViewById(R.id.card_view);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    PlaylistItemAdapter playlistItemAdapter = playList.get(getAdapterPosition());

                    Intent intent = new Intent(activity, PlaylistVideoActivity.class);
                    intent.putExtra("PLAYLISTID",playlistItemAdapter.getPlaylistId());
                    activity.startActivity(intent);

                }
            });

            LinearLayout videoLayout = view.findViewById(R.id.videoLinear);
            videoLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                }
            });
            cardView.setCardBackgroundColor(cardColor);
            cardView.setRadius(cornerRadius);


            playlistText = (TextView) view.findViewById(R.id.playlist_text);
            playlistText.setTextColor(textColor);
            playlistText.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    PlaylistItemAdapter playlistItemAdapter = playList.get(getAdapterPosition());

                    Intent intent = new Intent(activity, PlaylistVideoActivity.class);
                    intent.putExtra("PLAYLISTID",playlistItemAdapter.getPlaylistId());
                    activity.startActivity(intent);
                }
            });
        }
    }


    // method for filtering our recyclerview items.
    public void filterList(ArrayList<PlaylistItemAdapter> filterllist) {
        // below line is to add our filtered
        // list in our course array list.
        playList = filterllist;
        // below line is to notify our adapter
        // as change in recycler view data.
        notifyDataSetChanged();
    }

    public PlaylistAdapter(List<PlaylistItemAdapter> playList, String yt_key, Activity activity, int cornerRadius, int cardColor, int textColor) {
        this.activity  = activity;
        this.key = yt_key;
        this.playList = playList;
        this.cornerRadius = cornerRadius;
        this.cardColor = cardColor;
        this.textColor = textColor;
    }

    @Override
    public PlaylistAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.channel_playlist_item, parent, false);

        return new PlaylistAdapter.ViewHolder(itemView);
    }



    @Override
    public void onBindViewHolder(PlaylistAdapter.ViewHolder holder, int position) {
        //Videos video = videoList.get(position);
        //holder.pla.setText(video.getTitle());

        PlaylistItemAdapter playlistItemAdapter = playList.get(position);
        holder.playlistText.setText(playlistItemAdapter.getTitle());

        Glide.with(activity)
                .load(playlistItemAdapter.getPlaylistThumbUrl() )// Uri of the picture
                .error(R.drawable.baseline_error_white_24dp)
                .apply(new RequestOptions().override(400, 100))
                .into(holder.playlistImage);

    }
    @Override
    public int getItemCount() {
        return playList.size();
    }

}

