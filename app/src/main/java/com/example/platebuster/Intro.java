package com.example.platebuster;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;

public class Intro extends AppCompatActivity {

    ImageView placeholder,title,splashImg;
    LottieAnimationView lottieAnimationView;

    private static final int No_pges = 3;
    private ViewPager viewPager;
    private Screen_Slide_Page_Adapter pageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        placeholder = findViewById(R.id.placeholder);
        title = findViewById(R.id.title);
        splashImg = findViewById(R.id.backimg);
        lottieAnimationView = findViewById(R.id.intro_splash);

        viewPager = findViewById(R.id.pager);
        pageAdapter = new Screen_Slide_Page_Adapter(getSupportFragmentManager());
        viewPager.setAdapter(pageAdapter);

        splashImg.animate().translationY(-3000).setDuration(1000).setStartDelay(4000);
        placeholder.animate().translationY(2800).setDuration(1000).setStartDelay(4000);
        title.animate().translationY(2800).setDuration(1600).setStartDelay(4000);
        lottieAnimationView.animate().translationY(2800).setDuration(1000).setStartDelay(4000);

    }
    private class Screen_Slide_Page_Adapter extends FragmentStatePagerAdapter{

        public Screen_Slide_Page_Adapter(@NonNull FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:
                    fragment_intro1 t1 = new fragment_intro1();
                    return t1;
                case 1:
                    fragment_intro2 t2 = new fragment_intro2();
                    return t2;
                case 2:
                    fragment_intro3 t3 = new fragment_intro3();
                    return t3;
            }
            return null;
        }

        @Override
        public int getCount() {
            return No_pges;
        }
    }
}