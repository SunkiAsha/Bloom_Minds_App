package com.example.mad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class IbmActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ibm);
        WebView wv = (WebView) findViewById(R.id.wb3);
        wv.loadUrl("https://www.ibm.com/training/certification/C0000200");
    }
}