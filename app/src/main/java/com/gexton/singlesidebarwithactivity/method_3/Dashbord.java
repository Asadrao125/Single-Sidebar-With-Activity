package com.gexton.singlesidebarwithactivity.method_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.gexton.singlesidebarwithactivity.R;

public class Dashbord extends AppCompatActivity {
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

    public void clickMenu(View view){
        MainActivity.openDrawer(drawerLayout);
    }

    public void clickLogo(View view){
        MainActivity.closeDrawer(drawerLayout);
    }

    public void clickHome(View view){
        MainActivity.redirectActivity(Dashbord.this, MainActivity.class);
    }

    public void clickDashbord(View view){
        MainActivity.closeDrawer(drawerLayout);
    }

    public void clickAboutUs(View view){
        MainActivity.redirectActivity(Dashbord.this, About.class);
    }

    public void clickLogout(View view){
        MainActivity.logout(Dashbord.this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        MainActivity.closeDrawer(drawerLayout);
    }
}