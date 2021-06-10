package com.infinityapps.studytubejee.ChapterHandler;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.infinityapps.studytubejee.PlaylistVideoActivity;
import com.infinityapps.studytubejee.R;

public class ChapterAdapter extends RecyclerView.Adapter<ChapterAdapter.ViewHolder> {
    private final ChapterListAdapterData[] listdata;
   // Context context;

    // RecyclerView recyclerView;
    public ChapterAdapter(ChapterListAdapterData[] listdata) {
        this.listdata = listdata;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.chapter_item, parent, false);
        return new ViewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final ChapterListAdapterData myListData = listdata[position];
        holder.chapterNo1.setText(listdata[position].getChapterNo());
        holder.chapterName1.setText(listdata[position].getChapterName());
       // holder.imageView.setImageResource(listdata[position].getImgId());
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Toast.makeText(v.getContext(),myListData.getPlaylistId(),Toast.LENGTH_LONG).show();
                Intent intent =new Intent(v.getContext(), PlaylistVideoActivity.class);
                intent.putExtra("PLAYLISTID",myListData.getPlaylistId());
                v.getContext().startActivity(intent);
            }
        });
       // holder.linearLayout.setOnClickListener(view -> Toast.makeText(view.getContext(),"click on item: "+myListData.getChapterName(),Toast.LENGTH_LONG).show());
    }


    @Override
    public int getItemCount() {
        return listdata.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView chapterNo1;
        public TextView chapterName1;
        public LinearLayout linearLayout;
        public ViewHolder(View itemView) {
            super(itemView);
            this.chapterNo1 =(TextView) itemView.findViewById(R.id.Chapter_No);
            this.chapterName1 = (TextView) itemView.findViewById(R.id.Chapter_Name);
            linearLayout = (LinearLayout)itemView.findViewById(R.id.Chapter);
        }
    }
}
