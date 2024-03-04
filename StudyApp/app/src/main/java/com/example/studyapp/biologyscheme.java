package com.example.studyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class biologyscheme extends AppCompatActivity {
    ListView listView;
    String items[]= new String [] {"BIOLOGY FIRST SEMESTER","BIOLOGY SECOND SEMESTER","BIOLOGY THIRD SEMESTER"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biologyscheme);
        listView = findViewById(R.id.listView7);
        ArrayAdapter<String> myadapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,items);
        listView.setAdapter(myadapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String item = listView.getItemAtPosition(i).toString();
                Intent intent = new Intent(biologyscheme.this,biologypdf.class);
                intent.putExtra("pdfFileName", item);
                startActivity(intent);

            }
        });

    }
}