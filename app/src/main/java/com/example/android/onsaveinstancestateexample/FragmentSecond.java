package com.example.android.onsaveinstancestateexample;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentSecond extends Fragment {
    TextView textView;
    String data;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second, container, false);
        if (savedInstanceState == null) {

        } else {
            data = savedInstanceState.getString("text");
            TextView myText = (TextView) view.findViewById(R.id.textView);
            myText.setText(data);
        }
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        textView = (TextView) getActivity().findViewById(R.id.textView);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("text", data);
    }

    public void changeText(String data) {
        this.data = data;
        textView.setText(data);
    }
}
