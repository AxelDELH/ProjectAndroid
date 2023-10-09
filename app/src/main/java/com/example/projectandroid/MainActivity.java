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
    private boolean region = false;

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
                //Identifier l’unité choisie en regardant quel valeur selectionner dans le spinner1.
                String spinner = Choice.getSelectedItem().toString();
                region= spinner.equals("Région");

                if (region) {
                    // Créez une intention pour démarrer le quizz des regions
                    Intent intent = new Intent(MainActivity.this, QuestionButton.class);
                    Log.d(Log_TAG, "creation d'intent Race");
                    startActivity(intent);
                    Log.d(Log_TAG, "Lancement du test");
                }else{
                    // Créez une intention pour démarrer le quizz des races
                    Intent intent = new Intent(MainActivity.this, QuestionSeekbar.class);
                    Log.d(Log_TAG, "creation d'intent Région");
                    startActivity(intent);
                    Log.d(Log_TAG, "Lancement du test");
                }
            }
        });

    }
}