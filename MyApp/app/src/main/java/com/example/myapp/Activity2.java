package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        TextView h = findViewById(R.id.textView8);
        Bundle m = getIntent().getExtras();
        String name = m.getString("The");
        String age = m.getString("age");
        String job = m.getString("job");
        String phone = m.getString("phone");
        String email = m.getString("email");

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