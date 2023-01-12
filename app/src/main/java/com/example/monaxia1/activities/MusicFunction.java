package com.example.monaxia1.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;

import com.example.monaxia1.Dashboard;
import com.example.monaxia1.R;

import java.io.IOException;
import java.util.ArrayList;

public class MusicFunction extends AppCompatActivity{

    private ArrayList<SongInfo> _songs = new ArrayList<SongInfo>();;
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
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        seekBar = (SeekBar) findViewById(R.id.seekBar);

        arrowback = findViewById(R.id.arrowBack);
        arrowback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MusicFunction.this, Dashboard.class);
                startActivity(intent1);
            }
        });

        SongInfo music1 = new SongInfo("Forgotten", "Track 1", "https://firebasestorage.googleapis.com/v0/b/monaxia-f416d.appspot.com/o/Forgotten.mp3?alt=media&token=698a342f-9ad4-4153-9ae5-bb7c1d969914");
        SongInfo music2 = new SongInfo("Last Lights", "Track 2", "https://firebasestorage.googleapis.com/v0/b/monaxia-f416d.appspot.com/o/Last%20Lights.mp3?alt=media&token=a38b3dd2-18c5-437a-878e-46fe6ec7955a");
        SongInfo music3 = new SongInfo("Metanoia", "Track 3", "https://firebasestorage.googleapis.com/v0/b/monaxia-f416d.appspot.com/o/Metanoia.mp3?alt=media&token=112ccbe2-c108-4a94-b8f8-fe2d13e3adf3");
        SongInfo music4 = new SongInfo("Unwind", "Track 4", "https://firebasestorage.googleapis.com/v0/b/monaxia-f416d.appspot.com/o/Unwind.mp3?alt=media&token=df4c902f-eef6-4b67-939f-a021c095dfcb");
        SongInfo music5 = new SongInfo("Sine", "Track 5", "https://firebasestorage.googleapis.com/v0/b/monaxia-f416d.appspot.com/o/Sine.mp3?alt=media&token=4febb5e4-928e-46f9-a22a-9819d01447ec");
        SongInfo music6 = new SongInfo("Bloom", "Track 6", "https://firebasestorage.googleapis.com/v0/b/monaxia-f416d.appspot.com/o/bloom.mp3?alt=media&token=bdaba5e9-1f3b-45ab-8fbd-45d41696fa90");
        SongInfo music7 = new SongInfo("Breathing Music Effects", "Track 7", "https://firebasestorage.googleapis.com/v0/b/monaxia-f416d.appspot.com/o/breathing_music_effect.mp3?alt=media&token=19c70c12-ccbd-47be-9c29-58336a51b569");
        SongInfo music8 = new SongInfo("Cloudburst", "Track 8", "https://firebasestorage.googleapis.com/v0/b/monaxia-f416d.appspot.com/o/cloudburst.mp3?alt=media&token=d49b3777-e9b2-419d-80b3-034326652cf6");
        SongInfo music9 = new SongInfo("Laffey crush", "Track 9", "https://firebasestorage.googleapis.com/v0/b/monaxia-f416d.appspot.com/o/laffey_crush.mp3?alt=media&token=ae2fc9c5-f44a-4976-bf45-002c2e7d2960");
        SongInfo music10 = new SongInfo("Loving You", "Track 10", "https://firebasestorage.googleapis.com/v0/b/monaxia-f416d.appspot.com/o/loving_you.mp3?alt=media&token=c1cf2d67-edf5-4492-a4e1-3f3ad843294f");
        SongInfo music11 = new SongInfo("Mood Relaxation", "Track 11", "https://firebasestorage.googleapis.com/v0/b/monaxia-f416d.appspot.com/o/mood_relaxation.mp3?alt=media&token=e312735f-e3dd-43b2-83a4-4108e5202ae6");
        SongInfo music12 = new SongInfo("Relaxing music for sleep", "Track 12", "https://firebasestorage.googleapis.com/v0/b/monaxia-f416d.appspot.com/o/relaxing_music_for_sleep.mp3?alt=media&token=3ae2f997-c2ec-489d-af1e-e1fd0e2c4a22");
        SongInfo music13 = new SongInfo("Steezy prime Letting go", "Track 13", "https://firebasestorage.googleapis.com/v0/b/monaxia-f416d.appspot.com/o/steezy_prime_letting_go.mp3?alt=media&token=548f20d8-97aa-4b60-8639-31aa5b103a8b");

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
        _songs.add(music11);
        _songs.add(music12);
        _songs.add(music13);

        songAdapter = new SongAdapter(this,_songs);
        recyclerView.setAdapter(songAdapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(),
                linearLayoutManager.getOrientation());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.addItemDecoration(dividerItemDecoration);

        songAdapter.setOnItemClickListener(new SongAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(final Button b, View view, final SongInfo obj, int position) {
                if(b.getText().equals("Stop")){
                    mediaPlayer.stop();
                    mediaPlayer.reset();
                    mediaPlayer.release();
                    mediaPlayer = null;
                    b.setText("Play");
                }else {

                    Runnable runnable = new Runnable() {
                        @Override
                        public void run() {
                            try {
                                mediaPlayer = new MediaPlayer();
                                mediaPlayer.setDataSource(obj.getSongUrl());
                                mediaPlayer.prepareAsync();
                                mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                                    @Override
                                    public void onPrepared(MediaPlayer mp) {
                                        mp.start();
                                        seekBar.setProgress(0);
                                        seekBar.setMax(mediaPlayer.getDuration());
                                        Log.d("Prog", "run: " + mediaPlayer.getDuration());
                                    }
                                });
                                b.setText("Stop");



                            }catch (Exception e){}
                        }

                    };
                    myHandler.postDelayed(runnable,100);

                }
            }
        });

        Thread t = new runThread();
        t.start();
    }

    public class runThread extends Thread {


        @Override
        public void run() {
            while (true) {

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Log.d("Runwa", "run: " + 1);
                if (mediaPlayer != null) {
                    seekBar.post(new Runnable() {
                        @Override
                        public void run() {
                            seekBar.setProgress(mediaPlayer.getCurrentPosition());
                        }
                    });

                    Log.d("Runwa", "run: " + mediaPlayer.getCurrentPosition());
                }
            }
        }

    }




}