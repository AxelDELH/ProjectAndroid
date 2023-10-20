package com.example.projectandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;

public class QuestionSwitch extends AppCompatActivity {
    private static final String Log_TAG = "Intent Log";
    private Button Suivant;
    private Button Retour;
    private Switch Mont;
    private String Res1;
    private String Res2;
    private String Username;
    private ImageView ImgMon;
    private ImageView ImgMer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_switch);
        Res1 = getIntent().getStringExtra("Res1");
        Username = getIntent().getStringExtra("Username");
        this.Suivant = findViewById(R.id.buttonNext);
        this.Retour = findViewById(R.id.buttonBack2);
        this.Mont = findViewById(R.id.switchMM);
        this.ImgMon = findViewById(R.id.imageView4);
        this.ImgMer = findViewById(R.id.imageView3);
        ImgMon.setImageResource(R.drawable.campagne);
        ImgMer.setImageResource(R.drawable.nature);


        Suivant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean choix  = Mont.isChecked();
                if (choix){
                    Res2 = "Montagne";
                    Log.d(Log_TAG, "Choix :"+Res2);
                }
                else {
                    Res2 = "Mer";
                    Log.d(Log_TAG, "Choix :"+Res2);
                }

                // Créez une intention ver la question suivante
                Intent intent = new Intent(QuestionSwitch.this, QuestionRadio.class);
                Log.d(Log_TAG, "creation d'intent QRadio");
                intent.putExtra("Username",Username);
                Log.d(Log_TAG, "transfert :"+Username);
                intent.putExtra("Res1",Res1);
                Log.d(Log_TAG, "transfert :"+Res1);
                intent.putExtra("Res2",Res2);
                Log.d(Log_TAG, "transfert :"+Res2);
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