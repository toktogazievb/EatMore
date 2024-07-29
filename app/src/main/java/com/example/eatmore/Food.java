package com.example.eatmore;

import android.graphics.drawable.Drawable;

public class Food {
    private String name;
    private Integer price;
    private Drawable icFood;

    public Food(String name, Integer price, Drawable icFood) {
        this.name = name;
        this.price = price;
        this.icFood = icFood;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return "$"+price;
    }

    public Drawable getIcFood() {
        return icFood;
    }
}
