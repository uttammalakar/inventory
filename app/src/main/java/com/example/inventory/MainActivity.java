package com.example.inventory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button total,stockin,stockout,addproduct;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //accotion bar hide
        getSupportActionBar().hide();
        //end
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        total=(Button)findViewById(R.id.total);
        stockin=(Button)findViewById(R.id.stockin);
        stockout=(Button)findViewById(R.id.stockout);
        addproduct=(Button)findViewById(R.id.addproduct);
        //total listener
        total.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Total.class);
                startActivity(intent);
            }
        });
        //stockin listner
        stockin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,StockIn.class);
                startActivity(intent);
            }
        });
        //stockout listener
        stockout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Stockout.class);
                startActivity(intent);
            }
        });
        //addproduct listener
        addproduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Addproduct.class);
                startActivity(intent);
            }
        });

    }
}