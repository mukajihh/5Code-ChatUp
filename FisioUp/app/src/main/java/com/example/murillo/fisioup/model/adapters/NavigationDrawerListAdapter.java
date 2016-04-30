package com.example.murillo.fisioup.model.adapters;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.murillo.fisioup.R;

import org.w3c.dom.Text;

import java.util.zip.Inflater;

/**
 * Created by Carrefour Limão on 27/04/2016.
 */
public class NavigationDrawerListAdapter extends BaseAdapter {

    public static final int CHAT_POSITION = 0;
    public static final int LEITOS_POSITION = 1;
    public static final int LIBRARY_POSITION = 2;

    private Activity activity;

    public NavigationDrawerListAdapter(Activity activity){
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
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
                break;
            case LEITOS_POSITION:
                holder.text.setText("Leitos");
                break;
            case LIBRARY_POSITION:
                holder.text.setText("Biblioteca");
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
