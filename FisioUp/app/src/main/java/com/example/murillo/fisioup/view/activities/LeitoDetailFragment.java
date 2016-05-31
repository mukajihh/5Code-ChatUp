package com.example.murillo.fisioup.view.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.murillo.fisioup.R;
import com.example.murillo.fisioup.model.adapters.NavigationDrawerListAdapter;

import java.util.List;

/**
 * Created by mukajihh on 30/05/2016.
 */
public class LeitoDetailFragment extends Fragment {

    private int position;

    public static LeitoDetailFragment newInstance(int position) {

        Bundle args = new Bundle();

        LeitoDetailFragment fragment = new LeitoDetailFragment();
        fragment.setArguments(args);
        fragment.setPosition(position);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        View view = inflater.inflate(R.layout.fragment_leito_details, null);



        return view;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
