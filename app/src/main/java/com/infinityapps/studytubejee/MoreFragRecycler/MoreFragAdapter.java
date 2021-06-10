package com.infinityapps.studytubejee.MoreFragRecycler;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.google.android.youtube.player.internal.i;
import com.infinityapps.studytubejee.Adapter.PlaylistItemAdapter;
import com.infinityapps.studytubejee.ChapterHandler.ChapterAdapter;
import com.infinityapps.studytubejee.ChapterHandler.ChapterListAdapterData;
import com.infinityapps.studytubejee.Fragment.MoreFrag;
import com.infinityapps.studytubejee.PlaylistActivity;
import com.infinityapps.studytubejee.PlaylistVideoActivity;
import com.infinityapps.studytubejee.R;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MoreFragAdapter extends RecyclerView.Adapter<MoreFragAdapter.ViewHolder> {

    // creating a variable for array list and context.
    private ArrayList<MoreFragItem> courseModalArrayList;
    private Context context;

    // creating a constructor for our variables.
    public MoreFragAdapter(ArrayList<MoreFragItem> courseModalArrayList, Context context) {
        this.courseModalArrayList = courseModalArrayList;
        this.context = context;
    }

    // method for filtering our recyclerview items.
    public void filterList(ArrayList<MoreFragItem> filterllist) {
        // below line is to add our filtered
        // list in our course array list.
        courseModalArrayList = filterllist;
        // below line is to notify our adapter
        // as change in recycler view data.
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MoreFragAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // below line is to inflate our layout.
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.more_channels_adapter, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MoreFragAdapter.ViewHolder holder, int position) {
        // setting data to our views of recycler view.
        MoreFragItem modal = courseModalArrayList.get(position);
       // holder.channelIcon.setImageResource(modal.getChannelIcon());
        Glide.with(context)
                .load(modal.getChannelIcon())// Uri of the picture
                .error(R.drawable.baseline_error_white_24dp)
                .apply(new RequestOptions().override(400, 100))
                .into(holder.channelIcon);
        holder.channelName.setText(modal.getChannelName());
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Toast.makeText(context, modal.getChannelId(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(context,PlaylistActivity.class);
                intent.putExtra("CHANNEL_ID",modal.getChannelId());
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);

            }
        });
        holder.channelYoutube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.youtube.com/channel/"+modal.getChannelId();
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                i.setData(Uri.parse(url));
                context.startActivity(i);
            }
        });
        if (modal.getChannelWeb().equals("none")){holder.channelWeb.setVisibility(View.GONE);}
        else {holder.channelWeb.setText(modal.getChannelWeb());}
        holder.channelWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(modal.getChannelWeb().equals("none")){
                    Toast.makeText(context, "Sorry! Not Available", Toast.LENGTH_SHORT).show();
                }else{
                String url = modal.getChannelWeb();
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                i.setData(Uri.parse(url));
                context.startActivity(i);}
            }
        });

        if(modal.getChannelApp().equals("none")){holder.channelApp.setVisibility(View.GONE);}
        else{holder.channelApp.setText(modal.getChannelApp());}
        holder.channelApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (modal.getChannelApp().equals("none")){
                    Toast.makeText(context, "Sorry! Not Available", Toast.LENGTH_SHORT).show();

                }else{
                    String url = modal.getChannelApp();
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    i.setData(Uri.parse(url));
                    context.startActivity(i);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        // returning the size of array list.
        return courseModalArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        // creating variables for our views.
        private TextView channelName;
        private TextView channelYoutube,channelWeb,channelApp;
        private ImageView channelIcon;
        private LinearLayout linearLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            // initializing our views with their ids.
            channelName = itemView.findViewById(R.id.Channel_name);
            channelIcon = itemView.findViewById(R.id.Channel_icon);
            channelYoutube = itemView.findViewById(R.id.Channel_Youtube);
            channelWeb = itemView.findViewById(R.id.Channel_Website);
            channelApp = itemView.findViewById(R.id.Channel_App);
            linearLayout = itemView.findViewById(R.id.Channel_click);
        }
    }
  /*  private MoreFragItem[] listdata;
    private ArrayList<MoreFragItem> moreFragItems;
    // RecyclerView recyclerView;

    public MoreFragAdapter(MoreFragItem[] listdata) {
        this.listdata = listdata;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.more_channels_adapter, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final MoreFragItem myListData = listdata[position];
        holder.channelName1.setText(listdata[position].getChannelName());
        holder.channelIcon1.setImageResource(listdata[position].getChannelIcon());
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"click on item: "+myListData.getChannelId(),Toast.LENGTH_LONG).show();
            }
        });
    }


    @Override
    public int getItemCount() {
        return listdata.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView channelIcon1;
        public TextView channelName1;
        public LinearLayout linearLayout;
        public ViewHolder(View itemView) {
            super(itemView);
            this.channelIcon1 =itemView.findViewById(R.id.Channel_icon);
            this.channelName1 = (TextView) itemView.findViewById(R.id.Channel_name);
            linearLayout = (LinearLayout)itemView.findViewById(R.id.Channel_click);
        }
    }

    // method for filtering our recyclerview items.
    public void filterList(ArrayList<MoreFragItem> filterllist) {
        // below line is to add our filtered
        // list in our course array list.
        listdata = filterllist.toArray(new MoreFragItem[0]);
        // below line is to notify our adapter
        // as change in recycler view data.
        notifyDataSetChanged();
    }*/


}

