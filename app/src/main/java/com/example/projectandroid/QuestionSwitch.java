package com.example.projectandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

public class QuestionSwitch extends AppCompatActivity {
    private static final String Log_TAG = "Intent Log";
    private Button Suivant;
    private Button Retour;
    private Switch Mont;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_switch);
        this.Suivant = findViewById(R.id.buttonNext);
        this.Retour = findViewById(R.id.buttonBack2);


        Suivant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean choix  = Mont.isChecked();
                if (choix){
                    String Res = "Montagne";
                }
                else {
                    String Res = "Mer";
                }

                // Créez une intention ver la question suivante
                Intent intent = new Intent(QuestionSwitch.this, QuestionRadio.class);
                Log.d(Log_TAG, "creation d'intent QSwitch");
                //transfer de la réponse à insérer ici ???
                startActivity(intent);
                Log.d(Log_TAG, "Lancement du test");
            }
        });
        Retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(Log_TAG, "bouton close");
                // Appeler finish() pour dépiler l'activité actuelle et revenir à l'activité précédente
                finish();
            }
        });
    }
}