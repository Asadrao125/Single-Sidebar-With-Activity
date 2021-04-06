package com.gexton.singlesidebarwithactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawerLayout = findViewById(R.id.drawer_layout);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            getWindow().setStatusBarColor(getResources().getColor(R.color.green, this.getTheme()));
        }

    }

    public void clickMenu(View view) {
        openDrawer(drawerLayout);
    }

    public static void openDrawer(DrawerLayout drawerLayout) {
        drawerLayout.openDrawer(GravityCompat.START);
    }

    public static void closeDrawer(DrawerLayout drawerLayout) {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        }
    }

    public void Dashbord(View view) {
        redirectActivity(this, Dashbord.class);
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
        Toast.makeText(MainActivity.this, "Logout", Toast.LENGTH_SHORT).show();
        closeDrawer(drawerLayout);
    }

    @Override
    protected void onPause() {
        super.onPause();
        closeDrawer(drawerLayout);
    }

    public static void redirectActivity(Activity activity, Class aClass) {
        Intent intent = new Intent(activity, aClass);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        activity.startActivity(intent);
        activity.finish();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}