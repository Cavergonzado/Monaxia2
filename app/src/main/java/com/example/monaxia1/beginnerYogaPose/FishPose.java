package com.example.monaxia1.beginnerYogaPose;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.monaxia1.BeginnerDialog.FishPoseDialog;
import com.example.monaxia1.R;
import com.example.monaxia1.activities.BeginnerPhysicalActivity;
import com.example.monaxia1.reverseTraDialog;

import java.util.Locale;

public class FishPose extends AppCompatActivity {

    private static final long START_TIME_IN_MILLIS = 30000;

    private TextView mTextViewCountDown;
    private Button mButtonStartPause;
    private Button mButtonReset, TInstruction;
    private ImageView arrowback;

    private CountDownTimer mCountDownTimer;
    private boolean mTimerRunning;
    private  long mTimeLeftInMillis = START_TIME_IN_MILLIS;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fish_pose);

        mTextViewCountDown = findViewById(R.id.timer);
        mButtonStartPause = findViewById(R.id.StartButton);
        mButtonReset = findViewById(R.id.ResetButton);
        TInstruction = findViewById(R.id.instructionBtn);
        arrowback = findViewById(R.id.arrowBack);

        arrowback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(FishPose.this, BeginnerPhysicalActivity.class);
                startActivity(intent1);
            }
        });

        TInstruction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
            }
        });

        mButtonStartPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mTimerRunning){
                    pauseTimer();
                }else{
                    startTimer();
                }

            }


        });

        mButtonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetTimer();
            }
        });

        updateCountDownText();
    }

    private void openDialog() {
      FishPoseDialog dialogReverse = new FishPoseDialog();
        dialogReverse.show(getSupportFragmentManager(), "Example Dialog");
    }

    private void startTimer() {
        mCountDownTimer = new CountDownTimer(mTimeLeftInMillis, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                mTimeLeftInMillis = millisUntilFinished;
                updateCountDownText();
            }

            @Override
            public void onFinish() {

                mTimerRunning= false;
                mButtonStartPause.setText("Start");
                mButtonStartPause.setVisibility(View.INVISIBLE);
                mButtonReset.setVisibility(View.VISIBLE);
            }
        }.start();

        mTimerRunning = true;
        mButtonStartPause.setText("pause");
        mButtonReset.setVisibility(View.INVISIBLE);
    }


    private void pauseTimer() {
        mCountDownTimer.cancel();
        mTimerRunning = false;
        mButtonStartPause.setText("Start");
        mButtonReset.setVisibility(View.VISIBLE);
    }

    private void resetTimer() {
        mTimeLeftInMillis = START_TIME_IN_MILLIS;
        updateCountDownText();
        mButtonReset.setVisibility(View.INVISIBLE);
        mButtonStartPause.setVisibility(View.VISIBLE);
    }

    private void updateCountDownText(){
        int minutes = (int) (mTimeLeftInMillis/1000) /600;
        int seconds = (int) (mTimeLeftInMillis/1000) %60;

        String timeLeftFormatted = String.format(Locale.getDefault(),"%02d:%02d", minutes, seconds);

        mTextViewCountDown.setText(timeLeftFormatted);

    }
}