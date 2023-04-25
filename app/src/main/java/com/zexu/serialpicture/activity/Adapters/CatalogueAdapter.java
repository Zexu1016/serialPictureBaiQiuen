package com.zexu.serialpicture.activity.Adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.zexu.serialpicture.R;
import com.zexu.serialpicture.activity.CatalogueActivity;
import com.zexu.serialpicture.activity.Page;
import com.zexu.serialpicture.activity.Utils.ToastUtil;

import java.util.List;

public class CatalogueAdapter extends ArrayAdapter<Page> {
    private int resourceId;
    List<Page> pageList;
    public CatalogueAdapter(Context context, int textViewResourceId, List<Page> object) {
        super(context, textViewResourceId, object);
        this.resourceId = textViewResourceId;
        pageList = object;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //获得当前的page实例
        Page page = (Page) getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
        TextView textView = view.findViewById(R.id.tv);
        textView.setText( String.valueOf( page.getId() ) );

        return view;
    }

}
