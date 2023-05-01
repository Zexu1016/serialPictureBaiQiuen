package com.zexu.serialpicture.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.zexu.serialpicture.R;
import com.zexu.serialpicture.service.SerialPictureService;

public class MainActivity extends AppCompatActivity {

    private SerialPictureService serialPictureService;
    Button catalogue,label,setting;
    ViewPager2 viewPager2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        catalogue = findViewById(R.id.catalogue);
        label = findViewById(R.id.label);
        setting = findViewById(R.id.setting);

        catalogue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,CatalogueActivity.class);
                startActivity(intent);
            }
        });

        //ysh
    }
}