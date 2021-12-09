package com.test.first2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;

public class Services extends AppCompatActivity {

    ImageButton buy1;
    ImageButton home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);
       home=findViewById(R.id.home1);
       home.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent=new Intent(Services.this,Services.class);
               startActivity(intent);

           }
       });
       buy1=findViewById(R.id.buy);
        buy1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Services.this,BuyActivity.class);
                startActivity(intent);
            }
        });

    }

}