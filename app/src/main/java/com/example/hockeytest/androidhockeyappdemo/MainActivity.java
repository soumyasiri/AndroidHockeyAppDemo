package com.example.hockeytest.androidhockeyappdemo;

import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends ActivityBase {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        super.onCreate(savedInstanceState);
        getSupportFragmentManager().beginTransaction().add(R.id.activity_content, new FragmentOne(), "Content").commit();
        Menu bottomNavigationViewMenu = mBottomNav.getMenu();
        bottomNavigationViewMenu.findItem(R.id.action_one).setChecked(true);
    }
}
