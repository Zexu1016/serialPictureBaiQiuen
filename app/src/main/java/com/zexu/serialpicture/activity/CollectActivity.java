package com.zexu.serialpicture.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import com.zexu.serialpicture.R;
import com.zexu.serialpicture.activity.Utils.ToastUtil;
import com.zexu.serialpicture.service.CollectService;

public class CollectActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener, View.OnClickListener {

    private CollectService collectService;
    boolean had_collect = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collect);
        CheckBox ck_collect = findViewById(R.id.ck_collect);
        ck_collect.setOnCheckedChangeListener(this);
        Button btn_deliver = findViewById(R.id.btn_deliver);
        btn_deliver.setOnClickListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        //如果选中了，就收藏进收藏目录中
        if(compoundButton.isChecked()&&!had_collect){

            had_collect = true; //标记为已经收藏
            ToastUtil.show(this,"成功收藏此页面");
        }
        //如果已经收藏,再次点击,则将其删除出目录
        else if(had_collect){

            had_collect = false;
            ToastUtil.show(this,"取消收藏");
        }
    }

    @Override
    public void onClick(View view) {
        if( view.getId() == R.id.btn_deliver){
            Intent intent = new Intent();
            intent.setClass(this,CatalogueActivity.class);
            startActivity(intent);
        }
    }
}