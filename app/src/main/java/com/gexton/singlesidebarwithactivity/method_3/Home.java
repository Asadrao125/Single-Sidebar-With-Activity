package com.gexton.singlesidebarwithactivity.method_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.gexton.singlesidebarwithactivity.R;

public class Home extends AppCompatActivity {
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

    public void clickMenu(View view) {
        MainActivity.openDrawer(drawerLayout);
    }

    public void clickLogo(View view) {
        MainActivity.closeDrawer(drawerLayout);
    }

    public void clickHome(View view) {
        MainActivity.closeDrawer(drawerLayout);
    }

    public void clickDashbord(View view) {
        MainActivity.redirectActivity(Home.this, Dashbord.class);
    }

    public void clickAboutUs(View view) {
        recreate();
    }

    public void clickLogout(View view) {
        MainActivity.logout(Home.this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        MainActivity.closeDrawer(drawerLayout);
    }

}