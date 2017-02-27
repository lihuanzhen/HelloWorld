package com.example.think.helloworld.activitydemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.think.helloworld.R;

public  class MyActivity2 extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_my2);
            Intent i =getIntent();
            String str= i.getStringExtra("username");
            TextView tvName = (TextView) findViewById(R.id.tvwelcome);
            tvName.setText("欢迎"+str+"的登录");
        }
    }