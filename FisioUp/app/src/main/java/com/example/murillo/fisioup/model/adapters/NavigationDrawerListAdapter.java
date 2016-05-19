package com.example.murillo.fisioup.model.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.murillo.fisioup.R;

import org.w3c.dom.Text;

import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by mukajihh on 27/04/2016.
 */
public class NavigationDrawerListAdapter extends ArrayAdapter<String> {

    public static final int CHAT_POSITION = 0;
    public static final int LEITOS_POSITION = 1;
    public static final int LIBRARY_POSITION = 2;

    private Activity activity;

    public NavigationDrawerListAdapter(Context context, int resource, List<String> objects) {
        super(context, resource, objects);
        activity = (Activity) context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = activity.getLayoutInflater().inflate(R.layout.item_list_fragment, null);
        Holder holder = new Holder();

        holder.ic = (ImageView) view.findViewById(R.id.list_ic);
        holder.text = (TextView) view.findViewById(R.id.list_text);

        switch (position){
            case CHAT_POSITION:
                holder.text.setText("Chat");
                holder.ic.setImageResource(R.drawable.icone_chat);
                break;
            case LEITOS_POSITION:
                holder.text.setText("Leitos");
                holder.ic.setImageResource(R.drawable.icone_leito);
                break;
            case LIBRARY_POSITION:
                holder.text.setText("Biblioteca");
                holder.ic.setImageResource(R.drawable.icone_biblioteca);
                break;
        }
        view.setTag(holder);
        return view;
    }

    private class Holder{
        ImageView ic;
        TextView text;
    }
}
