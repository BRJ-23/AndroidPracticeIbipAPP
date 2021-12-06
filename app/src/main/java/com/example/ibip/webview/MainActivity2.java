package com.example.ibip.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

import com.example.ibip.R;
import com.example.ibip.ascreen.Main;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webview_activity);
        WebView myWebView = (WebView) findViewById(R.id.webview);
        myWebView.loadUrl("https://devleen.xyz/politica-de-privacidad/politica-de-privacidad-para-aplicaciones-desarrolladas-por-devleen/");


    }



    public void back(View view){
        Intent i = new Intent(this, Main.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
        finish();
    }
}