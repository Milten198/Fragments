package com.example.android.alertdialogcustom;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showDialog(View view) {
        CustomDialogAlert customDialogAlert = new CustomDialogAlert();
        customDialogAlert.show(getFragmentManager(), "customDialogAlert");
    }

    public void showDialogAsAFragment(View view) {
        CustomDialogAlert customDialogAlert = new CustomDialogAlert();
        FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.group, customDialogAlert, "customDialogAlert");
        transaction.commit();
    }
}
