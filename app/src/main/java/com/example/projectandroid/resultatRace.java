package com.example.projectandroid;

import android.annotation.SuppressLint;
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
        this.ImgRes = findViewById(R.id.imageView8);
        this.Retour = findViewById(R.id.buttonBack4);
        this.ResultDescription = findViewById(R.id.textResultDescription);

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
                            ImgRes.setImageResource(R.drawable.piltoverzaun);
                            ResultDescription.setText("Piltover est une cité florissante animée par le progrès, dont la puissance et l'influence ne cessent de croître. C'est le centre culturel de Valoran, où l'art, l'artisanat, le commerce et l'innovation avancent main dans la main. Sa puissance ne repose pas sur sa force militaire, mais sur les rouages bien huilés du libre-échange et de la pensée progressiste.");
                            break;
                        case "Campagne":
                            NomRes.setText("Icathia");
                            //ImgRes.setImageResource(R.drawable.icathia);
                            break;
                        case "Nature":
                            NomRes.setText("Ixtal");
                            ImgRes.setImageResource(R.drawable.ixtal);
                            ResultDescription.setText("Célèbre pour sa maîtrise de la magie élémentaire, Ixtal fut l'une des premières nations indépendantes à se joindre à l'empire de Shurima. En vérité, la culture d'Ixtal est bien plus ancienne que ça. Elle appartient à la grande diaspora de l'ouest qui a donné naissance à de nombreuses civilisations, parmi lesquelles Buhru, la magnifique Helia et Targon l'ascétique. Elle a probablement joué un rôle significatif dans la création des premiers Transfigurés.");
                            break;
                    }
                }else if (Res2.equals("Montagne")){
                    Log.d(Log_TAG, "Lancement du if Montagne");
                    switch (Res3) {
                        case "Ville":
                            NomRes.setText("Noxus");
                            ImgRes.setImageResource(R.drawable.noxus);
                            ResultDescription.setText("Noxus est un puissant empire à la réputation terrifiante. Pour les étrangers qui vivent hors de ses frontières, il s'agit d'un pays brutal, expansionniste et agressif, mais ceux qui observent au-delà de cette façade belliqueuse découvrent une société ouverte, où la force et les talents du peuple sont valorisés et cultivés.");
                            break;
                        case "Campagne":
                            NomRes.setText("Camavore");
                            ImgRes.setImageResource(R.drawable.camavore);
                            ResultDescription.setText("Camavoran Continent or Eastern Continent is a continent on the eastern hemisphere of Runeterra. The most predominant nation on this continent was the ancient kingdom of Camavor before its fall during the Ruination of Helia. After the Ruination its history became largely unknown to the rest of the world.");
                            break;
                        case "Nature":
                            NomRes.setText("Shurima");
                            ImgRes.setImageResource(R.drawable.shurima);
                            ResultDescription.setText("L'empire de Shurima était autrefois une civilisation florissante qui s'étendait sur un continent tout entier. Forgé en un temps révolu par les puissants dieux-guerriers de l'Ost des Transfigurés, il scella l'union de tous les peuples disparates du sud et imposa entre eux une paix durable.");
                            break;
                    }
                }
            }else if (Res1.equals("Hiver")) {
                Log.d(Log_TAG, "Lancement du if Hiver");
                if (Res2.equals("Mer")) {
                    switch (Res3) {
                        case "Ville":
                            NomRes.setText("Bildgewater");
                            ImgRes.setImageResource(R.drawable.bilgewater);
                            ResultDescription.setText("Nichée dans l'archipel des Îles de la Flamme bleue, Bilgewater est une ville portuaire semblable à nulle autre : elle abrite les pêcheurs de serpents de mer, les gangs des docks et tous les contrebandiers du monde. Ici, les fortunes se font et les ambitions meurent en une fraction de seconde. Pour ceux qui fuient la justice, l'endettement ou la persécution, Bilgewater peut être le lieu d'un nouveau départ, car nul ici ne vous questionne sur votre passé. Pourtant, chaque matin, on retrouve dans les eaux du port des cadavres de voyageurs, la bourse vide et la gorge tranchée…");
                            break;
                        case "Campagne":
                            NomRes.setText("Iles obscur");
                            ImgRes.setImageResource(R.drawable.ilesobscur);
                            ResultDescription.setText("Cette terre maudite était autrefois une civilisation noble et éclairée, connue auprès de ses alliés et de ses émissaires sous le nom d'Îles bénies. Cependant, il y a plus d'un millier d'années, un cataclysme magique sans précédent réduisit en lambeaux la frontière entre le monde physique et le royaume spirituel, entraînant leur fusion... et condamnant instantanément tous les êtres vivants.");
                            break;
                        case "Nature":
                            NomRes.setText("Ionia");
                            ImgRes.setImageResource(R.drawable.ionia);
                            ResultDescription.setText("Entourée de mers capricieuses, Ionia est composée de plusieurs provinces alliées réparties à travers un gigantesque archipel appelé les Terres premières. La culture ionienne s'est développée dans le but de maintenir l'équilibre universel, et par conséquent, la frontière entre le monde matériel et le monde spirituel y est plus perméable, particulièrement dans les montagnes et les forêts sauvages.");
                            break;
                    }
                } else if (Res2.equals("Montagne")) {
                    switch (Res3) {
                        case "Ville":
                            NomRes.setText("Demacia");
                            ImgRes.setImageResource(R.drawable.demacia);
                            ResultDescription.setText("Demacia est un royaume fort, fondé sur des lois strictes et riche d'un passé militaire prestigieux. Ses habitants ont toujours attaché une grande importance aux idéaux de justice, d'honneur et de devoir, et ils sont très fiers de leur héritage culturel. Mais malgré ses valeurs très nobles, cette nation parfaitement autosuffisante est devenue de plus en plus insulaire et isolationniste au cours de ces derniers siècles.");
                            break;
                        case "Campagne":
                            NomRes.setText("Targon");
                            ImgRes.setImageResource(R.drawable.targon);
                            ResultDescription.setText("Du haut de son imposante aiguille de pierres stériles, le Mont Targon est le point culminant de la plus haute chaîne de montagnes de Runeterra. S'élevant aux confins de toute civilisation, il n'est accessible qu'aux explorateurs les plus déterminés. De nombreuses légendes entourent le Mont Targon, et comme tous les lieux mythologiques, il enflamme l'imagination des rêveurs, des fous, de tous ceux qui sont assoiffés d'aventure");
                            break;
                        case "Nature":
                            NomRes.setText("Frejlord");
                            ImgRes.setImageResource(R.drawable.frejlord);
                            ResultDescription.setText("Freljord est une terre inhospitalière et hostile dont les habitants sont des guerriers-nés, contraints de persévérer envers et contre tout.");
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