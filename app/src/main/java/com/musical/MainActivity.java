package com.musical;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout leftRL;
    DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drawer);
        leftRL = (LinearLayout) findViewById(R.id.whatYouWantInLeftDrawer);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
    }
    public void onOpenLeftDrawer(View view) {
        drawerLayout.openDrawer(leftRL);
    }
}
