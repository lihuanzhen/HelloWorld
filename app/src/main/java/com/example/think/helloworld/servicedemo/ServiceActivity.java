package com.example.think.helloworld.servicedemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.think.helloworld.R;

public class ServiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);
    }
  public void  startClick(View v){
      Intent intent =new Intent(this,MyService.class);
      startService(intent);
  }

    public void  stopClick(View v){
        Intent intent =new Intent(this,MyService.class);
        stopService(intent);
    }
}
