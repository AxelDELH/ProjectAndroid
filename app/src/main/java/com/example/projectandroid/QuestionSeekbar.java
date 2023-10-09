package com.example.projectandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class QuestionSeekbar extends AppCompatActivity {

    //valeur de 1 à 10 de la 1er Seekbar
    private TextView SeekBarValue1;
    //valeur de 1 à 10 de la 2eme Seekbar
    private TextView SeekBarValue2;
    //Button Suivant
    private Button Next;
    //Button Retour
    private Button Back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_seekbar);
        //Attribution des buttons
        this.Next = findViewById(R.id.button_next_seekbar);
        this.Back = findViewById(R.id.button_back_seekbar);
    }
}