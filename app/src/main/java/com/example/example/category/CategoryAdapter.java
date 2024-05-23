package com.example.example.category;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.example.R;
import com.example.example.animal.AnimalAdapter;

import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder> {
    private Context context;
    List<Category> mListCategory;

    public CategoryAdapter(Context context) {
        this.context = context;
    }

    public void setData(List<Category> list) {
        mListCategory = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_category, parent, false);

        return new CategoryViewHolder(view);
        // doi tuong tra ve la View
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {
        // ham set di giu lieu cho Adapter ( set du lieu de hien thi len)
        Category category = mListCategory.get(position);
        if (category == null) {
            return;
        }
        holder.tvNameCategory.setText(category.getNameCategory());
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(context,RecyclerView.HORIZONTAL,false);
        holder.rcvAnimal.setLayoutManager(linearLayoutManager);
        AnimalAdapter animalAdapter = new AnimalAdapter();
        animalAdapter.setData(category.getAnimalList());
        holder.rcvAnimal.setAdapter(animalAdapter);

    }

    @Override
    public int getItemCount() {
        if (mListCategory != null) {
            return mListCategory.size();
        }
        return 0;
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder {
        private TextView tvNameCategory;
        private RecyclerView rcvAnimal;

        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNameCategory = itemView.findViewById(R.id.tv_name_category);
            rcvAnimal = itemView.findViewById(R.id.rcv_animal);
        }
    }
}
