package com.test.first2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CountrySelection extends AppCompatActivity {
    Button button1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_selection);
       button1=findViewById(R.id.butx);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
           public void onClick(View view) {
                Intent intent=new Intent(CountrySelection.this, Services.class);
               startActivity(intent);

           }
       });
    }
}