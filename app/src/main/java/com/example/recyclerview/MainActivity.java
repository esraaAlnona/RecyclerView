package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mrecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutmanager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item(R.drawable.image1,"line1","line2"));
        items.add(new Item(R.drawable.image1,"line2","line3"));
        items.add(new Item(R.drawable.image1,"line3","line4"));
        items.add(new Item(R.drawable.image1,"line4","line5"));
        items.add(new Item(R.drawable.image1,"line5","line6"));
        items.add(new Item(R.drawable.image1,"line1","line2"));
        items.add(new Item(R.drawable.image1,"line2","line3"));
        items.add(new Item(R.drawable.image1,"line3","line4"));
        items.add(new Item(R.drawable.image1,"line4","line5"));
        items.add(new Item(R.drawable.image1,"line5","line6"));
        items.add(new Item(R.drawable.image1,"line1","line2"));
        items.add(new Item(R.drawable.image1,"line2","line3"));
        items.add(new Item(R.drawable.image1,"line3","line4"));
        items.add(new Item(R.drawable.image1,"line4","line5"));
        items.add(new Item(R.drawable.image1,"line5","line6"));

        mrecyclerView = findViewById(R.id.recyclerView);
        mrecyclerView.setHasFixedSize(true);
        mLayoutmanager = new LinearLayoutManager(this);
        mrecyclerView.setLayoutManager(mLayoutmanager);
        mAdapter = new ItemAdapter(items);
        mrecyclerView.setAdapter(mAdapter);

    }
}