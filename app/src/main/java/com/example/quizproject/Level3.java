package com.example.quizproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class Level3 extends AppCompatActivity {

    Dialog dialog;
    Dialog dialogEnd3;
    public int country=0;
    public int trueans=0;
    public int falseans1=0;
    public int falseans2=0;
    public int falseans3=0;
    public int rightAns=0;
    public int count = 0;
    Array array = new Array();
    Random flag = new Random();
    Random ans1 = new Random();
    Random ans2 = new Random();
    Random ans3 = new Random();
    Random c = new Random();
    private MediaPlayer sound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.universal3);

        sound = MediaPlayer.create(this, R.raw.rammstein1);

        soundPlayButton(sound);

        TextView text_levels = findViewById(R.id.text_levels);
        text_levels.setText(R.string.levelthree);

        final ImageView img_flag = (ImageView)findViewById(R.id.img_flag);
        img_flag.setClipToOutline(true);

        final TextView img_answ1 = findViewById(R.id.img_answ1);
        final TextView img_answ5 = findViewById(R.id.img_answ5);
        final TextView img_answ9 = findViewById(R.id.img_answ9);
        final TextView img_answ13 = findViewById(R.id.img_answ13);


        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.level3dialog);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.MATCH_PARENT);
        dialog.setCancelable(false);

        TextView btnclose = (TextView)dialog.findViewById(R.id.btnclose);
        btnclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(Level3.this, GameLevels.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {

                }
                dialog.dismiss();
            }
        });

        Button btncontinue = (Button)dialog.findViewById(R.id.btncontinue);
        btncontinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });

        dialog.show();

        //______________________________________________________________________________________________________________________________________________________________
        dialogEnd3 = new Dialog(this);
        dialogEnd3.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialogEnd3.setContentView(R.layout.dialogend3);
        dialogEnd3.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialogEnd3.getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.MATCH_PARENT);
        dialogEnd3.setCancelable(false);

        TextView btnclose2 = (TextView)dialogEnd3.findViewById(R.id.btnclose);
        btnclose2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound.stop();
                try {
                    Intent intent = new Intent(Level3.this, GameLevels.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {

                }
                dialogEnd3.dismiss();
            }
        });

        Button btncontinue2 = (Button)dialogEnd3.findViewById(R.id.btncontinue);
        btncontinue2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Level3.this, GameLevels.class);
                    startActivity(intent);
                    finish();
                } catch(Exception e) {

                }
                dialogEnd3.dismiss();
            }
        });


        //______________________________________________________________________________________________________________________________________________________________

        Button btn_back = (Button)findViewById(R.id.button_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound.stop();
                try {
                    Intent intent = new Intent(Level3.this, GameLevels.class);
                    startActivity(intent);
                    finish();
                } catch(Exception e) {

                }
            }
        });


        //3 lvl start
        final int[] progress = {
                R.id.point1, R.id.point2, R.id.point3, R.id.point4, R.id.point5
        };

        final Animation a = AnimationUtils.loadAnimation(Level3.this, R.anim.alpha);

        country = flag.nextInt(43);

        trueans = country;
        falseans1 = flag.nextInt(43);
        while(falseans1 == trueans) {
            falseans1 = flag.nextInt(43);
        }
        falseans2 = flag.nextInt(43);
        while((falseans2 == trueans) || (falseans2 == falseans1)) {
            falseans2 = flag.nextInt(43);
        }
        falseans3 = flag.nextInt(43);
        while((falseans3 == trueans) || ((falseans3 == falseans2) || (falseans3 == falseans1))) {
            falseans3 = flag.nextInt(43);
        }
        rightAns = c.nextInt(4);

        img_flag.setImageResource(array.flags[country]);

        // вывод ответов на экран - начало
        if (rightAns == 0) {
            img_answ1.setText(array.flagname[trueans]);
            img_answ5.setText(array.flagname[falseans1]);
            img_answ9.setText(array.flagname[falseans2]);
            img_answ13.setText(array.flagname[falseans3]);

        } else if (rightAns == 1) {
            img_answ1.setText(array.flagname[falseans1]);
            img_answ5.setText(array.flagname[trueans]);
            img_answ9.setText(array.flagname[falseans2]);
            img_answ13.setText(array.flagname[falseans3]);

        } else if (rightAns == 2) {
            img_answ1.setText(array.flagname[falseans1]);
            img_answ5.setText(array.flagname[falseans2]);
            img_answ9.setText(array.flagname[trueans]);
            img_answ13.setText(array.flagname[falseans3]);
        } else {
            img_answ1.setText(array.flagname[falseans1]);
            img_answ5.setText(array.flagname[falseans2]);
            img_answ9.setText(array.flagname[falseans3]);
            img_answ13.setText(array.flagname[trueans]);

        }
        // вывод ответов на экран - konec

        //обработка кнопки 1 - начало
        img_answ1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    img_answ5.setEnabled(false);
                    img_answ9.setEnabled(false);
                    img_answ13.setEnabled(false);

                } else if(motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    if(rightAns == 0) {
                        if(count < 5) {
                            count++;
                        }

                        for (int i = 0; i < 5; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points);
                        }

                        for(int i = 0; i < count; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points_green);
                        }

                    } else {
                        if(count > 0) {
                            count = 0;
                        }
                        for (int i = 0; i < 4; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points);
                        }

                        for(int i = 0; i < count; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points_green);
                        }
                    }
                    if(count == 5) {
                        dialogEnd3.show();
                        sound.stop();
                    } else{
                        country = flag.nextInt(43);
                        trueans = country;
                        falseans1 = flag.nextInt(43);
                        while(falseans1 == trueans) {
                            falseans1 = flag.nextInt(43);
                        }
                        falseans2 = flag.nextInt(43);
                        while((falseans2 == trueans) || (falseans2 == falseans1)) {
                            falseans2 = flag.nextInt(43);
                        }
                        falseans3 = flag.nextInt(43);
                        while((falseans3 == trueans) || ((falseans3 == falseans2) || (falseans3 == falseans1))) {
                            falseans3 = flag.nextInt(43);
                        }
                        rightAns = c.nextInt(4);

                        img_flag.setImageResource(array.flags[country]);

                        // вывод ответов на экран - начало
                        if (rightAns == 0) {
                            img_answ1.setText(array.flagname[trueans]);
                            img_answ5.setText(array.flagname[falseans1]);
                            img_answ9.setText(array.flagname[falseans2]);
                            img_answ13.setText(array.flagname[falseans3]);

                        } else if (rightAns == 1) {
                            img_answ1.setText(array.flagname[falseans1]);
                            img_answ5.setText(array.flagname[trueans]);
                            img_answ9.setText(array.flagname[falseans2]);
                            img_answ13.setText(array.flagname[falseans3]);

                        } else if (rightAns == 2) {
                            img_answ1.setText(array.flagname[falseans1]);
                            img_answ5.setText(array.flagname[falseans2]);
                            img_answ9.setText(array.flagname[trueans]);
                            img_answ13.setText(array.flagname[falseans3]);
                        } else {
                            img_answ1.setText(array.flagname[falseans1]);
                            img_answ5.setText(array.flagname[falseans2]);
                            img_answ9.setText(array.flagname[falseans3]);
                            img_answ13.setText(array.flagname[trueans]);

                        }

                        img_answ5.setEnabled(true);
                        img_answ9.setEnabled(true);
                        img_answ13.setEnabled(true);

                    }
                }
                return true;
            }
        });
        //обработка кнопки 1 - конец


        //обработка кнопки 2 - начало
        img_answ5.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    img_answ1.setEnabled(false);
                    img_answ9.setEnabled(false);
                    img_answ13.setEnabled(false);

                } else if(motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    if(rightAns == 1) {
                        if(count < 5) {
                            count++;
                        }

                        for (int i = 0; i < 5; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points);
                        }

                        for(int i = 0; i < count; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points_green);
                        }

                    } else {
                        if(count > 0) {
                            count = 0;
                        }
                        for (int i = 0; i < 4; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points);
                        }

                        for(int i = 0; i < count; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points_green);
                        }
                    }
                    if(count == 5) {
                        dialogEnd3.show();
                        sound.stop();
                    } else{
                        country = flag.nextInt(43);
                        trueans = country;
                        falseans1 = flag.nextInt(43);
                        while(falseans1 == trueans) {
                            falseans1 = flag.nextInt(43);
                        }
                        falseans2 = flag.nextInt(43);
                        while((falseans2 == trueans) || (falseans2 == falseans1)) {
                            falseans2 = flag.nextInt(43);
                        }
                        falseans3 = flag.nextInt(43);
                        while((falseans3 == trueans) || ((falseans3 == falseans2) || (falseans3 == falseans1))) {
                            falseans3 = flag.nextInt(43);
                        }
                        rightAns = c.nextInt(4);

                        img_flag.setImageResource(array.flags[country]);

                        // вывод ответов на экран - начало
                        if (rightAns == 0) {
                            img_answ1.setText(array.flagname[trueans]);
                            img_answ5.setText(array.flagname[falseans1]);
                            img_answ9.setText(array.flagname[falseans2]);
                            img_answ13.setText(array.flagname[falseans3]);

                        } else if (rightAns == 1) {
                            img_answ1.setText(array.flagname[falseans1]);
                            img_answ5.setText(array.flagname[trueans]);
                            img_answ9.setText(array.flagname[falseans2]);
                            img_answ13.setText(array.flagname[falseans3]);

                        } else if (rightAns == 2) {
                            img_answ1.setText(array.flagname[falseans1]);
                            img_answ5.setText(array.flagname[falseans2]);
                            img_answ9.setText(array.flagname[trueans]);
                            img_answ13.setText(array.flagname[falseans3]);
                        } else {
                            img_answ1.setText(array.flagname[falseans1]);
                            img_answ5.setText(array.flagname[falseans2]);
                            img_answ9.setText(array.flagname[falseans3]);
                            img_answ13.setText(array.flagname[trueans]);

                        }

                        img_answ1.setEnabled(true);
                        img_answ9.setEnabled(true);
                        img_answ13.setEnabled(true);

                    }
                }
                return true;
            }
        });
        //обработка кнопки 2 - конец

        //обработка кнопки 3 - начало
        img_answ9.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    img_answ1.setEnabled(false);
                    img_answ5.setEnabled(false);
                    img_answ13.setEnabled(false);

                } else if(motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    if(rightAns == 2) {
                        if(count < 5) {
                            count++;
                        }

                        for (int i = 0; i < 5; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points);
                        }

                        for(int i = 0; i < count; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points_green);
                        }

                    } else {
                        if(count > 0) {
                            count = 0;
                        }
                        for (int i = 0; i < 4; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points);
                        }

                        for(int i = 0; i < count; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points_green);
                        }
                    }
                    if(count == 5) {
                        dialogEnd3.show();
                        sound.stop();
                    } else{
                        country = flag.nextInt(43);
                        trueans = country;
                        falseans1 = flag.nextInt(43);
                        while(falseans1 == trueans) {
                            falseans1 = flag.nextInt(43);
                        }
                        falseans2 = flag.nextInt(43);
                        while((falseans2 == trueans) || (falseans2 == falseans1)) {
                            falseans2 = flag.nextInt(43);
                        }
                        falseans3 = flag.nextInt(43);
                        while((falseans3 == trueans) || ((falseans3 == falseans2) || (falseans3 == falseans1))) {
                            falseans3 = flag.nextInt(43);
                        }
                        rightAns = c.nextInt(4);

                        img_flag.setImageResource(array.flags[country]);

                        // вывод ответов на экран - начало
                        if (rightAns == 0) {
                            img_answ1.setText(array.flagname[trueans]);
                            img_answ5.setText(array.flagname[falseans1]);
                            img_answ9.setText(array.flagname[falseans2]);
                            img_answ13.setText(array.flagname[falseans3]);

                        } else if (rightAns == 1) {
                            img_answ1.setText(array.flagname[falseans1]);
                            img_answ5.setText(array.flagname[trueans]);
                            img_answ9.setText(array.flagname[falseans2]);
                            img_answ13.setText(array.flagname[falseans3]);

                        } else if (rightAns == 2) {
                            img_answ1.setText(array.flagname[falseans1]);
                            img_answ5.setText(array.flagname[falseans2]);
                            img_answ9.setText(array.flagname[trueans]);
                            img_answ13.setText(array.flagname[falseans3]);
                        } else {
                            img_answ1.setText(array.flagname[falseans1]);
                            img_answ5.setText(array.flagname[falseans2]);
                            img_answ9.setText(array.flagname[falseans3]);
                            img_answ13.setText(array.flagname[trueans]);

                        }

                        img_answ1.setEnabled(true);
                        img_answ5.setEnabled(true);
                        img_answ13.setEnabled(true);

                    }
                }
                return true;
            }
        });
        //обработка кнопки 3 - конец

        //обработка кнопки 4 - начало
        img_answ13.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    img_answ1.setEnabled(false);
                    img_answ5.setEnabled(false);
                    img_answ9.setEnabled(false);

                } else if(motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    if(rightAns == 3) {
                        if(count < 5) {
                            count++;
                        }

                        for (int i = 0; i < 5; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points);
                        }

                        for(int i = 0; i < count; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points_green);
                        }

                    } else {
                        if(count > 0) {
                            count = 0;
                        }
                        for (int i = 0; i < 4; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points);
                        }

                        for(int i = 0; i < count; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points_green);
                        }
                    }
                    if(count == 5) {
                        dialogEnd3.show();
                        sound.stop();
                    } else{
                        country = flag.nextInt(43);
                        trueans = country;
                        falseans1 = flag.nextInt(43);
                        while(falseans1 == trueans) {
                            falseans1 = flag.nextInt(43);
                        }
                        falseans2 = flag.nextInt(43);
                        while((falseans2 == trueans) || (falseans2 == falseans1)) {
                            falseans2 = flag.nextInt(43);
                        }
                        falseans3 = flag.nextInt(43);
                        while((falseans3 == trueans) || ((falseans3 == falseans2) || (falseans3 == falseans1))) {
                            falseans3 = flag.nextInt(43);
                        }
                        rightAns = c.nextInt(4);

                        img_flag.setImageResource(array.flags[country]);

                        // вывод ответов на экран - начало
                        if (rightAns == 0) {
                            img_answ1.setText(array.flagname[trueans]);
                            img_answ5.setText(array.flagname[falseans1]);
                            img_answ9.setText(array.flagname[falseans2]);
                            img_answ13.setText(array.flagname[falseans3]);

                        } else if (rightAns == 1) {
                            img_answ1.setText(array.flagname[falseans1]);
                            img_answ5.setText(array.flagname[trueans]);
                            img_answ9.setText(array.flagname[falseans2]);
                            img_answ13.setText(array.flagname[falseans3]);

                        } else if (rightAns == 2) {
                            img_answ1.setText(array.flagname[falseans1]);
                            img_answ5.setText(array.flagname[falseans2]);
                            img_answ9.setText(array.flagname[trueans]);
                            img_answ13.setText(array.flagname[falseans3]);
                        } else {
                            img_answ1.setText(array.flagname[falseans1]);
                            img_answ5.setText(array.flagname[falseans2]);
                            img_answ9.setText(array.flagname[falseans3]);
                            img_answ13.setText(array.flagname[trueans]);

                        }

                        img_answ1.setEnabled(true);
                        img_answ5.setEnabled(true);
                        img_answ9.setEnabled(true);

                    }
                }
                return true;
            }
        });
        //обработка кнопки 4 - конец
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
    public void onBackPressed(){

        try {
            Intent intent = new Intent(Level3.this, GameLevels.class);
            startActivity(intent);
            finish();
        } catch(Exception e) {

        }
    }
}