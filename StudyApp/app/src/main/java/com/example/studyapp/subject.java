package com.example.studyapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;


public class subject extends Fragment {



    Button button1,button2,button3,button4;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_subject, container, false);




        button1 = (Button) rootView.findViewById(R.id.mathsbutton);
        button2 = (Button) rootView.findViewById(R.id.chemistrybutton);
        button3 = (Button) rootView.findViewById(R.id.physicsbutton);
        button4 = (Button) rootView.findViewById(R.id.biologybutton);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(), mathscheme.class);
                startActivity(intent);

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), chemistryscheme.class);
                startActivity(intent);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), physicsscheme.class);
                startActivity(intent);

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), biologyscheme.class);
                startActivity(intent);

            }
        });

        return rootView;
    }



}