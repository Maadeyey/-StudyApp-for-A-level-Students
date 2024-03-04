package com.example.studyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class chemistryscheme extends AppCompatActivity {
    ListView listView;
    String items[]= new String [] {"CHEMISTRY FIRST SEMESTER","CHEMISTRY SECOND SEMESTER","CHEMISTRY THIRD SEMESTER","CHEMISTRY EXAM PAST QUESTION 1","CHEMISTRY EXAM PAST QUESTION 2","CHEMISTRY EXAM PAST QUESTION 3",
            "CHEMISTRY EXAM PAST QUESTION 4","CHEMISTRY EXAM PAST QUESTION 5"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chemistryscheme);

        listView = findViewById(R.id.listView1);
        ArrayAdapter<String> myadapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,items);
        listView.setAdapter(myadapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String item = listView.getItemAtPosition(i).toString();
                Intent intent = new Intent(chemistryscheme.this,chemistryPdf.class);
                intent.putExtra("pdfFileName", item);
                startActivity(intent);


            }
        });

    }
}