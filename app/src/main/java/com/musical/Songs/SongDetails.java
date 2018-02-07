package com.musical.Songs;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import com.musical.MainActivity;
import com.musical.R;

/**
 * Created by Ahmed Magdy on 1/2/2018.
 */
public class SongDetails extends AppCompatActivity {
    ImageButton imageButton;
    LinearLayout linearLayout;
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
        imageButton = (ImageButton) findViewById(R.id.backMain);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainActivity = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(mainActivity);
            }
        });
        linearLayout = (LinearLayout) findViewById(R.id.related_song_item);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent songDetails = new Intent(SongDetails.this, SongDetails.class);
                startActivity(songDetails);
                finish();
            }
        });
    }
}
