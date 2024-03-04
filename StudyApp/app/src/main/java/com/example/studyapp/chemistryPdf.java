package com.example.studyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class chemistryPdf extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chemistry_pdf);
        pdfView = findViewById(R.id.pdfview);
        String getItem = getIntent().getStringExtra("pdfFileName");
        if (getItem.equals("CHEMISTRY FIRST SEMESTER")) {
            pdfView.fromAsset("FSC.pdf").load();
        }

        if (getItem.equals("CHEMISTRY SECOND SEMESTER")) {
            pdfView.fromAsset("SSC.pdf").load();
        }
        if (getItem.equals("CHEMISTRY THIRD SEMESTER")) {
            pdfView.fromAsset("TSC.pdf").load();
        }
        if (getItem.equals("CHEMISTRY EXAM PAST QUESTION 1")) {
            pdfView.fromAsset("cv11.pdf").load();
        }
        if (getItem.equals("CHEMISTRY EXAM PAST QUESTION 2")) {
            pdfView.fromAsset("cv21.pdf").load();
        }
        if (getItem.equals("CHEMISTRY EXAM PAST QUESTION 3")) {
            pdfView.fromAsset("EOS1.pdf").load();
        }
        if (getItem.equals("CHEMISTRY EXAM PAST QUESTION 4")) {
            pdfView.fromAsset("EOS2.pdf").load();
        }
        if (getItem.equals("CHEMISTRY EXAM PAST QUESTION 5")) {
            pdfView.fromAsset("EOS3.pdf").load();
        }


    }
}