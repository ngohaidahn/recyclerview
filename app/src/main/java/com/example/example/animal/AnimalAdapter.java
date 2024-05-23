package com.example.example.animal;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.example.R;

import java.util.List;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalAdapter.AnimalViewHolder> {
    private Context mContext;
    private List<Animal> mListAnimal;// ham khoi tao

    public AnimalAdapter(Context mContext) {
        this.mContext = mContext;
        // ham set du lieu
    }

    public AnimalAdapter() {
    }

    public void setData(List<Animal> list) {
        this.mListAnimal = list;
        notifyDataSetChanged();///load du lieu vao AnimalAdapter
    }

    @NonNull
    @Override
    public AnimalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_animal, parent, false);
        return new AnimalViewHolder(view);
        // doi tuong tra ve la View
    }

    @Override
    public void onBindViewHolder(@NonNull AnimalViewHolder holder, int position) {
        // ham set di giu lieu cho Adapter ( set du lieu de hien thi len)
        Animal animal = mListAnimal.get(position);
        if (animal == null) {
            return;
        }

        holder.imgAnimal.setImageResource(animal.getResourceImg());
        holder.tvName.setText(animal.getName());
        holder.cardView.setBackgroundColor(Color.GREEN);


    }

    @Override
    public int getItemCount() {
        //check
        if (mListAnimal != null) {
            return mListAnimal.size();
        }
        return 0;
    }

    public class AnimalViewHolder extends RecyclerView.ViewHolder {
        //noi khai bao nhung thanh phan view co trong view.xml
        private ImageView imgAnimal;
        private TextView tvName;
        private CardView cardView;

        public AnimalViewHolder(@NonNull View itemView) {
            super(itemView);

            //anh xa view
            //gan gia tri khac cho bien o tren
            //itemView.findViewById tim view dua vao id
            imgAnimal = itemView.findViewById(R.id.img_animal);
            tvName = itemView.findViewById(R.id.tv_name_category);
            cardView = itemView.findViewById(R.id.cardView);
        }
    }
}
