package com.example.classwork;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.classwork.DetailActivity;
import com.example.classwork.Product;
import com.example.classwork.R;

import java.io.Serializable;
import java.util.ArrayList;

public class HomeActivity extends BaseActivity implements ProductAdapter.OnItemClickListener {

    private RecyclerView recyclerView;
    private ProductAdapter productAdapter;
    private ArrayList<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // set toolbar as ActionBar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Khởi tạo RecyclerView và sản phẩm
        recyclerView = findViewById(R.id.productRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        productList = new ArrayList<>();

        // Thêm sản phẩm vào danh sách
        productList.add(new Product("Car 1", 120000, R.drawable.product1, "Product 1"));
        productList.add(new Product("Car 2", 400000, R.drawable.product2, "Product 1"));
        productList.add(new Product("Car 3", 220000, R.drawable.product3, "Product 1"));
        productList.add(new Product("Car 4", 180000, R.drawable.product4, "Product 1"));
        productList.add(new Product("Car 5", 125000, R.drawable.product5, "Product 1"));

        // Khởi tạo ProductAdapter và đặt nó cho RecyclerView
        productAdapter = new ProductAdapter(productList, this);
        recyclerView.setAdapter(productAdapter);
    }


    // Xử lý sự kiện khi một sản phẩm được nhấp vào
    @Override
    public void onItemClick(Product product) {
        Intent intent = new Intent(HomeActivity.this, DetailActivity.class);
        intent.putExtra("product", (Serializable) product);
        startActivity(intent);
    }
}