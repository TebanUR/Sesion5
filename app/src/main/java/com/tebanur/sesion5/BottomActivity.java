package com.tebanur.sesion5;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class BottomActivity extends AppCompatActivity {

    FragmentManager fm;
    FragmentTransaction ft;
    private TextView mTextMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom);

        fm = getFragmentManager();
        ft = fm.beginTransaction();

        Superman frag = new Superman();
        ft.add(android.R.id.content, frag).commit();

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelected);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelected
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        ft = fm.beginTransaction();
            switch (item.getItemId()) {
                case R.id.mSuperman:
                    Superman frag = new Superman();
                    ft.replace(android.R.id.content, frag).commit();
                    return true;
                case R.id.mBatman:
                    Batman frag2 = new Batman();
                    ft.replace(android.R.id.content, frag2).commit();
                    return true;
                case R.id.mFlash:
                    Flash frag3 = new Flash();
                    ft.add(android.R.id.content, frag3).commit();
                    return true;
            }
            return false;
        }
    };



}
