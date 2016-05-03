package com.example.android.flexiblefragmenuimorecomplex;

import android.app.FragmentManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements FragmentA.Communicator{

    FragmentA fragmentA;
    FragmentB fragmentB;
    FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manager = getFragmentManager();
        fragmentA = (FragmentA) manager.findFragmentById(R.id.fragmentA);
        fragmentA.setCommunicator(this);
    }

    @Override
    public void respond(int index) {
        fragmentB = (FragmentB) manager.findFragmentById(R.id.fragmentB);
        if (fragmentB != null && fragmentB.isVisible()) {
            fragmentB.changeData(index);
        } else {
            Intent intent = new Intent(this, AnotherActivity.class);
            intent.putExtra("index", index);
            startActivity(intent);
        }
    }
}
