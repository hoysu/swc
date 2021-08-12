package com.example.swc_fin;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Frag2 extends Fragment {

    private WebView mWebView; // 웹뷰 선언
    private WebSettings mWebSettings; //웹뷰세팅

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag2, container, false);

        Button game = (Button) view.findViewById(R.id.game);
        game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Button bt1 = (Button) view.findViewById(R.id.bt1);
                bt1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                            mWebView = (WebView) view.findViewById(R.id.wv);
                            mWebView.setWebViewClient(new WebViewClient()); // 클릭시 새창 안뜨게
                            mWebSettings = mWebView.getSettings(); //세부 세팅 등록
                            mWebSettings.setJavaScriptEnabled(true); // 웹페이지 자바스클비트 허용 여부
                            mWebSettings.setSupportMultipleWindows(false); // 새창 띄우기 허용 여부
                            mWebSettings.setJavaScriptCanOpenWindowsAutomatically(false); // 자바스크립트 새창 띄우기(멀티뷰) 허용 여부
                            mWebSettings.setLoadWithOverviewMode(true); // 메타태그 허용 여부
                            mWebSettings.setUseWideViewPort(true); // 화면 사이즈 맞추기 허용 여부
                            mWebSettings.setSupportZoom(false); // 화면 줌 허용 여부
                            mWebSettings.setBuiltInZoomControls(false); // 화면 확대 축소 허용 여부
                            mWebSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN); // 컨텐츠 사이즈 맞추기
                            mWebSettings.setCacheMode(WebSettings.LOAD_NO_CACHE); // 브라우저 캐시 허용 여부
                            mWebSettings.setDomStorageEnabled(true); // 로컬저장소 허용 여부
                            mWebView.loadUrl("https://www.youtube.com/watch?v=jj0RQjUHD1c&t=1s"); // 웹뷰에 표시할 웹사이트 주소, 웹뷰 시작
                    }
                });

                Button bt2 = (Button) view.findViewById(R.id.bt2);
                bt2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mWebView = (WebView) view.findViewById(R.id.wv);
                        mWebView.setWebViewClient(new WebViewClient());
                        mWebSettings = mWebView.getSettings();
                        mWebSettings.setJavaScriptEnabled(true);
                        mWebSettings.setSupportMultipleWindows(false);
                        mWebSettings.setJavaScriptCanOpenWindowsAutomatically(false);
                        mWebSettings.setLoadWithOverviewMode(true);
                        mWebSettings.setUseWideViewPort(true);
                        mWebSettings.setSupportZoom(false);
                        mWebSettings.setBuiltInZoomControls(false);
                        mWebSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
                        mWebSettings.setCacheMode(WebSettings.LOAD_NO_CACHE);
                        mWebSettings.setDomStorageEnabled(true);
                        mWebView.loadUrl("https://www.youtube.com/watch?v=qfGJspwxaeo&t=38s");
                    }
                });

                Button bt3 = (Button) view.findViewById(R.id.bt3);
                bt3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mWebView = (WebView) view.findViewById(R.id.wv);
                        mWebView.setWebViewClient(new WebViewClient());
                        mWebSettings = mWebView.getSettings();
                        mWebSettings.setJavaScriptEnabled(true);
                        mWebSettings.setSupportMultipleWindows(false);
                        mWebSettings.setJavaScriptCanOpenWindowsAutomatically(false);
                        mWebSettings.setLoadWithOverviewMode(true);
                        mWebSettings.setUseWideViewPort(true);
                        mWebSettings.setSupportZoom(false);
                        mWebSettings.setBuiltInZoomControls(false);
                        mWebSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
                        mWebSettings.setCacheMode(WebSettings.LOAD_NO_CACHE);
                        mWebSettings.setDomStorageEnabled(true);
                        mWebView.loadUrl("https://www.youtube.com/watch?v=eit-mGS1EgU&t=1s");
                    }
                });

                Button bt4 = (Button) view.findViewById(R.id.bt4);
                bt4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mWebView = (WebView) view.findViewById(R.id.wv);
                        mWebView.setWebViewClient(new WebViewClient());
                        mWebSettings = mWebView.getSettings();
                        mWebSettings.setJavaScriptEnabled(true);
                        mWebSettings.setSupportMultipleWindows(false);
                        mWebSettings.setJavaScriptCanOpenWindowsAutomatically(false);
                        mWebSettings.setLoadWithOverviewMode(true);
                        mWebSettings.setUseWideViewPort(true);
                        mWebSettings.setSupportZoom(false);
                        mWebSettings.setBuiltInZoomControls(false);
                        mWebSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
                        mWebSettings.setCacheMode(WebSettings.LOAD_NO_CACHE);
                        mWebSettings.setDomStorageEnabled(true);
                        mWebView.loadUrl("https://www.youtube.com/watch?v=SDqD3jOBSkQ");
                    }
                });

                Button bt5 = (Button) view.findViewById(R.id.bt5);
                bt5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mWebView = (WebView) view.findViewById(R.id.wv);
                        mWebView.setWebViewClient(new WebViewClient());
                        mWebSettings = mWebView.getSettings();
                        mWebSettings.setJavaScriptEnabled(true);
                        mWebSettings.setSupportMultipleWindows(false);
                        mWebSettings.setJavaScriptCanOpenWindowsAutomatically(false);
                        mWebSettings.setLoadWithOverviewMode(true);
                        mWebSettings.setUseWideViewPort(true);
                        mWebSettings.setSupportZoom(false);
                        mWebSettings.setBuiltInZoomControls(false);
                        mWebSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
                        mWebSettings.setCacheMode(WebSettings.LOAD_NO_CACHE);
                        mWebSettings.setDomStorageEnabled(true);
                        mWebView.loadUrl("https://www.youtube.com/watch?v=7wjv7kjfm3s&list=PLhBBx7Sv0kF0yHVP20gsCWjm6Mxq5Uitw");
                    }
                });

                Button bt6 = (Button) view.findViewById(R.id.bt6);
                bt6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mWebView = (WebView) view.findViewById(R.id.wv);
                        mWebView.setWebViewClient(new WebViewClient());
                        mWebSettings = mWebView.getSettings();
                        mWebSettings.setJavaScriptEnabled(true);
                        mWebSettings.setSupportMultipleWindows(false);
                        mWebSettings.setJavaScriptCanOpenWindowsAutomatically(false);
                        mWebSettings.setLoadWithOverviewMode(true);
                        mWebSettings.setUseWideViewPort(true);
                        mWebSettings.setSupportZoom(false);
                        mWebSettings.setBuiltInZoomControls(false);
                        mWebSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
                        mWebSettings.setCacheMode(WebSettings.LOAD_NO_CACHE);
                        mWebSettings.setDomStorageEnabled(true);
                        mWebView.loadUrl("https://www.youtube.com/watch?v=-GzKyytgI60&list=PLhBBx7Sv0kF3Lz61pOV1tbZH1iPo3CkwG");
                    }
                });

                Button bt7 = (Button) view.findViewById(R.id.bt7);
                bt7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mWebView = (WebView) view.findViewById(R.id.wv);
                        mWebView.setWebViewClient(new WebViewClient());
                        mWebSettings = mWebView.getSettings();
                        mWebSettings.setJavaScriptEnabled(true);
                        mWebSettings.setSupportMultipleWindows(false);
                        mWebSettings.setJavaScriptCanOpenWindowsAutomatically(false);
                        mWebSettings.setLoadWithOverviewMode(true);
                        mWebSettings.setUseWideViewPort(true);
                        mWebSettings.setSupportZoom(false);
                        mWebSettings.setBuiltInZoomControls(false);
                        mWebSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
                        mWebSettings.setCacheMode(WebSettings.LOAD_NO_CACHE);
                        mWebSettings.setDomStorageEnabled(true);
                        mWebView.loadUrl("https://www.youtube.com/watch?v=gsbe1jobm8s&list=PLhBBx7Sv0kF1ZsbMXiYctDumH8FZAkr8K");
                    }
                });

                }
            });

        Button health = (Button) view.findViewById(R.id.health);
        health.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mWebView = (WebView) view.findViewById(R.id.wv);
                mWebView.setWebViewClient(new WebViewClient());
                mWebSettings = mWebView.getSettings();
                mWebSettings.setJavaScriptEnabled(true);
                mWebSettings.setSupportMultipleWindows(false);
                mWebSettings.setJavaScriptCanOpenWindowsAutomatically(false);
                mWebSettings.setLoadWithOverviewMode(true);
                mWebSettings.setUseWideViewPort(true);
                mWebSettings.setSupportZoom(false);
                mWebSettings.setBuiltInZoomControls(false);
                mWebSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
                mWebSettings.setCacheMode(WebSettings.LOAD_NO_CACHE);
                mWebSettings.setDomStorageEnabled(true);
                mWebView.loadUrl("https://youtu.be/wP5rGmrTyjg");
                }
            });

        Button video = (Button) view.findViewById(R.id.video);
        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Button bt1 = (Button) view.findViewById(R.id.bt1);
                bt1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mWebView = (WebView) view.findViewById(R.id.wv);
                        mWebView.setWebViewClient(new WebViewClient());
                        mWebSettings = mWebView.getSettings();
                        mWebSettings.setJavaScriptEnabled(true);
                        mWebSettings.setSupportMultipleWindows(false);
                        mWebSettings.setJavaScriptCanOpenWindowsAutomatically(false);
                        mWebSettings.setLoadWithOverviewMode(true);
                        mWebSettings.setUseWideViewPort(true);
                        mWebSettings.setSupportZoom(false);
                        mWebSettings.setBuiltInZoomControls(false);
                        mWebSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
                        mWebSettings.setCacheMode(WebSettings.LOAD_NO_CACHE);
                        mWebSettings.setDomStorageEnabled(true);
                        mWebView.loadUrl("https://www.youtube.com/watch?v=enD8zJRw8J0");
                    }
                });

                Button bt2 = (Button) view.findViewById(R.id.bt2);
                bt2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mWebView = (WebView) view.findViewById(R.id.wv);
                        mWebView.setWebViewClient(new WebViewClient());
                        mWebSettings = mWebView.getSettings();
                        mWebSettings.setJavaScriptEnabled(true);
                        mWebSettings.setSupportMultipleWindows(false);
                        mWebSettings.setJavaScriptCanOpenWindowsAutomatically(false);
                        mWebSettings.setLoadWithOverviewMode(true);
                        mWebSettings.setUseWideViewPort(true);
                        mWebSettings.setSupportZoom(false);
                        mWebSettings.setBuiltInZoomControls(false);
                        mWebSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
                        mWebSettings.setCacheMode(WebSettings.LOAD_NO_CACHE);
                        mWebSettings.setDomStorageEnabled(true);
                        mWebView.loadUrl("https://www.youtube.com/watch?v=pL_O4uWj0eg");
                    }
                });

                Button bt3 = (Button) view.findViewById(R.id.bt3);
                bt3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mWebView = (WebView) view.findViewById(R.id.wv);
                        mWebView.setWebViewClient(new WebViewClient());
                        mWebSettings = mWebView.getSettings();
                        mWebSettings.setJavaScriptEnabled(true);
                        mWebSettings.setSupportMultipleWindows(false);
                        mWebSettings.setJavaScriptCanOpenWindowsAutomatically(false);
                        mWebSettings.setLoadWithOverviewMode(true);
                        mWebSettings.setUseWideViewPort(true);
                        mWebSettings.setSupportZoom(false);
                        mWebSettings.setBuiltInZoomControls(false);
                        mWebSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
                        mWebSettings.setCacheMode(WebSettings.LOAD_NO_CACHE);
                        mWebSettings.setDomStorageEnabled(true);
                        mWebView.loadUrl("https://www.youtube.com/watch?v=gL4EAcEhEAU");
                    }
                });

                }
            });

        return view;
    }
}
