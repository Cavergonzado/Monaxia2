package com.example.monaxia1.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.monaxia1.Dashboard;
import com.example.monaxia1.R;
import com.example.monaxia1.advancedYogaPose.Adho_mukha_svanasana;
import com.example.monaxia1.advancedYogaPose.Halasana;
import com.example.monaxia1.advancedYogaPose.Padmasana;
import com.example.monaxia1.advancedYogaPose.Reclining_Bound_angle_pose;
import com.example.monaxia1.advancedYogaPose.Savasana;
import com.example.monaxia1.advancedYogaPose.Setu_Bandhasana;
import com.example.monaxia1.advancedYogaPose.Shishuasana;
import com.example.monaxia1.advancedYogaPose.Urdhva_Mukha_Svanasana;
import com.example.monaxia1.advancedYogaPose.triangleYogaPose;
import com.example.monaxia1.beginnerYogaPose.ChildPose;
import com.example.monaxia1.beginnerYogaPose.ExtendedPuppyPose;
import com.example.monaxia1.beginnerYogaPose.FishPose;
import com.example.monaxia1.beginnerYogaPose.HeadToKneeForwardBend;
import com.example.monaxia1.beginnerYogaPose.HeroPose;
import com.example.monaxia1.beginnerYogaPose.SeatedForwardBend;
import com.example.monaxia1.beginnerYogaPose.StandingForwardBend;
import com.example.monaxia1.beginnerYogaPose.legsUpWallPose;
import com.example.monaxia1.beginnerYogaPose.treePose;
import com.example.monaxia1.beginnerYogaPose.trianglePose;
import com.example.monaxia1.bountAnglePose;

public class advanceYoga extends AppCompatActivity {

    Button button1, button2, button3, button4, button5, button6, button7, button8,button9,button10;
    ImageView arrow_back;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance_yoga);

        androidx.appcompat.widget.Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        arrow_back = findViewById(R.id.arrowBack);

        button1 = findViewById(R.id.halasanaPoseBtn);
        button2 = findViewById(R.id.shavasanaPoseBtn);
        button3 = findViewById(R.id.bandhasanaPoseBtn);
        button4 = findViewById(R.id.shishuasanaBtn);
        button5 = findViewById(R.id.urdhvaPoseBtn);
        button6 = findViewById(R.id.triangleYogaPose);
        button7 = findViewById(R.id.RecliningBoundBtn);
        button8 = findViewById(R.id.fishPoseBtn);
        button9 = findViewById(R.id.adhoMukhaBtn);
        button10 = findViewById(R.id.padmasanaBtn);


        arrow_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(advanceYoga.this, Dashboard.class);
                startActivity(intent);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent (advanceYoga.this, Halasana.class);
                startActivity(intent1);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(advanceYoga.this, Savasana.class);
                startActivity(intent2);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(advanceYoga.this, Setu_Bandhasana.class);
                startActivity(intent3);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(advanceYoga.this, Shishuasana.class);
                startActivity(intent4);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(advanceYoga.this, Urdhva_Mukha_Svanasana.class);
                startActivity(intent5);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6 = new Intent(advanceYoga.this, triangleYogaPose.class);
                startActivity(intent6);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent7 = new Intent(advanceYoga.this, Reclining_Bound_angle_pose.class);
                startActivity(intent7);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent8 = new Intent(advanceYoga.this, FishPose.class);
                startActivity(intent8);
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent9 = new Intent(advanceYoga.this, Adho_mukha_svanasana.class);
                startActivity(intent9);
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent10 = new Intent(advanceYoga.this, Padmasana.class);
                startActivity(intent10);
            }
        });



    }


}