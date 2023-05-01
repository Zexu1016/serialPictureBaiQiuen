package com.zexu.serialpicture.activity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;

import com.zexu.serialpicture.R;
import com.zexu.serialpicture.ScreenSlidePageFragment;
import com.zexu.serialpicture.activity.Utils.ToastUtil;
import com.zexu.serialpicture.service.SerialPictureService;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    int[] arr = new int[]{
            R.drawable.fengmian,R.drawable.one, R.drawable.two, R.drawable.three, R.drawable.four, R.drawable.five, R.drawable.six, R.drawable.seven, R.drawable.eight, R.drawable.nine, R.drawable.ten, R.drawable.end
    };
    private static final int NUM_PAGES = 10;
    private static final int CatalogueResultCode = 1000;
    List<Page> pageList = new ArrayList<>();
    boolean had_collect = false;
    private TextView tv_collect;
    private ViewPager2 viewPager;

    private FragmentStateAdapter pagerAdapter;

    private SerialPictureService serialPictureService;
    Button catalogue,label,setting,collect,ck_collect;
    ViewPager2 viewPager2;
    RadioButton max,mid,min;
    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        setContentView(R.layout.activity_main);
        CheckBox ck_collect = findViewById(R.id.ck_collect);
        ck_collect.setOnCheckedChangeListener(this::onClick);
        Button btn_catalogue = findViewById(R.id.catalogue);

        btn_catalogue.setOnClickListener(this::onClick);
        Button btn_collect = findViewById(R.id.collect);

        btn_collect.setOnClickListener(this::onClick);
        tv_collect = findViewById(R.id.tv_collect);



        catalogue = findViewById(R.id.catalogue);
        label = findViewById(R.id.label);
        collect = findViewById(R.id.collect);
        setting = findViewById(R.id.setting);
        viewPager = findViewById(R.id.viewpager2);
        pagerAdapter = new MainActivity.ScreenSlidePagerAdapter(this);
        viewPager.setAdapter(pagerAdapter);

        catalogue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();

                intent.setClass(MainActivity.this,CatalogueActivity.class);
                intent.putExtra("cnt", arr.length);
                startActivityForResult(intent, CatalogueResultCode);
            }
        });

        label.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LabelActivity.class);
                startActivity(intent);
            }
        });

        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SettingActivity.class);
                startActivity(intent);
            }
        });

        collect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CollectActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if(requestCode == CatalogueResultCode) {
            assert data != null;
            int which = data.getIntExtra("which", 0);
            viewPager.setCurrentItem(which);
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    private void onClick(CompoundButton compoundButton, boolean b) {
    }

    @Override
        public void onBackPressed() {
            if (viewPager.getCurrentItem() == 0) {
                // If the user is currently looking at the first step, allow the system to handle the
                // Back button. This calls finish() on this activity and pops the back stack.
                super.onBackPressed();
            } else {
                // Otherwise, select the previous step.
                viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
            }
        }

        private class ScreenSlidePagerAdapter extends FragmentStateAdapter {
            public ScreenSlidePagerAdapter(FragmentActivity fa) {
                super(fa);
            }

            @Override
            public Fragment createFragment(int position) {
                return new ScreenSlidePageFragment(arr[position]);
            }

            @Override
            public int getItemCount() {
                return arr.length;
            }
        }
        //ysh


    public void onClick(View view) {
        switch ( view.getId() ) {
            case R.id.btn_catalogue :
                goToCatalogueActivity();
                break;
            case R.id.collect:
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

}