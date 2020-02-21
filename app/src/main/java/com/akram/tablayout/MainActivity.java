package com.akram.tablayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       tabLayout = (TabLayout) findViewById(R.id.tablayout1);
       viewPager = (ViewPager) findViewById(R.id.viewpage);
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        PagerAdapter myAdapter = new PagerAdapter(this, getSupportFragmentManager(),2);
       viewPager.setAdapter(myAdapter);
       tabLayout.setupWithViewPager(viewPager);

    }
}

