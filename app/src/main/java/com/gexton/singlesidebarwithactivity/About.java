package com.gexton.singlesidebarwithactivity;

import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class About extends MainActivity {
    DrawerLayout drawerLayout;
    TextView tvToolbarTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        drawerLayout = findViewById(R.id.drawer_layout);
        tvToolbarTitle = findViewById(R.id.tvToolbarTitle);
        tvToolbarTitle.setText("About");
    }

   /* public void clickMenu(View view) {
        MainActivity.openDrawer(drawerLayout);
    }

    public void clickLogo(View view) {
        MainActivity.closeDrawer(drawerLayout);
    }

    public void clickHome(View view) {
        MainActivity.redirectActivity(About.this, Home.class);
    }

    public void clickDashbord(View view) {
        MainActivity.redirectActivity(About.this, Dashbord.class);
    }

    public void clickAboutUs(View view) {
        MainActivity.closeDrawer(drawerLayout);
    }

    public void clickLogout(View view) {
        MainActivity.logout(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        MainActivity.closeDrawer(drawerLayout);
    }*/

    public void clickAboutUs(View view) {
        MainActivity.closeDrawer(drawerLayout);
    }

}