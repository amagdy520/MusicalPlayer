package com.musical.Songs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.musical.R;

/**
 * Created by Ahmed Magdy on 1/2/2018.
 */
public class SongDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_details);
    }

    public void openRelatedSong(View view){
        Intent songDetails = new Intent(this, SongDetails.class);
        startActivity(songDetails);
        finish();
    }
}
