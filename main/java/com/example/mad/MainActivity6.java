package com.example.mad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        WebView wv = (WebView) findViewById(R.id.wb5);
        wv.loadUrl("https://projectsgeek.com/2015/01/java-board-game-android-project-source.html");
    }
}