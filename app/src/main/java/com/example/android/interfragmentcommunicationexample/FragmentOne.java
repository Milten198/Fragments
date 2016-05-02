package com.example.android.interfragmentcommunicationexample;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentOne extends Fragment implements View.OnClickListener {
    Button button;
    int counter = 0;
    Communicator communicator;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.first_fragment_layout, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        communicator = (Communicator) getActivity();
        button = (Button) getActivity().findViewById(R.id.buttonInFragOne);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        counter++;
        communicator.respond("Button was clicked: " + counter + " times");
    }
}
