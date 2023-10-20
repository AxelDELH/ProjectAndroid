package com.example.projectandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class resultat extends AppCompatActivity {
    private static final String Log_TAG = "Intent Log";
    private TextView NomRes;
    private TextView UserRes;
    private ImageView ImgRes;
    private Button Retour;
    private String Res1;
    private String Res2;
    private String Res3;
    private int test;
    private String Username;

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
        this.ImgRes = findViewById(R.id.imageView8);
        this.Retour = findViewById(R.id.buttonBack4);

        UserRes.setText(Username+", la région qui vous corresond est :");

        if (test==1){
            Log.d(Log_TAG, "Lancement du if test");
            if (Res1.equals("Été")){
                Log.d(Log_TAG, "Lancement du if Ete");
                if (Res2.equals("Mer")){
                    Log.d(Log_TAG, "Lancement du if Mer");
                    if (Res3.equals("Ville")){
                        Log.d(Log_TAG, "Lancement du if Ville");
                        NomRes.setText("Piltover and Zaun");
                        ImgRes.setImageResource(R.drawable.piltoverzaun);
                    }else if (Res3.equals("Campagne")){
                        NomRes.setText("Icathia");
                        ImgRes.setImageResource(R.drawable.icathia);
                    }else if (Res3.equals("Nature")){
                        NomRes.setText("Ixtal");
                        ImgRes.setImageResource(R.drawable.ixtal);
                    }
                }else if (Res2.equals("Montagne")){
                    Log.d(Log_TAG, "Lancement du if Montagne");
                    if (Res3.equals("Ville")){
                        NomRes.setText("Noxus");
                        ImgRes.setImageResource(R.drawable.noxus);
                    }else if (Res3.equals("Campagne")){
                        NomRes.setText("Camavore");
                        ImgRes.setImageResource(R.drawable.camavore);
                    }else if (Res3.equals("Nature")){
                        NomRes.setText("Shurima");
                        ImgRes.setImageResource(R.drawable.shurima);
                    }
                }
            }else if (Res1.equals("Hiver")) {
                Log.d(Log_TAG, "Lancement du if Hiver");
                if (Res2.equals("Mer")) {
                    if (Res3.equals("Ville")) {
                        NomRes.setText("Bildgewater");
                        ImgRes.setImageResource(R.drawable.bilgewater);
                    } else if (Res3.equals("Campagne")) {
                        NomRes.setText("Iles obscur");
                        ImgRes.setImageResource(R.drawable.ilesobscur);
                    } else if (Res3.equals("Nature")) {
                        NomRes.setText("Ionia");
                        ImgRes.setImageResource(R.drawable.ionia);
                    }
                } else if (Res2.equals("Montagne")) {
                    if (Res3.equals("Ville")) {
                        NomRes.setText("Demacia");
                        ImgRes.setImageResource(R.drawable.demacia);
                    } else if (Res3.equals("Campagne")) {
                        NomRes.setText("Targon");
                        ImgRes.setImageResource(R.drawable.targon);
                    } else if (Res3.equals("Nature")) {
                        NomRes.setText("Frejlord");
                        ImgRes.setImageResource(R.drawable.frejlord);
                    }
                }
            }
        }else if (test==2){

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