package com.example.studyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class physicsscheme extends AppCompatActivity {
    ListView listView;
    String items[]= new String [] {"THERMAL PHYSICS", "THERMAL PHYSICS 2", "KINEMATICS", "WORK ENERGY AND POWER", "CAPACITORS","CHARGE,CURRENT AND RESISTANCE","FORCES","DYNAMICS","IDEAL GASES"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physicsscheme);
        listView = findViewById(R.id.listView5);
        ArrayAdapter<String> myadapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,items);
        listView.setAdapter(myadapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String item = listView.getItemAtPosition(i).toString();
                Intent intent = new Intent(physicsscheme.this,physicspdf.class);
                intent.putExtra("pdfFileName", item);
                startActivity(intent);

            }
        });



    }
}