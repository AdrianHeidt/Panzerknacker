package com.example.panzerknacker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Formulare extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulare);
        Button button= (Button) findViewById(R.id.button10);
        Button button5=(Button) findViewById(R.id.button5);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(Formulare. this,antrag1.class);
                startActivity(intent1);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2=new Intent(Formulare. this,antrag2.class);
                startActivity(intent2);
            }
        });



    }
}
