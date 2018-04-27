package com.easylife.recyclerviewdemo;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);

        initData();

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void initData() {
        layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        List<Integer> avatars = new ArrayList<>();
        List<String> names = new ArrayList<>();
        List<String> describes = new ArrayList<>();
        for(int i = 0;i<10;i++){
            avatars.add(R.drawable.ic_launcher_background);
            names.add("曾老师"+i);
            describes.add("曾老师"+i+"是个傻逼");
        }
        adapter = new MyAdapter(avatars,names,describes);
    }
}
