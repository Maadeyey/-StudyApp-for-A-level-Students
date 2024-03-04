package com.example.studyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class biologypdf extends AppCompatActivity {
    PDFView pdfView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biologypdf);
        pdfView = findViewById(R.id.pdfviewBiology);
        String getItem = getIntent().getStringExtra("pdfFileName");
        if (getItem.equals("BIOLOGY FIRST SEMESTER")) {
            pdfView.fromAsset("BFS.pdf").load();
        }
        if (getItem.equals("BIOLOGY SECOND SEMESTER")) {
            pdfView.fromAsset("BSS.pdf").load();
        }
        if (getItem.equals("BIOLOGY THIRD SEMESTER")) {
            pdfView.fromAsset("BTS.pdf").load();
        }
    }
}