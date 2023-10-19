package com.example.projectandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class QuestionSeekbar extends AppCompatActivity {
    private static final String Log_TAG = "Intent Log";
    private SeekBar SeekBar;
    private SeekBar SeekBar2;
    private TextView SeekBarValue1; //valeur de 1 à 10 de la 1er Seekbar
    private TextView SeekBarValue2; //valeur de 1 à 10 de la 2eme Seekbar
    private Button Next; //Button Suivant
    private Button Back; //Button Retour

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_seekbar);
        //Attribution des buttons
        this.Next = findViewById(R.id.button_next_seekbar);
        this.Back = findViewById(R.id.button_back_seekbar);
        this.SeekBar = findViewById(R.id.seek_bar);

        this.SeekBar2 = findViewById(R.id.seek_bar2);

        //Initialisation des SharedPreferences : le code pour récupérer et stocker la valeur, vous devez initialiser SharedPreferences dans votre activité
        SharedPreferences sharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE);

        //Récupération de la valeur précédente : Pour récupérer
        // la valeur stockée précédemment, ajoutez le code suivant sous l'initialisation de la SeekBar

        int defaultValue = 5; // Valeur par défaut de 5 si aucune valeur n'est stockée.
        int savedValue = sharedPreferences.getInt("userValue", defaultValue);
        SeekBar.setProgress(savedValue);

        //Code SeekBar n°1
        SeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                // Mettez à jour le texte pour afficher la valeur sélectionnée.
                SeekBarValue1.setText("Sur une échelle de 1 à 10, de quelle taille te considères-tu : " + progress);

                // Mettre à jour SharedPreferences avec la nouvelle valeur.
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putInt("userValue", progress);
                editor.apply();

                //Avec ces modifications, votre application récupérera la valeur choisie par
                //l'utilisateur à partir des SharedPreferences et la mettra à jour à chaque fois que l'utilisateur
                //déplacera la SeekBar. Cette valeur sera conservée même après la fermeture et la réouverture de l'application.
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // Appelé lorsque l'utilisateur commence à déplacer la SeekBar.
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // Appelé lorsque l'utilisateur arrête de déplacer la SeekBar.
            }
        });

        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Créez une intention ver la question suivante
                Intent intent = new Intent(QuestionSeekbar.this, QuestionRadio.class);
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