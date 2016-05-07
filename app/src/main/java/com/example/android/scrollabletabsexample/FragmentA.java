package com.example.android.scrollabletabsexample;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentA extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_a, container, false);
    }

    @Override
    public void onAttach(Context context) {
        Log.v("MILT", "OnAttach");
        super.onAttach(context);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.v("MILT", "OnCreate");
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            Log.v("MILT", "FIRST TIME");
        } else {
            Log.v("MILT", "SUBSEQUENT TIME");
        }
    }

    @Override
    public void onStart() {
        Log.v("MILT", "OnStart");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.v("MILT", "OnResume");
        super.onResume();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        Log.v("MILT", "OnSaveInstanceState");
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onPause() {
        Log.v("MILT", "OnPause");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.v("MILT", "OnStop");
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        Log.v("MILT", "OnDestroyView");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.v("MILT", "OnDestroy");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.v("MILT", "OnDetach");
        super.onDetach();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        Log.v("MILT", "OnActivityCreated");
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        Log.v("MILT", "OnViewCreated");
        super.onViewCreated(view, savedInstanceState);
    }
}
