package com.s1vann.payplayer;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.getcapacitor.BridgeActivity;

public class MainActivity extends BridgeActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // Full screen mode
        getWindow().setFlags(
            android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,
            android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN
        );
    }

    // ===== TV REMOTE CONTROL SUPPORT =====
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        // Forward D-pad/remote keys to the WebView
        // Your website can listen for keydown events
        WebView webView = getBridge().getWebView();
        if (webView != null) {
            // Pass the key event to the WebView
            webView.dispatchKeyEvent(event);
        }
        return super.onKeyDown(keyCode, event);
    }
}
