package com.example.kin.learningjava;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;

public class Chapter2a extends AppCompatActivity {
    WebView mwebview;
    Button jumppage1,jumppage2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter2a);
        mwebview = (WebView) findViewById(R.id.webview);
        WebSettings webSettings = mwebview.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mwebview.loadUrl("https://leungwaikin.000webhostapp.com/Chapter2a.html");
        jumppage1=(Button)findViewById(R.id.jump1);
        jumppage1.setOnClickListener(new View.OnClickListener(){
            @Override
            //On click function
            public void onClick(View w) {
                Intent jumpage=new Intent(Chapter2a.this,Exercise.class);
                startActivity(jumpage);
            }
        });
        jumppage2=(Button)findViewById(R.id.jump2);
        jumppage2.setOnClickListener(new View.OnClickListener(){
            @Override
            //On click function
            public void onClick(View w) {
                Intent jumpage=new Intent(Chapter2a.this,Chapter2b.class);
                startActivity(jumpage);
            }
        });
    }
}
