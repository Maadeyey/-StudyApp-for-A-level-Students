package com.example.studyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class mathpdf extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mathpdf);
        pdfView = findViewById(R.id.mathpdfview);
        String getItem = getIntent().getStringExtra("pdfFileName");
        if(getItem.equals("BUSINESS MATHEMATICS PAPER 1")){
            pdfView.fromAsset("paper1.pdf").load();
        }

        if(getItem.equals("BUSINESS MARKING SCHEME 1")){
            pdfView.fromAsset("paper1ms.pdf").load();
        }

        if(getItem.equals("BUSINESS MATHEMATICS PAPER 2")){
            pdfView.fromAsset("paper2.pdf").load();
        }
        if(getItem.equals("BUSINESS MARKING SCHEME 2")){
            pdfView.fromAsset("paper2ms.pdf").load();
        }

        if(getItem.equals("BUSINESS MATHEMATICS PAPER 3")){
            pdfView.fromAsset("paper3.pdf").load();
        }
        if(getItem.equals("BUSINESS MARKING SCHEME 3")){
            pdfView.fromAsset("paper3ms.pdf").load();
        }
        if(getItem.equals("SCIENCE AND ENGINEERING MATHEMATICS PAPER 1")){
            pdfView.fromAsset("SEF1.pdf").load();
        }
        if(getItem.equals("MARKING SCHEME 1")){
            pdfView.fromAsset("SEF1MS.pdf").load();
        }
        if(getItem.equals("SCIENCE AND ENGINEERING MATHEMATICS PAPER 2")){
            pdfView.fromAsset("SEF2.pdf").load();
        }
        if(getItem.equals("MARKING SCHEME 2")){
            pdfView.fromAsset("SEF2MS.pdf").load();
        }
        if(getItem.equals("SCIENCE AND ENGINEERING MATHEMATICS PAPER 3")){
            pdfView.fromAsset("SEF3.pdf").load();
        }
        if(getItem.equals("MARKING SCHEME 3")){
            pdfView.fromAsset("SEF3MS.pdf").load();
        }
    }
}