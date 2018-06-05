package com.example.pooja.auxilio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {

    private ImageView Logo_text_app;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        Logo_text_app = (ImageView)findViewById(R.id.Logo_text_app);

        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.mtransition);
        Logo_text_app.startAnimation(myanim);

        final Intent intent = new Intent(this, MainActivity.class);
        Thread timer = new Thread(){

            public void run(){
                try {
                    sleep(2000);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
                finally {
                    startActivity(intent);
                    finish();
                }
            }
        };

        timer.start();

    }
}
