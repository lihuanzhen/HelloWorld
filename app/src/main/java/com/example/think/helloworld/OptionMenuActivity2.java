package com.example.think.helloworld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class OptionMenuActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option_menu2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0,100,1,"娱乐新闻");
        menu.add(0,200,2,"体育新闻");
        menu.add(0,300,3,"军事新闻");
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case 100:
                Toast.makeText( OptionMenuActivity2.this,"你选择了娱乐新闻", Toast.LENGTH_SHORT).show();
                return true;
            case 200:
                Toast.makeText( OptionMenuActivity2.this,"你选择了体育新闻", Toast.LENGTH_SHORT).show();
                return true;
            case 300:
                Toast.makeText( OptionMenuActivity2.this,"你选择了军事新闻", Toast.LENGTH_SHORT).show();

                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
