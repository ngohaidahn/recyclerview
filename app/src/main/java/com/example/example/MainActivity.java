package com.example.example;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.example.animal.Animal;
import com.example.example.animal.AnimalAdapter;
import com.example.example.category.Category;
import com.example.example.category.CategoryAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rcvCategory;
    private CategoryAdapter categoryAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        rcvCategory = findViewById(R.id.rcv_category);
        categoryAdapter = new CategoryAdapter(this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        rcvCategory.setLayoutManager(linearLayoutManager);

        categoryAdapter.setData(getListCategory());
        rcvCategory.setAdapter(categoryAdapter);
    }

    private List<Category> getListCategory(){
        List<Category> listCategory = new ArrayList<>();
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal(R.drawable.cat,"meo"));
        animals.add(new Animal(R.drawable.dog,"Cho"));

        animals.add(new Animal(R.drawable.clock,"dong ho"));
        animals.add(new Animal(R.drawable.check,"hihi"));

        animals.add(new Animal(R.drawable.clock,"dong ho"));
        animals.add(new Animal(R.drawable.check,"hihi"));

        animals.add(new Animal(R.drawable.cat,"meo"));
        animals.add(new Animal(R.drawable.check,"hihi"));
        animals.add(new Animal(R.drawable.cat,"meo"));
        animals.add(new Animal(R.drawable.dog,"Cho"));

        animals.add(new Animal(R.drawable.clock,"dong ho"));
        animals.add(new Animal(R.drawable.check,"hihi"));
        animals.add(new Animal(R.drawable.cat,"meo"));
        animals.add(new Animal(R.drawable.dog,"Cho"));

        animals.add(new Animal(R.drawable.clock,"dong ho"));
        animals.add(new Animal(R.drawable.check,"hihi"));

        listCategory.add(new Category("Category 1", animals));
        listCategory.add(new Category("Category 2", animals));

        listCategory.add(new Category("Category 3", animals));

        listCategory.add(new Category("Category 1", animals));

        listCategory.add(new Category("Category 2", animals));

        return  listCategory;
    }
}