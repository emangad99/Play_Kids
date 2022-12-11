package com.example.playkids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 2000;
    TextView play , kids;
    ImageView hi;
    Animation charactanim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        play=findViewById(R.id.play);
        kids=findViewById(R.id.kids);
        hi = findViewById(R.id.hi_1);

        charactanim= AnimationUtils.loadAnimation(this,R.anim.anim1);
        play.startAnimation(charactanim);
        kids.startAnimation(charactanim);
        hi.startAnimation(charactanim);



        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeIntent = new Intent(MainActivity.this, Splash.class);
                startActivity(homeIntent);
                finish();
            }
        },SPLASH_TIME_OUT);

        if (android.os.Build.VERSION.SDK_INT >= 21) {
            Window window = this.getWindow();
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        }

    }
}