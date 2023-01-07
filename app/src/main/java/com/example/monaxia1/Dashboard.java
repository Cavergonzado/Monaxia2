package com.example.monaxia1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.monaxia1.activities.BeginnerPhysicalActivity;
import com.example.monaxia1.activities.MusicFunction;
import com.example.monaxia1.activities.NoteFunction;
import com.example.monaxia1.activities.YogaExercises;

public class Dashboard extends AppCompatActivity {

    CardView card1, card2, card3, card4;
    Button logout, dashIntruction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        card1 = findViewById(R.id.BreathingExercise);
        card2 = findViewById(R.id.physical_activity);
        card3 = findViewById(R.id.notepad);
        card4 = findViewById(R.id.MusicPlayer);
        logout = findViewById(R.id.logout);
        dashIntruction = findViewById(R.id.QuestionBtn);

        Intent intent = getIntent();
        String name = intent.getStringExtra("NAME");

        dashIntruction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
            }
        });


        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Dashboard.this, breathingExerciseCountButton.class);
                startActivity(intent1);
            }
        });

        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Dashboard.this, YogaExercises.class);
                startActivity(intent2);
            }
        });

        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(Dashboard.this, NoteFunction.class);
                startActivity(intent3);
            }
        });

        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(Dashboard.this, MusicFunction.class);
                startActivity(intent4);
            }
        });

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(Dashboard.this, Login.class);
                startActivity(intent5);
            }
        });
    }

    private void openDialog() {
        InstructionDashboardDialog dialogReverse = new InstructionDashboardDialog();
        dialogReverse.show(getSupportFragmentManager(), "Example Dialog");
    }
}