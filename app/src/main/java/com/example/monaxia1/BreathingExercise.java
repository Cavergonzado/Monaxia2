package com.example.monaxia1;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.provider.MediaStore;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class BreathingExercise extends AppCompatActivity implements SettingsDialog.SettingsChangeListener {

    private static final String TAG = MainActivity.class.getSimpleName();

    private ConstraintLayout contentLayout;
    private TextView statusText;
    private MediaPlayer mySong;
    private View outerCircleView, innerCircleView;
    private FloatingActionButton fab;
    private ImageView arrowBack;

    private Animation animationInhaleText, animationExhaleText,
            animationInhaleInnerCircle, animationExhaleInnerCircle;
    private Handler handler = new Handler();

    private int holdDuration = 0;

    @Override
    protected void onPause() {
        super.onPause();
        mySong.release();
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breathing_exercise);

        contentLayout = findViewById(R.id.lt_content);
        contentLayout.setOnTouchListener(contentTouchListener);

        statusText = findViewById(R.id.txt_status);
        statusText.setText(Constants.INHALE);

        outerCircleView = findViewById(R.id.v_circle_outer);
        innerCircleView = findViewById(R.id.v_circle_inner);
        arrowBack = findViewById(R.id.arrowBack);
        mySong = MediaPlayer.create(BreathingExercise.this, R.raw.breathing_music_effect);
        mySong.start();

        fab = findViewById(R.id.fab);
        fab.setOnClickListener(fabClickListener);

        setupBackgroundColor();

        prepareAnimations();
        statusText.startAnimation(animationInhaleText);
        innerCircleView.startAnimation(animationInhaleInnerCircle);



        arrowBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BreathingExercise.this, Dashboard.class);
                startActivity(intent);
            }
        });
    }




    private void setupBackgroundColor() {
        int backgroundResId = SettingsUtils.getBackgroundByPresetPosition(SettingsUtils
                .getSelectedPreset());
        setOuterCircleBackground(backgroundResId);
    }

    private void setOuterCircleBackground(int backgroundResId) {
        outerCircleView.setBackgroundResource(backgroundResId);
    }

    private void setInhaleDuration(int duration) {
        animationInhaleText.setDuration(duration);
        animationInhaleInnerCircle.setDuration(duration);
    }

    private void setExhaleDuration(int duration) {
        animationExhaleText.setDuration(duration);
        animationExhaleInnerCircle.setDuration(duration);
    }

    private void prepareAnimations() {
        int inhaleDuration = SettingsUtils.getSelectedInhaleDuration();
        int exhaleDuration = SettingsUtils.getSelectedExhaleDuration();
        holdDuration = SettingsUtils.getSelectedHoldDuration();

        // Inhale - make large
        animationInhaleText = AnimationUtils.loadAnimation(this, R.anim.anim_text_inhale);
        animationInhaleText.setFillAfter(true);
        animationInhaleText.setAnimationListener(inhaleAnimationListener);

        animationInhaleInnerCircle = AnimationUtils.loadAnimation(this, R.anim.anim_inner_circle_inhale);
        animationInhaleInnerCircle.setFillAfter(true);
        animationInhaleInnerCircle.setAnimationListener(inhaleAnimationListener);

        setInhaleDuration(inhaleDuration);

        // Exhale - make small
        animationExhaleText = AnimationUtils.loadAnimation(this, R.anim.anim_text_exhale);
        animationExhaleText.setFillAfter(true);
        animationExhaleText.setAnimationListener(exhaleAnimationListener);

        animationExhaleInnerCircle = AnimationUtils.loadAnimation(this, R.anim.anim_inner_circle_exhale);
        animationExhaleInnerCircle.setFillAfter(true);
        animationExhaleInnerCircle.setAnimationListener(exhaleAnimationListener);

        setExhaleDuration(exhaleDuration);

    }

    private Animation.AnimationListener inhaleAnimationListener = new Animation.AnimationListener() {
        @Override
        public void onAnimationStart(Animation animation) {

        }

        @Override
        public void onAnimationEnd(Animation animation) {
            Log.d(TAG, "inhale animation end");
            statusText.setText(Constants.HOLD);
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    statusText.setText(Constants.EXHALE);
                    statusText.startAnimation(animationExhaleText);
                    innerCircleView.startAnimation(animationExhaleInnerCircle);
                }
            }, holdDuration);
        }

        @Override
        public void onAnimationRepeat(Animation animation) {
        }
    };

    private Animation.AnimationListener exhaleAnimationListener = new Animation.AnimationListener() {
        @Override
        public void onAnimationStart(Animation animation) {}
        @Override
        public void onAnimationEnd(Animation animation) {
            Log.d(TAG, "exhale animation end");
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    statusText.setText(Constants.INHALE);
                    statusText.startAnimation(animationInhaleText);
                    innerCircleView.startAnimation(animationInhaleInnerCircle);
                }
            }, 0);
        }

        @Override
        public void onAnimationRepeat(Animation animation) {}
    };

    private View.OnTouchListener contentTouchListener = new View.OnTouchListener() {
        @Override
        public boolean onTouch(View v, MotionEvent event) {
            fab.show();

            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    fab.hide();
                }
            }, Constants.CONTENT_SHOW_DELAY_MS);
            return false;
        }
    };

    private View.OnClickListener fabClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            showSettingsDialog();
        }
    };

    private void showSettingsDialog() {
        SettingsDialog settingsDialog = new SettingsDialog(this, (SettingsDialog.SettingsChangeListener) this);
        settingsDialog.show();
    }

    @Override
    public void onPresetChanged(int backgroundResId) {
        setOuterCircleBackground(backgroundResId);
    }

    @Override
    public void onInhaleValueChanged(int duration) {
        setInhaleDuration(duration);
    }

    @Override
    public void onExhaleValueChanged(int duration) {
        setExhaleDuration(duration);
    }

    @Override
    public void onHoldValueChanged(int duration) {
        holdDuration = duration;
    }
}

