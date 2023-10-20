package com.example.projectandroid;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class resultat extends AppCompatActivity {
    private static final String Log_TAG = "Intent Log";
    private TextView NomRes;
    private TextView UserRes;
    //private ImageView ImgRes;
    private Button Retour;
    private String Res1;
    private String Res2;
    private String Res3;
    private int test;
    private String Username;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultat);
        Username = getIntent().getStringExtra("Username");
        Res1 = getIntent().getStringExtra("Res1");
        Res2 = getIntent().getStringExtra("Res2");
        Res3 = getIntent().getStringExtra("Res3");
        test = getIntent().getIntExtra("test",0);
        this.NomRes = findViewById(R.id.textView5);
        this.UserRes = findViewById(R.id.textView6);
        //this.ImgRes = findViewById(R.id.imageView8);
        this.Retour = findViewById(R.id.buttonBack4);

        UserRes.setText(Username+", la région qui vous corresond est :");

        if (test==1){
            Log.d(Log_TAG, "Lancement du if test");
            if (Res1.equals("Été")){
                Log.d(Log_TAG, "Lancement du if Ete");
                if (Res2.equals("Mer")){
                    Log.d(Log_TAG, "Lancement du if Mer");
                    switch (Res3) {
                        case "Ville":
                            Log.d(Log_TAG, "Lancement du if Ville");
                            NomRes.setText("Piltover and Zaun");
                            //ImgRes.setImageResource(R.drawable.piltoverzaun);
                            break;
                        case "Campagne":
                            NomRes.setText("Icathia");
                            //ImgRes.setImageResource(R.drawable.icathia);
                            break;
                        case "Nature":
                            NomRes.setText("Ixtal");
                            //ImgRes.setImageResource(R.drawable.ixtal);
                            break;
                    }
                }else if (Res2.equals("Montagne")){
                    Log.d(Log_TAG, "Lancement du if Montagne");
                    switch (Res3) {
                        case "Ville":
                            NomRes.setText("Noxus");
                            //ImgRes.setImageResource(R.drawable.noxus);
                            break;
                        case "Campagne":
                            NomRes.setText("Camavore");
                            //ImgRes.setImageResource(R.drawable.camavore);
                            break;
                        case "Nature":
                            NomRes.setText("Shurima");
                            //ImgRes.setImageResource(R.drawable.shurima);
                            break;
                    }
                }
            }else if (Res1.equals("Hiver")) {
                Log.d(Log_TAG, "Lancement du if Hiver");
                if (Res2.equals("Mer")) {
                    switch (Res3) {
                        case "Ville":
                            NomRes.setText("Bildgewater");
                            //ImgRes.setImageResource(R.drawable.bilgewater);
                            break;
                        case "Campagne":
                            NomRes.setText("Iles obscur");
                            //ImgRes.setImageResource(R.drawable.ilesobscur);
                            break;
                        case "Nature":
                            NomRes.setText("Ionia");
                            //ImgRes.setImageResource(R.drawable.ionia);
                            break;
                    }
                } else if (Res2.equals("Montagne")) {
                    switch (Res3) {
                        case "Ville":
                            NomRes.setText("Demacia");
                            //ImgRes.setImageResource(R.drawable.demacia);
                            break;
                        case "Campagne":
                            NomRes.setText("Targon");
                            //ImgRes.setImageResource(R.drawable.targon);
                            break;
                        case "Nature":
                            NomRes.setText("Frejlord");
                            //ImgRes.setImageResource(R.drawable.frejlord);
                            break;
                    }
                }
            }
        }else if (test==2){
            // résultat test 2
        }


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