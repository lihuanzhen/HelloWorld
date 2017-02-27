package com.example.think.helloworld.brocasetReceiverDemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.think.helloworld.R;

public class BroadCaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broad_case);
    }

    public void sendBroadcast(View v){
        Intent intent =new Intent("com.edu.MyBroad");
        intent.putExtra("id","123456");
        this.sendBroadcast(intent);
    }
}
