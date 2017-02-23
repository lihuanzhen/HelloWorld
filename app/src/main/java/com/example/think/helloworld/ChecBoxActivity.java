package com.example.think.helloworld;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class ChecBoxActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chec_box);

        CheckBox cbApple = (CheckBox) findViewById(R.id.cbapple);
        cbApple.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    Toast.makeText(ChecBoxActivity.this,"你选择了苹果",Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(ChecBoxActivity.this,"你取消了苹果",Toast.LENGTH_LONG).show();
            }
        });

        CheckBox cbPear = (CheckBox) findViewById(R.id.cbpear);
        cbPear.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    Toast.makeText(ChecBoxActivity.this,"你选择了梨",Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(ChecBoxActivity.this,"你取消了梨",Toast.LENGTH_LONG).show();
            }
        });


        Button btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder ab = new AlertDialog.Builder(ChecBoxActivity.this);
                ab.setTitle("温馨提示");
                ab.setMessage("你确定要退出吗？");
                ab.setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        ChecBoxActivity.this.finish();
                    }
                });

                ab.setNegativeButton("取消",null);
                ab.create();
                ab.show();
            }
        });


    }
    }
