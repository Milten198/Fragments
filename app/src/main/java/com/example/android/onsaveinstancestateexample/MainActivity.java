package com.example.android.onsaveinstancestateexample;


import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements Communication {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void respond(String data) {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentSecond fragmentSecond = (FragmentSecond) fragmentManager.findFragmentById(R.id.fragment2);
        fragmentSecond.changeText(data);
    }
}
