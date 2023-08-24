package com.example.mad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        WebView wv = (WebView) findViewById(R.id.wb4);
        wv.loadUrl("https://github.com/Anuj-Kumar-Sharma/Shuffler");
    }
}