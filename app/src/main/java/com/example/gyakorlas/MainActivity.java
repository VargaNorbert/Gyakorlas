package com.example.gyakorlas;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private EditText mondat;
    private Button nagy,kicsi,szin;
    private TextView szoveg;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button nagy= findViewById(R.id.nagy);
        Button kicsi= findViewById(R.id.kicsi);
        Button szin= findViewById(R.id.szin);
        EditText mondat=findViewById(R.id.mondat);
        TextView szoveg = findViewById(R.id.szoveg);

        nagy.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                szoveg.setText(mondat.getText().toString().toUpperCase(Locale.ROOT));

            }
        });

        kicsi.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                szoveg.setText(mondat.getText().toString().toLowerCase(Locale.ROOT));

            }
        });

        szin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                szoveg.setBackgroundColor(getRandomColor());

            }
        });
    }

    public int getRandomColor(){
        Random rnd = new Random();
        return Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
    }
}