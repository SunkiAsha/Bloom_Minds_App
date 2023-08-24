package com.example.mad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class GreatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_great);
        WebView wv = (WebView) findViewById(R.id.wb4);
        wv.loadUrl("https://www.mygreatlearning.com/academy/learn-for-free/courses/android-application-development");
    }
}