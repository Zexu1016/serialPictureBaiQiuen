package com.zexu.serialpicture.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import com.zexu.serialpicture.R;
import com.zexu.serialpicture.activity.Utils.ToastUtil;

import java.util.ArrayList;
import java.util.List;

public class CollectActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener, View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collect);
    }

    @Override
    public void onClick(View view) {

    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

    }
}