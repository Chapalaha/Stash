package com.example.stash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class Logo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo);

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.animright);
        Animation animation2 = AnimationUtils.loadAnimation(this, R.anim.animleft);


        TextView text = findViewById(R.id.textView);
        text.startAnimation(animation);

        TextView text2 = findViewById(R.id.textView2);
        text2.startAnimation(animation2);

        TextView text3 = findViewById(R.id.textView3);
        text3.startAnimation(animation);

        TextView text4 = findViewById(R.id.textView4);
        text4.startAnimation(animation2);

        TextView text5 = findViewById(R.id.textView5);
        text5.startAnimation(animation);

        TextView text6 = findViewById(R.id.textView6);
        text6.startAnimation(animation2);

        TextView text7 = findViewById(R.id.textView7);
        text7.startAnimation(animation);

        TextView text8 = findViewById(R.id.textView8);
        text8.startAnimation(animation2);

        TextView text9 = findViewById(R.id.textView9);
        text9.startAnimation(animation);

        TextView text10 = findViewById(R.id.textView10);
        text10.startAnimation(animation2);

        TextView text11 = findViewById(R.id.textView11);
        text11.startAnimation(animation);

        TextView text12 = findViewById(R.id.textView12);
        text12.startAnimation(animation2);

        TextView text13 = findViewById(R.id.textView13);
        text13.startAnimation(animation);

        TextView text14 = findViewById(R.id.textView14);
        text14.startAnimation(animation2);

        TextView text15 = findViewById(R.id.textView15);
        text15.startAnimation(animation);

        TextView text16 = findViewById(R.id.textView16);
        text16.startAnimation(animation2);

        TextView text17 = findViewById(R.id.textView17);
        text17.startAnimation(animation);

        TextView text18 = findViewById(R.id.textView18);
        text18.startAnimation(animation2);

        TextView text19 = findViewById(R.id.textView19);
        text19.startAnimation(animation);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable(){
            @Override
            public void run() {
                Intent intent = new Intent(Logo.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 4000);



    }
}