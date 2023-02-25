package com.example.classwork;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.squareup.picasso.Picasso;

public class DetailActivity extends BaseActivity {
    private ImageView productImage;
    private TextView productName;
    private TextView productDescription;
    private TextView productPrice;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // find views
        productImage = findViewById(R.id.product_image);
        productName = findViewById(R.id.product_name);
        productDescription = findViewById(R.id.product_description);
        productPrice = findViewById(R.id.product_price);

        // get product from Intent
        Intent intent = getIntent();
        Product product = (Product) getIntent().getSerializableExtra("product");


        ImageButton addToCartButton = findViewById(R.id.btn_add_to_cart);
        addToCartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Xử lý thêm sản phẩm vào giỏ hàng
                Toast.makeText(v.getContext(), R.string.add_to_cart_success_message, Toast.LENGTH_SHORT).show();
            }
        });

        // display product info
        Picasso.get().load(product.getImageResourceId()).into(productImage);
        productName.setText(product.getName());
        productDescription.setText(product.getDescription());
        productPrice.setText(String.valueOf(product.getPrice())+"đ");
    }
}
