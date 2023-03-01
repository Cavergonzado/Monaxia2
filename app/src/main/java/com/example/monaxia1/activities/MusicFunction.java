package com.example.monaxia1.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import com.example.monaxia1.Dashboard;
import com.example.monaxia1.R;

import java.io.IOException;
import java.util.ArrayList;

public class MusicFunction extends AppCompatActivity {

    private ArrayList<SongInfo> _songs = new ArrayList<SongInfo>();
    private Button imagePlayPause;
    private boolean isPlaying = false;
    private SongInfo currentSong;
    private Button currentButton;
    private TextView startTimeTextView, endTimeTextView;
    RecyclerView recyclerView;
    SeekBar seekBar;
    SongAdapter songAdapter;
    MediaPlayer mediaPlayer;
    private Handler myHandler = new Handler();
    private ImageView arrowback;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_function);
        startTimeTextView = findViewById(R.id.startTime);
        endTimeTextView = findViewById(R.id.endTime);
        imagePlayPause = findViewById(R.id.imagePlayPauseBtn);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mediaPlayer = new MediaPlayer();

        seekBar = (SeekBar) findViewById(R.id.seekBar);

        arrowback = findViewById(R.id.arrowBack);
        arrowback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MusicFunction.this, Dashboard.class);
                startActivity(intent1);
            }
        });

        SongInfo music1 = new SongInfo("Untoughable", "Track 1", "https://firebasestorage.googleapis.com/v0/b/monaxia-f416d.appspot.com/o/Untouchable%20-%20Original%20soundtrack%20by%20Eddcyn%20Almero.mp3?alt=media&token=87fa5719-e0c3-4fc7-9714-e5bfb3e298b4");
        SongInfo music2 = new SongInfo("Time To Cultivate", "Track 2", "https://firebasestorage.googleapis.com/v0/b/monaxia-f416d.appspot.com/o/Time%20To%20Cultivate%20-%20original%20soundtrack%20by%20Eric%20Moreno.mp3?alt=media&token=d3d3d8a8-ce01-4566-a0ca-ad3f80ccac47");
        SongInfo music3 = new SongInfo("The Mythical Koi", "Track 3", "https://firebasestorage.googleapis.com/v0/b/monaxia-f416d.appspot.com/o/The%20Mythical%20Koi%20-%20Original%20Soundtrack%20by%20Eddcyn%20Almero%20(1).mp3?alt=media&token=5ea4f6ba-b764-4b2b-b50b-817fafbeb387");
        SongInfo music4 = new SongInfo("The Lamb", "Track 4", "https://firebasestorage.googleapis.com/v0/b/monaxia-f416d.appspot.com/o/The%20Lamb%20-%20original%20soundtrack%20by%20Eric%20Moreno.mp3?alt=media&token=048383b4-1262-4a86-ad07-5559b2936bc9");
        SongInfo music5 = new SongInfo("In my Fantasy", "Track 5", "https://firebasestorage.googleapis.com/v0/b/monaxia-f416d.appspot.com/o/In%20My%20Fantasy%20-%20Original%20Soundtrack%20by%20Eddcyn%20Almero.mp3?alt=media&token=9a5acedb-9b94-4494-9238-0b0194b99d5c");
        SongInfo music6 = new SongInfo("Bloom", "Track 6", "https://firebasestorage.googleapis.com/v0/b/monaxia-f416d.appspot.com/o/bloom.mp3?alt=media&token=bdaba5e9-1f3b-45ab-8fbd-45d41696fa90");
        SongInfo music7 = new SongInfo("Grace", "Track 7", "https://firebasestorage.googleapis.com/v0/b/monaxia-f416d.appspot.com/o/Grace%20-%20Original%20Soundtrack%20by%20Eddcyn%20Almero%20(1).mp3?alt=media&token=937ec62b-ff3f-4fa4-8e64-81a363f1400d");
        SongInfo music8 = new SongInfo("The Prime", "Track 8", "https://firebasestorage.googleapis.com/v0/b/monaxia-f416d.appspot.com/o/The%20Prime%20-%20Original%20Soundtrack%20by%20Eddcyn%20Almero%20(1).mp3?alt=media&token=59931981-b554-4a05-8fbb-a0dc9e2b1813");
        SongInfo music9 = new SongInfo("The Prodigal Son", "Track 9", "https://firebasestorage.googleapis.com/v0/b/monaxia-f416d.appspot.com/o/The%20Prodigal%20Son%20-%20original%20soundtrack%20by%20Eric%20Moreno.mp3?alt=media&token=7e808ffc-e325-47b1-92d2-99bc916c4c11");
        SongInfo music10 = new SongInfo("Loving You", "Track 10", "https://firebasestorage.googleapis.com/v0/b/monaxia-f416d.appspot.com/o/loving_you.mp3?alt=media&token=c1cf2d67-edf5-4492-a4e1-3f3ad843294f");

        _songs.add(music1);
        _songs.add(music2);
        _songs.add(music3);
        _songs.add(music4);
        _songs.add(music5);
        _songs.add(music6);
        _songs.add(music7);
        _songs.add(music8);
        _songs.add(music9);
        _songs.add(music10);

        songAdapter = new SongAdapter(this, _songs);
        recyclerView.setAdapter(songAdapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(),
                linearLayoutManager.getOrientation());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.addItemDecoration(dividerItemDecoration);


        songAdapter.setOnItemClickListener(new SongAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(final Button b, View view, final SongInfo obj, int position) {
                if (currentButton != null && currentButton != b) {
                    // Stop the playback if another button was already playing
                    mediaPlayer.stop();
                    mediaPlayer.release();
                    mediaPlayer = null;
                    currentSong = null;
                    isPlaying = false;
                    currentButton.setText("Play");
                }

                if (isPlaying && b == currentButton) {
                    // Pause the playback if the current button is clicked again
                    mediaPlayer.pause();
                    isPlaying = false;
                    b.setText("Play");
                } else {
                    // Start the playback
                    try {
                        mediaPlayer = new MediaPlayer();
                        mediaPlayer.setDataSource(obj.getSongUrl());
                        mediaPlayer.prepareAsync();
                        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                            @Override
                            public void onPrepared(MediaPlayer mp) {
                                mp.start();
                                seekBar.setProgress(0);
                                seekBar.setMax(mp.getDuration());
                                updateSeekBar();

                            }
                        });
                        isPlaying = true;
                        b.setText("Stop");
                        currentSong = obj;
                        currentButton = b;

                    } catch (Exception e) {
                        // Handle any errors
                    }
                }
            }
        });

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (fromUser) {
                    mediaPlayer.seekTo(progress);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }

    private void updateSeekBar() {
        myHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if (mediaPlayer != null) {
                    int currentPosition = mediaPlayer.getCurrentPosition();
                    seekBar.setProgress(currentPosition);

                    int totalDuration = mediaPlayer.getDuration();

                    // Convert the current position and total duration to time format (mm:ss)
                    String currentTime = milliSecondsToTimer(currentPosition);
                    String endTime = milliSecondsToTimer(totalDuration);

                    // Update the TextViews with the start and end time
                    startTimeTextView.setText(currentTime);
                    endTimeTextView.setText(endTime);
                    updateSeekBar();


                }
            }
        }, 1000);
    }

    private String milliSecondsToTimer(long milliseconds) {
        String timerString = "";
        String secondsString;

        int hours = (int) (milliseconds / (1000 * 60 * 60));
        int minutes = (int) (milliseconds % (1000 * 60 * 60)) / (1000 * 60);
        int seconds = (int) ((milliseconds % (1000 * 60 * 60)) % (1000 * 60) / 1000);

        if (hours > 0) {
            timerString = hours + ":";
        }

        if (seconds < 10) {
            secondsString = "0" + seconds;
        } else {
            secondsString = "" + seconds;
        }

        timerString = timerString + minutes + ":" + secondsString;
        return timerString;
    }

    @Override
    public void onBackPressed() {
        if (mediaPlayer != null && isPlaying) {
            mediaPlayer.stop();
            mediaPlayer.release();
            mediaPlayer = null;
            currentSong = null;
            isPlaying = false;
        }
        super.onBackPressed();
    }
}






