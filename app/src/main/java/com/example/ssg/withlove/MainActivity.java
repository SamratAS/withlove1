package com.example.ssg.withlove;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run()
            {
                Intent homeintent = new Intent(MainActivity.this, home.class);
                startActivity(homeintent);
                finish();
            }
        },SPLASH);

            ImageView image = (ImageView)findViewById(R.id.hrt);
            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.myanimation);
            image.startAnimation(animation);


    }
}
