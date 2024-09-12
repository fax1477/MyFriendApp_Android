package com.example.lab11_foodrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.lab11_foodrecyclerview.model.Food;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // เก็บ Food 2 อย่างไว้ใน ArrayList<Food> ชื่อว่า foods
        //
        List<Food> foods = new ArrayList<Food>();
        Food food = new Food();
        food.setFood_name("Alex");
        food.setFood_image("https://media.komchadluek.net/uploads/images/contents/w1024/2021/11/Jlxtkovil5R6Js3lcoP1.jpg?x-image-process=style/lg-webp");
        food.setFood_number("0965348596");
        foods.add(food);

        Food food2 = new Food();
        food2.setFood_name("Justmin");
        food2.setFood_image("https://i.pinimg.com/564x/df/33/71/df337154029f94c4e4a2c147576eafd3.jpg");
        food2.setFood_number("0867913579");
        foods.add(food2);


        // ส่ง foods ไปให้ MyAdapter
        //
        mAdapter = new MyAdapter(foods, this);
        recyclerView.setAdapter(mAdapter);


    }
}