package com.cclz.myapp_170426_02;

import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clicka(View v){     // 圖片可跟 clickb 交換
        FragmentTransaction ft=getFragmentManager().beginTransaction();
        ft.replace(R.id.layout_main, new FragmentA());
        ft.addToBackStack(null);    // 回前一個畫面
        ft.commit();
    }

    public void clickb(View v){     // 圖片可跟 clicka 交換
        FragmentTransaction ft=getFragmentManager().beginTransaction();
        ft.replace(R.id.layout_main, new FragmentB());
        ft.addToBackStack(null);    // 回前一個畫面
        ft.commit();
    }
}
