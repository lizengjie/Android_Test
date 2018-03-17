package com.cloudlife.application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class ImageViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);
        ImageView imageView = (ImageView) findViewById(R.id.image1);
        Glide.with(this).load("http://d.lanrentuku.com/down/png/1712/if_christmass_holidays_celebrate/christmass_star_2.png").into(imageView);
    }
}
