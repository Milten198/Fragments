package com.example.android.onsaveinstancestateexample;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentFirst extends Fragment implements View.OnClickListener {
    Button button;
    int counter = 0;
    Communication communication;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            counter = 0;
        } else {
            counter = savedInstanceState.getInt("counter", 0);
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        communication = (Communication) getActivity();
        button = (Button) getActivity().findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("counter", counter);
    }

    @Override
    public void onClick(View view) {
        counter++;
        communication.respond("You have clicked button: " + counter + " times");
    }
}
