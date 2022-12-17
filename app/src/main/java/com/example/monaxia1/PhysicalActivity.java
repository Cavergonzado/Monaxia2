package com.example.monaxia1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;

public class PhysicalActivity extends AppCompatActivity {

    Button button1, button2, button3, button4, button5, button6, button7, button8,button9,button10;
    ImageView arrow_back;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physical);

        androidx.appcompat.widget.Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        arrow_back = findViewById(R.id.arrowBack);

        button1 = findViewById(R.id.reverseTraBtn);
        button2 = findViewById(R.id.standingBackHeadBtn);
        button3 = findViewById(R.id.chatarungaBtn);
        button4 = findViewById(R.id.pigeonPoseBtn);
        button5 = findViewById(R.id.headstand_pose);
        button6 = findViewById(R.id.lotusPoseBtn);
        button7 = findViewById(R.id.bountAngleBtn);
        button8 = findViewById(R.id.runnerLungeBtn);
        button9 = findViewById(R.id.StandingSideBtn);
        button10 = findViewById(R.id.corpsePoseBtn);


        arrow_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PhysicalActivity.this, Dashboard.class);
                startActivity(intent);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent (PhysicalActivity.this, reversedTrianglePose.class);
                startActivity(intent1);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(PhysicalActivity.this, standingBackHead.class);
                startActivity(intent2);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(PhysicalActivity.this, chaturangaPose.class);
                startActivity(intent3);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(PhysicalActivity.this, Pigeon_pose.class);
                startActivity(intent4);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(PhysicalActivity.this, headStandPose.class);
                startActivity(intent5);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6 = new Intent(PhysicalActivity.this, LotusPose.class);
                startActivity(intent6);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent7 = new Intent(PhysicalActivity.this, bountAnglePose.class);
                startActivity(intent7);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent8 = new Intent(PhysicalActivity.this, RunnerLungPose.class);
                startActivity(intent8);
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent9 = new Intent(PhysicalActivity.this, StandingSidePose.class);
                startActivity(intent9);
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent10 = new Intent(PhysicalActivity.this, corpsePost.class);
                startActivity(intent10);
            }
        });



    }

    private void setSupportActionBar(Toolbar toolbar) {
    }

}