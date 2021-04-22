package com.example.platebuster;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;

public class Intro extends AppCompatActivity {

    ImageView placeholder,title,splashImg;
    LottieAnimationView lottieAnimationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        placeholder = findViewById(R.id.placeholder);
        title = findViewById(R.id.title);
        splashImg = findViewById(R.id.backimg);
        lottieAnimationView = findViewById(R.id.intro_splash);

        splashImg.animate().translationY(-3000).setDuration(1000).setStartDelay(4000);
        placeholder.animate().translationY(2800).setDuration(1000).setStartDelay(4000);
        title.animate().translationY(2800).setDuration(1600).setStartDelay(4000);
        lottieAnimationView.animate().translationY(2800).setDuration(1000).setStartDelay(4000);

    }
}