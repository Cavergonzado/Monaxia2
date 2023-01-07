package com.example.monaxia1.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.monaxia1.Dashboard;
import com.example.monaxia1.LotusPose;
import com.example.monaxia1.PhysicalActivity;
import com.example.monaxia1.Pigeon_pose;
import com.example.monaxia1.R;
import com.example.monaxia1.RunnerLungPose;
import com.example.monaxia1.StandingSidePose;
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
import com.example.monaxia1.chaturangaPose;
import com.example.monaxia1.corpsePost;
import com.example.monaxia1.headStandPose;
import com.example.monaxia1.reversedTrianglePose;
import com.example.monaxia1.standingBackHead;

public class BeginnerPhysicalActivity extends AppCompatActivity {

    Button button1, button2, button3, button4, button5, button6, button7, button8,button9,button10;
    ImageView arrow_back;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beginner_physical);

        androidx.appcompat.widget.Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        arrow_back = findViewById(R.id.arrowBack);

        button1 = findViewById(R.id.heroPoseBtn);
        button2 = findViewById(R.id.treePoseBtn);
        button3 = findViewById(R.id.trianglePoseBtn);
        button4 = findViewById(R.id.standingForwardBtn);
        button5 = findViewById(R.id.fishPose);
        button6 = findViewById(R.id.extendedPuppy);
        button7 = findViewById(R.id.childsPoseBtn);
        button8 = findViewById(R.id.headTokneeBtn);
        button9 = findViewById(R.id.seatedForwardBtn);
        button10 = findViewById(R.id.legsUpWallBtn);


        arrow_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BeginnerPhysicalActivity.this, Dashboard.class);
                startActivity(intent);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent (BeginnerPhysicalActivity.this, HeroPose.class);
                startActivity(intent1);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(BeginnerPhysicalActivity.this, treePose.class);
                startActivity(intent2);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(BeginnerPhysicalActivity.this, trianglePose.class);
                startActivity(intent3);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(BeginnerPhysicalActivity.this, StandingForwardBend.class);
                startActivity(intent4);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(BeginnerPhysicalActivity.this, FishPose.class);
                startActivity(intent5);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6 = new Intent(BeginnerPhysicalActivity.this, ExtendedPuppyPose.class);
                startActivity(intent6);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent7 = new Intent(BeginnerPhysicalActivity.this, ChildPose.class);
                startActivity(intent7);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent8 = new Intent(BeginnerPhysicalActivity.this, HeadToKneeForwardBend.class);
                startActivity(intent8);
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent9 = new Intent(BeginnerPhysicalActivity.this, SeatedForwardBend.class);
                startActivity(intent9);
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent10 = new Intent(BeginnerPhysicalActivity.this, legsUpWallPose.class);
                startActivity(intent10);
            }
        });



    }


    }


