package com.example.monaxia1.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.monaxia1.Dashboard;
import com.example.monaxia1.PhysicalActivity;
import com.example.monaxia1.R;

public class YogaExercises extends AppCompatActivity {

    CardView card1, card2;
    ImageView arrow_back;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoga_exercises);

        card1 = findViewById(R.id.beginnerBtn);
        card2 = findViewById(R.id.advanceBtn);
        arrow_back = findViewById(R.id.arrowBack);

        arrow_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(YogaExercises.this, Dashboard.class);
                startActivity(intent);
            }
        });

        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(YogaExercises.this, BeginnerPhysicalActivity.class);
                startActivity(intent);
            }
        });

        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(YogaExercises.this, advanceYoga.class);
                startActivity(intent2);
            }
        });


    }
}