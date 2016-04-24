package com.example.murillo.fisioup.view.activities;

import android.content.Intent;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.murillo.fisioup.R;
import com.example.murillo.fisioup.view.fragments.ChatFragment;
import com.example.murillo.fisioup.view.fragments.LeitosFragment;
import com.example.murillo.fisioup.view.fragments.LibraryFragment;
import com.example.murillo.fisioup.view.fragments.NavigationDrawerFragment;

/**
 * Created by Mukajihh on 23/04/2016.
 */
public class NavigationDrawerBaseActivity extends AppCompatActivity implements NavigationDrawerFragment.NavigationDrawerCallbacks{

    private static final String DRAWER_TAB_START_PARAM = "NavigationDrawerBaseActivity.drawerTabStart";

    public static final int CHAT_POSITION = 0;
    public static final int LEITOS_POSITION = 1;
    public static final int BIBLIOTECA_POSITION = 2;
    protected int baseSelectedItem = 0;
    public NavigationDrawerFragment mNavigationDrawerFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        baseSelectedItem = getIntent().getIntExtra(DRAWER_TAB_START_PARAM, 0);
    }


    @Override
    public void onNavigationDrawerItemSelected(int position) {
        switch (position){
            case CHAT_POSITION :
                openChat();
                break;
            case LEITOS_POSITION :
                openLeitos();
                break;
            case BIBLIOTECA_POSITION :
                openLibrary();
        }

        setTheme(R.style.ThemeOverlay_AppCompat_Dark);
    }

    private void openChat() {
        if (this.getClass().getSimpleName().equals("MainActivity")){
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.container, ChatFragment.newInstance());
            fragmentTransaction.commit();
        }else{
            startActivity(new Intent(getApplicationContext(),MainActivity.class));
        }
    }

    private void openLeitos() {
        if (this.getClass().getSimpleName().equals("MainActivity")){
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.container, LeitosFragment.newInstance());
            fragmentTransaction.commit();
        }else{
            startActivity(new Intent(getApplicationContext(),MainActivity.class));
        }
    }

    private void openLibrary() {
        if (this.getClass().getSimpleName().equals("MainActivity")){
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.container, LibraryFragment.newInstance());
            fragmentTransaction.commit();
        }else{
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
        }
    }

    public void changePageTitle(String title) {
        ActionBar actionBar = getSupportActionBar();
        if(title != null && actionBar != null) {
            actionBar.setTitle(title.toUpperCase());
        }
    }

    public void initToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.custom_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(true);
    }


}
