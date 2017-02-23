package com.example.think.helloworld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public int add(int a,int b){
        return a-b;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        setContentView(R.layout.new_layout);

        Button btn1 = (Button) findViewById(R.id.btnCal);
        btn1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                EditText etData1 = (EditText) findViewById(R.id.etdata1);
                EditText etData2 = (EditText) findViewById(R.id.etdata2);
                int a = Integer.parseInt ( etData1.getText().toString());
                int b= Integer.parseInt ( etData2.getText().toString());
                String str = Integer.toString(add(a,b));
                Toast.makeText(MainActivity.this,str,Toast.LENGTH_LONG).show();
            }
        });
    }



}
