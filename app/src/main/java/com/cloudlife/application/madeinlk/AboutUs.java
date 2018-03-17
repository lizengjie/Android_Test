package com.cloudlife.application.madeinlk;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.cloudlife.application.R;

public class AboutUs extends Activity {
    private View mLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        mLayout = findViewById(R.id.aboutus);
        mLayout.getBackground().setAlpha(100);
    }
}
