package com.gexton.singlesidebarwithactivity;

import androidx.drawerlayout.widget.DrawerLayout;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

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

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            getWindow().setStatusBarColor(getResources().getColor(R.color.green, this.getTheme()));
        }

    }

    public void Dashbord(View view) {
        redirectActivity(this, Dashbord.class);
    }

    public void clickMenu(View view) {
        openDrawer(drawerLayout);
    }

    public void FindProperty(View view) {
        redirectActivity(this, Dashbord.class);
    }

    public void MyProperties(View view) {
        redirectActivity(this, Dashbord.class);
    }

    public void MyContacts(View view) {
        redirectActivity(this, Dashbord.class);
    }

    public void Messages(View view) {
        redirectActivity(this, Dashbord.class);
    }

    public void SavedSearches(View view) {
        redirectActivity(this, Dashbord.class);
    }

    public void MyProfile(View view) {
        redirectActivity(this, Dashbord.class);
    }

    public void SupportTickets(View view) {
        redirectActivity(this, Dashbord.class);
    }

    public void Logout(View view) {
        Toast.makeText(Dashbord.this, "Logout", Toast.LENGTH_SHORT).show();
    }

}