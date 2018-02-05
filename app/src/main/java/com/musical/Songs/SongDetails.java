package com.musical.Songs;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.musical.MainActivity;
import com.musical.R;

/**
 * Created by Ahmed Magdy on 1/2/2018.
 */
public class SongDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_details);
        FloatingActionButton addSongsFab = (FloatingActionButton) findViewById(R.id.add_songs);
        addSongsFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent addSongs = new Intent(getApplicationContext(), AddSongs.class);
                startActivity(addSongs);
            }
        });
    }

    public void openRelatedSong(View view){
        Intent songDetails = new Intent(this, SongDetails.class);
        startActivity(songDetails);
        finish();
    }
    public void backMain(View view){
        Intent mainActivity = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(mainActivity);
    }
}
