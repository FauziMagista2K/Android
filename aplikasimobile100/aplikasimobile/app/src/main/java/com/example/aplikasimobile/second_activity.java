package com.example.aplikasimobile;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class second_activity extends AppCompatActivity {

    public TextView btnsejarahfotografi, btnjenisjenisfotografi, btnkamera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        btnsejarahfotografi = findViewById(R.id.btnsejarahfotografi);
        btnjenisjenisfotografi = findViewById(R.id.btnjenisjenisfotografi);
        btnkamera = findViewById(R.id.btnkamera);

        btnsejarahfotografi.setOnClickListener(v -> {
            Intent intent = new Intent(second_activity.this, ManfaatActivity.class);
            startActivity(intent);
        });

        btnjenisjenisfotografi.setOnClickListener(v -> {
            Intent intent = new Intent(second_activity.this, PengertianActivity.class);
            startActivity(intent);
        });

        btnkamera.setOnClickListener(v -> {
            Intent intent = new Intent(second_activity.this, TriktrikActivity.class);
            startActivity(intent);
        });
    }
}