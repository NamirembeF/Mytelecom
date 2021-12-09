package com.test.first2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {  
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button= findViewById(R.id.but);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, CountrySelection.class);
                startActivity(intent);

            }
        });


       /*public void onCheckboxClicked(View view) {

     //       boolean checked;
        if (CheckBox.isChecked(R.id.female)) {
            checked = true;
        } else checked = false;


        switch(view.getId()) {
                case R.id.female:
                    if (checked)
                        Toast.makeText(getApplicationContext(), "she is a female", Toast.LENGTH_LONG).show();

            else

                    break;
                case R.id.male:
                    if (checked)
                        Toast.makeText(getApplicationContext(), "he is a male", Toast.LENGTH_LONG).show();

            else


                    break;

            }
        }*/

    }


}