package com.example.android.scrollabletabsexample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;

public class MainActivity extends FragmentActivity {

    ViewPager viewPager = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager manager = getSupportFragmentManager();
        viewPager = (ViewPager) findViewById(R.id.pager);
        viewPager.setAdapter(new MyAdapter(manager));
    }
}

class MyAdapter extends FragmentPagerAdapter{

    Fragment fragment = null;

    public MyAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
     //   Log.v("MILT", "getItem was called " + position);
        if (position == 0) {
            fragment = new FragmentA();
        }
        if (position == 1) {
            fragment = new FragmentB();
        }
        if (position == 2) {
            fragment = new FragmentC();
        }
        return fragment;
    }

    @Override
    public int getCount() {
     //   Log.v("MILT", "getCount was called");
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "Tab 1";
        }
        if (position == 1) {
            return "Tab 2";
        }
        if (position == 2) {
            return "Tab 3";
        }
        return null;
    }
}
