package com.example.android.fragmenttransaction;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements FragmentManager.OnBackStackChangedListener {

    FragmentManager manager;
    TextView textView;

    @Override
    public void onBackPressed() {
        if (manager.getBackStackEntryCount() != 0) {
            manager.popBackStack();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manager = getFragmentManager();
        manager.addOnBackStackChangedListener(this);
        textView = (TextView) findViewById(R.id.message);
    }

    public void addA(View view) {
        FragmentA fragmentA = new FragmentA();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.group, fragmentA, "A");
        transaction.addToBackStack("addA");
        transaction.commit();
    }

    public void removeA(View view) {
        FragmentA fragmentA = (FragmentA) manager.findFragmentByTag("A");
        FragmentTransaction transaction = manager.beginTransaction();
        if (fragmentA != null) {
            transaction.remove(fragmentA);
            transaction.addToBackStack("removeA");
            transaction.commit();
        } else {
            Toast.makeText(this, "There is no fragment A to remove", Toast.LENGTH_SHORT)
                    .show();
        }
    }

    public void replaceAWithB(View view) {
        FragmentB fragmentB = new FragmentB();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.group, fragmentB, "B");
        transaction.addToBackStack("replaceAwithB");
        transaction.commit();
    }

    public void addB(View view) {
        FragmentB fragmentB = new FragmentB();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.group, fragmentB, "B");
        transaction.addToBackStack("addB");
        transaction.commit();
    }

    public void removeB(View view) {
        FragmentB fragmentB = (FragmentB) manager.findFragmentByTag("B");
        FragmentTransaction transaction = manager.beginTransaction();
        if (fragmentB != null) {
            transaction.remove(fragmentB);
            transaction.addToBackStack("removeB");
            transaction.commit();
        } else {
            Toast.makeText(this, "There is no fragment B to remove", Toast.LENGTH_SHORT)
                    .show();
        }
    }

    public void replaceBWithA(View view) {
        FragmentA fragmentA = new FragmentA();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.group, fragmentA, "A");
        transaction.addToBackStack("replaceBWithA");
        transaction.commit();
    }

    public void attachA(View view) {
        FragmentA fragmentA = (FragmentA) manager.findFragmentByTag("A");
        FragmentTransaction transaction = manager.beginTransaction();
        if (fragmentA != null) {
            transaction.attach(fragmentA);
            transaction.addToBackStack("attachA");
            transaction.commit();
        }

    }

    public void detachA(View view) {
        FragmentA fragmentA = (FragmentA) manager.findFragmentByTag("A");
        FragmentTransaction transaction = manager.beginTransaction();
        if (fragmentA != null) {
            transaction.detach(fragmentA);
            transaction.addToBackStack("detachA");
            transaction.commit();
        }
    }

    public void detachB(View view) {
        FragmentTransaction transaction = manager.beginTransaction();
        FragmentB fragmentB = (FragmentB) manager.findFragmentByTag("B");
        if (fragmentB != null) {
            transaction.detach(fragmentB);
            transaction.addToBackStack("detachB");
            transaction.commit();
        } else {
            Toast.makeText(this, "There is no fragment B to attach", Toast.LENGTH_SHORT)
                    .show();
        }
    }

    public void attachB(View view) {
        FragmentB fragmentB = (FragmentB) manager.findFragmentByTag("B");
        FragmentTransaction transaction = manager.beginTransaction();
        if (fragmentB != null) {
            transaction.attach(fragmentB);
            transaction.addToBackStack("attachB");
            transaction.commit();
        } else {
            Toast.makeText(this, "There is no fragment A to attach", Toast.LENGTH_SHORT)
                    .show();
        }
    }

    public void popAddB(View view) {
        manager.popBackStack();
    }

    public void back(View view) {
        manager.popBackStack("addB", FragmentManager.POP_BACK_STACK_INCLUSIVE);
    }

    @Override
    public void onBackStackChanged() {
        textView.setText(textView.getText() + "\n ");
        textView.setText(textView.getText() + "The current status of Back Stack \n");
        Log.v("MILT1", "onBackStackChanged");
        int count = manager.getBackStackEntryCount();
        for (int i = count - 1; i >= 0; i--) {
            FragmentManager.BackStackEntry entry = manager.getBackStackEntryAt(i);
            textView.setText(textView.getText() + " " + entry.getName() + "\n ");
        }
        textView.setText(textView.getText() + "\n ");
    }
}
