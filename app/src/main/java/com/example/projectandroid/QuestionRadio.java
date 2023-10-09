package com.example.projectandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class QuestionRadio extends AppCompatActivity {
    private static final String Log_TAG = "Intent Log";
    private Button Resultat;
    private Button Retour;
    private RadioButton Ville;
    private RadioButton Nature;
    private RadioButton Campagne;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_radio);
        this.Resultat = findViewById(R.id.buttonAffRes);
        this.Retour = findViewById(R.id.buttonBack3);
        this.Ville = findViewById(R.id.radioButtonVille);
        this.Nature = findViewById(R.id.radioButtonNature);
        this.Campagne = findViewById(R.id.radioButtonCamp);

        Resultat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (Ville.isChecked()){
                    String Res = "Ville";
                }
                else if (Nature.isChecked()) {
                    String Res = "Nature";
                }
                else if (Campagne.isChecked()) {
                    String Res = "Campagne";
                }

                // Créez une intention ver la question suivante
                Intent intent = new Intent(QuestionRadio.this, resultat.class);
                Log.d(Log_TAG, "creation d'intent resultat");
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