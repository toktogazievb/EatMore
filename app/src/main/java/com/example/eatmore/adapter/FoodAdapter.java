package com.example.eatmore.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.eatmore.Food;
import com.example.eatmore.databinding.ItemFoodBinding;

import java.util.ArrayList;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodViewHolder>{

    private ArrayList<Food> foods;

    public FoodAdapter(ArrayList<Food> foods) {
        this.foods = foods;
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new FoodViewHolder(ItemFoodBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {
        holder.bind(foods.get(position));
    }

    @Override
    public int getItemCount() {
        return foods.size();
    }

    static class FoodViewHolder extends RecyclerView.ViewHolder{

        public ItemFoodBinding viewBinding;

        public FoodViewHolder(@NonNull ItemFoodBinding viewBinding) {
            super(viewBinding.getRoot());
            this.viewBinding = viewBinding;
        }

        public void bind(Food food){
            viewBinding.ivFood.setImageDrawable(food.getIcFood());
            viewBinding.tvPrice.setText(food.getPrice().toString());
            viewBinding.tvFoodName.setText(food.getName());
        }
    }
}
