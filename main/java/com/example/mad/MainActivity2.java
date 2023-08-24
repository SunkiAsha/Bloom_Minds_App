package com.example.mad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        WebView wv = (WebView) findViewById(R.id.wb1);
        wv.loadUrl("https://projectworlds.in/android-projects-with-source-code/women-safety-app-android-project-source-code/");
    }
}