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
    private ImageView ImgRes;
    private Button Retour;
    private String Res1;
    private String Res2;
    private String Res3;
    private int test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultat);
        Res1 = getIntent().getStringExtra("Res1");
        Res2 = getIntent().getStringExtra("Res2");
        Res3 = getIntent().getStringExtra("Res3");
        test = getIntent().getIntExtra("test",0);
        this.NomRes = findViewById(R.id.textView5);
        this.ImgRes = findViewById(R.id.imageView8);
        this.Retour = findViewById(R.id.buttonBack4);

        if (test==1){
            Log.d(Log_TAG, "Lancement du if test");
            if (Res1.equals("Été")){
                Log.d(Log_TAG, "Lancement du if Ete");
                if (Res2.equals("Mer")){
                    Log.d(Log_TAG, "Lancement du if Mer");
                    if (Res3.equals("Ville")){
                        Log.d(Log_TAG, "Lancement du if Ville");
                        NomRes.setText("Piltover and Zaun");
                        //ImgRes.setImageDrawable(image P/Z);
                    }else if (Res3.equals("Campagne")){
                        NomRes.setText("Icathia");
                        //ImgRes.setImageDrawable(image Icathia);
                    }else if (Res3.equals("Nature")){
                        NomRes.setText("Ixtal");
                        //ImgRes.setImageDrawable(image Ixtal);
                    }
                }else if (Res2.equals("Montagne")){
                    Log.d(Log_TAG, "Lancement du if Montagne");
                    if (Res3.equals("Ville")){
                        NomRes.setText("Noxus");
                        //ImgRes.setImageDrawable(image Noxus);
                    }else if (Res3.equals("Campagne")){
                        NomRes.setText("Camavore");
                        //ImgRes.setImageDrawable(image Camrvore);
                    }else if (Res3.equals("Nature")){
                        NomRes.setText("Shurima");
                        //ImgRes.setImageDrawable(image Shurima);
                    }
                }
            }else if (Res1.equals("Hiver")){
                Log.d(Log_TAG, "Lancement du if Hiver");
                if (Res2.equals("Mer")){
                    if (Res3.equals("Ville")){
                        NomRes.setText("Bildgewater");
                        //ImgRes.setImageDrawable(image P/Z);
                    }else if (Res3.equals("Campagne")){
                        NomRes.setText("Iles obscur");
                        //ImgRes.setImageDrawable(image iles obscur);
                    }else if (Res3.equals("Nature")){
                        NomRes.setText("Ionia");
                        //ImgRes.setImageDrawable(image Ionia);
                    }
                }else if (Res2.equals("Montagne")){
                    if (Res3.equals("Ville")){
                        NomRes.setText("Demacia");
                        //ImgRes.setImageDrawable(image Demacia);
                    }else if (Res3.equals("Campagne")){
                        NomRes.setText("Targon");
                        //ImgRes.setImageDrawable(image Targon);
                    }else if (Res3.equals("Nature")){
                        NomRes.setText("Frejlord");
                        //ImgRes.setImageDrawable(image Frejlord);
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