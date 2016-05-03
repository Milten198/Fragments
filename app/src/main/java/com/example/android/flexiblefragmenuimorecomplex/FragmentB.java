package com.example.android.flexiblefragmenuimorecomplex;

import android.app.Fragment;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentB extends Fragment{
    TextView textView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b, container, false);
        textView = (TextView) view.findViewById(R.id.textView);
        return view;
    }

    public void changeData(int i) {
        Resources resources = getResources();
        String[] descriptions = resources.getStringArray(R.array.description);
        textView.setText(descriptions[i]);
    }
}
