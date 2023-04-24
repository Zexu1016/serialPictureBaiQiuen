package com.zexu.serialpicture.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.zexu.serialpicture.R;
import com.zexu.serialpicture.activity.Adapters.CatalogueAdapter;
import com.zexu.serialpicture.activity.Utils.ToastUtil;

import java.util.List;

public class CollectCatalogueActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    List<Page> pageList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collect_catalogue);
        //接收传来已收藏的页面
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        pageList = (List<Page>) bundle.getParcelable("page");
        //设置适配器
        CatalogueAdapter catalogueAdapter = new CatalogueAdapter(this, R.layout.catalogue_item ,pageList);//传入页面list
        ListView catalogue = findViewById(R.id.lv_collect_catalogue);
        catalogue.setAdapter(catalogueAdapter);
        catalogue.setOnItemClickListener(this);
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