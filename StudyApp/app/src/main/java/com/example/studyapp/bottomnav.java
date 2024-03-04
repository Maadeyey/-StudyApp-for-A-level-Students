package com.example.studyapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toolbar;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class bottomnav extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    subject subject = new subject();
    home home = new home();
    video video = new video();
    MainVideo mainVideo=new MainVideo();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottomnav);
        bottomNavigationView =findViewById(R.id.navi_gation);

        getSupportFragmentManager().beginTransaction().replace(R.id.box, home).commit();
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch(item.getItemId()){
                    case R.id.home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.box, home).commit();
                        return true;
                    case R.id.subjects:
                        getSupportFragmentManager().beginTransaction().replace(R.id.box, subject).commit();
                        return true;
                    case R.id.media:
                        getSupportFragmentManager().beginTransaction().replace(R.id.box, video).commit();
                        return true;





                }
                return false;
            }
        });





    }
}