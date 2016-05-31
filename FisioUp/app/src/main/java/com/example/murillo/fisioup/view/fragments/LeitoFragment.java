package com.example.murillo.fisioup.view.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.murillo.fisioup.R;
import com.example.murillo.fisioup.model.adapters.LeitoFragmentAdapter;
import com.example.murillo.fisioup.view.activities.LeitoDetailFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mukajihh on 23/04/2016.
 */
public class LeitoFragment extends Fragment{

    public static LeitoFragment newInstance(){
        return new LeitoFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

//      TODO retirar para coletar diretamente do banco
        ArrayList<String> list = new ArrayList<String>();
        for (int i=1; i<=10; i++){
            list.add("Leito " + i);
    }

        View view = inflater.inflate(R.layout.fragment_leito_activity, container, false);
        ListView listView = (ListView) view.findViewById(R.id.list_leito);
        listView.setAdapter(new LeitoFragmentAdapter(getContext(), R.layout.item_list_leito_fragment, list));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                openLeitoDetails(position);
            }
        });



        return view;
    }

    private void openLeitoDetails(int position) {
        FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.container, LeitoDetailFragment.newInstance(position), "LeitoDetailFragment");
        fragmentTransaction.commit();
    }

}
