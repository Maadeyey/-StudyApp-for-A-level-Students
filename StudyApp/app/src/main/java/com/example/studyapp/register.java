package com.example.studyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class register extends AppCompatActivity {
    EditText username, password, repassword;
    Button signup, signin;
    DBHelper Logdb;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        repassword = (EditText)findViewById(R.id.repassword);
        signup = (Button) findViewById(R.id.btnsignup);
        signin = (Button) findViewById(R.id.btnsignin);
        Logdb = new DBHelper(getApplicationContext());

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = username.getText().toString();
                String pass = password.getText().toString();
                String repass = repassword.getText().toString();

                if(user.equals("")||pass.equals("")||repass.equals(""))
                    Toast.makeText(getApplicationContext(), "Please enter all the fields", Toast.LENGTH_SHORT).show();
                else{
                    if(pass.equals(repass)){
                        Boolean checkuser = Logdb.checkusername(user);
                        if(checkuser==false){
                            Boolean insert = Logdb.insertData(user,pass);
                            if(insert==true){
                                Toast.makeText(getApplicationContext(),"Registered Successfully", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getApplicationContext().getApplicationContext(),bottomnav.class);
                                startActivity(intent);
                            }else{
                                Toast.makeText(getApplicationContext(), "Registration Failed",Toast.LENGTH_SHORT).show();
                            }

                        }
                        else{
                            Toast.makeText(getApplicationContext(),"User already exists! please sign in", Toast.LENGTH_SHORT).show();
                        }

                    }else{
                        Toast.makeText(getApplicationContext(),"Passwords not matching",Toast.LENGTH_SHORT).show();
                    }

                }

            }


        });
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), login.class);
                startActivity(intent);

            }
        });



    }
}