package com.musical.Songs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.musical.MainActivity;
import com.musical.R;


public class AddSongs extends AppCompatActivity {

    ImageButton imageButton;
    LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_songs);
        imageButton = (ImageButton) findViewById(R.id.backMain);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainActivity = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(mainActivity);
            }
        });
        linearLayout = (LinearLayout) findViewById(R.id.store_item);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AddSongs.this, getResources().getString(R.string.openStore), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
