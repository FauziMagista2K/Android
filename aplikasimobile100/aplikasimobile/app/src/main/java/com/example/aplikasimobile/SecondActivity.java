package com.example.aplikasimobile;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    public TextView btnsejarahfotografi, btnjenisjenisfotografi,btnkamera;
    public ImageView btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btnsejarahfotografi = findViewById(R.id.btnsejarahfotografi);
        btnjenisjenisfotografi = findViewById(R.id.btnjenisjenisfotografi);
        btnkamera = findViewById(R.id.btnkamera);

        btnsejarahfotografi.setOnClickListener(v -> {
            Intent intent = new Intent(SecondActivity.this, SejarahActivity.class);
            startActivity(intent);
        });
        btnjenisjenisfotografi.setOnClickListener(v -> {
            Intent intent = new Intent(SecondActivity.this, JenisActivity.class);
            startActivity(intent);
        });
        btnkamera.setOnClickListener(v -> {
            Intent intent = new Intent(SecondActivity.this, JenisActivity.class);
            startActivity(intent);
        });
    }
}