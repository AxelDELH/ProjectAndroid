package com.example.projectandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button Quitter;
    private Button Commencer;
    private Button Result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.Quitter = findViewById(R.id.buttonQuit);
        this.Commencer = findViewById(R.id.buttonStart);
        this.Result = findViewById(R.id.buttonRes);
    }
}