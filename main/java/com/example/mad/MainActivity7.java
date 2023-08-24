package com.example.mad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        WebView wv = (WebView) findViewById(R.id.wb6);
        wv.loadUrl("https://www.niit.com/india/knowledge-centre/build-chatbot-with-Java");
    }
}