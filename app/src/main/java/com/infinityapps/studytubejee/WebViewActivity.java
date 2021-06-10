package com.infinityapps.studytubejee;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import java.net.HttpURLConnection;

public class WebViewActivity extends AppCompatActivity {
    public double playback;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

       // if(){}

        Button fullScreen = findViewById(R.id.fullscreen);
        fullScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConstraintLayout.LayoutParams params =
                        new ConstraintLayout.LayoutParams(WindowManager.LayoutParams.MATCH_PARENT,
                                WindowManager.LayoutParams.MATCH_PARENT);

            }
        });
        String videoId = getIntent().getStringExtra("WEBVIDEO");
        WebView webView = findViewById(R.id.webview);
        String title =webView.getTitle();
        WebSettings webSettings = webView.getSettings();
        webSettings.setAppCacheEnabled(false);
        webView.clearCache(true);
        // For Desktop to show settings
        String newUA= "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12) AppleWebKit/602.1.50 (KHTML, like Gecko) Version/10.0 Safari/602.1.50";
        webView.getSettings().setUserAgentString(newUA);

        webSettings.setJavaScriptEnabled(true);
        webSettings.setJavaScriptCanOpenWindowsAutomatically(true);
        webSettings.setPluginState(WebSettings.PluginState.ON);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setUseWideViewPort(true);

        webView.setWebChromeClient(new WebChromeClient());
        webView.setPadding(0, 0, 0, 0);

        playback = 1.0;

       String html = "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "    <meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\">\n" +
                "    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js\"></script>\n" +
                "    <title></title>\n" +
                "\n" +
                "    <style type=\"text/css\">\n" +
                "\n" +
                "    iframe {\n" +
                "      position: absolute;\n" +
                "      border: none;\n" +
                "      box-sizing: border-box;\n" +
                "      width: 98.2%;\n" +
                "      height: 98%;\n" +
                "    }\n" +
                "  </style>\n" +
                "\n" +
                "    <script>\n" +
                "\n" +
                "    var player;\n" +
                "\n" +
                "    // init player\n" +
                "    function onYouTubeIframeAPIReady() {\n" +
                "      player = new YT.Player('player', {\n" +
                "        height: '0',\n" +
                "        width: '0',\n" +
                "        //videoId: 'Orw8CZpzIDU',\n" +
                "        suggestedQuality: 'hd720',\n" +
                "        playerVars: {rel: 1,showinfo:1},\n" +
                "        events: {\n" +
                "          'onReady': onPlayerReady,\n" +
                "          'onStateChange': onPlayerStateChange\n" +
                "        }\n" +
                "      });\n" +
                "\n" +
                "    }\n" +
                "\n" +
                "\n" +
                "\n" +
                "    function loadVideo(target){\n" +
                "      target.loadVideoById('"+videoId+"', 0, 'hd720');\n" +
                "    }\n" +
                "\n" +
                "    function onPlayerStateChange(event) {\n" +
                "\n" +
                "        var playbackQuality = event.target.getPlaybackQuality();\n" +
                "        var suggestedQuality = 'hd720';\n" +
                "\n" +
                "        console.log(\"Quality changed to: \" + playbackQuality );\n" +
                "\n" +
                "        if( playbackQuality !== 'hd720') {\n" +
                "            console.log(\"Setting quality to \" + suggestedQuality );\n" +
                "            event.target.setPlaybackQuality( suggestedQuality );\n" +
                "        }\n" +
                "\n" +
                "        console.log(event.data + \" et \" + YT.PlayerState.PLAYING);\n" +
                "    }\n" +
                "\n" +
                "    // when ready, wait for clicks\n" +
                "    function onPlayerReady(event) {\n" +
                "      event.target.setPlaybackQuality('hd720');\n" +
                "      var player = event.target;\n" +
                "      player.setPlaybackRate("+playback+"); // 4x speed\n" +
               "         player.getOptions()\n" +
                "      loadVideo(player);\n" +
                "\n" +
                "      return false;\n" +
                "    }\n" +
                "\n" +
                "  </script>\n" +
                "</head>\n" +
                "\n" +
                "<body id=\"body\">\n" +
                "\n" +
                "<div id=\"video_div\">\n" +
                "\n" +
                "    <script src=\"https://www.youtube.com/iframe_api\"></script>\n" +
                "\n" +
                "    <div id=\"bottom\">\n" +
                "        <div id=\"player\"></div>\n" +
                "    </div>\n" +
                "\n" +
                "</div>\n" +
                "\n" +
                "</body>\n" +
                "\n" +
                "</html>";


        final String mimeType = "text/html";
        final String encoding = "UTF-8";
       webView.loadDataWithBaseURL("", html, mimeType, encoding, "");

    }
}