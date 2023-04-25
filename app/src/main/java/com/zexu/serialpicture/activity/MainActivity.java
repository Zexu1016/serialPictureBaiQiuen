package com.zexu.serialpicture.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.zexu.serialpicture.R;
import com.zexu.serialpicture.service.SerialPictureService;

public class MainActivity extends AppCompatActivity {

    private SerialPictureService serialPictureService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ysh
    }
}