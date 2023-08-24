package com.example.mad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class CourseraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coursera);
        WebView wv = (WebView) findViewById(R.id.wb1);
        wv.loadUrl("https://www.coursera.org/specializations/android-app-development");
    }
}