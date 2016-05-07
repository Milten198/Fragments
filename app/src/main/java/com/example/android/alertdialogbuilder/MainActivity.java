package com.example.android.alertdialogbuilder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showDialogMessage(View view) {
        MyDialogMessage myDialog = new MyDialogMessage();
        myDialog.show(getFragmentManager(), "myDialog");
    }

    public void showDialogList(View view) {
        MyDialogList myDialogList = new MyDialogList();
        myDialogList.show(getFragmentManager(), "myDialogList");
    }

    public void showDialogMultipleChoiceList(View view) {
        MyDialogMultipleChoice myDialogMultipleChoice = new MyDialogMultipleChoice();
        myDialogMultipleChoice.show(getFragmentManager(), "myDialogMultipleChoice");
    }
}
