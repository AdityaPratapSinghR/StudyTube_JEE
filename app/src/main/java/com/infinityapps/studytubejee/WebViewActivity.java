package com.infinityapps.studytubejee;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.Layout;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import org.imaginativeworld.oopsnointernet.callbacks.ConnectionCallback;
import org.imaginativeworld.oopsnointernet.dialogs.signal.DialogPropertiesSignal;
import org.imaginativeworld.oopsnointernet.dialogs.signal.NoInternetDialogSignal;

import java.net.HttpURLConnection;

public class WebViewActivity extends AppCompatActivity {
    public double playback;
    WebView webView;
    int fullScreenView = 0;
    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        hideSystemUI();

        String videoId = getIntent().getStringExtra("WEBVIDEO");

      /*  getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();*/

        View decorView = getWindow().getDecorView();
        decorView.setOnSystemUiVisibilityChangeListener
                (new View.OnSystemUiVisibilityChangeListener() {
                    @Override
                    public void onSystemUiVisibilityChange(int visibility) {
                        // Note that system bars will only be "visible" if none of the
                        // LOW_PROFILE, HIDE_NAVIGATION, or FULLSCREEN flags are set.
                        if ((visibility & View.SYSTEM_UI_FLAG_FULLSCREEN) == 0) {
                            // TODO: The system bars are visible. Make any desired
                            Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                public void run() {
                                    // Actions to do after 10 seconds
                                    hideSystemUI();
                                }
                            }, 4000);

                            // adjustments to your UI, such as showing the action bar or
                            // other navigational controls.
                        } else {
                            // TODO: The system bars are NOT visible. Make any desired
                           // hideSystemUI();
                            // adjustments to your UI, such as hiding the action bar or
                            // other navigational controls.
                        }
                    }
                });




    // No Internet Dialog: Signal
        NoInternetDialogSignal.Builder builder = new NoInternetDialogSignal.Builder(
                this,
                getLifecycle()
        );

        DialogPropertiesSignal properties = builder.getDialogProperties();

        properties.setConnectionCallback(new ConnectionCallback() { // Optional
            @Override
            public void hasActiveConnection(boolean hasActiveConnection) {
                // ...
            }
        });

        properties.setCancelable(false); // Optional
        properties.setNoInternetConnectionTitle("No Internet"); // Optional
        properties.setNoInternetConnectionMessage("Check your Internet connection and try again"); // Optional
        properties.setShowInternetOnButtons(true); // Optional
        properties.setPleaseTurnOnText("Please turn on"); // Optional
        properties.setWifiOnButtonText("Wifi"); // Optional
        properties.setMobileDataOnButtonText("Mobile data"); // Optional

        properties.setOnAirplaneModeTitle("No Internet"); // Optional
        properties.setOnAirplaneModeMessage("You have turned on the airplane mode."); // Optional
        properties.setPleaseTurnOffText("Please turn off"); // Optional
        properties.setAirplaneModeOffButtonText("Airplane mode"); // Optional
        properties.setShowAirplaneModeOffButtons(true); // Optional

        builder.build();

        Button description = findViewById(R.id.description);
        description.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(WebViewActivity.this,DescriptionActivity.class);
                intent.putExtra("DESC",videoId);
                startActivity(intent);
            }
        });



         webView = findViewById(R.id.webview);
        String title =webView.getTitle();
        WebSettings webSettings = webView.getSettings();
        webSettings.setAppCacheEnabled(true);
       // webView.clearCache(true);
        // For Desktop to show settings
        String newUA= "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12) AppleWebKit/602.1.50 (KHTML, like Gecko) Version/10.0 Safari/602.1.50";
        webView.getSettings().setUserAgentString(newUA);
       // webView.setBackgroundColor(getResources().getColor(R.color.black));
        webView.setPadding(0,0,0,0);

        webSettings.setJavaScriptEnabled(true);
        webSettings.setJavaScriptCanOpenWindowsAutomatically(true);
        webSettings.setPluginState(WebSettings.PluginState.ON);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setUseWideViewPort(true);
        webView.setWebChromeClient(new WebChromeClient());
       /* webView.setWebChromeClient(new WebChromeClient() {

            @Override
            public void onShowCustomView(View view, CustomViewCallback callback) {
                super.onShowCustomView(view, callback);
            }

            @Override
            public void onHideCustomView() {
                super.onHideCustomView();
            }
        });*/
      //  webView.setPadding(0, 0, 0, 0);

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
                "      width: 100%;\n" +
                "      height: 100%;\n" +
               "       margin: 0;\n" +
               "       padding: 0;\n" +
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
               "         margin: '0',\n" +
               "         padding: '0',\n" +

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
                "<body id=\"body\"style=\"margin: 0; padding: 0\">\n" +
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

   @Override
    public void onBackPressed() {
        webView.clearCache(true);
        webView.destroy();
        super.onBackPressed();
    }



    // Shows the system bars by removing all the flags
// except for the ones that make the content appear under the system bars.
    private void showSystemUI() {
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
    }



    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onResume() {
        super.onResume();
        hideSystemUI();
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onRestart() {
        super.onRestart();
        hideSystemUI();
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        hideSystemUI();
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    private void hideSystemUI() {
        // Enables regular immersive mode.
        // For "lean back" mode, remove SYSTEM_UI_FLAG_IMMERSIVE.
        // Or for "sticky immersive," replace it with SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_IMMERSIVE
                        // Set the content to appear under the system bars so that the
                        // content doesn't resize when the system bars hide and show.
                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        // Hide the nav bar and status bar
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN);
    }
}