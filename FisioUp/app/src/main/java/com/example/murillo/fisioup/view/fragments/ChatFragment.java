package com.example.murillo.fisioup.view.fragments;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.murillo.fisioup.R;

/**
 * Created by Mukajihh on 23/04/2016.
 */
public class ChatFragment extends Fragment{

    public static ChatFragment newInstance(){
        return new ChatFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_chat_activity, container, false);
        EditText editText = (EditText) view.findViewById(R.id.message_content);
        return view;
    }
}
