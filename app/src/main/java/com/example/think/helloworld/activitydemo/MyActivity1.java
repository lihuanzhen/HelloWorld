package com.example.think.helloworld.activitydemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.example.think.helloworld.R;

public class MyActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my1);
        System.out.println("Hello");
    }

    public void loginClick(View v){
        EditText et = (EditText) findViewById(R.id.etName);
        Intent intent = new Intent();
        intent.setClass(this,MyActivity2.class);
        intent.putExtra("username",et.getText().toString());
        startActivity(intent);

    }
}
