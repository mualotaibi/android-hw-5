package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.ActionProvider;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapp.R;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

            public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        final TextView name = findViewById(R.id.name);
        final TextView age = findViewById(R.id.age);
        final TextView your = findViewById(R.id.yourjob);
        final TextView phone = findViewById(R.id.phone);
        final TextView Email = findViewById(R.id.Email);

        final Button next = findViewById(R.id.button);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // name = munera , age = 16
                String thename = name.getText().toString();
                String theage = age.getText().toString();
                String thejob = your.getText().toString();
                String thephone = phone.getText().toString();
                String theemail = Email.getText().toString();

                if (name.getText().toString().equals("munera") && age.getText().toString().equals("16") && your.getText().toString().equals("ENG")) {
                    Toast.makeText(MainActivity.this, "done", Toast.LENGTH_SHORT).show();
                    //another
                    Intent m = new Intent(MainActivity.this, Activity2.class);
                    m.putExtra("the", thename);
                    m.putExtra("age", theage);
                    m.putExtra("job", thejob);
                    m.putExtra("phone", thephone);
                    m.putExtra("email", theemail);
                    startActivity(m);


                } else {
                    Toast.makeText(MainActivity.this, "WERONG ", Toast.LENGTH_SHORT).show();
                }
            }

                });

            }
        }