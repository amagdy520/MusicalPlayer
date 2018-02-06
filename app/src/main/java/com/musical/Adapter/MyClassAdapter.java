package com.musical.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.musical.R;
import com.musical.Songs.SongsArrayList;

import java.util.ArrayList;

/**
 * Created by Ahmed Magdy on 2/6/2018.
 */

public class MyClassAdapter extends ArrayAdapter<SongsArrayList> {

    private static class ViewHolder {
        private TextView songTitle,songAuthor;
    }

    public MyClassAdapter(Context context, int textViewResourceId, ArrayList<SongsArrayList> items) {
        super(context, textViewResourceId, items);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        SongsArrayList item = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(this.getContext())
                    .inflate(R.layout.song_item, parent, false);

            viewHolder = new ViewHolder();
            viewHolder.songTitle = (TextView) convertView.findViewById(R.id.song_title);
            viewHolder.songAuthor= (TextView) convertView.findViewById(R.id.song_author);
            viewHolder.songTitle.setText(item.getSongName());
            viewHolder.songAuthor.setText(item.getAuthorName());
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        if (item!= null) {
        }

        return convertView;
    }
}
