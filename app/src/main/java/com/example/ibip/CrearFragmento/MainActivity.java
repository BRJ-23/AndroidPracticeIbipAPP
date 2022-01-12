package com.example.ibip.CrearFragmento;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import com.example.ibip.R;

public class MainActivity extends AppCompatActivity {

    FragmentOne mFragmentOne;
    FragmentTwo mFragmentTwo;
    int showingFragment=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_activity);
        mFragmentOne = new FragmentOne();
        mFragmentTwo = new FragmentTwo();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.frameLayout,  mFragmentOne);
        fragmentTransaction.commit();
        showingFragment=1;
    }

    public void switchFragment(View view) {

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        if (showingFragment==1) {
            fragmentTransaction.replace(R.id.frameLayout, mFragmentTwo);
            showingFragment = 2;
        } else {
            fragmentTransaction.replace(R.id.frameLayout, mFragmentOne);
            showingFragment = 1;
        }
        fragmentTransaction.commit();
    }
}