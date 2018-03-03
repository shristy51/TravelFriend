package com.example.shristy.travelfriend;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Bookthotel extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bookthotel);

//Get a reference to your WebView//
        WebView webView = (WebView) findViewById(R.id.webview);
        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(true);
        webView.getSettings().setJavaScriptEnabled(true);
        WebSettings settings = webView.getSettings();
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
//Specify the URL you want to display//
        webView.loadUrl("http://www.irctctourism.com/cgi-bin/dev1.dll/irctc/booking/hotelplanner.do?click=true&screen=fromHome&city=New%20Delhi&offset=0&bannercode=GIN01");
    }
}