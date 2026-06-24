package com.example.mymobileapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private GridAdapter adapter;
    private List<TableItem> itemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);

        prepareData();

        adapter = new GridAdapter(this, itemList);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerView.setAdapter(adapter);
    }

    private void prepareData() {
        itemList = new ArrayList<>();

        // REPLACE R.drawable.xxx with your actual image names
        itemList.add(new TableItem("iPhone 15", "Electronics", 999.99, 10, R.drawable.iphone));
        itemList.add(new TableItem("Samsung TV", "Electronics", 799.50, 5, R.drawable.tv));
        itemList.add(new TableItem("Nike Shoes", "Fashion", 129.99, 20, R.drawable.nicke));
        itemList.add(new TableItem("Coffee Maker", "Home", 89.99, 15, R.drawable.coffeemaker));
        itemList.add(new TableItem("Headphones", "Electronics", 59.99, 30, R.drawable.headphones));
        itemList.add(new TableItem("Backpack", "Fashion", 49.99, 12, R.drawable.backpack));
        itemList.add(new TableItem("Laptop", "Electronics", 1299.99, 8, R.drawable.laptop));
        itemList.add(new TableItem("Watch", "Accessories", 199.99, 25, R.drawable.watch));
    }
}