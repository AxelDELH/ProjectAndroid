package com.example.projectandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class QuestionButton extends AppCompatActivity {
    private static final String Log_TAG = "Intent Log";
    private Button Ete;
    private Button Hiver;
    private Button retour;
    private String Username;
    private ImageView ImgSum;
    private ImageView ImgWin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_button);
        Username = getIntent().getStringExtra("Username");
        Log.d(Log_TAG, "Pseudo"+Username);
        this.Ete = findViewById(R.id.buttonEte);
        this.Hiver = findViewById(R.id.buttonHiver);
        this.retour = findViewById(R.id.buttonBack);
        this.ImgSum = findViewById(R.id.imageView);
        this.ImgWin = findViewById(R.id.imageView2);
        ImgSum.setImageResource(R.drawable.desert);
        ImgWin.setImageResource(R.drawable.banquise);

        Ete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Créez une intention ver la question suivante
                Intent intent = new Intent(QuestionButton.this, QuestionSwitch.class);
                Log.d(Log_TAG, "creation d'intent QSwitch");
                intent.putExtra("Res1","Été");
                intent.putExtra("Username",Username);
                Log.d(Log_TAG, "transfert :"+Username);
                startActivity(intent);
                Log.d(Log_TAG, "Lancement du test");
            }
        });
        Hiver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Créez une intention ver la question suivante
                Intent intent = new Intent(QuestionButton.this, QuestionSwitch.class);
                Log.d(Log_TAG, "creation d'intent QSwitch");
                intent.putExtra("Res1","Hiver");
                intent.putExtra("Username",Username);
                Log.d(Log_TAG, "transfert :"+Username);
                startActivity(intent);
                Log.d(Log_TAG, "Lancement du test");
            }
        });
        retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(Log_TAG, "bouton close");
                // Appeler finish() pour dépiler l'activité actuelle et revenir à l'activité précédente
                finish();
            }
        });

    }
}