package codemonkey.test;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;


@SuppressLint("SetJavaScriptEnabled")
public class ExemploWebViewActivity extends Activity {
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_main);
        WebView web = (WebView) findViewById(R.id.webView);
        web.loadUrl("http://www.livroandroid.com.br");
    }
}