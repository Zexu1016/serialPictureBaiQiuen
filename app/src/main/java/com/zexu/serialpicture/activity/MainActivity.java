package com.zexu.serialpicture.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import com.zexu.serialpicture.R;
import com.zexu.serialpicture.ScreenSlidePageFragment;
import com.zexu.serialpicture.service.SerialPictureService;

public class MainActivity extends AppCompatActivity {

    int[] arr = new int[]{
            R.drawable.fengmian,R.drawable.one, R.drawable.two, R.drawable.three, R.drawable.four, R.drawable.five, R.drawable.six, R.drawable.seven, R.drawable.eight, R.drawable.nine, R.drawable.ten, R.drawable.end
    };
    private static final int NUM_PAGES = 10;

    private ViewPager2 viewPager;

    private FragmentStateAdapter pagerAdapter;

    private SerialPictureService serialPictureService;
    Button catalogue,label,setting,collect;
    ViewPager2 viewPager2;
    RadioButton max,mid,min;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
                Intent intent = new Intent(MainActivity.this, CatalogueActivity.class);
                startActivity(intent);
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
}