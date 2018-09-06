package com.example.sumayya.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //declaring variable and
         webView = findViewById(R.id.webView);

        //load URL
        webView.loadUrl("https://www.prothomalo.com");
        

        //javascript enabled
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        //dont get use external browser
        webView.setWebViewClient(new WebViewClient());

    }
    @Override
    public void onBackPressed()
    {
        if(webView.canGoBack())
        {
           webView.goBack();
        }else {
        super.onBackPressed();
        }
    }
}
