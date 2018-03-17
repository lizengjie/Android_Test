package com.cloudlife.application;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    private Button mTV,mBtn,mEText,mRBtn,mIView,mCBox,mLianke;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTV = (Button) findViewById(R.id.Btn_1);
        mBtn= (Button) findViewById(R.id.Btn_2);
        mEText = (Button) findViewById(R.id.Btn_3);
        mRBtn= (Button) findViewById(R.id.Btn_4);
        mIView= (Button) findViewById(R.id.Btn_5);
        mCBox= (Button) findViewById(R.id.Btn_6);
        mLianke= (Button) findViewById(R.id.Btn_18);
        setListener();
    }
    private void setListener(){
        Click click=new Click();
        mTV.setOnClickListener(click);
        mBtn.setOnClickListener(click);
        mEText.setOnClickListener(click);
        mRBtn.setOnClickListener(click);
        mIView.setOnClickListener(click);
        mCBox.setOnClickListener(click);
        mLianke.setOnClickListener(click);
    }
    private class Click implements View.OnClickListener{
        Intent i = null;
        @Override
        public void onClick(View v) {
         switch (v.getId()){
             case R.id.Btn_1:
                 i = new Intent(MainActivity.this,TextViewActivity.class);
                 break;
             case R.id.Btn_2:
                 i = new Intent(MainActivity.this,ButtonActivity.class);
                 break;
             case R.id.Btn_3:
                 i = new Intent(MainActivity.this,EditTextActivity.class);
                 break;
             case R.id.Btn_4:
                 i = new Intent(MainActivity.this,RadioButtonActivity.class);
                 break;
             case R.id.Btn_5:
                 i = new Intent(MainActivity.this,CheckBoxActivity.class);
                 break;
             case R.id.Btn_6:
                 i = new Intent(MainActivity.this,ImageViewActivity.class);
                 break;
             case R.id.Btn_7:
                 i = new Intent(MainActivity.this,ListViewActivity.class);
                 break;
             case R.id.Btn_8:
                 i = new Intent(MainActivity.this,GridViewActivity.class);
                 break;
             case R.id.Btn_9:
                 i = new Intent(MainActivity.this,ScrollViewActivity.class);
                 break;
             case R.id.Btn_10:
                 i = new Intent(MainActivity.this,RecyclerViewActivity.class);
                 break;
             case R.id.Btn_11:
                 i = new Intent(MainActivity.this,WebViewActivity.class);
                 break;
             case R.id.Btn_12:
                 i = new Intent(MainActivity.this,TextViewActivity.class);
                 break;
             case R.id.Btn_13:
                 i = new Intent(MainActivity.this,AlertDialogActivity.class);
                  break;
             case R.id.Btn_14:
                 i = new Intent(MainActivity.this,ProgressBarActivity.class);
                 break;
             case R.id.Btn_15:
                 i = new Intent(MainActivity.this,SelfdefDialogActivity.class);
                 break;
             case R.id.Btn_16:
                 i = new Intent(MainActivity.this,PopupWindowActivity.class);
                 break;
             case R.id.Btn_17:
                 i = new Intent(MainActivity.this,ActivityActivity.class);
                 break;
             case R.id.Btn_18:
                 i = new Intent(MainActivity.this,Lianke.class);

                 break;
         }
            startActivity(i);
        }
    }
}
