package com.example.aplikasimobile;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class TriktrikActivity extends AppCompatActivity {

    public ImageView btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triktrik);

        PDFView pdfView =findViewById(R.id.pdf_view);
        pdfView.fromAsset("trik2.pdf")
                .enableSwipe(true)
                .enableDoubletap(true)
                .load();
        btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(v -> finish());
    }
}