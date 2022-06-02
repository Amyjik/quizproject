package com.example.quizproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private long backPressedTime;
    private Toast backToast;
    private Button buttonStart;
    private MediaPlayer sound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonStart = findViewById(R.id.buttonStart);
        sound = MediaPlayer.create(this, R.raw.rammstein1);

        soundPlayButton(sound);


        Button buttonStart = (Button) findViewById(R.id.buttonStart);
        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound.stop();
                try {
                    Intent intent = new Intent(MainActivity.this, GameLevels.class);
                    startActivity(intent);finish();
                } catch (Exception e) {

                }
            }
        });

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
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

        if(backPressedTime + 1500 > System.currentTimeMillis()) {
            backToast.cancel();
            super.onBackPressed();
            return;
        } else {
            backToast = Toast.makeText(getBaseContext(), "Нажмите еще раз, чтобы выйти", Toast.LENGTH_SHORT);
            backToast.show();
        }
        backPressedTime = System.currentTimeMillis();
    }
}