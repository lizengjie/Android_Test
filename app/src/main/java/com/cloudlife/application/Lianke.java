package com.cloudlife.application;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.cloudlife.application.madeinlk.AboutUs;
import com.cloudlife.application.madeinlk.JoinUs;

public class Lianke extends AppCompatActivity {
    private MenuItem mMenuItem1,mMenuItem2;
    Intent i = null;
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.lianke_main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.main_1:
                i=new Intent(Lianke.this, AboutUs.class);
                break;
            case R.id.main_2:
                i=new Intent(Lianke.this, JoinUs.class);
                break;
        }
        startActivity(i);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lianke);
    }
}
