package com.example.monaxia1.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.monaxia1.Dashboard;
import com.example.monaxia1.R;
import com.example.monaxia1.music.CloudburstMusic;
import com.example.monaxia1.music.IntoTheBloomMusic;
import com.example.monaxia1.music.LaffeyCrushMusic;
import com.example.monaxia1.music.MetanoiaMusic;
import com.example.monaxia1.music.MoodRelaxationMusic;
import com.example.monaxia1.music.MusicSeeker;
import com.example.monaxia1.music.RelaxingMusic;
import com.example.monaxia1.music.SineMusic;
import com.example.monaxia1.music.SteezyLettingGoMusic;
import com.example.monaxia1.music.lovingYouMusic;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.io.IOException;

public class MusicFunction extends AppCompatActivity implements MediaPlayer.OnPreparedListener {

    LinearLayout musicLinear, musicLinear2, musicLinear3, musicLinear4, musicLinear5, musicLinear6, musicLinear7, musicLinear8, musicLinear9, musicLinear10;
    private ImageView arrowback;
    MediaPlayer mediaPlayer;

    String Forgotten = "https://firebasestorage.googleapis.com/v0/b/monaxia-f416d.appspot.com/o/Forgotten.mp3?alt=media&token=698a342f-9ad4-4153-9ae5-bb7c1d969914";
    String Last_Night = "https://firebasestorage.googleapis.com/v0/b/monaxia-f416d.appspot.com/o/Last%20Lights.mp3?alt=media&token=a38b3dd2-18c5-437a-878e-46fe6ec7955a";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_function);

        musicLinear = findViewById(R.id.LinearMusic);
        musicLinear2 = findViewById(R.id.LinearMusic2);
        musicLinear3 = findViewById(R.id.LinearMusic3);
        musicLinear4 = findViewById(R.id.LinearMusic4);
        musicLinear5 = findViewById(R.id.LinearMusic5);
        musicLinear6 = findViewById(R.id.LinearMusic6);
        musicLinear7 = findViewById(R.id.LinearMusic7);
        musicLinear8 = findViewById(R.id.LinearMusic8);
        musicLinear9 = findViewById(R.id.LinearMusic9);
        musicLinear10 = findViewById(R.id.LinearMusic10);

        mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);

        arrowback = findViewById(R.id.arrowBack);
        arrowback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MusicFunction.this, Dashboard.class);
                startActivity(intent1);
            }
        });


        musicLinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playmusicSeeker();
            }
        });

        musicLinear2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playLastNight();
            }
        });

//        musicLinear3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent3 = new Intent(MusicFunction.this, CloudburstMusic.class);
//                startActivity(intent3);
//            }
//        });
//
//        musicLinear4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent4 = new Intent(MusicFunction.this, IntoTheBloomMusic.class);
//                startActivity(intent4);
//            }
//        });
//
//        musicLinear5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent5 = new Intent(MusicFunction.this, MetanoiaMusic.class);
//                startActivity(intent5);
//            }
//        });
//
//        musicLinear6.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent6 = new Intent(MusicFunction.this, SineMusic.class);
//                startActivity(intent6);
//            }
//        });
//
//        musicLinear7.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent7 = new Intent(MusicFunction.this, SteezyLettingGoMusic.class);
//                startActivity(intent7);
//            }
//        });
//
//        musicLinear8.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent8 = new Intent(MusicFunction.this, LaffeyCrushMusic.class);
//                startActivity(intent8);
//            }
//        });
//
//        musicLinear9.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent9 = new Intent(MusicFunction.this, MoodRelaxationMusic.class);
//                startActivity(intent9);
//            }
//        });
//
//        musicLinear10.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent10 = new Intent(MusicFunction.this, RelaxingMusic.class);
//                startActivity(intent10);
//            }
//        });


    }

    private void playLastNight() {
        if(mediaPlayer.isPlaying()){
            mediaPlayer.stop();
        }
        playmusic(Last_Night);
    }


    private void playmusic(String url) {

        FirebaseStorage firebaseStorage = FirebaseStorage.getInstance();
        StorageReference storageRef = firebaseStorage.getReferenceFromUrl(url);
        storageRef.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                    @Override
                    public void onSuccess(Uri uri) {


                    }
                })

                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Log.i("TAG", e.getMessage());
                    }
                });


    }


    private void playmusicSeeker() {
        if(mediaPlayer.isPlaying()){
            mediaPlayer.stop();
        }
        playmusic(Forgotten);
    }

    @Override
    public void onPrepared(MediaPlayer mp) {

        try {
            mediaPlayer.start();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }
}