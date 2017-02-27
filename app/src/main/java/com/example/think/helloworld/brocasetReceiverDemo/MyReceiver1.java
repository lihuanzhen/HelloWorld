package com.example.think.helloworld.brocasetReceiverDemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver1 extends BroadcastReceiver {
    public MyReceiver1() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        String str_id=intent.getStringExtra("id");
        Toast.makeText(context, "str_id", Toast.LENGTH_LONG).show();
    }
}
