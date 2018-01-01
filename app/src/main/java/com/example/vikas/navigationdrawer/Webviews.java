package com.example.vikas.navigationdrawer;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;

public class Webviews extends AppCompatActivity {
    android.webkit.WebView webView;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webview);
        String newspaper = getIntent().getStringExtra("NEWSPAPER");
        webView = (android.webkit.WebView) findViewById(R.id.webView);
        WebSettings webSettings = webView.getSettings();

        webSettings.setJavaScriptEnabled(true);//enables the JavaScript for webpage
        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(true);

        progressDialog = new ProgressDialog(this); //displays the ProgressDialog
        progressDialog.setMessage("Loading");  //sets the message on ProgressDialog
        webView.setWebViewClient(new CustomWebViewClient(progressDialog));  //override the WebViewClient to force open inside our WbView
        //webView.loadUrl("http://" + newspaper.toLowerCase() + ".com");  //loads the specified URL
        webView.loadUrl("http://" + newspaper.toLowerCase() + ".com");
    }

    private class CustomWebViewClient extends WebViewClient {
        private ProgressDialog progressDialog;

        CustomWebViewClient(ProgressDialog progressDialog) {
            this.progressDialog = progressDialog;
            progressDialog.show();
        }

        @Override
        public boolean shouldOverrideUrlLoading(android.webkit.WebView view, WebResourceRequest request) {
            return super.shouldOverrideUrlLoading(view, request);
        }

        @Override
        public void onPageFinished(android.webkit.WebView view, String url) {
            super.onPageFinished(view, url);
            if (progressDialog.isShowing())
                progressDialog.cancel();
        }
    }   /*class for overloading the WebViewClient*/


}