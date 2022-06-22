package com.yourname.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    SimpleRecyclerViewAdapter adapter;
    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;

    ArrayList<String> meroApikoData = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        meroApikoData.add("Ravikrishna");
        meroApikoData.add("sapana");
        meroApikoData.add("radha");
        meroApikoData.add("madhav");
        meroApikoData.add("nandan");
        meroApikoData.add("balaram");


        recyclerView = findViewById(R.id.recycler_view);
        adapter = new SimpleRecyclerViewAdapter(meroApikoData);
        layoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}