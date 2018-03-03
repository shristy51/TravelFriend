package com.example.shristy.travelfriend;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
ImageButton I1,I2,I3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        I1 = (ImageButton)findViewById(R.id.I1);
        I2 = (ImageButton)findViewById(R.id.I2);
        I3 = (ImageButton)findViewById(R.id.I3);
        I1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i1 = new Intent(MainActivity.this, Railway.class);
                startActivity(i1);

            }
        });
        I2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i2 = new Intent(MainActivity.this, Flight.class);
                startActivity(i2);

            }
        });
        I3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i3 = new Intent(MainActivity.this, Bus.class);
                startActivity(i3);

            }
        });


    }
}
