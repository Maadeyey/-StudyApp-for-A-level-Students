package com.example.studyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class physicspdf extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physicspdf);
        pdfView = findViewById(R.id.pdfview3);
        String getItem = getIntent().getStringExtra("pdfFileName");
        if (getItem.equals("THERMAL PHYSICS")) {
            pdfView.fromAsset("14 Thermal Physics - Thermal Properties of Matter.pdf").load();
        }
        if (getItem.equals("THERMAL PHYSICS 2")) {
            pdfView.fromAsset("a2-thermal Physics.pdf").load();
        }

        if (getItem.equals("KINEMATICS")) {
            pdfView.fromAsset("AS.PHYSICS. 3. Kinematics.pdf").load();
        }
        if (getItem.equals("WORK ENERGY AND POWER")) {
            pdfView.fromAsset("AS.PHYSICS.6.WORK ENERGY AND POWER.pdf").load();
        }
        if (getItem.equals("CAPACITORS")) {
            pdfView.fromAsset("CAPACITOR.pdf").load();
        }
        if (getItem.equals("CHARGE,CURRENT AND RESISTANCE")) {
            pdfView.fromAsset("Charge, Current and Resistance.pdf").load();
        }
        if (getItem.equals("FORCES")) {
            pdfView.fromAsset("Chapter 5-forces.pdf").load();
        }
        if (getItem.equals("DYNAMICS")) {
            pdfView.fromAsset("Chapter 4-Dynamics.pdf").load();
        }
        if (getItem.equals("IDEAL GASES")) {
            pdfView.fromAsset("IDEAL GASES.pdf").load();
        }
    }
}