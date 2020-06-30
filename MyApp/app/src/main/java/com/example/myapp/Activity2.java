package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        final EditText name = (EditText)findViewById(R.id.name);
        EditText age = (EditText)findViewById(R.id.age);
        EditText job = (EditText)findViewById(R.id.yourjob);
        EditText phone = (EditText)findViewById(R.id.phone);
        EditText email = (EditText)findViewById(R.id.Email);
        String t = name.getText().toString();
        String b = age.getText().toString();
        String s = job.getText().toString();
        String c = phone.getText().toString();
        String u = email.getText().toString();


        Toast.makeText(Activity2.this,"this is your CV :" + name , Toast.LENGTH_SHORT).show();

        final Button back = findViewById(R.id.button);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Activity2.this,MainActivity.class);
                startActivity(i);


            }
        });
    }
}