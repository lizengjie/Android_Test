package com.cloudlife.application;

import android.graphics.Paint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.widget.TextView;

public class TextViewActivity extends AppCompatActivity {
    private TextView mTV_4,mTV_5,mTV_6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);
        mTV_4 = (TextView) findViewById(R.id.txt_4);
        mTV_4.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);
        mTV_4.getPaint().setAntiAlias(true);
        mTV_5 = (TextView) findViewById(R.id.txt_5);
        mTV_5.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);
        mTV_5.getPaint().setAntiAlias(true);
        mTV_6 = (TextView) findViewById(R.id.txt_6);
        mTV_6.setText(Html.fromHtml("<u>第五个实验-方法二</u>"));
    }
}
