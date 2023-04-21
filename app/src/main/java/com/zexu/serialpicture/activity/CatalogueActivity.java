package com.zexu.serialpicture.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.zexu.serialpicture.R;
import com.zexu.serialpicture.activity.Adapters.CatalogueAdapter;

import java.util.ArrayList;
import java.util.List;

public class CatalogueActivity extends AppCompatActivity {
    private  List<Page> pages = new ArrayList<Page>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalogue);
        initPages();
        ListView lv_catalogue = findViewById(R.id.lv_catalogue);
        CatalogueAdapter catalogueAdapter = new CatalogueAdapter(this, R.layout.catalogue_item ,pages);
        ListView catalogue = findViewById(R.id.lv_catalogue);
        catalogue.setAdapter(catalogueAdapter);
    }

    private void initPages() {
        Page page1 =new Page(1);
        pages.add(page1);

        Page page2 =new Page(2);
        pages.add(page2);

        Page page3 =new Page(3);
        pages.add(page3);
    }

}