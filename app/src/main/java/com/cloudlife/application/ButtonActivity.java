package com.cloudlife.application;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ButtonActivity extends AppCompatActivity {
    private Button sub_btn6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        sub_btn6 = (Button) findViewById(R.id.sub_Btn6);
        sub_btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ButtonActivity.this,"按钮6被点击了",Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void showtoast(View view){
        Toast.makeText(this,"按钮5被点击了",Toast.LENGTH_SHORT).show();
    }
}
