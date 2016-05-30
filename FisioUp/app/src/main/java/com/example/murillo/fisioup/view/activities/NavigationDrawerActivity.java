package com.example.murillo.fisioup.view.activities;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.murillo.fisioup.R;
import com.example.murillo.fisioup.model.adapters.NavigationDrawerListAdapter;
import com.example.murillo.fisioup.view.fragments.ChatFragment;
import com.example.murillo.fisioup.view.fragments.LeitoFragment;
import com.example.murillo.fisioup.view.fragments.LibraryFragment;

import java.util.ArrayList;

public class NavigationDrawerActivity extends AppCompatActivity{
    public static final int CHAT_POSITION = 0;
    public static final int LEITOS_POSITION = 1;
    public static final int LIBRARY_POSITION = 2;
    private DrawerLayout mDrawerLayout;
    private ListView mDrawerList;
    private ArrayList<String> list = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.base_drawer_navigation);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        final ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        mDrawerList = (ListView) findViewById(R.id.left_drawer);

        list.add("Chat");
        list.add("Leitos");
        list.add("Biblioteca");
        mDrawerList.setAdapter(new NavigationDrawerListAdapter(this, R.layout.item_list_chat_fragment, list));

        mDrawerList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                onNavigationDrawerItemSelected(position);
                drawer.closeDrawer(GravityCompat.START);
            }
        });

        openChat();
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
    }

    public void onNavigationDrawerItemSelected(int position){
        switch (position){
            case CHAT_POSITION :
                openChat();
                break;
            case LEITOS_POSITION :
                openLeito();
                break;
            case LIBRARY_POSITION :
                openLibrary();
                break;
        }
    }

    private void openChat() {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.container, ChatFragment.newInstance(), "ChatFragment");
        fragmentTransaction.commit();
    }

    private void openLeito() {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.container, LeitoFragment.newInstance(), "LeitoFragment");
        fragmentTransaction.commit();
    }

    private void openLibrary() {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.container, LibraryFragment.newInstance(), "LibraryFragment");
        fragmentTransaction.commit();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            Fragment fragment = getSupportFragmentManager().findFragmentByTag("ChatFragment");
            if (fragment != null && fragment.isVisible()){
                super.onBackPressed();
            }else{
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.container, ChatFragment.newInstance(), "ChatFragment");
                fragmentTransaction.commit();
            }
        }
    }
}
