package com.example.murillo.fisioup.view.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.murillo.fisioup.R;
import com.example.murillo.fisioup.view.fragments.NavigationDrawerFragment;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.base_drawer_navigation);
    }

}
