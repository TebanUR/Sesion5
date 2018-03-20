package com.tebanur.sesion5;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    FragmentManager fm;
    FragmentTransaction ft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fm = getFragmentManager();
        ft = fm.beginTransaction();

        Superman frag = new Superman();
        ft.add(android.R.id.content, frag).commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        ft = fm.beginTransaction();

        switch (id){
            case R.id.mSuperman:
                Superman frag = new Superman();
                ft.replace(android.R.id.content, frag).commit();
                break;
            case R.id.mBatman:
                Batman frag2 = new Batman();
                ft.replace(android.R.id.content, frag2).commit();
                break;
            case R.id.mFlash:
                Flash frag3 = new Flash();
                ft.add(android.R.id.content, frag3).commit();
                break;

        }

        return super.onOptionsItemSelected(item);

    }
}
