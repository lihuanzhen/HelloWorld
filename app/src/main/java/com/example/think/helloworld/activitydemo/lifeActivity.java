package com.example.think.helloworld.activitydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.think.helloworld.R;

public class lifeActivity extends AppCompatActivity {

    /**
     *  被创建时调用的第一个方法，注册事件，加载布局文件，初始化ＵＩ组件
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life);
        System.out.println("onCreate");
    }

    /**
     *开始显示界面，还不能进行交互
     */
    @Override
    protected void onStart() {
        super.onStart();
        System.out.print("onStart");
    }
    /**
     * 执行完成后，可以交互，进入Resume状态
     * PAUSE状态的activity进入Resume状态也会调用这个方法
     */

    @Override
    protected void onResume() {
        super.onResume();
        System.out.print("onResume");
    }
    /**
     *当其他activity透明或窗口模式，进入时，执行该方法，进入PAUSE状态；
     * 当前activity可见，但不可交互；其它更高优先级需要内存时，有可能被kill
     * 当前activity被返回时会调用onResume()
     */

    @Override
    protected void onPause() {
        super.onPause();
        System.out.print("onPause");
    }

    /**
     *当其他activity透完全覆盖，不可见，不可交互，该方法会被调用，进入Stop状态
     * 其它更高优先级activity需要内存时，有可能被kill
     * 当前activity被返回时会调用onRestart()方法
     */
    @Override
    protected void onStop() {
        super.onStop();
        System.out.print("onStop");
    }


    /**
     * 当处于Stop状态的Activity被返回时调用，之后调用onStart()
     */
    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.print("onRestart");
    }

    /**
     * 当前Activity被销毁时调用，通常在该方法释放资源
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.print("onDestroy");
    }
}
