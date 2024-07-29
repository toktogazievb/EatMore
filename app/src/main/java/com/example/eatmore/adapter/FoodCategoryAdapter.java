package com.example.eatmore.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.eatmore.FoodCategory;
import com.example.eatmore.R;
import com.example.eatmore.databinding.ItemFoodCategoryBinding;

import java.util.ArrayList;

public class FoodCategoryAdapter extends RecyclerView.Adapter<FoodCategoryAdapter.FoodCategoryViewHolder> {

    private ArrayList<FoodCategory> foodCategories;

    public FoodCategoryAdapter(ArrayList<FoodCategory> foodCategories) {
        this.foodCategories = foodCategories;
    }

    @NonNull
    @Override
    public FoodCategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new FoodCategoryViewHolder(ItemFoodCategoryBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull FoodCategoryViewHolder holder, int position) {
        holder.bind(foodCategories.get(position));
    }

    @Override
    public int getItemCount() {
        return foodCategories.size();
    }
    static class FoodCategoryViewHolder extends RecyclerView.ViewHolder{

        public ItemFoodCategoryBinding viewBinding;

        public FoodCategoryViewHolder(@NonNull ItemFoodCategoryBinding viewBinding) {
            super(viewBinding.getRoot());
            this.viewBinding = viewBinding;
        }

        public void bind(FoodCategory foodCategory){
            viewBinding.ivLogo.setImageDrawable(foodCategory.getIcFoodCategory());
            viewBinding.tvText.setText(foodCategory.getName());
        }
    }
}


