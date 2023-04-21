package com.zexu.serialpicture.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.zexu.serialpicture.R;
import com.zexu.serialpicture.service.impl.LabelServiceImpl;

public class LabelActivity extends AppCompatActivity {
    private LabelServiceImpl labelService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_label);
    }
}