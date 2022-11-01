package com.example.aplikasimobile;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public TextView btnManfaat, btnPengertian, btnTriktrik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnManfaat = findViewById(R.id.btnManfaat);
        btnPengertian = findViewById(R.id.btnPengertian);
        btnTriktrik = findViewById(R.id.btnTriktrik);

        btnManfaat.setOnClickListener(v -> {
            Intent i = new Intent(MainActivity.this, ManfaatActivity.class);
            startActivity(i);
        });

        btnPengertian.setOnClickListener(v -> {
            Intent i = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(i);
        });

        btnTriktrik.setOnClickListener(v -> {
            Intent i = new Intent(MainActivity.this, TriktrikActivity.class);
            startActivity(i);
        });
    }
}