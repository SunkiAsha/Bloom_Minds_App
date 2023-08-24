package com.example.mad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        WebView wv = (WebView) findViewById(R.id.wb2);
        wv.loadUrl("https://projectworlds.in/android-projects-with-source-code/android-fitness-app-project-source-code/");
    }
}