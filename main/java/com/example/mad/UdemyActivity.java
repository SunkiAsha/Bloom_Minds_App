package com.example.mad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class UdemyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_udemy);
        WebView wv = (WebView) findViewById(R.id.wb2);
        wv.loadUrl("https://www.udemy.com/course/learn-android-application-development-y/");
    }
}