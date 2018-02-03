package com.musical.Songs;

import com.musical.R;

/**
 * Created by Ahmed Magdy on 2/3/2018.
 */

public class SongsArrayList {
    private String SongName =  String.valueOf(R.string.song_name_placeholder);
    private String AuthorName = String.valueOf(R.string.song_author_placeholder);

    public SongsArrayList(){

    }
    public SongsArrayList(String SongName,String AuthorName)
    {
        this.SongName = SongName;
        this.AuthorName = AuthorName;
    }

    public String getSongName() {
        return SongName;
    }

    public void setSongName(String songName) {
        this.SongName = songName;
    }

    public String getAuthorName() {
        return AuthorName;
    }

    public void setAuthorName(String authorName) {
        this.AuthorName = authorName;

    }
}
