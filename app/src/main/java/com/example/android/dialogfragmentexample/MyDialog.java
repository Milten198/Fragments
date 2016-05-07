package com.example.android.dialogfragmentexample;

import android.app.Activity;
import android.app.DialogFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MyDialog extends DialogFragment implements View.OnClickListener {
    Button yes, no;
    Communicator communicator;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        communicator = (Communicator) activity;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        setCancelable(false);
        View view = inflater.inflate(R.layout.my_dialog_layout, null, false);
        no = (Button) view.findViewById(R.id.no);
        yes = (Button) view.findViewById(R.id.yes);
        no.setOnClickListener(this);
        yes.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.no) {
            dismiss();
            communicator.respond("No was clicked");
        } else if (view.getId() == R.id.yes) {
            dismiss();
            communicator.respond("Yes was clicked");
        }
    }

    interface Communicator {
        public void respond(String message);
    }
}
