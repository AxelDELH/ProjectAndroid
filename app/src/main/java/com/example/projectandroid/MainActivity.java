package com.example.projectandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    private static final String Log_TAG = "Intent Log";
    private Button Quitter;
    private Button Commencer;
    private Button Result;
    private Spinner Choice;
    private EditText Pseudo;
    private boolean region;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.Quitter = findViewById(R.id.buttonQuit);
        this.Commencer = findViewById(R.id.buttonStart);
        this.Result = findViewById(R.id.buttonRes);
        this.Choice = findViewById(R.id.spinnerChoix);
        this.Pseudo = findViewById(R.id.editTextPseudo);

        Commencer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Créez une intention pour démarrer InfoPokemon ActivityB
                Intent intent = new Intent(MainActivity.this, QuestionButton.class);
                Log.d(Log_TAG, "creation d'intent");
                startActivity(intent);
                Log.d(Log_TAG, "Lancement du test");
            }
        });
    }
}