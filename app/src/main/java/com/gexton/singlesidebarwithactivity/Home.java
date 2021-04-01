package com.gexton.singlesidebarwithactivity;

import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Home extends MainActivity {
    DrawerLayout drawerLayout;
    TextView tvToolbarTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        drawerLayout = findViewById(R.id.drawer_layout);
        tvToolbarTitle = findViewById(R.id.tvToolbarTitle);
        tvToolbarTitle.setText("Home");
    }

    public void clickHome(View view) {
        MainActivity.closeDrawer(drawerLayout);
    }
}