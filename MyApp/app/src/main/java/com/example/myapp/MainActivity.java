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

import org.w3c.dom.Text;

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
                String namee = name.getText().toString();
                String agge = age.getText().toString();
                String yyour = your.getText().toString();
                String pphone = phone.getText().toString();
                String emaill = Email.getText().toString();


                    Intent m = new Intent(MainActivity.this, Activity2.class);
                    m.putExtra("name", namee);
                    m.putExtra("age", agge);
                    m.putExtra("job", yyour);
                    m.putExtra("phone", pphone);
                    m.putExtra("email", emaill);
                    startActivity(m);

            }

                });

            }
        }