package com.zexu.serialpicture.activity.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.zexu.serialpicture.R;
import com.zexu.serialpicture.activity.Page;

import java.util.List;

public class CatalogueAdapter extends ArrayAdapter<Page> {
    private int resourceId;
    public CatalogueAdapter(Context context, int textViewResourceId, List<Page> object) {
        super(context, textViewResourceId, object);
        this.resourceId = textViewResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //获得当前的page实例
        Page page = (Page) getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
        TextView textView = view.findViewById(R.id.tv);
        textView.setText( String.valueOf(page.getId() ) );

        return view;
    }
}
