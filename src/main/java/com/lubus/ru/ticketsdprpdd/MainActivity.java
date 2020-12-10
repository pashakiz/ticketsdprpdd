package com.lubus.ru.ticketsdprpdd;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //init
        WebView myWebApp = (WebView) findViewById(R.id.webview);

        //settings
        //myWebApp.getSettings().setJavaScriptEnabled(true);

        //load
        myWebApp.loadUrl("http://avtoclub.dn.ua/exam");

    }
}