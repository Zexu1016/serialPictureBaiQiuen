package com.zexu.serialpicture;

import android.graphics.BitmapFactory;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class ScreenSlidePageFragment extends Fragment {
    private int imageId;
    public ScreenSlidePageFragment(int imageId) {
        this.imageId = imageId;
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_screen_slide_page, container, false);

        ImageView image = view.findViewById(R.id.main_img);
        image.setImageDrawable(getResources().getDrawable(imageId));
        return view;
    }
}