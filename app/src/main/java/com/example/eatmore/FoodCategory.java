package com.example.eatmore;

import android.graphics.drawable.Drawable;

public class FoodCategory {

    private String name;
    private Drawable icFoodCategory;

    public FoodCategory(String name, Drawable icFoodCategory) {
        this.name = name;
        this.icFoodCategory = icFoodCategory;
    }

    public String getName() {
        return name;
    }

    public Drawable getIcFoodCategory() {
        return icFoodCategory;
    }
}
