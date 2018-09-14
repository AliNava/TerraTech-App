package mx.terratech.iat.terratech;

import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class Navegador extends AppCompatActivity {


                    private WebView browser;

                        @Override
                        public void onCreate(Bundle savedInstanceState)
                        {
                            super.onCreate(savedInstanceState);
                            setContentView(R.layout.content_navegador);

                            browser = (WebView)findViewById(R.id.webkit);

                            //habilitamos javascript y el zoom
                            browser.getSettings().setJavaScriptEnabled(true);
                            //browser.getSettings().setBuiltInZoomControls(true);

                            //habilitamos los plugins (flash)
                            //browser.getSettings().setPluginsEnabled(true);

                            browser.loadUrl("http://172.20.10.8//login");

                            browser.setWebViewClient(new WebViewClient()
                            {
                                // evita que los enlaces se abran fuera nuestra app en el navegador de android
                                @Override
                                public boolean shouldOverrideUrlLoading(WebView view, String url)
                                {
                                    return false;
                                }

                            });
                        }
                        @Override
                        public void onBackPressed()
                        {
                            finish();
                        }
                    }


