package com.example.mad;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView btn;
    HomeFragment hf = new HomeFragment();
    ApplicationsFragment af = new ApplicationsFragment();
    CoursesFragment cf = new CoursesFragment();
    HelpFragment hp = new HelpFragment();
    ReviewFragment rf = new ReviewFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.bottom_navigation);
        getSupportFragmentManager().beginTransaction().replace(R.id.container,hf).commit();
        btn.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId()){
                    case R.id.home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,hf).commit();
                        return true;
                    case R.id.programs:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,af).commit();
                        return true;
                    case R.id.courses:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,cf).commit();
                        return true;
                    case R.id.help:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,hp).commit();
                        return true;
                    case R.id.review:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,rf).commit();
                        return true;
                }
                return false;
            }
        });
    }
}