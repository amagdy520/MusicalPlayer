package com.musical.Songs;

import android.content.Context;

import com.musical.R;

import java.util.ArrayList;

/**
 * Created by Ahmed Magdy on 2/3/2018.
 */

public class SongsArrayList extends ArrayList {
    private String songName =  String.valueOf(R.string.song_name_placeholder);
    private String authorName = String.valueOf(R.string.song_author_placeholder);

    public SongsArrayList(String songName,String authorName)
    {
        this.songName = songName;
        this.authorName = authorName;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
