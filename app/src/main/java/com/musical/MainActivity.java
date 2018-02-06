package com.musical;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;


import com.musical.Adapter.MyClassAdapter;
import com.musical.Songs.AddSongs;
import com.musical.Songs.SongsArrayList;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView songList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String songName = getResources().getString(R.string.song_name_placeholder);
        String songAuthor = getResources().getString(R.string.song_author_placeholder);
        SongsArrayList songsArrayList = new SongsArrayList(songName,songAuthor);
        int songsCount = 50;
        int i = 0;
        ArrayList<SongsArrayList> songsList = new ArrayList<>();
        while( i < songsCount){
            SongsArrayList song = new SongsArrayList(songName,songAuthor);
            songsList.add(i, song);
            i++;
        }
        songList = (ListView) findViewById(R.id.songs_list);
        songList.setAdapter(new MyClassAdapter(this,0, songsList ));


        FloatingActionButton addSongsFab = (FloatingActionButton) findViewById(R.id.add_songs);
        addSongsFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent addSongs = new Intent(getApplicationContext(), AddSongs.class);
                startActivity(addSongs);
            }
        });

    }
}
