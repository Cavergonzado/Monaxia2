package com.example.monaxia1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.gusakov.library.PulseCountDown;
import com.gusakov.library.java.interfaces.OnCountdownCompleted;

import java.util.Timer;
import java.util.TimerTask;

public class breathingExerciseCountButton extends AppCompatActivity {

    private Button buttonStart;
    private PulseCountDown pulseCountDown;
    private Timer timer;
    private ImageView arrowback;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breathing_exercise_count_button);


        arrowback = findViewById(R.id.arrowBack1);

        arrowback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(breathingExerciseCountButton.this, Dashboard.class);
                startActivity(intent1);
            }
        });

        // initialising objects
        buttonStart=(Button)findViewById(R.id.button);
        pulseCountDown=(PulseCountDown)findViewById(R.id.pulseCountDown);

        // button OnClickListener
        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                timer = new Timer();
                timer.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(breathingExerciseCountButton.this, BreathingExercise.class);
                        startActivity(intent);
                        finish();
                    }
                }, 6000);
                // start countdown and add OnCountdownCompleted
                pulseCountDown.start(new OnCountdownCompleted() {
                    @Override
                    public void completed() {
                        // show simple toast when countdown completed
                    }
                });
            }
        });
    }
}