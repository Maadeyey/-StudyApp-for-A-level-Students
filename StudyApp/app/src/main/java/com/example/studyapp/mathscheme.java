package com.example.studyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;

import java.io.IOException;
import java.io.InputStream;

public class mathscheme extends AppCompatActivity {
    ListView listView;
    String [] myList = {"BUSINESS MATHEMATICS PAPER 1","BUSINESS MARKING SCHEME 1","BUSINESS MATHEMATICS PAPER 2","BUSINESS MARKING SCHEME 2","BUSINESS MATHEMATICS PAPER 3","BUSINESS MARKING SCHEME 3","SCIENCE AND ENGINEERING MATHEMATICS PAPER 1","MARKING SCHEME 1","SCIENCE AND ENGINEERING MATHEMATICS PAPER 2","MARKING SCHEME 2","SCIENCE AND ENGINEERING MATHEMATICS PAPER 3","MARKING SCHEME 3"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mathscheme);
        listView = findViewById(R.id.listview);
        ArrayAdapter<String> myArrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1,myList);
        listView.setAdapter(myArrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String item = listView.getItemAtPosition(i).toString();
                Intent intent = new Intent(mathscheme.this,mathpdf.class);
                intent.putExtra("pdfFileName", item);
                startActivity(intent);







            }
        });

    }
}
