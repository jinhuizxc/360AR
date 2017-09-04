package com.example.jh.a360ar.about;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

/**
 * Created by Administrator on 2017/9/4.
 */

public class WebViewWrapper extends RelativeLayout {


    private WebView webView;
    private ProgressBar progressBar;
    private String mUrl;
    
    public WebViewWrapper(Context context) {
        super(context);
    }

    public WebViewWrapper(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public WebViewWrapper(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context);
        initWebViewSettings();
        initListener();
    }

    private void initListener() {
    }

    private void initWebViewSettings() {
    }

    private void initView(Context context) {
    }
}
