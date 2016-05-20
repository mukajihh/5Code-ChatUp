package com.example.murillo.fisioup.model.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.murillo.fisioup.R;

import java.util.List;

/**
 * Created by mukajihh on 19/05/2016.
 */
public class LeitoFragmentAdapter extends ArrayAdapter<String>{
    private Activity activity;
    private List<String> list;

    public LeitoFragmentAdapter(Context context, int resource, List<String> objects) {
        super(context, resource, objects);
        list = objects;
        activity = (Activity) context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = activity.getLayoutInflater().inflate(R.layout.item_list_leito_fragment, null);
        Holder holder = new Holder();

        holder.text = (TextView) view.findViewById(R.id.list_text);
        holder.text.setText(list.get(position));

        view.setTag(holder);
        return view;
    }

    private class Holder{
        ImageView ic;
        TextView text;
    }
}
