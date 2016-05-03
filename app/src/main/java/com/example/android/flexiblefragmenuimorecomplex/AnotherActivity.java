package com.example.android.flexiblefragmenuimorecomplex;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class AnotherActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        Intent intent = getIntent();
        int index = intent.getIntExtra("index", 0);
        FragmentB fragmentB = (FragmentB) getFragmentManager().findFragmentById(R.id.fragmentB);
        if (fragmentB != null)
            fragmentB.changeData(index);

    }
}
