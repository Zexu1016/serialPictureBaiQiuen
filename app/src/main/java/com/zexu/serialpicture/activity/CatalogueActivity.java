package com.zexu.serialpicture.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.zexu.serialpicture.R;
import com.zexu.serialpicture.activity.Adapters.CatalogueAdapter;
import com.zexu.serialpicture.activity.Utils.ToastUtil;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CatalogueActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private  List<Page> pageList = new ArrayList<Page>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalogue);
        initPages();
        CatalogueAdapter catalogueAdapter = new CatalogueAdapter(this, R.layout.catalogue_item ,pageList);
        ListView catalogue = findViewById(R.id.lv_catalogue);
        catalogue.setAdapter(catalogueAdapter);
        catalogue.setOnItemClickListener(this);
    }

    private void initPages() {
        //添加目录号进目录中
        for(int i=1;i<36;i++){
            Page page = new Page(i);
            pageList.add(page);
        }
    }
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
        /*
        跳转到所点击的页面
        (这里与另外一个目录文件类似，后续可以创建DeliverUtil类在Util中，调用其中编写的方法进行传输)
        */

        //(viewPager) = setCurrentItem(pageList.get(position).getId());
        ToastUtil.show(this,"跳转到"+pageList.get(position).getId()+"号页面");
    }
}