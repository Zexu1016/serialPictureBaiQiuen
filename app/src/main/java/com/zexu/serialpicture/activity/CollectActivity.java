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
    List<Page> pageList = new ArrayList<>();
    boolean had_collect = false;
    private TextView tv_collect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collect);
        CheckBox ck_collect = findViewById(R.id.ck_collect);
        ck_collect.setOnCheckedChangeListener(this);
        Button btn_catalogue = findViewById(R.id.btn_catalogue);
        btn_catalogue.setOnClickListener(this);
        Button btn_collect = findViewById(R.id.btn_collect);
        btn_collect.setOnClickListener(this);
        tv_collect = findViewById(R.id.tv_collect);
    }
    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        //如果选中了，就收藏进收藏目录中
        if(compoundButton.isChecked()&&!had_collect){
            //收藏进目录
            Page page = new Page(/*()getCurrentItem*/);
            pageList.add(page);

            //标记为已经收藏
            had_collect = true;
            tv_collect.setText("已收藏");
            ToastUtil.show(this,"成功收藏此页面");
        }
        //如果已经收藏,再次点击,则将其删除出目录
        else if(had_collect){
            //在目录中删除
            /*getCurrentItem*/
            //pageList.remove();

            //标记为未收藏
            had_collect = false;
            tv_collect.setText("未收藏");
            ToastUtil.show(this,"取消收藏");
        }
    }
    @Override
    public void onClick(View view) {
        switch ( view.getId() ) {
            case R.id.btn_catalogue :
                goToCatalogueActivity();
                break;
            case R.id.btn_collect :
                if(pageList.isEmpty()){
                    ToastUtil.show(this,"你还没有进行收藏过哦，收藏目录是空的");
                }
                else
                    goToCollectCatalogueActivity();
                break;
        }
    }
    public void goToCatalogueActivity() {
        Intent intent = new Intent();
        intent.setClass(this,CatalogueActivity.class);
        startActivity(intent);
    }
    private void goToCollectCatalogueActivity() {
        Intent intent1 = new Intent();
        Bundle bundle = new Bundle();
        //传送收藏了的页面List到目标Activity
        bundle.putParcelable("page", (Parcelable) pageList);
        intent1.putExtras(bundle);
        intent1.setClass(this,CollectCatalogueActivity.class);
        startActivity(intent1);
    }
}