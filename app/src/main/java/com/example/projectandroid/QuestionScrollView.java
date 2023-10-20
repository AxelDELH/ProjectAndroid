package com.example.projectandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class QuestionScrollView extends AppCompatActivity {

    private Button Next; //Button Suivant
    private Button Back; //Button Retour
    private static final String Log_TAG = "Intent Log";
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_scroll_view);

        this.Next = findViewById(R.id.button_next_scrollview);
        this.Back = findViewById(R.id.button_back_scrollview);

        //les spinners de l'activité
        Spinner answerSpinner1 = findViewById(R.id.answerSpinner1);
        Spinner answerSpinner2 = findViewById(R.id.answerSpinner2);
        Spinner answerSpinner3 = findViewById(R.id.answerSpinner3);

        //Avec ce code, le Spinner sera rempli avec les options définies dans le tableau de ressources.
        SharedPreferences sharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        //spinner1
        answerSpinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                String selectedAnswer1 = answerSpinner1.getSelectedItem().toString();
                editor.putString("spinnerValue1", selectedAnswer1);
                editor.apply();
                Log.d(Log_TAG, "Valeur enregistrer spinner1 " + selectedAnswer1); //log
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // Aucune réponse sélectionnée
            }
        });

        //spinner2
        answerSpinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                String selectedAnswer2  = answerSpinner2.getSelectedItem().toString();
                editor.putString("spinnerValue2", selectedAnswer2);
                editor.apply();
                Log.d(Log_TAG, "Valeur enregistrer spinner2 " + selectedAnswer2); //log
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // Aucune réponse sélectionnée
            }
        });

        //spinner3
        answerSpinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                String selectedAnswer3 = answerSpinner3.getSelectedItem().toString();
                editor.putString("spinnerValue3", selectedAnswer3);
                editor.apply();
                Log.d(Log_TAG, "Valeur enregistrer spinner3 " + selectedAnswer3); //log
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // Aucune réponse sélectionnée
            }
        });

        //Code Boutons Suivant et Retour
        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Créez une intention vers la question suivante
                Intent intent = new Intent(QuestionScrollView.this, resultatRace.class);
                Log.d(Log_TAG, "creation d'intent QRadio");
                //transfer de la réponse à insérer ici ???
                startActivity(intent);
                Log.d(Log_TAG, "Lancement du test");
            }
        });
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(Log_TAG, "bouton close");
                // Appeler finish() pour dépiler l'activité actuelle et revenir à l'activité précédente
                finish();
            }
        });

    }

}