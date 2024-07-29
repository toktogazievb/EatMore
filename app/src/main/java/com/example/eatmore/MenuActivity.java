package com.example.eatmore;

import static androidx.core.content.ContentProviderCompat.requireContext;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.eatmore.adapter.FoodAdapter;
import com.example.eatmore.adapter.FoodCategoryAdapter;
import com.example.eatmore.databinding.ActivityMenuBinding;

import java.util.ArrayList;

public class MenuActivity extends AppCompatActivity {

    private ActivityMenuBinding viewBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        viewBinding = ActivityMenuBinding.inflate(getLayoutInflater());
        setContentView(viewBinding.getRoot());

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ArrayList<FoodCategory> foodCategories = new ArrayList<>();
        FoodCategory foodCategory1 = new FoodCategory("Burgers", getDrawable(R.drawable.ic_logo_hamburger));
        FoodCategory foodCategory2 = new FoodCategory("Pizza", getDrawable(R.drawable.ic_logo_pizza));
        FoodCategory foodCategory3 = new FoodCategory("Chicken", getDrawable(R.drawable.ic_logo_chicken));
        foodCategories.add(foodCategory1);
        foodCategories.add(foodCategory2);
        foodCategories.add(foodCategory3);

        FoodCategoryAdapter foodCategoryAdapter = new FoodCategoryAdapter(foodCategories);

        LinearLayoutManager layoutManager
                = new LinearLayoutManager(MenuActivity.this, LinearLayoutManager.HORIZONTAL, false);
        viewBinding.rvFoodCategory.setLayoutManager(layoutManager);
        viewBinding.rvFoodCategory.setAdapter(foodCategoryAdapter);


        ArrayList<Food> foods = new ArrayList<>();
        Food burger1 = new Food("Salad Burger", 12, getDrawable(R.drawable.burger_one));
        Food burger2 = new Food("Chicken Burger", 15, getDrawable(R.drawable.burger_one));
        foods.add(burger1);
        foods.add(burger2);
        LinearLayoutManager layoutManager2
                = new LinearLayoutManager(MenuActivity.this, LinearLayoutManager.HORIZONTAL, false);

        FoodAdapter foodAdapter = new FoodAdapter(foods);
        viewBinding.rvFood.setLayoutManager(layoutManager2);
        viewBinding.rvFood.setAdapter(foodAdapter);


    }

}