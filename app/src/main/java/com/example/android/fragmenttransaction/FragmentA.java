package com.example.android.fragmenttransaction;


import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentA extends Fragment {
    @Override
    public void onAttach(Context context) {
        Log.v("MILT", "Fragment A onAttach");
        super.onAttach(context);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.v("MILT", "Fragment A onCreate");
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.v("MILT", "Fragment A onCreateView");
        View view = inflater.inflate(R.layout.fragment_a, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        Log.v("MILT", "Fragment A onActivityCreated");
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.v("MILT", "Fragment A onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.v("MILT", "Fragment A onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.v("MILT", "Fragment A onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.v("MILT", "Fragment A onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.v("MILT", "Fragment A onDetach");
    }
}
