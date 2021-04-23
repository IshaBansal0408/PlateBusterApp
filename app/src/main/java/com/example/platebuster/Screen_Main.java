package com.example.platebuster;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;

public class Screen_Main extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    FloatingActionButton cam,up;
    float v=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen__main);

        tabLayout = findViewById(R.id.tab_layout);
        viewPager = findViewById(R.id.view_pager);
        cam = findViewById(R.id.float_camera);
        up = findViewById(R.id.float_upload);

        tabLayout.addTab(tabLayout.newTab().setText("Enter data"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final InputAdapter adapter = new InputAdapter(getSupportFragmentManager(),this,tabLayout.getTabCount());
        viewPager.setAdapter(adapter);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        cam.setTranslationY(300);
        up.setTranslationY(300);
        tabLayout.setTranslationY(300);

        cam.setAlpha(v);
        up.setAlpha(v);
        tabLayout.setAlpha(v);

        cam.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(400).start();
        up.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(600).start();
        tabLayout.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(100).start();

    }
}