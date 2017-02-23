package com.example.think.helloworld;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class ContextMenuActivity extends AppCompatActivity {

    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_context_menu);
        tv = (TextView) findViewById(R.id.tvcolor);

        //为组件注册上下文菜单
        registerForContextMenu(tv);


    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        //加载菜单资源
        getMenuInflater().inflate(R.menu.contextmenu,menu);
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.red:
                tv.setBackgroundColor(Color.RED);
                return true;
            case R.id.green:
                tv.setBackgroundColor(Color.GREEN);
                return true;
            case R.id.blue:
                tv.setBackgroundColor(Color.BLUE);
                return true;}
        return super.onContextItemSelected(item);
    }


}
