package com.example.foodorderingapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    Button login,signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Objects.requireNonNull(getSupportActionBar()).hide();
        login = findViewById(R.id.btnlogin);
        signUp = findViewById(R.id.btnsignup);

        login.setOnClickListener(v -> {
            Toast.makeText(MainActivity.this, "login is clicked", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(MainActivity.this,LogIn.class);
            startActivity(intent);
        });

        signUp.setOnClickListener(v -> {
            Toast.makeText(MainActivity.this, "signUp is clicked", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(MainActivity.this,SignUp.class);
            startActivity(intent);
        });
    }
}