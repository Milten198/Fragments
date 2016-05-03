package com.example.android.fragmenttransaction;


import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentB extends Fragment{

    @Override
    public void onAttach(Context context) {
        Log.v("MILT", "Fragment B onAttach");
        super.onAttach(context);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.v("MILT", "Fragment B onCreate");
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.v("MILT", "Fragment B onCreateView");
        View view = inflater.inflate(R.layout.fragment_b, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        Log.v("MILT", "Fragment B onActivityCreated");
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.v("MILT", "Fragment B onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.v("MILT", "Fragment B onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.v("MILT", "Fragment B onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.v("MILT", "Fragment B onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.v("MILT", "Fragment B onDetach");
    }
}
