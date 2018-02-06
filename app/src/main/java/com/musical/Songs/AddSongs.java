package com.musical.Songs;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.musical.MainActivity;
import com.musical.R;


public class AddSongs extends AppCompatActivity {

    ImageButton imageButton;
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
    }

    public void openStore(View view){
        Toast.makeText(this, getResources().getString(R.string.openStore), Toast.LENGTH_SHORT).show();
    }
}
