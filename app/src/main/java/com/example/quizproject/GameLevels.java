package com.example.quizproject;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GameLevels extends AppCompatActivity {

    private MediaPlayer sound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gamelevels);

        sound = MediaPlayer.create(this, R.raw.rammstein1);

        soundPlayButton(sound);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Button button_back = (Button) findViewById(R.id.button_back);
        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    Intent intent = new Intent(GameLevels.this, MainActivity.class);
                    startActivity(intent);finish();
                } catch(Exception e) {

                }
            }
        });
        // переход на 1лвл - начало
        TextView textView1 = (TextView) findViewById(R.id.textView1);
        textView1.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound.stop();
                try {
                    Intent intent = new Intent(GameLevels.this, Level1.class);
                    startActivity(intent);finish();
                } catch(Exception e) {

                }
            }
        }));
        //переход на 1 лвл - конец

        // переход на 2лвл - начало
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setOnClickListener((new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                sound.stop();
                try {
                    Intent intent = new Intent(GameLevels.this, Level2.class);
                    startActivity(intent);finish();
                } catch(Exception e) {

                }
            }
        }));
        //переход на 2 лвл - конец

        //переход на 3 лвл - начало
        TextView textView3 = (TextView) findViewById(R.id.textView3);
        textView3.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound.stop();
                try {
                    Intent intent = new Intent(GameLevels.this, Level3.class);
                    startActivity(intent);finish();
                } catch(Exception e) {

                }
            }
        }));
        //переход на 3 лвл - конец

    }

    private void soundPlayButton(MediaPlayer sound) {
        if(sound.isPlaying()) {
            sound.stop();
        }
        sound.start();
        sound.setLooping(true);
        sound.seekTo(10000);
    }

    @Override
    public void onBackPressed() {
        sound.stop();
        try {
            Intent intent = new Intent(GameLevels.this, MainActivity.class);
            startActivity(intent);finish();
        } catch(Exception e) {

        }
    }
}