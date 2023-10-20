package com.example.projectandroid;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class resultatRace extends AppCompatActivity {
    private static final String Log_TAG = "Intent Log";
    private TextView NomRes;
    private TextView UserRes;
    private TextView ResultDescription;
    private ImageView ImgRes;
    private Button Retour;
    private String Username;

    public int score = 0;

    //Score de l'utilisateurs qui va décider de sont résultat
    public void incrementerScore(int points) {
        score += points;
    }

    public int getScore() {
        return score;
    }


    @SuppressLint({"SetTextI18n", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultat_race);
        Username = getIntent().getStringExtra("Username");
        this.NomRes = findViewById(R.id.textViewRace);
        this.UserRes = findViewById(R.id.textViewRaceResult);
        this.ImgRes = findViewById(R.id.imageViewRace);
        this.Retour = findViewById(R.id.buttonBack);
        this.ResultDescription = findViewById(R.id.textResultDescriptionRace);

        // Récupérez la valeur des SeekBar à partir des SharedPreferences.
        SharedPreferences sharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE);
        int savedValueSeekbar1 = sharedPreferences.getInt("SeekbarValue1", 5); // 5 est la valeur par défaut si aucune valeur n'est trouvée
        int savedValueSeekbar2 = sharedPreferences.getInt("SeekbarValue2", 5); // 5 est la valeur par défaut si aucune valeur n'est trouvée

        // Récupérez les valeurs des Spinners à partir des SharedPreferences.
        //question taille
        String savedValue1 = sharedPreferences.getString("spinnerValue1", "");
        //question communauté
        String savedValue2 = sharedPreferences.getString("spinnerValue2", "");
        //question nature
        String savedValue3 = sharedPreferences.getString("spinnerValue3", "");


        incrementerScore(savedValueSeekbar1); // Incrémentez le score avec Seekbar1 (taille 1 à 10)
        incrementerScore(savedValueSeekbar2); // Incrémentez le score avec Seekbar2 (magie 1 à 10)
        //question taille
        if (savedValue1.equals("Yes")) {
            incrementerScore(5);
        } else if (savedValue1.equals("No")){
            incrementerScore(0);
        }

        int score1 = getScore();
        Log.d(Log_TAG, "Question caractéristique physique réponse ="+savedValue1+" Score actuel : " + score1);

        //question communauté
        if (savedValue2.equals("I like living in community")) {
            incrementerScore(10);
        } else if (savedValue2.equals("I prefer to be alone")) {
            incrementerScore(0);
        } else if (savedValue2.equals("I prefer to live in a small group")) {
        incrementerScore(5);
        }

        int score2 = getScore();
        Log.d(Log_TAG, "Question communauté réponse ="+savedValue2+"  actuel : " + score2);

        //question nature
        if (savedValue3.equals("I have a connection with nature and animals")) {
            incrementerScore(5);
        } else if (savedValue3.equals("Im not close to nature")) {
            incrementerScore(0);
        } else if (savedValue3.equals("I can manipulate nature for my needs")) {
            incrementerScore(10);
        }

        int scoreActuel = getScore();
        Log.d(Log_TAG, "Question nature réponse =" +savedValue3+" Score actuel : " + scoreActuel);


        Log.d(Log_TAG, String.valueOf(scoreActuel));

        if (scoreActuel == 15) {
                //Néant
                NomRes.setText("Néant");
                ImgRes.setImageResource(R.drawable.neant);
        } else if (scoreActuel>= 10 && scoreActuel < 15) {
                // Humain
                NomRes.setText("Humain");
                ImgRes.setImageResource(R.drawable.humain);
        } else if (scoreActuel> 15 && scoreActuel <= 20) {
                // Mort-vivant
                NomRes.setText("Mort-vivant");
                ImgRes.setImageResource(R.drawable.undead);
        } else if (scoreActuel> 20 && scoreActuel < 25) {
                // Troll
                NomRes.setText("Troll");
                ImgRes.setImageResource(R.drawable.troll);
        } else if (scoreActuel> 25 && scoreActuel < 30) {
                // Yéti
                NomRes.setText("Yéti");
                ImgRes.setImageResource(R.drawable.yeti);
        } else if (scoreActuel>= 30 && scoreActuel < 35) {
                // Minautore
                NomRes.setText("Minautore");
                ImgRes.setImageResource(R.drawable.minotaure);
        } else if (scoreActuel> 35 && scoreActuel <= 40) {
                // Golem
                NomRes.setText("Golem");
                ImgRes.setImageResource(R.drawable.golem);
        } else if (scoreActuel == 35) {
                // Yordle
                NomRes.setText("Yordle");
                ImgRes.setImageResource(R.drawable.yordle);
        } else if (scoreActuel == 25) {
                // Vastayia
                NomRes.setText("Vastayia");
                ImgRes.setImageResource(R.drawable.vastayia);
        } else {

        }

        UserRes.setText("la race qui vous corresond est :" +NomRes);
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