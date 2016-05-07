package com.example.android.dialogfragmentexample;

import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements MyDialog.Communicator{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openDialog(View view) {
        MyDialog myDialog = new MyDialog();
        FragmentManager manager = getFragmentManager();
        myDialog.show(manager, "myDialog");
    }

    @Override
    public void respond(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
