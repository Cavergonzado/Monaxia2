package com.example.monaxia1.music;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;

import androidx.appcompat.app.AppCompatActivity;

import com.example.monaxia1.PhysicalActivity;
import com.example.monaxia1.R;
import com.example.monaxia1.activities.MusicFunction;

import java.util.Timer;
import java.util.TimerTask;

public class RelaxingMusic extends AppCompatActivity {

    private Button start, pause;
    private SeekBar seekBar;
    private MediaPlayer player;
    private ImageView arrowback;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mood_relaxation_music);
        start = findViewById(R.id.button);
        pause = findViewById(R.id.button2);
        seekBar = findViewById(R.id.seekBar);
        player = MediaPlayer.create(this, R.raw.relaxing_music_for_sleep);

        arrowback = findViewById(R.id.arrowBack);
        arrowback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(RelaxingMusic.this, MusicFunction.class);
                startActivity(intent1);
            }
        });

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player.start();
            }
        });

        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player.pause();
            }
        });


        seekBar.setMax(player.getDuration());
        new Timer().scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                seekBar.setProgress(player.getCurrentPosition());
            }
        }, 0,900);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                player.seekTo(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
}