package com.example.foodorderingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class LogIn extends AppCompatActivity {
    TextView register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        getSupportActionBar().setTitle("LogIn");

        register = findViewById(R.id.tvRegister);
        register.setOnClickListener(v -> {

            Intent intent = new Intent(LogIn.this,SignUp.class);
            startActivity(intent);
        });
    }
}