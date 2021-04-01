package com.gexton.singlesidebarwithactivity;

import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Dashbord extends MainActivity {
    DrawerLayout drawerLayout;
    TextView tvToolbarTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashbord);

        drawerLayout = findViewById(R.id.drawer_layout);
        tvToolbarTitle = findViewById(R.id.tvToolbarTitle);
        tvToolbarTitle.setText("Dashbord");

    }

    public void clickDashbord(View view) {
        MainActivity.closeDrawer(drawerLayout);
    }

}