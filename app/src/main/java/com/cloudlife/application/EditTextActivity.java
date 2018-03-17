package com.cloudlife.application;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EditTextActivity extends AppCompatActivity {
    private EditText mET1,mET2;
    private Button mBtn1,mBtn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);
        mET1 = (EditText) findViewById(R.id.ET1);
        mBtn1 = (Button) findViewById(R.id.ET_Btn1);
        mBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(EditTextActivity.this,"正在进行注册",Toast.LENGTH_SHORT).show();
            }

        });
        mET1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Toast.makeText(EditTextActivity.this,s.toString(),Toast.LENGTH_SHORT).show();
                Log.d("edittext",s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}
