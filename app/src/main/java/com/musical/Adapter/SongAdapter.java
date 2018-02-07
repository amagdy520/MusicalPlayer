package com.musical.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.musical.R;
import com.musical.Songs.SongDetails;
import com.musical.Songs.SongsArrayList;

import java.util.ArrayList;

/**
 * Created by Ahmed Magdy on 2/6/2018.
 */

public class SongAdapter extends ArrayAdapter<SongsArrayList> {
    Context mContext = null;
    private static class ViewHolder {
        private TextView songTitle,songAuthor;
        private LinearLayout linearLayout;
    }

    public SongAdapter(Context context, int textViewResourceId, ArrayList<SongsArrayList> items) {
        super(context,textViewResourceId, items);
        mContext = context;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        SongsArrayList item = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(this.getContext())
                    .inflate(R.layout.song_item, parent, false);

            viewHolder = new ViewHolder();
            viewHolder.linearLayout = (LinearLayout) convertView.findViewById(R.id.song_item);
            viewHolder.songTitle = (TextView) convertView.findViewById(R.id.song_title);
            viewHolder.songAuthor= (TextView) convertView.findViewById(R.id.song_author);
            viewHolder.songTitle.setText(item.getSongName());
            viewHolder.songAuthor.setText(item.getAuthorName());
            viewHolder.linearLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mContext.startActivity(new Intent(mContext, SongDetails.class));
                }
            });
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        return convertView;
    }
}
