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

import com.zexu.serialpicture.R;
import com.zexu.serialpicture.ScreenSlidePageFragment;
import com.zexu.serialpicture.service.SerialPictureService;

public class MainActivity extends AppCompatActivity {

    private static final int NUM_PAGES = 5;

    private ViewPager2 viewPager;

    private FragmentStateAdapter pagerAdapter;

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
                return new ScreenSlidePageFragment();
            }

            @Override
            public int getItemCount() {
                return NUM_PAGES;
            }
        }
        //ysh
}