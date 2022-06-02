package com.example.quizproject;

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
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class Level2 extends AppCompatActivity {


    Dialog dialog;
    Dialog dialogEnd2;

    public int numLeft1 = 0;
    public int numLeft2 = 0;
    public int numRight1 = 0;
    public int numRight2 = 0;
    public int znak1 = 0;
    public int answer1 = 0;
    public int answer2 = 0;
    public int answer3 = 0;
    public int answer4 = 0;
    public int rightAns = 0;
    Array array = new Array();
    Random a1 = new Random();
    Random a2 = new Random();
    Random b1 = new Random();
    Random b2 = new Random();
    Random znak = new Random();
    Random ans2 = new Random();
    Random ans3 = new Random();
    Random ans4 = new Random();
    Random trueAns = new Random();
    public int count = 0;
    private MediaPlayer sound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.universal2);

        sound = MediaPlayer.create(this, R.raw.rammstein1);

        soundPlayButton(sound);

        TextView text_levels = findViewById(R.id.text_levels);
        text_levels.setText(R.string.leveltwo);

        final ImageView img_left1 = (ImageView) findViewById(R.id.img_left1);
        img_left1.setClipToOutline(true);

        final ImageView img_left2 = (ImageView) findViewById(R.id.img_left2);
        img_left2.setClipToOutline(true);

        final ImageView img_znak1 = (ImageView) findViewById(R.id.img_znak1);
        img_znak1.setClipToOutline(true);

        final ImageView img_right1 = (ImageView) findViewById(R.id.img_right1);
        img_right1.setClipToOutline(true);

        final ImageView img_right2 = (ImageView) findViewById(R.id.img_right2);
        img_right2.setClipToOutline(true);

        final ImageView img_answ1 = (ImageView) findViewById(R.id.img_answ1);

        final ImageView img_answ2 = (ImageView) findViewById(R.id.img_answ2);

        final ImageView img_answ3 = (ImageView) findViewById(R.id.img_answ3);

        final ImageView img_answ4 = (ImageView) findViewById(R.id.img_answ4);

        final ImageView img_answ5 = (ImageView) findViewById(R.id.img_answ5);

        final ImageView img_answ6 = (ImageView) findViewById(R.id.img_answ6);

        final ImageView img_answ7 = (ImageView) findViewById(R.id.img_answ7);

        final ImageView img_answ8 = (ImageView) findViewById(R.id.img_answ8);

        final ImageView img_answ9 = (ImageView) findViewById(R.id.img_answ9);

        final ImageView img_answ10 = (ImageView) findViewById(R.id.img_answ10);

        final ImageView img_answ11 = (ImageView) findViewById(R.id.img_answ11);

        final ImageView img_answ12 = (ImageView) findViewById(R.id.img_answ12);

        final ImageView img_answ13 = (ImageView) findViewById(R.id.img_answ13);

        final ImageView img_answ14 = (ImageView) findViewById(R.id.img_answ14);

        final ImageView img_answ15 = (ImageView) findViewById(R.id.img_answ15);

        final ImageView img_answ16 = (ImageView) findViewById(R.id.img_answ16);


        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.level2dialog);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.MATCH_PARENT);
        dialog.setCancelable(false);


        TextView btnclose = (TextView) dialog.findViewById(R.id.btnclose);
        btnclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound.stop();
                try {
                    Intent intent = new Intent(com.example.quizproject.Level2.this, GameLevels.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {

                }
                dialog.dismiss();
            }
        });

        Button btncontinue = (Button) dialog.findViewById(R.id.btncontinue);
        btncontinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });

        dialog.show();

        //______________________________________________________________________________________________________________________________________________________________
        dialogEnd2 = new Dialog(this);
        dialogEnd2.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialogEnd2.setContentView(R.layout.dialogend2);
        dialogEnd2.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialogEnd2.getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.MATCH_PARENT);
        dialogEnd2.setCancelable(false);

        TextView btnclose2 = (TextView) dialogEnd2.findViewById(R.id.btnclose);
        btnclose2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound.stop();
                try {
                    Intent intent = new Intent(com.example.quizproject.Level2.this, GameLevels.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {

                }
                dialogEnd2.dismiss();
            }
        });

        Button btncontinue2 = (Button) dialogEnd2.findViewById(R.id.btncontinue);
        btncontinue2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(com.example.quizproject.Level2.this, Level3.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {

                }
                dialogEnd2.dismiss();
            }
        });


        //______________________________________________________________________________________________________________________________________________________________

        Button btn_back = (Button) findViewById(R.id.button_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound.stop();
                try {
                    Intent intent = new Intent(com.example.quizproject.Level2.this, GameLevels.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {

                }
            }
        });

            //2 лвл - начало
            final int[] progress = {
                    R.id.point1, R.id.point2, R.id.point3, R.id.point4, R.id.point5, R.id.point6, R.id.point7, R.id.point8, R.id.point9, R.id.point10,
                    R.id.point11, R.id.point12, R.id.point13, R.id.point14, R.id.point15, R.id.point16, R.id.point17, R.id.point18, R.id.point19, R.id.point20,
            };


            // вывод примера на экран - начало
            numLeft1 = a1.nextInt(10);

            numLeft2 = a2.nextInt(10);

            numRight1 = b1.nextInt(10);

            numRight2 = b2.nextInt(10);

            znak1 = znak.nextInt(3);
            img_znak1.setImageResource(array.znaki[znak1]);


            while (((numLeft1 * 10 + numLeft2) < (numRight1 * 10 + numRight2)) && (znak1 == 1)) {
                numLeft1 = a1.nextInt(10);
                numLeft2 = a2.nextInt(10);
                numRight1 = b1.nextInt(10);
                numRight2 = b2.nextInt(10);
            }
            img_left1.setImageResource(array.smallnum[numLeft1]);
            img_left2.setImageResource(array.smallnum[numLeft2]);
            img_right1.setImageResource(array.smallnum[numRight1]);
            img_right2.setImageResource(array.smallnum[numRight2]);

            //вывод примера на экран - конец

            rightAns = trueAns.nextInt(4);

            // вычисление и вывод ответов на экран - начало

            if (znak1 == 0)
                answer1 = (numLeft1 * 10 + numLeft2) + (numRight1 * 10 + numRight2);
            else if (znak1 == 2)
                answer1 = (numLeft1 * 10 + numLeft2) * (numRight1 * 10 + numRight2);
            else {
                answer1 = (numLeft1 * 10 + numLeft2) - (numRight1 * 10 + numRight2);
            }

                if (rightAns == 0) {

                img_answ1.setImageResource(array.smallnum[answer1 / 1000]);
                img_answ2.setImageResource(array.smallnum[answer1 / 100 % 10]);
                img_answ3.setImageResource(array.smallnum[answer1 / 10 % 10]);
                img_answ4.setImageResource(array.smallnum[answer1 % 10]);

                answer2 = ans2.nextInt(1000);
                img_answ5.setImageResource(array.smallnum[answer2 / 1000]);
                img_answ6.setImageResource(array.smallnum[answer2 / 100 % 10]);
                img_answ7.setImageResource(array.smallnum[answer2 / 10 % 10]);
                img_answ8.setImageResource(array.smallnum[answer2 % 10]);

                answer3 = ans3.nextInt(1000);
                img_answ9.setImageResource(array.smallnum[answer3 / 1000]);
                img_answ10.setImageResource(array.smallnum[answer3 / 100 % 10]);
                img_answ11.setImageResource(array.smallnum[answer3 / 10 % 10]);
                img_answ12.setImageResource(array.smallnum[answer3 % 10]);

                answer4 = ans4.nextInt(1000);
                img_answ13.setImageResource(array.smallnum[answer4 / 1000]);
                img_answ14.setImageResource(array.smallnum[answer4 / 100 % 10]);
                img_answ15.setImageResource(array.smallnum[answer4 / 10 % 10]);
                img_answ16.setImageResource(array.smallnum[answer4 % 10]);

            } else if (rightAns == 1) {
                    answer2 = ans2.nextInt(1000);
                    img_answ1.setImageResource(array.smallnum[answer2 / 1000]);
                    img_answ2.setImageResource(array.smallnum[answer2 / 100 % 10]);
                    img_answ3.setImageResource(array.smallnum[answer2 / 10 % 10]);
                    img_answ4.setImageResource(array.smallnum[answer2 % 10]);

                    img_answ5.setImageResource(array.smallnum[answer1 / 1000]);
                    img_answ6.setImageResource(array.smallnum[answer1 / 100 % 10]);
                    img_answ7.setImageResource(array.smallnum[answer1 / 10 % 10]);
                    img_answ8.setImageResource(array.smallnum[answer1 % 10]);

                    answer3 = ans3.nextInt(1000);
                    img_answ9.setImageResource(array.smallnum[answer3 / 1000]);
                    img_answ10.setImageResource(array.smallnum[answer3 / 100 % 10]);
                    img_answ11.setImageResource(array.smallnum[answer3 / 10 % 10]);
                    img_answ12.setImageResource(array.smallnum[answer3 % 10]);

                    answer4 = ans4.nextInt(1000);
                    img_answ13.setImageResource(array.smallnum[answer4 / 1000]);
                    img_answ14.setImageResource(array.smallnum[answer4 / 100 % 10]);
                    img_answ15.setImageResource(array.smallnum[answer4 / 10 % 10]);
                    img_answ16.setImageResource(array.smallnum[answer4 % 10]);
            } else if (rightAns == 2) {
                    answer2 = ans2.nextInt(1000);
                    img_answ1.setImageResource(array.smallnum[answer2 / 1000]);
                    img_answ2.setImageResource(array.smallnum[answer2 / 100 % 10]);
                    img_answ3.setImageResource(array.smallnum[answer2 / 10 % 10]);
                    img_answ4.setImageResource(array.smallnum[answer2 % 10]);

                    answer3 = ans3.nextInt(1000);
                    img_answ5.setImageResource(array.smallnum[answer3 / 1000]);
                    img_answ6.setImageResource(array.smallnum[answer3 / 100 % 10]);
                    img_answ7.setImageResource(array.smallnum[answer3 / 10 % 10]);
                    img_answ8.setImageResource(array.smallnum[answer3 % 10]);

                    img_answ9.setImageResource(array.smallnum[answer1 / 1000]);
                    img_answ10.setImageResource(array.smallnum[answer1 / 100 % 10]);
                    img_answ11.setImageResource(array.smallnum[answer1 / 10 % 10]);
                    img_answ12.setImageResource(array.smallnum[answer1 % 10]);

                    answer4 = ans4.nextInt(1000);
                    img_answ13.setImageResource(array.smallnum[answer4 / 1000]);
                    img_answ14.setImageResource(array.smallnum[answer4 / 100 % 10]);
                    img_answ15.setImageResource(array.smallnum[answer4 / 10 % 10]);
                    img_answ16.setImageResource(array.smallnum[answer4 % 10]);
                } else {
                    answer2 = ans2.nextInt(1000);
                    img_answ1.setImageResource(array.smallnum[answer2 / 1000]);
                    img_answ2.setImageResource(array.smallnum[answer2 / 100 % 10]);
                    img_answ3.setImageResource(array.smallnum[answer2 / 10 % 10]);
                    img_answ4.setImageResource(array.smallnum[answer2 % 10]);

                    answer3 = ans3.nextInt(1000);
                    img_answ5.setImageResource(array.smallnum[answer3 / 1000]);
                    img_answ6.setImageResource(array.smallnum[answer3 / 100 % 10]);
                    img_answ7.setImageResource(array.smallnum[answer3 / 10 % 10]);
                    img_answ8.setImageResource(array.smallnum[answer3 % 10]);

                    answer4 = ans4.nextInt(1000);
                    img_answ9.setImageResource(array.smallnum[answer4 / 1000]);
                    img_answ10.setImageResource(array.smallnum[answer4 / 100 % 10]);
                    img_answ11.setImageResource(array.smallnum[answer4 / 10 % 10]);
                    img_answ12.setImageResource(array.smallnum[answer4 % 10]);

                    img_answ13.setImageResource(array.smallnum[answer1 / 1000]);
                    img_answ14.setImageResource(array.smallnum[answer1 / 100 % 10]);
                    img_answ15.setImageResource(array.smallnum[answer1 / 10 % 10]);
                    img_answ16.setImageResource(array.smallnum[answer1 % 10]);
                }

        // вычисление и вывод правильного ответа на экран - конец
            //первая кнопка - начало
        img_answ1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    img_answ5.setEnabled(false);
                    img_answ6.setEnabled(false);
                    img_answ7.setEnabled(false);
                    img_answ8.setEnabled(false);
                    img_answ9.setEnabled(false);
                    img_answ10.setEnabled(false);
                    img_answ11.setEnabled(false);
                    img_answ12.setEnabled(false);
                    img_answ13.setEnabled(false);
                    img_answ14.setEnabled(false);
                    img_answ15.setEnabled(false);
                    img_answ16.setEnabled(false);
                    if(rightAns == 0) {
                        img_answ1.setImageResource(R.drawable.img_true);
                        img_answ2.setImageResource(R.drawable.img_true);
                        img_answ3.setImageResource(R.drawable.img_true);
                        img_answ4.setImageResource(R.drawable.img_true);
                    } else{
                        img_answ1.setImageResource(R.drawable.img_false);
                        img_answ2.setImageResource(R.drawable.img_false);
                        img_answ3.setImageResource(R.drawable.img_false);
                        img_answ4.setImageResource(R.drawable.img_false);

                    }
                } else if(motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    if(rightAns == 0) {
                        if(count < 20) {
                            count++;
                        }

                        for (int i = 0; i < 20; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points);
                        }

                        for(int i = 0; i < count; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points_green);
                        }

                    } else {
                        if(count > 0) {
                            if(count == 1) {
                                count = 0;
                            } else {
                                count -= 2;
                            }
                        }
                        for (int i = 0; i < 19; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points);
                        }

                        for(int i = 0; i < count; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points_green);
                        }
                    }
                    if(count == 20) {
                        dialogEnd2.show();
                        sound.stop();
                    } else{
                        numLeft1 = a1.nextInt(10);
                        numLeft2 = a2.nextInt(10);
                        numRight1 = b1.nextInt(10);
                        numRight2 = b2.nextInt(10);
                        znak1 = znak.nextInt(3);
                        img_znak1.setImageResource(array.znaki[znak1]);
                        while (((numLeft1 * 10 + numLeft2) < (numRight1 * 10 + numRight2)) && (znak1 == 1)) {
                            numLeft1 = a1.nextInt(10);
                            numLeft2 = a2.nextInt(10);
                            numRight1 = b1.nextInt(10);
                            numRight2 = b2.nextInt(10);
                        }
                        img_left1.setImageResource(array.smallnum[numLeft1]);
                        img_left2.setImageResource(array.smallnum[numLeft2]);
                        img_right1.setImageResource(array.smallnum[numRight1]);
                        img_right2.setImageResource(array.smallnum[numRight2]);

                        rightAns = trueAns.nextInt(4);

                        // вычисление и вывод ответов на экран - начало

                        if (znak1 == 0)
                            answer1 = (numLeft1 * 10 + numLeft2) + (numRight1 * 10 + numRight2);
                        else if (znak1 == 2)
                            answer1 = (numLeft1 * 10 + numLeft2) * (numRight1 * 10 + numRight2);
                        else {
                            answer1 = (numLeft1 * 10 + numLeft2) - (numRight1 * 10 + numRight2);
                        }

                        if (rightAns == 0) {

                            img_answ1.setImageResource(array.smallnum[answer1 / 1000]);
                            img_answ2.setImageResource(array.smallnum[answer1 / 100 % 10]);
                            img_answ3.setImageResource(array.smallnum[answer1 / 10 % 10]);
                            img_answ4.setImageResource(array.smallnum[answer1 % 10]);

                            answer2 = ans2.nextInt(1000);
                            img_answ5.setImageResource(array.smallnum[answer2 / 1000]);
                            img_answ6.setImageResource(array.smallnum[answer2 / 100 % 10]);
                            img_answ7.setImageResource(array.smallnum[answer2 / 10 % 10]);
                            img_answ8.setImageResource(array.smallnum[answer2 % 10]);

                            answer3 = ans3.nextInt(1000);
                            img_answ9.setImageResource(array.smallnum[answer3 / 1000]);
                            img_answ10.setImageResource(array.smallnum[answer3 / 100 % 10]);
                            img_answ11.setImageResource(array.smallnum[answer3 / 10 % 10]);
                            img_answ12.setImageResource(array.smallnum[answer3 % 10]);

                            answer4 = ans4.nextInt(1000);
                            img_answ13.setImageResource(array.smallnum[answer4 / 1000]);
                            img_answ14.setImageResource(array.smallnum[answer4 / 100 % 10]);
                            img_answ15.setImageResource(array.smallnum[answer4 / 10 % 10]);
                            img_answ16.setImageResource(array.smallnum[answer4 % 10]);

                        } else if (rightAns == 1) {
                            answer2 = ans2.nextInt(1000);
                            img_answ1.setImageResource(array.smallnum[answer2 / 1000]);
                            img_answ2.setImageResource(array.smallnum[answer2 / 100 % 10]);
                            img_answ3.setImageResource(array.smallnum[answer2 / 10 % 10]);
                            img_answ4.setImageResource(array.smallnum[answer2 % 10]);

                            img_answ5.setImageResource(array.smallnum[answer1 / 1000]);
                            img_answ6.setImageResource(array.smallnum[answer1 / 100 % 10]);
                            img_answ7.setImageResource(array.smallnum[answer1 / 10 % 10]);
                            img_answ8.setImageResource(array.smallnum[answer1 % 10]);

                            answer3 = ans3.nextInt(1000);
                            img_answ9.setImageResource(array.smallnum[answer3 / 1000]);
                            img_answ10.setImageResource(array.smallnum[answer3 / 100 % 10]);
                            img_answ11.setImageResource(array.smallnum[answer3 / 10 % 10]);
                            img_answ12.setImageResource(array.smallnum[answer3 % 10]);

                            answer4 = ans4.nextInt(1000);
                            img_answ13.setImageResource(array.smallnum[answer4 / 1000]);
                            img_answ14.setImageResource(array.smallnum[answer4 / 100 % 10]);
                            img_answ15.setImageResource(array.smallnum[answer4 / 10 % 10]);
                            img_answ16.setImageResource(array.smallnum[answer4 % 10]);
                        } else if (rightAns == 2) {
                            answer2 = ans2.nextInt(1000);
                            img_answ1.setImageResource(array.smallnum[answer2 / 1000]);
                            img_answ2.setImageResource(array.smallnum[answer2 / 100 % 10]);
                            img_answ3.setImageResource(array.smallnum[answer2 / 10 % 10]);
                            img_answ4.setImageResource(array.smallnum[answer2 % 10]);

                            answer3 = ans3.nextInt(1000);
                            img_answ5.setImageResource(array.smallnum[answer3 / 1000]);
                            img_answ6.setImageResource(array.smallnum[answer3 / 100 % 10]);
                            img_answ7.setImageResource(array.smallnum[answer3 / 10 % 10]);
                            img_answ8.setImageResource(array.smallnum[answer3 % 10]);

                            img_answ9.setImageResource(array.smallnum[answer1 / 1000]);
                            img_answ10.setImageResource(array.smallnum[answer1 / 100 % 10]);
                            img_answ11.setImageResource(array.smallnum[answer1 / 10 % 10]);
                            img_answ12.setImageResource(array.smallnum[answer1 % 10]);

                            answer4 = ans4.nextInt(1000);
                            img_answ13.setImageResource(array.smallnum[answer4 / 1000]);
                            img_answ14.setImageResource(array.smallnum[answer4 / 100 % 10]);
                            img_answ15.setImageResource(array.smallnum[answer4 / 10 % 10]);
                            img_answ16.setImageResource(array.smallnum[answer4 % 10]);
                        } else {
                            answer2 = ans2.nextInt(1000);
                            img_answ1.setImageResource(array.smallnum[answer2 / 1000]);
                            img_answ2.setImageResource(array.smallnum[answer2 / 100 % 10]);
                            img_answ3.setImageResource(array.smallnum[answer2 / 10 % 10]);
                            img_answ4.setImageResource(array.smallnum[answer2 % 10]);

                            answer3 = ans3.nextInt(1000);
                            img_answ5.setImageResource(array.smallnum[answer3 / 1000]);
                            img_answ6.setImageResource(array.smallnum[answer3 / 100 % 10]);
                            img_answ7.setImageResource(array.smallnum[answer3 / 10 % 10]);
                            img_answ8.setImageResource(array.smallnum[answer3 % 10]);

                            answer4 = ans4.nextInt(1000);
                            img_answ9.setImageResource(array.smallnum[answer4 / 1000]);
                            img_answ10.setImageResource(array.smallnum[answer4 / 100 % 10]);
                            img_answ11.setImageResource(array.smallnum[answer4 / 10 % 10]);
                            img_answ12.setImageResource(array.smallnum[answer4 % 10]);

                            img_answ13.setImageResource(array.smallnum[answer1 / 1000]);
                            img_answ14.setImageResource(array.smallnum[answer1 / 100 % 10]);
                            img_answ15.setImageResource(array.smallnum[answer1 / 10 % 10]);
                            img_answ16.setImageResource(array.smallnum[answer1 % 10]);
                        }

                        img_answ5.setEnabled(true);
                        img_answ6.setEnabled(true);
                        img_answ7.setEnabled(true);
                        img_answ8.setEnabled(true);
                        img_answ9.setEnabled(true);
                        img_answ10.setEnabled(true);
                        img_answ11.setEnabled(true);
                        img_answ12.setEnabled(true);
                        img_answ13.setEnabled(true);
                        img_answ14.setEnabled(true);
                        img_answ15.setEnabled(true);
                        img_answ16.setEnabled(true);
                    }
                }
                return true;
            }
        });
        img_answ2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    img_answ5.setEnabled(false);
                    img_answ6.setEnabled(false);
                    img_answ7.setEnabled(false);
                    img_answ8.setEnabled(false);
                    img_answ9.setEnabled(false);
                    img_answ10.setEnabled(false);
                    img_answ11.setEnabled(false);
                    img_answ12.setEnabled(false);
                    img_answ13.setEnabled(false);
                    img_answ14.setEnabled(false);
                    img_answ15.setEnabled(false);
                    img_answ16.setEnabled(false);
                    if(rightAns == 0) {
                        img_answ1.setImageResource(R.drawable.img_true);
                        img_answ2.setImageResource(R.drawable.img_true);
                        img_answ3.setImageResource(R.drawable.img_true);
                        img_answ4.setImageResource(R.drawable.img_true);
                    } else{
                        img_answ1.setImageResource(R.drawable.img_false);
                        img_answ2.setImageResource(R.drawable.img_false);
                        img_answ3.setImageResource(R.drawable.img_false);
                        img_answ4.setImageResource(R.drawable.img_false);

                    }
                } else if(motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    if(rightAns == 0) {
                        if(count < 20) {
                            count++;
                        }

                        for (int i = 0; i < 20; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points);
                        }

                        for(int i = 0; i < count; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points_green);
                        }

                    } else {
                        if(count > 0) {
                            if(count == 1) {
                                count = 0;
                            } else {
                                count -= 2;
                            }
                        }
                        for (int i = 0; i < 19; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points);
                        }

                        for(int i = 0; i < count; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points_green);
                        }
                    }
                    if(count == 20) {
                        dialogEnd2.show();
                        sound.stop();
                    } else{
                        numLeft1 = a1.nextInt(10);
                        numLeft2 = a2.nextInt(10);
                        numRight1 = b1.nextInt(10);
                        numRight2 = b2.nextInt(10);
                        znak1 = znak.nextInt(3);
                        img_znak1.setImageResource(array.znaki[znak1]);
                        while (((numLeft1 * 10 + numLeft2) < (numRight1 * 10 + numRight2)) && (znak1 == 1)) {
                            numLeft1 = a1.nextInt(10);
                            numLeft2 = a2.nextInt(10);
                            numRight1 = b1.nextInt(10);
                            numRight2 = b2.nextInt(10);
                        }
                        img_left1.setImageResource(array.smallnum[numLeft1]);
                        img_left2.setImageResource(array.smallnum[numLeft2]);
                        img_right1.setImageResource(array.smallnum[numRight1]);
                        img_right2.setImageResource(array.smallnum[numRight2]);

                        rightAns = trueAns.nextInt(4);

                        // вычисление и вывод ответов на экран - начало

                        if (znak1 == 0)
                            answer1 = (numLeft1 * 10 + numLeft2) + (numRight1 * 10 + numRight2);
                        else if (znak1 == 2)
                            answer1 = (numLeft1 * 10 + numLeft2) * (numRight1 * 10 + numRight2);
                        else {
                            answer1 = (numLeft1 * 10 + numLeft2) - (numRight1 * 10 + numRight2);
                        }

                        if (rightAns == 0) {

                            img_answ1.setImageResource(array.smallnum[answer1 / 1000]);
                            img_answ2.setImageResource(array.smallnum[answer1 / 100 % 10]);
                            img_answ3.setImageResource(array.smallnum[answer1 / 10 % 10]);
                            img_answ4.setImageResource(array.smallnum[answer1 % 10]);

                            answer2 = ans2.nextInt(1000);
                            img_answ5.setImageResource(array.smallnum[answer2 / 1000]);
                            img_answ6.setImageResource(array.smallnum[answer2 / 100 % 10]);
                            img_answ7.setImageResource(array.smallnum[answer2 / 10 % 10]);
                            img_answ8.setImageResource(array.smallnum[answer2 % 10]);

                            answer3 = ans3.nextInt(1000);
                            img_answ9.setImageResource(array.smallnum[answer3 / 1000]);
                            img_answ10.setImageResource(array.smallnum[answer3 / 100 % 10]);
                            img_answ11.setImageResource(array.smallnum[answer3 / 10 % 10]);
                            img_answ12.setImageResource(array.smallnum[answer3 % 10]);

                            answer4 = ans4.nextInt(1000);
                            img_answ13.setImageResource(array.smallnum[answer4 / 1000]);
                            img_answ14.setImageResource(array.smallnum[answer4 / 100 % 10]);
                            img_answ15.setImageResource(array.smallnum[answer4 / 10 % 10]);
                            img_answ16.setImageResource(array.smallnum[answer4 % 10]);

                        } else if (rightAns == 1) {
                            answer2 = ans2.nextInt(1000);
                            img_answ1.setImageResource(array.smallnum[answer2 / 1000]);
                            img_answ2.setImageResource(array.smallnum[answer2 / 100 % 10]);
                            img_answ3.setImageResource(array.smallnum[answer2 / 10 % 10]);
                            img_answ4.setImageResource(array.smallnum[answer2 % 10]);

                            img_answ5.setImageResource(array.smallnum[answer1 / 1000]);
                            img_answ6.setImageResource(array.smallnum[answer1 / 100 % 10]);
                            img_answ7.setImageResource(array.smallnum[answer1 / 10 % 10]);
                            img_answ8.setImageResource(array.smallnum[answer1 % 10]);

                            answer3 = ans3.nextInt(1000);
                            img_answ9.setImageResource(array.smallnum[answer3 / 1000]);
                            img_answ10.setImageResource(array.smallnum[answer3 / 100 % 10]);
                            img_answ11.setImageResource(array.smallnum[answer3 / 10 % 10]);
                            img_answ12.setImageResource(array.smallnum[answer3 % 10]);

                            answer4 = ans4.nextInt(1000);
                            img_answ13.setImageResource(array.smallnum[answer4 / 1000]);
                            img_answ14.setImageResource(array.smallnum[answer4 / 100 % 10]);
                            img_answ15.setImageResource(array.smallnum[answer4 / 10 % 10]);
                            img_answ16.setImageResource(array.smallnum[answer4 % 10]);
                        } else if (rightAns == 2) {
                            answer2 = ans2.nextInt(1000);
                            img_answ1.setImageResource(array.smallnum[answer2 / 1000]);
                            img_answ2.setImageResource(array.smallnum[answer2 / 100 % 10]);
                            img_answ3.setImageResource(array.smallnum[answer2 / 10 % 10]);
                            img_answ4.setImageResource(array.smallnum[answer2 % 10]);

                            answer3 = ans3.nextInt(1000);
                            img_answ5.setImageResource(array.smallnum[answer3 / 1000]);
                            img_answ6.setImageResource(array.smallnum[answer3 / 100 % 10]);
                            img_answ7.setImageResource(array.smallnum[answer3 / 10 % 10]);
                            img_answ8.setImageResource(array.smallnum[answer3 % 10]);

                            img_answ9.setImageResource(array.smallnum[answer1 / 1000]);
                            img_answ10.setImageResource(array.smallnum[answer1 / 100 % 10]);
                            img_answ11.setImageResource(array.smallnum[answer1 / 10 % 10]);
                            img_answ12.setImageResource(array.smallnum[answer1 % 10]);

                            answer4 = ans4.nextInt(1000);
                            img_answ13.setImageResource(array.smallnum[answer4 / 1000]);
                            img_answ14.setImageResource(array.smallnum[answer4 / 100 % 10]);
                            img_answ15.setImageResource(array.smallnum[answer4 / 10 % 10]);
                            img_answ16.setImageResource(array.smallnum[answer4 % 10]);
                        } else {
                            answer2 = ans2.nextInt(1000);
                            img_answ1.setImageResource(array.smallnum[answer2 / 1000]);
                            img_answ2.setImageResource(array.smallnum[answer2 / 100 % 10]);
                            img_answ3.setImageResource(array.smallnum[answer2 / 10 % 10]);
                            img_answ4.setImageResource(array.smallnum[answer2 % 10]);

                            answer3 = ans3.nextInt(1000);
                            img_answ5.setImageResource(array.smallnum[answer3 / 1000]);
                            img_answ6.setImageResource(array.smallnum[answer3 / 100 % 10]);
                            img_answ7.setImageResource(array.smallnum[answer3 / 10 % 10]);
                            img_answ8.setImageResource(array.smallnum[answer3 % 10]);

                            answer4 = ans4.nextInt(1000);
                            img_answ9.setImageResource(array.smallnum[answer4 / 1000]);
                            img_answ10.setImageResource(array.smallnum[answer4 / 100 % 10]);
                            img_answ11.setImageResource(array.smallnum[answer4 / 10 % 10]);
                            img_answ12.setImageResource(array.smallnum[answer4 % 10]);

                            img_answ13.setImageResource(array.smallnum[answer1 / 1000]);
                            img_answ14.setImageResource(array.smallnum[answer1 / 100 % 10]);
                            img_answ15.setImageResource(array.smallnum[answer1 / 10 % 10]);
                            img_answ16.setImageResource(array.smallnum[answer1 % 10]);
                        }

                        img_answ5.setEnabled(true);
                        img_answ6.setEnabled(true);
                        img_answ7.setEnabled(true);
                        img_answ8.setEnabled(true);
                        img_answ9.setEnabled(true);
                        img_answ10.setEnabled(true);
                        img_answ11.setEnabled(true);
                        img_answ12.setEnabled(true);
                        img_answ13.setEnabled(true);
                        img_answ14.setEnabled(true);
                        img_answ15.setEnabled(true);
                        img_answ16.setEnabled(true);
                    }
                }
                return true;
            }
        });
        img_answ3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    img_answ5.setEnabled(false);
                    img_answ6.setEnabled(false);
                    img_answ7.setEnabled(false);
                    img_answ8.setEnabled(false);
                    img_answ9.setEnabled(false);
                    img_answ10.setEnabled(false);
                    img_answ11.setEnabled(false);
                    img_answ12.setEnabled(false);
                    img_answ13.setEnabled(false);
                    img_answ14.setEnabled(false);
                    img_answ15.setEnabled(false);
                    img_answ16.setEnabled(false);
                    if(rightAns == 0) {
                        img_answ1.setImageResource(R.drawable.img_true);
                        img_answ2.setImageResource(R.drawable.img_true);
                        img_answ3.setImageResource(R.drawable.img_true);
                        img_answ4.setImageResource(R.drawable.img_true);
                    } else{
                        img_answ1.setImageResource(R.drawable.img_false);
                        img_answ2.setImageResource(R.drawable.img_false);
                        img_answ3.setImageResource(R.drawable.img_false);
                        img_answ4.setImageResource(R.drawable.img_false);

                    }
                } else if(motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    if(rightAns == 0) {
                        if(count < 20) {
                            count++;
                        }

                        for (int i = 0; i < 20; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points);
                        }

                        for(int i = 0; i < count; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points_green);
                        }

                    } else {
                        if(count > 0) {
                            if(count == 1) {
                                count = 0;
                            } else {
                                count -= 2;
                            }
                        }
                        for (int i = 0; i < 19; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points);
                        }

                        for(int i = 0; i < count; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points_green);
                        }
                    }
                    if(count == 20) {
                        dialogEnd2.show();
                        sound.stop();
                    } else{
                        numLeft1 = a1.nextInt(10);
                        numLeft2 = a2.nextInt(10);
                        numRight1 = b1.nextInt(10);
                        numRight2 = b2.nextInt(10);
                        znak1 = znak.nextInt(3);
                        img_znak1.setImageResource(array.znaki[znak1]);
                        while (((numLeft1 * 10 + numLeft2) < (numRight1 * 10 + numRight2)) && (znak1 == 1)) {
                            numLeft1 = a1.nextInt(10);
                            numLeft2 = a2.nextInt(10);
                            numRight1 = b1.nextInt(10);
                            numRight2 = b2.nextInt(10);
                        }
                        img_left1.setImageResource(array.smallnum[numLeft1]);
                        img_left2.setImageResource(array.smallnum[numLeft2]);
                        img_right1.setImageResource(array.smallnum[numRight1]);
                        img_right2.setImageResource(array.smallnum[numRight2]);

                        rightAns = trueAns.nextInt(4);

                        // вычисление и вывод ответов на экран - начало

                        if (znak1 == 0)
                            answer1 = (numLeft1 * 10 + numLeft2) + (numRight1 * 10 + numRight2);
                        else if (znak1 == 2)
                            answer1 = (numLeft1 * 10 + numLeft2) * (numRight1 * 10 + numRight2);
                        else {
                            answer1 = (numLeft1 * 10 + numLeft2) - (numRight1 * 10 + numRight2);
                        }

                        if (rightAns == 0) {

                            img_answ1.setImageResource(array.smallnum[answer1 / 1000]);
                            img_answ2.setImageResource(array.smallnum[answer1 / 100 % 10]);
                            img_answ3.setImageResource(array.smallnum[answer1 / 10 % 10]);
                            img_answ4.setImageResource(array.smallnum[answer1 % 10]);

                            answer2 = ans2.nextInt(1000);
                            img_answ5.setImageResource(array.smallnum[answer2 / 1000]);
                            img_answ6.setImageResource(array.smallnum[answer2 / 100 % 10]);
                            img_answ7.setImageResource(array.smallnum[answer2 / 10 % 10]);
                            img_answ8.setImageResource(array.smallnum[answer2 % 10]);

                            answer3 = ans3.nextInt(1000);
                            img_answ9.setImageResource(array.smallnum[answer3 / 1000]);
                            img_answ10.setImageResource(array.smallnum[answer3 / 100 % 10]);
                            img_answ11.setImageResource(array.smallnum[answer3 / 10 % 10]);
                            img_answ12.setImageResource(array.smallnum[answer3 % 10]);

                            answer4 = ans4.nextInt(1000);
                            img_answ13.setImageResource(array.smallnum[answer4 / 1000]);
                            img_answ14.setImageResource(array.smallnum[answer4 / 100 % 10]);
                            img_answ15.setImageResource(array.smallnum[answer4 / 10 % 10]);
                            img_answ16.setImageResource(array.smallnum[answer4 % 10]);

                        } else if (rightAns == 1) {
                            answer2 = ans2.nextInt(1000);
                            img_answ1.setImageResource(array.smallnum[answer2 / 1000]);
                            img_answ2.setImageResource(array.smallnum[answer2 / 100 % 10]);
                            img_answ3.setImageResource(array.smallnum[answer2 / 10 % 10]);
                            img_answ4.setImageResource(array.smallnum[answer2 % 10]);

                            img_answ5.setImageResource(array.smallnum[answer1 / 1000]);
                            img_answ6.setImageResource(array.smallnum[answer1 / 100 % 10]);
                            img_answ7.setImageResource(array.smallnum[answer1 / 10 % 10]);
                            img_answ8.setImageResource(array.smallnum[answer1 % 10]);

                            answer3 = ans3.nextInt(1000);
                            img_answ9.setImageResource(array.smallnum[answer3 / 1000]);
                            img_answ10.setImageResource(array.smallnum[answer3 / 100 % 10]);
                            img_answ11.setImageResource(array.smallnum[answer3 / 10 % 10]);
                            img_answ12.setImageResource(array.smallnum[answer3 % 10]);

                            answer4 = ans4.nextInt(1000);
                            img_answ13.setImageResource(array.smallnum[answer4 / 1000]);
                            img_answ14.setImageResource(array.smallnum[answer4 / 100 % 10]);
                            img_answ15.setImageResource(array.smallnum[answer4 / 10 % 10]);
                            img_answ16.setImageResource(array.smallnum[answer4 % 10]);
                        } else if (rightAns == 2) {
                            answer2 = ans2.nextInt(1000);
                            img_answ1.setImageResource(array.smallnum[answer2 / 1000]);
                            img_answ2.setImageResource(array.smallnum[answer2 / 100 % 10]);
                            img_answ3.setImageResource(array.smallnum[answer2 / 10 % 10]);
                            img_answ4.setImageResource(array.smallnum[answer2 % 10]);

                            answer3 = ans3.nextInt(1000);
                            img_answ5.setImageResource(array.smallnum[answer3 / 1000]);
                            img_answ6.setImageResource(array.smallnum[answer3 / 100 % 10]);
                            img_answ7.setImageResource(array.smallnum[answer3 / 10 % 10]);
                            img_answ8.setImageResource(array.smallnum[answer3 % 10]);

                            img_answ9.setImageResource(array.smallnum[answer1 / 1000]);
                            img_answ10.setImageResource(array.smallnum[answer1 / 100 % 10]);
                            img_answ11.setImageResource(array.smallnum[answer1 / 10 % 10]);
                            img_answ12.setImageResource(array.smallnum[answer1 % 10]);

                            answer4 = ans4.nextInt(1000);
                            img_answ13.setImageResource(array.smallnum[answer4 / 1000]);
                            img_answ14.setImageResource(array.smallnum[answer4 / 100 % 10]);
                            img_answ15.setImageResource(array.smallnum[answer4 / 10 % 10]);
                            img_answ16.setImageResource(array.smallnum[answer4 % 10]);
                        } else {
                            answer2 = ans2.nextInt(1000);
                            img_answ1.setImageResource(array.smallnum[answer2 / 1000]);
                            img_answ2.setImageResource(array.smallnum[answer2 / 100 % 10]);
                            img_answ3.setImageResource(array.smallnum[answer2 / 10 % 10]);
                            img_answ4.setImageResource(array.smallnum[answer2 % 10]);

                            answer3 = ans3.nextInt(1000);
                            img_answ5.setImageResource(array.smallnum[answer3 / 1000]);
                            img_answ6.setImageResource(array.smallnum[answer3 / 100 % 10]);
                            img_answ7.setImageResource(array.smallnum[answer3 / 10 % 10]);
                            img_answ8.setImageResource(array.smallnum[answer3 % 10]);

                            answer4 = ans4.nextInt(1000);
                            img_answ9.setImageResource(array.smallnum[answer4 / 1000]);
                            img_answ10.setImageResource(array.smallnum[answer4 / 100 % 10]);
                            img_answ11.setImageResource(array.smallnum[answer4 / 10 % 10]);
                            img_answ12.setImageResource(array.smallnum[answer4 % 10]);

                            img_answ13.setImageResource(array.smallnum[answer1 / 1000]);
                            img_answ14.setImageResource(array.smallnum[answer1 / 100 % 10]);
                            img_answ15.setImageResource(array.smallnum[answer1 / 10 % 10]);
                            img_answ16.setImageResource(array.smallnum[answer1 % 10]);
                        }

                        img_answ5.setEnabled(true);
                        img_answ6.setEnabled(true);
                        img_answ7.setEnabled(true);
                        img_answ8.setEnabled(true);
                        img_answ9.setEnabled(true);
                        img_answ10.setEnabled(true);
                        img_answ11.setEnabled(true);
                        img_answ12.setEnabled(true);
                        img_answ13.setEnabled(true);
                        img_answ14.setEnabled(true);
                        img_answ15.setEnabled(true);
                        img_answ16.setEnabled(true);
                    }
                }
                return true;
            }
        });
        img_answ4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    img_answ5.setEnabled(false);
                    img_answ6.setEnabled(false);
                    img_answ7.setEnabled(false);
                    img_answ8.setEnabled(false);
                    img_answ9.setEnabled(false);
                    img_answ10.setEnabled(false);
                    img_answ11.setEnabled(false);
                    img_answ12.setEnabled(false);
                    img_answ13.setEnabled(false);
                    img_answ14.setEnabled(false);
                    img_answ15.setEnabled(false);
                    img_answ16.setEnabled(false);
                    if(rightAns == 0) {
                        img_answ1.setImageResource(R.drawable.img_true);
                        img_answ2.setImageResource(R.drawable.img_true);
                        img_answ3.setImageResource(R.drawable.img_true);
                        img_answ4.setImageResource(R.drawable.img_true);
                    } else{
                        img_answ1.setImageResource(R.drawable.img_false);
                        img_answ2.setImageResource(R.drawable.img_false);
                        img_answ3.setImageResource(R.drawable.img_false);
                        img_answ4.setImageResource(R.drawable.img_false);

                    }
                } else if(motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    if(rightAns == 0) {
                        if(count < 20) {
                            count++;
                        }

                        for (int i = 0; i < 20; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points);
                        }

                        for(int i = 0; i < count; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points_green);
                        }

                    } else {
                        if(count > 0) {
                            if(count == 1) {
                                count = 0;
                            } else {
                                count -= 2;
                            }
                        }
                        for (int i = 0; i < 19; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points);
                        }

                        for(int i = 0; i < count; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points_green);
                        }
                    }
                    if(count == 20) {
                        dialogEnd2.show();
                        sound.stop();
                    } else{
                        numLeft1 = a1.nextInt(10);
                        numLeft2 = a2.nextInt(10);
                        numRight1 = b1.nextInt(10);
                        numRight2 = b2.nextInt(10);
                        znak1 = znak.nextInt(3);
                        img_znak1.setImageResource(array.znaki[znak1]);
                        while (((numLeft1 * 10 + numLeft2) < (numRight1 * 10 + numRight2)) && (znak1 == 1)) {
                            numLeft1 = a1.nextInt(10);
                            numLeft2 = a2.nextInt(10);
                            numRight1 = b1.nextInt(10);
                            numRight2 = b2.nextInt(10);
                        }
                        img_left1.setImageResource(array.smallnum[numLeft1]);
                        img_left2.setImageResource(array.smallnum[numLeft2]);
                        img_right1.setImageResource(array.smallnum[numRight1]);
                        img_right2.setImageResource(array.smallnum[numRight2]);

                        rightAns = trueAns.nextInt(4);

                        // вычисление и вывод ответов на экран - начало

                        if (znak1 == 0)
                            answer1 = (numLeft1 * 10 + numLeft2) + (numRight1 * 10 + numRight2);
                        else if (znak1 == 2)
                            answer1 = (numLeft1 * 10 + numLeft2) * (numRight1 * 10 + numRight2);
                        else {
                            answer1 = (numLeft1 * 10 + numLeft2) - (numRight1 * 10 + numRight2);
                        }

                        if (rightAns == 0) {

                            img_answ1.setImageResource(array.smallnum[answer1 / 1000]);
                            img_answ2.setImageResource(array.smallnum[answer1 / 100 % 10]);
                            img_answ3.setImageResource(array.smallnum[answer1 / 10 % 10]);
                            img_answ4.setImageResource(array.smallnum[answer1 % 10]);

                            answer2 = ans2.nextInt(1000);
                            img_answ5.setImageResource(array.smallnum[answer2 / 1000]);
                            img_answ6.setImageResource(array.smallnum[answer2 / 100 % 10]);
                            img_answ7.setImageResource(array.smallnum[answer2 / 10 % 10]);
                            img_answ8.setImageResource(array.smallnum[answer2 % 10]);

                            answer3 = ans3.nextInt(1000);
                            img_answ9.setImageResource(array.smallnum[answer3 / 1000]);
                            img_answ10.setImageResource(array.smallnum[answer3 / 100 % 10]);
                            img_answ11.setImageResource(array.smallnum[answer3 / 10 % 10]);
                            img_answ12.setImageResource(array.smallnum[answer3 % 10]);

                            answer4 = ans4.nextInt(1000);
                            img_answ13.setImageResource(array.smallnum[answer4 / 1000]);
                            img_answ14.setImageResource(array.smallnum[answer4 / 100 % 10]);
                            img_answ15.setImageResource(array.smallnum[answer4 / 10 % 10]);
                            img_answ16.setImageResource(array.smallnum[answer4 % 10]);

                        } else if (rightAns == 1) {
                            answer2 = ans2.nextInt(1000);
                            img_answ1.setImageResource(array.smallnum[answer2 / 1000]);
                            img_answ2.setImageResource(array.smallnum[answer2 / 100 % 10]);
                            img_answ3.setImageResource(array.smallnum[answer2 / 10 % 10]);
                            img_answ4.setImageResource(array.smallnum[answer2 % 10]);

                            img_answ5.setImageResource(array.smallnum[answer1 / 1000]);
                            img_answ6.setImageResource(array.smallnum[answer1 / 100 % 10]);
                            img_answ7.setImageResource(array.smallnum[answer1 / 10 % 10]);
                            img_answ8.setImageResource(array.smallnum[answer1 % 10]);

                            answer3 = ans3.nextInt(1000);
                            img_answ9.setImageResource(array.smallnum[answer3 / 1000]);
                            img_answ10.setImageResource(array.smallnum[answer3 / 100 % 10]);
                            img_answ11.setImageResource(array.smallnum[answer3 / 10 % 10]);
                            img_answ12.setImageResource(array.smallnum[answer3 % 10]);

                            answer4 = ans4.nextInt(1000);
                            img_answ13.setImageResource(array.smallnum[answer4 / 1000]);
                            img_answ14.setImageResource(array.smallnum[answer4 / 100 % 10]);
                            img_answ15.setImageResource(array.smallnum[answer4 / 10 % 10]);
                            img_answ16.setImageResource(array.smallnum[answer4 % 10]);
                        } else if (rightAns == 2) {
                            answer2 = ans2.nextInt(1000);
                            img_answ1.setImageResource(array.smallnum[answer2 / 1000]);
                            img_answ2.setImageResource(array.smallnum[answer2 / 100 % 10]);
                            img_answ3.setImageResource(array.smallnum[answer2 / 10 % 10]);
                            img_answ4.setImageResource(array.smallnum[answer2 % 10]);

                            answer3 = ans3.nextInt(1000);
                            img_answ5.setImageResource(array.smallnum[answer3 / 1000]);
                            img_answ6.setImageResource(array.smallnum[answer3 / 100 % 10]);
                            img_answ7.setImageResource(array.smallnum[answer3 / 10 % 10]);
                            img_answ8.setImageResource(array.smallnum[answer3 % 10]);

                            img_answ9.setImageResource(array.smallnum[answer1 / 1000]);
                            img_answ10.setImageResource(array.smallnum[answer1 / 100 % 10]);
                            img_answ11.setImageResource(array.smallnum[answer1 / 10 % 10]);
                            img_answ12.setImageResource(array.smallnum[answer1 % 10]);

                            answer4 = ans4.nextInt(1000);
                            img_answ13.setImageResource(array.smallnum[answer4 / 1000]);
                            img_answ14.setImageResource(array.smallnum[answer4 / 100 % 10]);
                            img_answ15.setImageResource(array.smallnum[answer4 / 10 % 10]);
                            img_answ16.setImageResource(array.smallnum[answer4 % 10]);
                        } else {
                            answer2 = ans2.nextInt(1000);
                            img_answ1.setImageResource(array.smallnum[answer2 / 1000]);
                            img_answ2.setImageResource(array.smallnum[answer2 / 100 % 10]);
                            img_answ3.setImageResource(array.smallnum[answer2 / 10 % 10]);
                            img_answ4.setImageResource(array.smallnum[answer2 % 10]);

                            answer3 = ans3.nextInt(1000);
                            img_answ5.setImageResource(array.smallnum[answer3 / 1000]);
                            img_answ6.setImageResource(array.smallnum[answer3 / 100 % 10]);
                            img_answ7.setImageResource(array.smallnum[answer3 / 10 % 10]);
                            img_answ8.setImageResource(array.smallnum[answer3 % 10]);

                            answer4 = ans4.nextInt(1000);
                            img_answ9.setImageResource(array.smallnum[answer4 / 1000]);
                            img_answ10.setImageResource(array.smallnum[answer4 / 100 % 10]);
                            img_answ11.setImageResource(array.smallnum[answer4 / 10 % 10]);
                            img_answ12.setImageResource(array.smallnum[answer4 % 10]);

                            img_answ13.setImageResource(array.smallnum[answer1 / 1000]);
                            img_answ14.setImageResource(array.smallnum[answer1 / 100 % 10]);
                            img_answ15.setImageResource(array.smallnum[answer1 / 10 % 10]);
                            img_answ16.setImageResource(array.smallnum[answer1 % 10]);
                        }

                        img_answ5.setEnabled(true);
                        img_answ6.setEnabled(true);
                        img_answ7.setEnabled(true);
                        img_answ8.setEnabled(true);
                        img_answ9.setEnabled(true);
                        img_answ10.setEnabled(true);
                        img_answ11.setEnabled(true);
                        img_answ12.setEnabled(true);
                        img_answ13.setEnabled(true);
                        img_answ14.setEnabled(true);
                        img_answ15.setEnabled(true);
                        img_answ16.setEnabled(true);
                    }
                }
                return true;
            }
        });
            //первая кнопка - конец

            //вторая кнопка - начало
        img_answ5.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    img_answ1.setEnabled(false);
                    img_answ2.setEnabled(false);
                    img_answ3.setEnabled(false);
                    img_answ4.setEnabled(false);
                    img_answ9.setEnabled(false);
                    img_answ10.setEnabled(false);
                    img_answ11.setEnabled(false);
                    img_answ12.setEnabled(false);
                    img_answ13.setEnabled(false);
                    img_answ14.setEnabled(false);
                    img_answ15.setEnabled(false);
                    img_answ16.setEnabled(false);
                    if(rightAns == 1) {
                        img_answ5.setImageResource(R.drawable.img_true);
                        img_answ6.setImageResource(R.drawable.img_true);
                        img_answ7.setImageResource(R.drawable.img_true);
                        img_answ8.setImageResource(R.drawable.img_true);
                    } else{
                        img_answ5.setImageResource(R.drawable.img_false);
                        img_answ6.setImageResource(R.drawable.img_false);
                        img_answ7.setImageResource(R.drawable.img_false);
                        img_answ8.setImageResource(R.drawable.img_false);

                    }
                } else if(motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    if(rightAns == 1) {
                        if(count < 20) {
                            count++;
                        }

                        for (int i = 0; i < 20; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points);
                        }

                        for(int i = 0; i < count; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points_green);
                        }

                    } else {
                        if(count > 0) {
                            if(count == 1) {
                                count = 0;
                            } else {
                                count -= 2;
                            }
                        }
                        for (int i = 0; i < 19; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points);
                        }

                        for(int i = 0; i < count; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points_green);
                        }
                    }
                    if(count == 20) {
                        dialogEnd2.show();
                        sound.stop();
                    } else{
                        numLeft1 = a1.nextInt(10);
                        numLeft2 = a2.nextInt(10);
                        numRight1 = b1.nextInt(10);
                        numRight2 = b2.nextInt(10);
                        znak1 = znak.nextInt(3);
                        img_znak1.setImageResource(array.znaki[znak1]);
                        while (((numLeft1 * 10 + numLeft2) < (numRight1 * 10 + numRight2)) && (znak1 == 1)) {
                            numLeft1 = a1.nextInt(10);
                            numLeft2 = a2.nextInt(10);
                            numRight1 = b1.nextInt(10);
                            numRight2 = b2.nextInt(10);
                        }
                        img_left1.setImageResource(array.smallnum[numLeft1]);
                        img_left2.setImageResource(array.smallnum[numLeft2]);
                        img_right1.setImageResource(array.smallnum[numRight1]);
                        img_right2.setImageResource(array.smallnum[numRight2]);

                        rightAns = trueAns.nextInt(4);

                        // вычисление и вывод ответов на экран - начало

                        if (znak1 == 0)
                            answer1 = (numLeft1 * 10 + numLeft2) + (numRight1 * 10 + numRight2);
                        else if (znak1 == 2)
                            answer1 = (numLeft1 * 10 + numLeft2) * (numRight1 * 10 + numRight2);
                        else {
                            answer1 = (numLeft1 * 10 + numLeft2) - (numRight1 * 10 + numRight2);
                        }

                        if (rightAns == 0) {

                            img_answ1.setImageResource(array.smallnum[answer1 / 1000]);
                            img_answ2.setImageResource(array.smallnum[answer1 / 100 % 10]);
                            img_answ3.setImageResource(array.smallnum[answer1 / 10 % 10]);
                            img_answ4.setImageResource(array.smallnum[answer1 % 10]);

                            answer2 = ans2.nextInt(1000);
                            img_answ5.setImageResource(array.smallnum[answer2 / 1000]);
                            img_answ6.setImageResource(array.smallnum[answer2 / 100 % 10]);
                            img_answ7.setImageResource(array.smallnum[answer2 / 10 % 10]);
                            img_answ8.setImageResource(array.smallnum[answer2 % 10]);

                            answer3 = ans3.nextInt(1000);
                            img_answ9.setImageResource(array.smallnum[answer3 / 1000]);
                            img_answ10.setImageResource(array.smallnum[answer3 / 100 % 10]);
                            img_answ11.setImageResource(array.smallnum[answer3 / 10 % 10]);
                            img_answ12.setImageResource(array.smallnum[answer3 % 10]);

                            answer4 = ans4.nextInt(1000);
                            img_answ13.setImageResource(array.smallnum[answer4 / 1000]);
                            img_answ14.setImageResource(array.smallnum[answer4 / 100 % 10]);
                            img_answ15.setImageResource(array.smallnum[answer4 / 10 % 10]);
                            img_answ16.setImageResource(array.smallnum[answer4 % 10]);

                        } else if (rightAns == 1) {
                            answer2 = ans2.nextInt(1000);
                            img_answ1.setImageResource(array.smallnum[answer2 / 1000]);
                            img_answ2.setImageResource(array.smallnum[answer2 / 100 % 10]);
                            img_answ3.setImageResource(array.smallnum[answer2 / 10 % 10]);
                            img_answ4.setImageResource(array.smallnum[answer2 % 10]);

                            img_answ5.setImageResource(array.smallnum[answer1 / 1000]);
                            img_answ6.setImageResource(array.smallnum[answer1 / 100 % 10]);
                            img_answ7.setImageResource(array.smallnum[answer1 / 10 % 10]);
                            img_answ8.setImageResource(array.smallnum[answer1 % 10]);

                            answer3 = ans3.nextInt(1000);
                            img_answ9.setImageResource(array.smallnum[answer3 / 1000]);
                            img_answ10.setImageResource(array.smallnum[answer3 / 100 % 10]);
                            img_answ11.setImageResource(array.smallnum[answer3 / 10 % 10]);
                            img_answ12.setImageResource(array.smallnum[answer3 % 10]);

                            answer4 = ans4.nextInt(1000);
                            img_answ13.setImageResource(array.smallnum[answer4 / 1000]);
                            img_answ14.setImageResource(array.smallnum[answer4 / 100 % 10]);
                            img_answ15.setImageResource(array.smallnum[answer4 / 10 % 10]);
                            img_answ16.setImageResource(array.smallnum[answer4 % 10]);
                        } else if (rightAns == 2) {
                            answer2 = ans2.nextInt(1000);
                            img_answ1.setImageResource(array.smallnum[answer2 / 1000]);
                            img_answ2.setImageResource(array.smallnum[answer2 / 100 % 10]);
                            img_answ3.setImageResource(array.smallnum[answer2 / 10 % 10]);
                            img_answ4.setImageResource(array.smallnum[answer2 % 10]);

                            answer3 = ans3.nextInt(1000);
                            img_answ5.setImageResource(array.smallnum[answer3 / 1000]);
                            img_answ6.setImageResource(array.smallnum[answer3 / 100 % 10]);
                            img_answ7.setImageResource(array.smallnum[answer3 / 10 % 10]);
                            img_answ8.setImageResource(array.smallnum[answer3 % 10]);

                            img_answ9.setImageResource(array.smallnum[answer1 / 1000]);
                            img_answ10.setImageResource(array.smallnum[answer1 / 100 % 10]);
                            img_answ11.setImageResource(array.smallnum[answer1 / 10 % 10]);
                            img_answ12.setImageResource(array.smallnum[answer1 % 10]);

                            answer4 = ans4.nextInt(1000);
                            img_answ13.setImageResource(array.smallnum[answer4 / 1000]);
                            img_answ14.setImageResource(array.smallnum[answer4 / 100 % 10]);
                            img_answ15.setImageResource(array.smallnum[answer4 / 10 % 10]);
                            img_answ16.setImageResource(array.smallnum[answer4 % 10]);
                        } else {
                            answer2 = ans2.nextInt(1000);
                            img_answ1.setImageResource(array.smallnum[answer2 / 1000]);
                            img_answ2.setImageResource(array.smallnum[answer2 / 100 % 10]);
                            img_answ3.setImageResource(array.smallnum[answer2 / 10 % 10]);
                            img_answ4.setImageResource(array.smallnum[answer2 % 10]);

                            answer3 = ans3.nextInt(1000);
                            img_answ5.setImageResource(array.smallnum[answer3 / 1000]);
                            img_answ6.setImageResource(array.smallnum[answer3 / 100 % 10]);
                            img_answ7.setImageResource(array.smallnum[answer3 / 10 % 10]);
                            img_answ8.setImageResource(array.smallnum[answer3 % 10]);

                            answer4 = ans4.nextInt(1000);
                            img_answ9.setImageResource(array.smallnum[answer4 / 1000]);
                            img_answ10.setImageResource(array.smallnum[answer4 / 100 % 10]);
                            img_answ11.setImageResource(array.smallnum[answer4 / 10 % 10]);
                            img_answ12.setImageResource(array.smallnum[answer4 % 10]);

                            img_answ13.setImageResource(array.smallnum[answer1 / 1000]);
                            img_answ14.setImageResource(array.smallnum[answer1 / 100 % 10]);
                            img_answ15.setImageResource(array.smallnum[answer1 / 10 % 10]);
                            img_answ16.setImageResource(array.smallnum[answer1 % 10]);
                        }

                        img_answ1.setEnabled(true);
                        img_answ2.setEnabled(true);
                        img_answ3.setEnabled(true);
                        img_answ4.setEnabled(true);
                        img_answ9.setEnabled(true);
                        img_answ10.setEnabled(true);
                        img_answ11.setEnabled(true);
                        img_answ12.setEnabled(true);
                        img_answ13.setEnabled(true);
                        img_answ14.setEnabled(true);
                        img_answ15.setEnabled(true);
                        img_answ16.setEnabled(true);
                    }
                }
                return true;
            }
        });
        img_answ6.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    img_answ1.setEnabled(false);
                    img_answ2.setEnabled(false);
                    img_answ3.setEnabled(false);
                    img_answ4.setEnabled(false);
                    img_answ9.setEnabled(false);
                    img_answ10.setEnabled(false);
                    img_answ11.setEnabled(false);
                    img_answ12.setEnabled(false);
                    img_answ13.setEnabled(false);
                    img_answ14.setEnabled(false);
                    img_answ15.setEnabled(false);
                    img_answ16.setEnabled(false);
                    if(rightAns == 1) {
                        img_answ5.setImageResource(R.drawable.img_true);
                        img_answ6.setImageResource(R.drawable.img_true);
                        img_answ7.setImageResource(R.drawable.img_true);
                        img_answ8.setImageResource(R.drawable.img_true);
                    } else{
                        img_answ5.setImageResource(R.drawable.img_false);
                        img_answ6.setImageResource(R.drawable.img_false);
                        img_answ7.setImageResource(R.drawable.img_false);
                        img_answ8.setImageResource(R.drawable.img_false);

                    }
                } else if(motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    if(rightAns == 1) {
                        if(count < 20) {
                            count++;
                        }

                        for (int i = 0; i < 20; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points);
                        }

                        for(int i = 0; i < count; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points_green);
                        }

                    } else {
                        if(count > 0) {
                            if(count == 1) {
                                count = 0;
                            } else {
                                count -= 2;
                            }
                        }
                        for (int i = 0; i < 19; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points);
                        }

                        for(int i = 0; i < count; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points_green);
                        }
                    }
                    if(count == 20) {
                        dialogEnd2.show();
                        sound.stop();
                    } else{
                        numLeft1 = a1.nextInt(10);
                        numLeft2 = a2.nextInt(10);
                        numRight1 = b1.nextInt(10);
                        numRight2 = b2.nextInt(10);
                        znak1 = znak.nextInt(3);
                        img_znak1.setImageResource(array.znaki[znak1]);
                        while (((numLeft1 * 10 + numLeft2) < (numRight1 * 10 + numRight2)) && (znak1 == 1)) {
                            numLeft1 = a1.nextInt(10);
                            numLeft2 = a2.nextInt(10);
                            numRight1 = b1.nextInt(10);
                            numRight2 = b2.nextInt(10);
                        }
                        img_left1.setImageResource(array.smallnum[numLeft1]);
                        img_left2.setImageResource(array.smallnum[numLeft2]);
                        img_right1.setImageResource(array.smallnum[numRight1]);
                        img_right2.setImageResource(array.smallnum[numRight2]);

                        rightAns = trueAns.nextInt(4);

                        // вычисление и вывод ответов на экран - начало

                        if (znak1 == 0)
                            answer1 = (numLeft1 * 10 + numLeft2) + (numRight1 * 10 + numRight2);
                        else if (znak1 == 2)
                            answer1 = (numLeft1 * 10 + numLeft2) * (numRight1 * 10 + numRight2);
                        else {
                            answer1 = (numLeft1 * 10 + numLeft2) - (numRight1 * 10 + numRight2);
                        }

                        if (rightAns == 0) {

                            img_answ1.setImageResource(array.smallnum[answer1 / 1000]);
                            img_answ2.setImageResource(array.smallnum[answer1 / 100 % 10]);
                            img_answ3.setImageResource(array.smallnum[answer1 / 10 % 10]);
                            img_answ4.setImageResource(array.smallnum[answer1 % 10]);

                            answer2 = ans2.nextInt(1000);
                            img_answ5.setImageResource(array.smallnum[answer2 / 1000]);
                            img_answ6.setImageResource(array.smallnum[answer2 / 100 % 10]);
                            img_answ7.setImageResource(array.smallnum[answer2 / 10 % 10]);
                            img_answ8.setImageResource(array.smallnum[answer2 % 10]);

                            answer3 = ans3.nextInt(1000);
                            img_answ9.setImageResource(array.smallnum[answer3 / 1000]);
                            img_answ10.setImageResource(array.smallnum[answer3 / 100 % 10]);
                            img_answ11.setImageResource(array.smallnum[answer3 / 10 % 10]);
                            img_answ12.setImageResource(array.smallnum[answer3 % 10]);

                            answer4 = ans4.nextInt(1000);
                            img_answ13.setImageResource(array.smallnum[answer4 / 1000]);
                            img_answ14.setImageResource(array.smallnum[answer4 / 100 % 10]);
                            img_answ15.setImageResource(array.smallnum[answer4 / 10 % 10]);
                            img_answ16.setImageResource(array.smallnum[answer4 % 10]);

                        } else if (rightAns == 1) {
                            answer2 = ans2.nextInt(1000);
                            img_answ1.setImageResource(array.smallnum[answer2 / 1000]);
                            img_answ2.setImageResource(array.smallnum[answer2 / 100 % 10]);
                            img_answ3.setImageResource(array.smallnum[answer2 / 10 % 10]);
                            img_answ4.setImageResource(array.smallnum[answer2 % 10]);

                            img_answ5.setImageResource(array.smallnum[answer1 / 1000]);
                            img_answ6.setImageResource(array.smallnum[answer1 / 100 % 10]);
                            img_answ7.setImageResource(array.smallnum[answer1 / 10 % 10]);
                            img_answ8.setImageResource(array.smallnum[answer1 % 10]);

                            answer3 = ans3.nextInt(1000);
                            img_answ9.setImageResource(array.smallnum[answer3 / 1000]);
                            img_answ10.setImageResource(array.smallnum[answer3 / 100 % 10]);
                            img_answ11.setImageResource(array.smallnum[answer3 / 10 % 10]);
                            img_answ12.setImageResource(array.smallnum[answer3 % 10]);

                            answer4 = ans4.nextInt(1000);
                            img_answ13.setImageResource(array.smallnum[answer4 / 1000]);
                            img_answ14.setImageResource(array.smallnum[answer4 / 100 % 10]);
                            img_answ15.setImageResource(array.smallnum[answer4 / 10 % 10]);
                            img_answ16.setImageResource(array.smallnum[answer4 % 10]);
                        } else if (rightAns == 2) {
                            answer2 = ans2.nextInt(1000);
                            img_answ1.setImageResource(array.smallnum[answer2 / 1000]);
                            img_answ2.setImageResource(array.smallnum[answer2 / 100 % 10]);
                            img_answ3.setImageResource(array.smallnum[answer2 / 10 % 10]);
                            img_answ4.setImageResource(array.smallnum[answer2 % 10]);

                            answer3 = ans3.nextInt(1000);
                            img_answ5.setImageResource(array.smallnum[answer3 / 1000]);
                            img_answ6.setImageResource(array.smallnum[answer3 / 100 % 10]);
                            img_answ7.setImageResource(array.smallnum[answer3 / 10 % 10]);
                            img_answ8.setImageResource(array.smallnum[answer3 % 10]);

                            img_answ9.setImageResource(array.smallnum[answer1 / 1000]);
                            img_answ10.setImageResource(array.smallnum[answer1 / 100 % 10]);
                            img_answ11.setImageResource(array.smallnum[answer1 / 10 % 10]);
                            img_answ12.setImageResource(array.smallnum[answer1 % 10]);

                            answer4 = ans4.nextInt(1000);
                            img_answ13.setImageResource(array.smallnum[answer4 / 1000]);
                            img_answ14.setImageResource(array.smallnum[answer4 / 100 % 10]);
                            img_answ15.setImageResource(array.smallnum[answer4 / 10 % 10]);
                            img_answ16.setImageResource(array.smallnum[answer4 % 10]);
                        } else {
                            answer2 = ans2.nextInt(1000);
                            img_answ1.setImageResource(array.smallnum[answer2 / 1000]);
                            img_answ2.setImageResource(array.smallnum[answer2 / 100 % 10]);
                            img_answ3.setImageResource(array.smallnum[answer2 / 10 % 10]);
                            img_answ4.setImageResource(array.smallnum[answer2 % 10]);

                            answer3 = ans3.nextInt(1000);
                            img_answ5.setImageResource(array.smallnum[answer3 / 1000]);
                            img_answ6.setImageResource(array.smallnum[answer3 / 100 % 10]);
                            img_answ7.setImageResource(array.smallnum[answer3 / 10 % 10]);
                            img_answ8.setImageResource(array.smallnum[answer3 % 10]);

                            answer4 = ans4.nextInt(1000);
                            img_answ9.setImageResource(array.smallnum[answer4 / 1000]);
                            img_answ10.setImageResource(array.smallnum[answer4 / 100 % 10]);
                            img_answ11.setImageResource(array.smallnum[answer4 / 10 % 10]);
                            img_answ12.setImageResource(array.smallnum[answer4 % 10]);

                            img_answ13.setImageResource(array.smallnum[answer1 / 1000]);
                            img_answ14.setImageResource(array.smallnum[answer1 / 100 % 10]);
                            img_answ15.setImageResource(array.smallnum[answer1 / 10 % 10]);
                            img_answ16.setImageResource(array.smallnum[answer1 % 10]);
                        }

                        img_answ1.setEnabled(true);
                        img_answ2.setEnabled(true);
                        img_answ3.setEnabled(true);
                        img_answ4.setEnabled(true);
                        img_answ9.setEnabled(true);
                        img_answ10.setEnabled(true);
                        img_answ11.setEnabled(true);
                        img_answ12.setEnabled(true);
                        img_answ13.setEnabled(true);
                        img_answ14.setEnabled(true);
                        img_answ15.setEnabled(true);
                        img_answ16.setEnabled(true);
                    }
                }
                return true;
            }
        });
        img_answ7.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    img_answ1.setEnabled(false);
                    img_answ2.setEnabled(false);
                    img_answ3.setEnabled(false);
                    img_answ4.setEnabled(false);
                    img_answ9.setEnabled(false);
                    img_answ10.setEnabled(false);
                    img_answ11.setEnabled(false);
                    img_answ12.setEnabled(false);
                    img_answ13.setEnabled(false);
                    img_answ14.setEnabled(false);
                    img_answ15.setEnabled(false);
                    img_answ16.setEnabled(false);
                    if(rightAns == 1) {
                        img_answ5.setImageResource(R.drawable.img_true);
                        img_answ6.setImageResource(R.drawable.img_true);
                        img_answ7.setImageResource(R.drawable.img_true);
                        img_answ8.setImageResource(R.drawable.img_true);
                    } else{
                        img_answ5.setImageResource(R.drawable.img_false);
                        img_answ6.setImageResource(R.drawable.img_false);
                        img_answ7.setImageResource(R.drawable.img_false);
                        img_answ8.setImageResource(R.drawable.img_false);

                    }
                } else if(motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    if(rightAns == 1) {
                        if(count < 20) {
                            count++;
                        }

                        for (int i = 0; i < 20; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points);
                        }

                        for(int i = 0; i < count; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points_green);
                        }

                    } else {
                        if(count > 0) {
                            if(count == 1) {
                                count = 0;
                            } else {
                                count -= 2;
                            }
                        }
                        for (int i = 0; i < 19; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points);
                        }

                        for(int i = 0; i < count; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points_green);
                        }
                    }
                    if(count == 20) {
                        dialogEnd2.show();
                        sound.stop();
                    } else{
                        numLeft1 = a1.nextInt(10);
                        numLeft2 = a2.nextInt(10);
                        numRight1 = b1.nextInt(10);
                        numRight2 = b2.nextInt(10);
                        znak1 = znak.nextInt(3);
                        img_znak1.setImageResource(array.znaki[znak1]);
                        while (((numLeft1 * 10 + numLeft2) < (numRight1 * 10 + numRight2)) && (znak1 == 1)) {
                            numLeft1 = a1.nextInt(10);
                            numLeft2 = a2.nextInt(10);
                            numRight1 = b1.nextInt(10);
                            numRight2 = b2.nextInt(10);
                        }
                        img_left1.setImageResource(array.smallnum[numLeft1]);
                        img_left2.setImageResource(array.smallnum[numLeft2]);
                        img_right1.setImageResource(array.smallnum[numRight1]);
                        img_right2.setImageResource(array.smallnum[numRight2]);

                        rightAns = trueAns.nextInt(4);

                        // вычисление и вывод ответов на экран - начало

                        if (znak1 == 0)
                            answer1 = (numLeft1 * 10 + numLeft2) + (numRight1 * 10 + numRight2);
                        else if (znak1 == 2)
                            answer1 = (numLeft1 * 10 + numLeft2) * (numRight1 * 10 + numRight2);
                        else {
                            answer1 = (numLeft1 * 10 + numLeft2) - (numRight1 * 10 + numRight2);
                        }

                        if (rightAns == 0) {

                            img_answ1.setImageResource(array.smallnum[answer1 / 1000]);
                            img_answ2.setImageResource(array.smallnum[answer1 / 100 % 10]);
                            img_answ3.setImageResource(array.smallnum[answer1 / 10 % 10]);
                            img_answ4.setImageResource(array.smallnum[answer1 % 10]);

                            answer2 = ans2.nextInt(1000);
                            img_answ5.setImageResource(array.smallnum[answer2 / 1000]);
                            img_answ6.setImageResource(array.smallnum[answer2 / 100 % 10]);
                            img_answ7.setImageResource(array.smallnum[answer2 / 10 % 10]);
                            img_answ8.setImageResource(array.smallnum[answer2 % 10]);

                            answer3 = ans3.nextInt(1000);
                            img_answ9.setImageResource(array.smallnum[answer3 / 1000]);
                            img_answ10.setImageResource(array.smallnum[answer3 / 100 % 10]);
                            img_answ11.setImageResource(array.smallnum[answer3 / 10 % 10]);
                            img_answ12.setImageResource(array.smallnum[answer3 % 10]);

                            answer4 = ans4.nextInt(1000);
                            img_answ13.setImageResource(array.smallnum[answer4 / 1000]);
                            img_answ14.setImageResource(array.smallnum[answer4 / 100 % 10]);
                            img_answ15.setImageResource(array.smallnum[answer4 / 10 % 10]);
                            img_answ16.setImageResource(array.smallnum[answer4 % 10]);

                        } else if (rightAns == 1) {
                            answer2 = ans2.nextInt(1000);
                            img_answ1.setImageResource(array.smallnum[answer2 / 1000]);
                            img_answ2.setImageResource(array.smallnum[answer2 / 100 % 10]);
                            img_answ3.setImageResource(array.smallnum[answer2 / 10 % 10]);
                            img_answ4.setImageResource(array.smallnum[answer2 % 10]);

                            img_answ5.setImageResource(array.smallnum[answer1 / 1000]);
                            img_answ6.setImageResource(array.smallnum[answer1 / 100 % 10]);
                            img_answ7.setImageResource(array.smallnum[answer1 / 10 % 10]);
                            img_answ8.setImageResource(array.smallnum[answer1 % 10]);

                            answer3 = ans3.nextInt(1000);
                            img_answ9.setImageResource(array.smallnum[answer3 / 1000]);
                            img_answ10.setImageResource(array.smallnum[answer3 / 100 % 10]);
                            img_answ11.setImageResource(array.smallnum[answer3 / 10 % 10]);
                            img_answ12.setImageResource(array.smallnum[answer3 % 10]);

                            answer4 = ans4.nextInt(1000);
                            img_answ13.setImageResource(array.smallnum[answer4 / 1000]);
                            img_answ14.setImageResource(array.smallnum[answer4 / 100 % 10]);
                            img_answ15.setImageResource(array.smallnum[answer4 / 10 % 10]);
                            img_answ16.setImageResource(array.smallnum[answer4 % 10]);
                        } else if (rightAns == 2) {
                            answer2 = ans2.nextInt(1000);
                            img_answ1.setImageResource(array.smallnum[answer2 / 1000]);
                            img_answ2.setImageResource(array.smallnum[answer2 / 100 % 10]);
                            img_answ3.setImageResource(array.smallnum[answer2 / 10 % 10]);
                            img_answ4.setImageResource(array.smallnum[answer2 % 10]);

                            answer3 = ans3.nextInt(1000);
                            img_answ5.setImageResource(array.smallnum[answer3 / 1000]);
                            img_answ6.setImageResource(array.smallnum[answer3 / 100 % 10]);
                            img_answ7.setImageResource(array.smallnum[answer3 / 10 % 10]);
                            img_answ8.setImageResource(array.smallnum[answer3 % 10]);

                            img_answ9.setImageResource(array.smallnum[answer1 / 1000]);
                            img_answ10.setImageResource(array.smallnum[answer1 / 100 % 10]);
                            img_answ11.setImageResource(array.smallnum[answer1 / 10 % 10]);
                            img_answ12.setImageResource(array.smallnum[answer1 % 10]);

                            answer4 = ans4.nextInt(1000);
                            img_answ13.setImageResource(array.smallnum[answer4 / 1000]);
                            img_answ14.setImageResource(array.smallnum[answer4 / 100 % 10]);
                            img_answ15.setImageResource(array.smallnum[answer4 / 10 % 10]);
                            img_answ16.setImageResource(array.smallnum[answer4 % 10]);
                        } else {
                            answer2 = ans2.nextInt(1000);
                            img_answ1.setImageResource(array.smallnum[answer2 / 1000]);
                            img_answ2.setImageResource(array.smallnum[answer2 / 100 % 10]);
                            img_answ3.setImageResource(array.smallnum[answer2 / 10 % 10]);
                            img_answ4.setImageResource(array.smallnum[answer2 % 10]);

                            answer3 = ans3.nextInt(1000);
                            img_answ5.setImageResource(array.smallnum[answer3 / 1000]);
                            img_answ6.setImageResource(array.smallnum[answer3 / 100 % 10]);
                            img_answ7.setImageResource(array.smallnum[answer3 / 10 % 10]);
                            img_answ8.setImageResource(array.smallnum[answer3 % 10]);

                            answer4 = ans4.nextInt(1000);
                            img_answ9.setImageResource(array.smallnum[answer4 / 1000]);
                            img_answ10.setImageResource(array.smallnum[answer4 / 100 % 10]);
                            img_answ11.setImageResource(array.smallnum[answer4 / 10 % 10]);
                            img_answ12.setImageResource(array.smallnum[answer4 % 10]);

                            img_answ13.setImageResource(array.smallnum[answer1 / 1000]);
                            img_answ14.setImageResource(array.smallnum[answer1 / 100 % 10]);
                            img_answ15.setImageResource(array.smallnum[answer1 / 10 % 10]);
                            img_answ16.setImageResource(array.smallnum[answer1 % 10]);
                        }

                        img_answ1.setEnabled(true);
                        img_answ2.setEnabled(true);
                        img_answ3.setEnabled(true);
                        img_answ4.setEnabled(true);
                        img_answ9.setEnabled(true);
                        img_answ10.setEnabled(true);
                        img_answ11.setEnabled(true);
                        img_answ12.setEnabled(true);
                        img_answ13.setEnabled(true);
                        img_answ14.setEnabled(true);
                        img_answ15.setEnabled(true);
                        img_answ16.setEnabled(true);
                    }
                }
                return true;
            }
        });
        img_answ8.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    img_answ1.setEnabled(false);
                    img_answ2.setEnabled(false);
                    img_answ3.setEnabled(false);
                    img_answ4.setEnabled(false);
                    img_answ9.setEnabled(false);
                    img_answ10.setEnabled(false);
                    img_answ11.setEnabled(false);
                    img_answ12.setEnabled(false);
                    img_answ13.setEnabled(false);
                    img_answ14.setEnabled(false);
                    img_answ15.setEnabled(false);
                    img_answ16.setEnabled(false);
                    if(rightAns == 1) {
                        img_answ5.setImageResource(R.drawable.img_true);
                        img_answ6.setImageResource(R.drawable.img_true);
                        img_answ7.setImageResource(R.drawable.img_true);
                        img_answ8.setImageResource(R.drawable.img_true);
                    } else{
                        img_answ5.setImageResource(R.drawable.img_false);
                        img_answ6.setImageResource(R.drawable.img_false);
                        img_answ7.setImageResource(R.drawable.img_false);
                        img_answ8.setImageResource(R.drawable.img_false);

                    }
                } else if(motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    if(rightAns == 1) {
                        if(count < 20) {
                            count++;
                        }

                        for (int i = 0; i < 20; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points);
                        }

                        for(int i = 0; i < count; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points_green);
                        }

                    } else {
                        if(count > 0) {
                            if(count == 1) {
                                count = 0;
                            } else {
                                count -= 2;
                            }
                        }
                        for (int i = 0; i < 19; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points);
                        }

                        for(int i = 0; i < count; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points_green);
                        }
                    }
                    if(count == 20) {
                        dialogEnd2.show();
                        sound.stop();
                    } else{
                        numLeft1 = a1.nextInt(10);
                        numLeft2 = a2.nextInt(10);
                        numRight1 = b1.nextInt(10);
                        numRight2 = b2.nextInt(10);
                        znak1 = znak.nextInt(3);
                        img_znak1.setImageResource(array.znaki[znak1]);
                        while (((numLeft1 * 10 + numLeft2) < (numRight1 * 10 + numRight2)) && (znak1 == 1)) {
                            numLeft1 = a1.nextInt(10);
                            numLeft2 = a2.nextInt(10);
                            numRight1 = b1.nextInt(10);
                            numRight2 = b2.nextInt(10);
                        }
                        img_left1.setImageResource(array.smallnum[numLeft1]);
                        img_left2.setImageResource(array.smallnum[numLeft2]);
                        img_right1.setImageResource(array.smallnum[numRight1]);
                        img_right2.setImageResource(array.smallnum[numRight2]);

                        rightAns = trueAns.nextInt(4);

                        // вычисление и вывод ответов на экран - начало

                        if (znak1 == 0)
                            answer1 = (numLeft1 * 10 + numLeft2) + (numRight1 * 10 + numRight2);
                        else if (znak1 == 2)
                            answer1 = (numLeft1 * 10 + numLeft2) * (numRight1 * 10 + numRight2);
                        else {
                            answer1 = (numLeft1 * 10 + numLeft2) - (numRight1 * 10 + numRight2);
                        }

                        if (rightAns == 0) {

                            img_answ1.setImageResource(array.smallnum[answer1 / 1000]);
                            img_answ2.setImageResource(array.smallnum[answer1 / 100 % 10]);
                            img_answ3.setImageResource(array.smallnum[answer1 / 10 % 10]);
                            img_answ4.setImageResource(array.smallnum[answer1 % 10]);

                            answer2 = ans2.nextInt(1000);
                            img_answ5.setImageResource(array.smallnum[answer2 / 1000]);
                            img_answ6.setImageResource(array.smallnum[answer2 / 100 % 10]);
                            img_answ7.setImageResource(array.smallnum[answer2 / 10 % 10]);
                            img_answ8.setImageResource(array.smallnum[answer2 % 10]);

                            answer3 = ans3.nextInt(1000);
                            img_answ9.setImageResource(array.smallnum[answer3 / 1000]);
                            img_answ10.setImageResource(array.smallnum[answer3 / 100 % 10]);
                            img_answ11.setImageResource(array.smallnum[answer3 / 10 % 10]);
                            img_answ12.setImageResource(array.smallnum[answer3 % 10]);

                            answer4 = ans4.nextInt(1000);
                            img_answ13.setImageResource(array.smallnum[answer4 / 1000]);
                            img_answ14.setImageResource(array.smallnum[answer4 / 100 % 10]);
                            img_answ15.setImageResource(array.smallnum[answer4 / 10 % 10]);
                            img_answ16.setImageResource(array.smallnum[answer4 % 10]);

                        } else if (rightAns == 1) {
                            answer2 = ans2.nextInt(1000);
                            img_answ1.setImageResource(array.smallnum[answer2 / 1000]);
                            img_answ2.setImageResource(array.smallnum[answer2 / 100 % 10]);
                            img_answ3.setImageResource(array.smallnum[answer2 / 10 % 10]);
                            img_answ4.setImageResource(array.smallnum[answer2 % 10]);

                            img_answ5.setImageResource(array.smallnum[answer1 / 1000]);
                            img_answ6.setImageResource(array.smallnum[answer1 / 100 % 10]);
                            img_answ7.setImageResource(array.smallnum[answer1 / 10 % 10]);
                            img_answ8.setImageResource(array.smallnum[answer1 % 10]);

                            answer3 = ans3.nextInt(1000);
                            img_answ9.setImageResource(array.smallnum[answer3 / 1000]);
                            img_answ10.setImageResource(array.smallnum[answer3 / 100 % 10]);
                            img_answ11.setImageResource(array.smallnum[answer3 / 10 % 10]);
                            img_answ12.setImageResource(array.smallnum[answer3 % 10]);

                            answer4 = ans4.nextInt(1000);
                            img_answ13.setImageResource(array.smallnum[answer4 / 1000]);
                            img_answ14.setImageResource(array.smallnum[answer4 / 100 % 10]);
                            img_answ15.setImageResource(array.smallnum[answer4 / 10 % 10]);
                            img_answ16.setImageResource(array.smallnum[answer4 % 10]);
                        } else if (rightAns == 2) {
                            answer2 = ans2.nextInt(1000);
                            img_answ1.setImageResource(array.smallnum[answer2 / 1000]);
                            img_answ2.setImageResource(array.smallnum[answer2 / 100 % 10]);
                            img_answ3.setImageResource(array.smallnum[answer2 / 10 % 10]);
                            img_answ4.setImageResource(array.smallnum[answer2 % 10]);

                            answer3 = ans3.nextInt(1000);
                            img_answ5.setImageResource(array.smallnum[answer3 / 1000]);
                            img_answ6.setImageResource(array.smallnum[answer3 / 100 % 10]);
                            img_answ7.setImageResource(array.smallnum[answer3 / 10 % 10]);
                            img_answ8.setImageResource(array.smallnum[answer3 % 10]);

                            img_answ9.setImageResource(array.smallnum[answer1 / 1000]);
                            img_answ10.setImageResource(array.smallnum[answer1 / 100 % 10]);
                            img_answ11.setImageResource(array.smallnum[answer1 / 10 % 10]);
                            img_answ12.setImageResource(array.smallnum[answer1 % 10]);

                            answer4 = ans4.nextInt(1000);
                            img_answ13.setImageResource(array.smallnum[answer4 / 1000]);
                            img_answ14.setImageResource(array.smallnum[answer4 / 100 % 10]);
                            img_answ15.setImageResource(array.smallnum[answer4 / 10 % 10]);
                            img_answ16.setImageResource(array.smallnum[answer4 % 10]);
                        } else {
                            answer2 = ans2.nextInt(1000);
                            img_answ1.setImageResource(array.smallnum[answer2 / 1000]);
                            img_answ2.setImageResource(array.smallnum[answer2 / 100 % 10]);
                            img_answ3.setImageResource(array.smallnum[answer2 / 10 % 10]);
                            img_answ4.setImageResource(array.smallnum[answer2 % 10]);

                            answer3 = ans3.nextInt(1000);
                            img_answ5.setImageResource(array.smallnum[answer3 / 1000]);
                            img_answ6.setImageResource(array.smallnum[answer3 / 100 % 10]);
                            img_answ7.setImageResource(array.smallnum[answer3 / 10 % 10]);
                            img_answ8.setImageResource(array.smallnum[answer3 % 10]);

                            answer4 = ans4.nextInt(1000);
                            img_answ9.setImageResource(array.smallnum[answer4 / 1000]);
                            img_answ10.setImageResource(array.smallnum[answer4 / 100 % 10]);
                            img_answ11.setImageResource(array.smallnum[answer4 / 10 % 10]);
                            img_answ12.setImageResource(array.smallnum[answer4 % 10]);

                            img_answ13.setImageResource(array.smallnum[answer1 / 1000]);
                            img_answ14.setImageResource(array.smallnum[answer1 / 100 % 10]);
                            img_answ15.setImageResource(array.smallnum[answer1 / 10 % 10]);
                            img_answ16.setImageResource(array.smallnum[answer1 % 10]);
                        }

                        img_answ1.setEnabled(true);
                        img_answ2.setEnabled(true);
                        img_answ3.setEnabled(true);
                        img_answ4.setEnabled(true);
                        img_answ9.setEnabled(true);
                        img_answ10.setEnabled(true);
                        img_answ11.setEnabled(true);
                        img_answ12.setEnabled(true);
                        img_answ13.setEnabled(true);
                        img_answ14.setEnabled(true);
                        img_answ15.setEnabled(true);
                        img_answ16.setEnabled(true);
                    }
                }
                return true;
            }
        });
            //вторая кнопка - конец

            //третья кнопка - начало
        img_answ9.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    img_answ1.setEnabled(false);
                    img_answ2.setEnabled(false);
                    img_answ3.setEnabled(false);
                    img_answ4.setEnabled(false);
                    img_answ5.setEnabled(false);
                    img_answ6.setEnabled(false);
                    img_answ7.setEnabled(false);
                    img_answ8.setEnabled(false);
                    img_answ13.setEnabled(false);
                    img_answ14.setEnabled(false);
                    img_answ15.setEnabled(false);
                    img_answ16.setEnabled(false);
                    if(rightAns == 2) {
                        img_answ9.setImageResource(R.drawable.img_true);
                        img_answ10.setImageResource(R.drawable.img_true);
                        img_answ11.setImageResource(R.drawable.img_true);
                        img_answ12.setImageResource(R.drawable.img_true);
                    } else{
                        img_answ9.setImageResource(R.drawable.img_false);
                        img_answ10.setImageResource(R.drawable.img_false);
                        img_answ11.setImageResource(R.drawable.img_false);
                        img_answ12.setImageResource(R.drawable.img_false);

                    }
                } else if(motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    if(rightAns == 2) {
                        if(count < 20) {
                            count++;
                        }

                        for (int i = 0; i < 20; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points);
                        }

                        for(int i = 0; i < count; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points_green);
                        }

                    } else {
                        if(count > 0) {
                            if(count == 1) {
                                count = 0;
                            } else {
                                count -= 2;
                            }
                        }
                        for (int i = 0; i < 19; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points);
                        }

                        for(int i = 0; i < count; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points_green);
                        }
                    }
                    if(count == 20) {
                        dialogEnd2.show();
                        sound.stop();
                    } else{
                        numLeft1 = a1.nextInt(10);
                        numLeft2 = a2.nextInt(10);
                        numRight1 = b1.nextInt(10);
                        numRight2 = b2.nextInt(10);
                        znak1 = znak.nextInt(3);
                        img_znak1.setImageResource(array.znaki[znak1]);
                        while (((numLeft1 * 10 + numLeft2) < (numRight1 * 10 + numRight2)) && (znak1 == 1)) {
                            numLeft1 = a1.nextInt(10);
                            numLeft2 = a2.nextInt(10);
                            numRight1 = b1.nextInt(10);
                            numRight2 = b2.nextInt(10);
                        }
                        img_left1.setImageResource(array.smallnum[numLeft1]);
                        img_left2.setImageResource(array.smallnum[numLeft2]);
                        img_right1.setImageResource(array.smallnum[numRight1]);
                        img_right2.setImageResource(array.smallnum[numRight2]);

                        rightAns = trueAns.nextInt(4);

                        // вычисление и вывод ответов на экран - начало

                        if (znak1 == 0)
                            answer1 = (numLeft1 * 10 + numLeft2) + (numRight1 * 10 + numRight2);
                        else if (znak1 == 2)
                            answer1 = (numLeft1 * 10 + numLeft2) * (numRight1 * 10 + numRight2);
                        else {
                            answer1 = (numLeft1 * 10 + numLeft2) - (numRight1 * 10 + numRight2);
                        }

                        if (rightAns == 0) {

                            img_answ1.setImageResource(array.smallnum[answer1 / 1000]);
                            img_answ2.setImageResource(array.smallnum[answer1 / 100 % 10]);
                            img_answ3.setImageResource(array.smallnum[answer1 / 10 % 10]);
                            img_answ4.setImageResource(array.smallnum[answer1 % 10]);

                            answer2 = ans2.nextInt(1000);
                            img_answ5.setImageResource(array.smallnum[answer2 / 1000]);
                            img_answ6.setImageResource(array.smallnum[answer2 / 100 % 10]);
                            img_answ7.setImageResource(array.smallnum[answer2 / 10 % 10]);
                            img_answ8.setImageResource(array.smallnum[answer2 % 10]);

                            answer3 = ans3.nextInt(1000);
                            img_answ9.setImageResource(array.smallnum[answer3 / 1000]);
                            img_answ10.setImageResource(array.smallnum[answer3 / 100 % 10]);
                            img_answ11.setImageResource(array.smallnum[answer3 / 10 % 10]);
                            img_answ12.setImageResource(array.smallnum[answer3 % 10]);

                            answer4 = ans4.nextInt(1000);
                            img_answ13.setImageResource(array.smallnum[answer4 / 1000]);
                            img_answ14.setImageResource(array.smallnum[answer4 / 100 % 10]);
                            img_answ15.setImageResource(array.smallnum[answer4 / 10 % 10]);
                            img_answ16.setImageResource(array.smallnum[answer4 % 10]);

                        } else if (rightAns == 1) {
                            answer2 = ans2.nextInt(1000);
                            img_answ1.setImageResource(array.smallnum[answer2 / 1000]);
                            img_answ2.setImageResource(array.smallnum[answer2 / 100 % 10]);
                            img_answ3.setImageResource(array.smallnum[answer2 / 10 % 10]);
                            img_answ4.setImageResource(array.smallnum[answer2 % 10]);

                            img_answ5.setImageResource(array.smallnum[answer1 / 1000]);
                            img_answ6.setImageResource(array.smallnum[answer1 / 100 % 10]);
                            img_answ7.setImageResource(array.smallnum[answer1 / 10 % 10]);
                            img_answ8.setImageResource(array.smallnum[answer1 % 10]);

                            answer3 = ans3.nextInt(1000);
                            img_answ9.setImageResource(array.smallnum[answer3 / 1000]);
                            img_answ10.setImageResource(array.smallnum[answer3 / 100 % 10]);
                            img_answ11.setImageResource(array.smallnum[answer3 / 10 % 10]);
                            img_answ12.setImageResource(array.smallnum[answer3 % 10]);

                            answer4 = ans4.nextInt(1000);
                            img_answ13.setImageResource(array.smallnum[answer4 / 1000]);
                            img_answ14.setImageResource(array.smallnum[answer4 / 100 % 10]);
                            img_answ15.setImageResource(array.smallnum[answer4 / 10 % 10]);
                            img_answ16.setImageResource(array.smallnum[answer4 % 10]);
                        } else if (rightAns == 2) {
                            answer2 = ans2.nextInt(1000);
                            img_answ1.setImageResource(array.smallnum[answer2 / 1000]);
                            img_answ2.setImageResource(array.smallnum[answer2 / 100 % 10]);
                            img_answ3.setImageResource(array.smallnum[answer2 / 10 % 10]);
                            img_answ4.setImageResource(array.smallnum[answer2 % 10]);

                            answer3 = ans3.nextInt(1000);
                            img_answ5.setImageResource(array.smallnum[answer3 / 1000]);
                            img_answ6.setImageResource(array.smallnum[answer3 / 100 % 10]);
                            img_answ7.setImageResource(array.smallnum[answer3 / 10 % 10]);
                            img_answ8.setImageResource(array.smallnum[answer3 % 10]);

                            img_answ9.setImageResource(array.smallnum[answer1 / 1000]);
                            img_answ10.setImageResource(array.smallnum[answer1 / 100 % 10]);
                            img_answ11.setImageResource(array.smallnum[answer1 / 10 % 10]);
                            img_answ12.setImageResource(array.smallnum[answer1 % 10]);

                            answer4 = ans4.nextInt(1000);
                            img_answ13.setImageResource(array.smallnum[answer4 / 1000]);
                            img_answ14.setImageResource(array.smallnum[answer4 / 100 % 10]);
                            img_answ15.setImageResource(array.smallnum[answer4 / 10 % 10]);
                            img_answ16.setImageResource(array.smallnum[answer4 % 10]);
                        } else {
                            answer2 = ans2.nextInt(1000);
                            img_answ1.setImageResource(array.smallnum[answer2 / 1000]);
                            img_answ2.setImageResource(array.smallnum[answer2 / 100 % 10]);
                            img_answ3.setImageResource(array.smallnum[answer2 / 10 % 10]);
                            img_answ4.setImageResource(array.smallnum[answer2 % 10]);

                            answer3 = ans3.nextInt(1000);
                            img_answ5.setImageResource(array.smallnum[answer3 / 1000]);
                            img_answ6.setImageResource(array.smallnum[answer3 / 100 % 10]);
                            img_answ7.setImageResource(array.smallnum[answer3 / 10 % 10]);
                            img_answ8.setImageResource(array.smallnum[answer3 % 10]);

                            answer4 = ans4.nextInt(1000);
                            img_answ9.setImageResource(array.smallnum[answer4 / 1000]);
                            img_answ10.setImageResource(array.smallnum[answer4 / 100 % 10]);
                            img_answ11.setImageResource(array.smallnum[answer4 / 10 % 10]);
                            img_answ12.setImageResource(array.smallnum[answer4 % 10]);

                            img_answ13.setImageResource(array.smallnum[answer1 / 1000]);
                            img_answ14.setImageResource(array.smallnum[answer1 / 100 % 10]);
                            img_answ15.setImageResource(array.smallnum[answer1 / 10 % 10]);
                            img_answ16.setImageResource(array.smallnum[answer1 % 10]);
                        }

                        img_answ1.setEnabled(true);
                        img_answ2.setEnabled(true);
                        img_answ3.setEnabled(true);
                        img_answ4.setEnabled(true);
                        img_answ5.setEnabled(true);
                        img_answ6.setEnabled(true);
                        img_answ7.setEnabled(true);
                        img_answ8.setEnabled(true);
                        img_answ13.setEnabled(true);
                        img_answ14.setEnabled(true);
                        img_answ15.setEnabled(true);
                        img_answ16.setEnabled(true);
                    }
                }
                return true;
            }
        });
        img_answ10.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    img_answ1.setEnabled(false);
                    img_answ2.setEnabled(false);
                    img_answ3.setEnabled(false);
                    img_answ4.setEnabled(false);
                    img_answ5.setEnabled(false);
                    img_answ6.setEnabled(false);
                    img_answ7.setEnabled(false);
                    img_answ8.setEnabled(false);
                    img_answ13.setEnabled(false);
                    img_answ14.setEnabled(false);
                    img_answ15.setEnabled(false);
                    img_answ16.setEnabled(false);
                    if(rightAns == 2) {
                        img_answ9.setImageResource(R.drawable.img_true);
                        img_answ10.setImageResource(R.drawable.img_true);
                        img_answ11.setImageResource(R.drawable.img_true);
                        img_answ12.setImageResource(R.drawable.img_true);
                    } else{
                        img_answ9.setImageResource(R.drawable.img_false);
                        img_answ10.setImageResource(R.drawable.img_false);
                        img_answ11.setImageResource(R.drawable.img_false);
                        img_answ12.setImageResource(R.drawable.img_false);

                    }
                } else if(motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    if(rightAns == 2) {
                        if(count < 20) {
                            count++;
                        }

                        for (int i = 0; i < 20; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points);
                        }

                        for(int i = 0; i < count; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points_green);
                        }

                    } else {
                        if(count > 0) {
                            if(count == 1) {
                                count = 0;
                            } else {
                                count -= 2;
                            }
                        }
                        for (int i = 0; i < 19; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points);
                        }

                        for(int i = 0; i < count; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points_green);
                        }
                    }
                    if(count == 20) {
                        dialogEnd2.show();
                        sound.stop();
                    } else{
                        numLeft1 = a1.nextInt(10);
                        numLeft2 = a2.nextInt(10);
                        numRight1 = b1.nextInt(10);
                        numRight2 = b2.nextInt(10);
                        znak1 = znak.nextInt(3);
                        img_znak1.setImageResource(array.znaki[znak1]);
                        while (((numLeft1 * 10 + numLeft2) < (numRight1 * 10 + numRight2)) && (znak1 == 1)) {
                            numLeft1 = a1.nextInt(10);
                            numLeft2 = a2.nextInt(10);
                            numRight1 = b1.nextInt(10);
                            numRight2 = b2.nextInt(10);
                        }
                        img_left1.setImageResource(array.smallnum[numLeft1]);
                        img_left2.setImageResource(array.smallnum[numLeft2]);
                        img_right1.setImageResource(array.smallnum[numRight1]);
                        img_right2.setImageResource(array.smallnum[numRight2]);

                        rightAns = trueAns.nextInt(4);

                        // вычисление и вывод ответов на экран - начало

                        if (znak1 == 0)
                            answer1 = (numLeft1 * 10 + numLeft2) + (numRight1 * 10 + numRight2);
                        else if (znak1 == 2)
                            answer1 = (numLeft1 * 10 + numLeft2) * (numRight1 * 10 + numRight2);
                        else {
                            answer1 = (numLeft1 * 10 + numLeft2) - (numRight1 * 10 + numRight2);
                        }

                        if (rightAns == 0) {

                            img_answ1.setImageResource(array.smallnum[answer1 / 1000]);
                            img_answ2.setImageResource(array.smallnum[answer1 / 100 % 10]);
                            img_answ3.setImageResource(array.smallnum[answer1 / 10 % 10]);
                            img_answ4.setImageResource(array.smallnum[answer1 % 10]);

                            answer2 = ans2.nextInt(1000);
                            img_answ5.setImageResource(array.smallnum[answer2 / 1000]);
                            img_answ6.setImageResource(array.smallnum[answer2 / 100 % 10]);
                            img_answ7.setImageResource(array.smallnum[answer2 / 10 % 10]);
                            img_answ8.setImageResource(array.smallnum[answer2 % 10]);

                            answer3 = ans3.nextInt(1000);
                            img_answ9.setImageResource(array.smallnum[answer3 / 1000]);
                            img_answ10.setImageResource(array.smallnum[answer3 / 100 % 10]);
                            img_answ11.setImageResource(array.smallnum[answer3 / 10 % 10]);
                            img_answ12.setImageResource(array.smallnum[answer3 % 10]);

                            answer4 = ans4.nextInt(1000);
                            img_answ13.setImageResource(array.smallnum[answer4 / 1000]);
                            img_answ14.setImageResource(array.smallnum[answer4 / 100 % 10]);
                            img_answ15.setImageResource(array.smallnum[answer4 / 10 % 10]);
                            img_answ16.setImageResource(array.smallnum[answer4 % 10]);

                        } else if (rightAns == 1) {
                            answer2 = ans2.nextInt(1000);
                            img_answ1.setImageResource(array.smallnum[answer2 / 1000]);
                            img_answ2.setImageResource(array.smallnum[answer2 / 100 % 10]);
                            img_answ3.setImageResource(array.smallnum[answer2 / 10 % 10]);
                            img_answ4.setImageResource(array.smallnum[answer2 % 10]);

                            img_answ5.setImageResource(array.smallnum[answer1 / 1000]);
                            img_answ6.setImageResource(array.smallnum[answer1 / 100 % 10]);
                            img_answ7.setImageResource(array.smallnum[answer1 / 10 % 10]);
                            img_answ8.setImageResource(array.smallnum[answer1 % 10]);

                            answer3 = ans3.nextInt(1000);
                            img_answ9.setImageResource(array.smallnum[answer3 / 1000]);
                            img_answ10.setImageResource(array.smallnum[answer3 / 100 % 10]);
                            img_answ11.setImageResource(array.smallnum[answer3 / 10 % 10]);
                            img_answ12.setImageResource(array.smallnum[answer3 % 10]);

                            answer4 = ans4.nextInt(1000);
                            img_answ13.setImageResource(array.smallnum[answer4 / 1000]);
                            img_answ14.setImageResource(array.smallnum[answer4 / 100 % 10]);
                            img_answ15.setImageResource(array.smallnum[answer4 / 10 % 10]);
                            img_answ16.setImageResource(array.smallnum[answer4 % 10]);
                        } else if (rightAns == 2) {
                            answer2 = ans2.nextInt(1000);
                            img_answ1.setImageResource(array.smallnum[answer2 / 1000]);
                            img_answ2.setImageResource(array.smallnum[answer2 / 100 % 10]);
                            img_answ3.setImageResource(array.smallnum[answer2 / 10 % 10]);
                            img_answ4.setImageResource(array.smallnum[answer2 % 10]);

                            answer3 = ans3.nextInt(1000);
                            img_answ5.setImageResource(array.smallnum[answer3 / 1000]);
                            img_answ6.setImageResource(array.smallnum[answer3 / 100 % 10]);
                            img_answ7.setImageResource(array.smallnum[answer3 / 10 % 10]);
                            img_answ8.setImageResource(array.smallnum[answer3 % 10]);

                            img_answ9.setImageResource(array.smallnum[answer1 / 1000]);
                            img_answ10.setImageResource(array.smallnum[answer1 / 100 % 10]);
                            img_answ11.setImageResource(array.smallnum[answer1 / 10 % 10]);
                            img_answ12.setImageResource(array.smallnum[answer1 % 10]);

                            answer4 = ans4.nextInt(1000);
                            img_answ13.setImageResource(array.smallnum[answer4 / 1000]);
                            img_answ14.setImageResource(array.smallnum[answer4 / 100 % 10]);
                            img_answ15.setImageResource(array.smallnum[answer4 / 10 % 10]);
                            img_answ16.setImageResource(array.smallnum[answer4 % 10]);
                        } else {
                            answer2 = ans2.nextInt(1000);
                            img_answ1.setImageResource(array.smallnum[answer2 / 1000]);
                            img_answ2.setImageResource(array.smallnum[answer2 / 100 % 10]);
                            img_answ3.setImageResource(array.smallnum[answer2 / 10 % 10]);
                            img_answ4.setImageResource(array.smallnum[answer2 % 10]);

                            answer3 = ans3.nextInt(1000);
                            img_answ5.setImageResource(array.smallnum[answer3 / 1000]);
                            img_answ6.setImageResource(array.smallnum[answer3 / 100 % 10]);
                            img_answ7.setImageResource(array.smallnum[answer3 / 10 % 10]);
                            img_answ8.setImageResource(array.smallnum[answer3 % 10]);

                            answer4 = ans4.nextInt(1000);
                            img_answ9.setImageResource(array.smallnum[answer4 / 1000]);
                            img_answ10.setImageResource(array.smallnum[answer4 / 100 % 10]);
                            img_answ11.setImageResource(array.smallnum[answer4 / 10 % 10]);
                            img_answ12.setImageResource(array.smallnum[answer4 % 10]);

                            img_answ13.setImageResource(array.smallnum[answer1 / 1000]);
                            img_answ14.setImageResource(array.smallnum[answer1 / 100 % 10]);
                            img_answ15.setImageResource(array.smallnum[answer1 / 10 % 10]);
                            img_answ16.setImageResource(array.smallnum[answer1 % 10]);
                        }

                        img_answ1.setEnabled(true);
                        img_answ2.setEnabled(true);
                        img_answ3.setEnabled(true);
                        img_answ4.setEnabled(true);
                        img_answ5.setEnabled(true);
                        img_answ6.setEnabled(true);
                        img_answ7.setEnabled(true);
                        img_answ8.setEnabled(true);
                        img_answ13.setEnabled(true);
                        img_answ14.setEnabled(true);
                        img_answ15.setEnabled(true);
                        img_answ16.setEnabled(true);
                    }
                }
                return true;
            }
        });
        img_answ11.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    img_answ1.setEnabled(false);
                    img_answ2.setEnabled(false);
                    img_answ3.setEnabled(false);
                    img_answ4.setEnabled(false);
                    img_answ5.setEnabled(false);
                    img_answ6.setEnabled(false);
                    img_answ7.setEnabled(false);
                    img_answ8.setEnabled(false);
                    img_answ13.setEnabled(false);
                    img_answ14.setEnabled(false);
                    img_answ15.setEnabled(false);
                    img_answ16.setEnabled(false);
                    if(rightAns == 2) {
                        img_answ9.setImageResource(R.drawable.img_true);
                        img_answ10.setImageResource(R.drawable.img_true);
                        img_answ11.setImageResource(R.drawable.img_true);
                        img_answ12.setImageResource(R.drawable.img_true);
                    } else{
                        img_answ9.setImageResource(R.drawable.img_false);
                        img_answ10.setImageResource(R.drawable.img_false);
                        img_answ11.setImageResource(R.drawable.img_false);
                        img_answ12.setImageResource(R.drawable.img_false);

                    }
                } else if(motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    if(rightAns == 2) {
                        if(count < 20) {
                            count++;
                        }

                        for (int i = 0; i < 20; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points);
                        }

                        for(int i = 0; i < count; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points_green);
                        }

                    } else {
                        if(count > 0) {
                            if(count == 1) {
                                count = 0;
                            } else {
                                count -= 2;
                            }
                        }
                        for (int i = 0; i < 19; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points);
                        }

                        for(int i = 0; i < count; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points_green);
                        }
                    }
                    if(count == 20) {
                        dialogEnd2.show();
                        sound.stop();
                    } else{
                        numLeft1 = a1.nextInt(10);
                        numLeft2 = a2.nextInt(10);
                        numRight1 = b1.nextInt(10);
                        numRight2 = b2.nextInt(10);
                        znak1 = znak.nextInt(3);
                        img_znak1.setImageResource(array.znaki[znak1]);
                        while (((numLeft1 * 10 + numLeft2) < (numRight1 * 10 + numRight2)) && (znak1 == 1)) {
                            numLeft1 = a1.nextInt(10);
                            numLeft2 = a2.nextInt(10);
                            numRight1 = b1.nextInt(10);
                            numRight2 = b2.nextInt(10);
                        }
                        img_left1.setImageResource(array.smallnum[numLeft1]);
                        img_left2.setImageResource(array.smallnum[numLeft2]);
                        img_right1.setImageResource(array.smallnum[numRight1]);
                        img_right2.setImageResource(array.smallnum[numRight2]);

                        rightAns = trueAns.nextInt(4);

                        // вычисление и вывод ответов на экран - начало

                        if (znak1 == 0)
                            answer1 = (numLeft1 * 10 + numLeft2) + (numRight1 * 10 + numRight2);
                        else if (znak1 == 2)
                            answer1 = (numLeft1 * 10 + numLeft2) * (numRight1 * 10 + numRight2);
                        else {
                            answer1 = (numLeft1 * 10 + numLeft2) - (numRight1 * 10 + numRight2);
                        }

                        if (rightAns == 0) {

                            img_answ1.setImageResource(array.smallnum[answer1 / 1000]);
                            img_answ2.setImageResource(array.smallnum[answer1 / 100 % 10]);
                            img_answ3.setImageResource(array.smallnum[answer1 / 10 % 10]);
                            img_answ4.setImageResource(array.smallnum[answer1 % 10]);

                            answer2 = ans2.nextInt(1000);
                            img_answ5.setImageResource(array.smallnum[answer2 / 1000]);
                            img_answ6.setImageResource(array.smallnum[answer2 / 100 % 10]);
                            img_answ7.setImageResource(array.smallnum[answer2 / 10 % 10]);
                            img_answ8.setImageResource(array.smallnum[answer2 % 10]);

                            answer3 = ans3.nextInt(1000);
                            img_answ9.setImageResource(array.smallnum[answer3 / 1000]);
                            img_answ10.setImageResource(array.smallnum[answer3 / 100 % 10]);
                            img_answ11.setImageResource(array.smallnum[answer3 / 10 % 10]);
                            img_answ12.setImageResource(array.smallnum[answer3 % 10]);

                            answer4 = ans4.nextInt(1000);
                            img_answ13.setImageResource(array.smallnum[answer4 / 1000]);
                            img_answ14.setImageResource(array.smallnum[answer4 / 100 % 10]);
                            img_answ15.setImageResource(array.smallnum[answer4 / 10 % 10]);
                            img_answ16.setImageResource(array.smallnum[answer4 % 10]);

                        } else if (rightAns == 1) {
                            answer2 = ans2.nextInt(1000);
                            img_answ1.setImageResource(array.smallnum[answer2 / 1000]);
                            img_answ2.setImageResource(array.smallnum[answer2 / 100 % 10]);
                            img_answ3.setImageResource(array.smallnum[answer2 / 10 % 10]);
                            img_answ4.setImageResource(array.smallnum[answer2 % 10]);

                            img_answ5.setImageResource(array.smallnum[answer1 / 1000]);
                            img_answ6.setImageResource(array.smallnum[answer1 / 100 % 10]);
                            img_answ7.setImageResource(array.smallnum[answer1 / 10 % 10]);
                            img_answ8.setImageResource(array.smallnum[answer1 % 10]);

                            answer3 = ans3.nextInt(1000);
                            img_answ9.setImageResource(array.smallnum[answer3 / 1000]);
                            img_answ10.setImageResource(array.smallnum[answer3 / 100 % 10]);
                            img_answ11.setImageResource(array.smallnum[answer3 / 10 % 10]);
                            img_answ12.setImageResource(array.smallnum[answer3 % 10]);

                            answer4 = ans4.nextInt(1000);
                            img_answ13.setImageResource(array.smallnum[answer4 / 1000]);
                            img_answ14.setImageResource(array.smallnum[answer4 / 100 % 10]);
                            img_answ15.setImageResource(array.smallnum[answer4 / 10 % 10]);
                            img_answ16.setImageResource(array.smallnum[answer4 % 10]);
                        } else if (rightAns == 2) {
                            answer2 = ans2.nextInt(1000);
                            img_answ1.setImageResource(array.smallnum[answer2 / 1000]);
                            img_answ2.setImageResource(array.smallnum[answer2 / 100 % 10]);
                            img_answ3.setImageResource(array.smallnum[answer2 / 10 % 10]);
                            img_answ4.setImageResource(array.smallnum[answer2 % 10]);

                            answer3 = ans3.nextInt(1000);
                            img_answ5.setImageResource(array.smallnum[answer3 / 1000]);
                            img_answ6.setImageResource(array.smallnum[answer3 / 100 % 10]);
                            img_answ7.setImageResource(array.smallnum[answer3 / 10 % 10]);
                            img_answ8.setImageResource(array.smallnum[answer3 % 10]);

                            img_answ9.setImageResource(array.smallnum[answer1 / 1000]);
                            img_answ10.setImageResource(array.smallnum[answer1 / 100 % 10]);
                            img_answ11.setImageResource(array.smallnum[answer1 / 10 % 10]);
                            img_answ12.setImageResource(array.smallnum[answer1 % 10]);

                            answer4 = ans4.nextInt(1000);
                            img_answ13.setImageResource(array.smallnum[answer4 / 1000]);
                            img_answ14.setImageResource(array.smallnum[answer4 / 100 % 10]);
                            img_answ15.setImageResource(array.smallnum[answer4 / 10 % 10]);
                            img_answ16.setImageResource(array.smallnum[answer4 % 10]);
                        } else {
                            answer2 = ans2.nextInt(1000);
                            img_answ1.setImageResource(array.smallnum[answer2 / 1000]);
                            img_answ2.setImageResource(array.smallnum[answer2 / 100 % 10]);
                            img_answ3.setImageResource(array.smallnum[answer2 / 10 % 10]);
                            img_answ4.setImageResource(array.smallnum[answer2 % 10]);

                            answer3 = ans3.nextInt(1000);
                            img_answ5.setImageResource(array.smallnum[answer3 / 1000]);
                            img_answ6.setImageResource(array.smallnum[answer3 / 100 % 10]);
                            img_answ7.setImageResource(array.smallnum[answer3 / 10 % 10]);
                            img_answ8.setImageResource(array.smallnum[answer3 % 10]);

                            answer4 = ans4.nextInt(1000);
                            img_answ9.setImageResource(array.smallnum[answer4 / 1000]);
                            img_answ10.setImageResource(array.smallnum[answer4 / 100 % 10]);
                            img_answ11.setImageResource(array.smallnum[answer4 / 10 % 10]);
                            img_answ12.setImageResource(array.smallnum[answer4 % 10]);

                            img_answ13.setImageResource(array.smallnum[answer1 / 1000]);
                            img_answ14.setImageResource(array.smallnum[answer1 / 100 % 10]);
                            img_answ15.setImageResource(array.smallnum[answer1 / 10 % 10]);
                            img_answ16.setImageResource(array.smallnum[answer1 % 10]);
                        }

                        img_answ1.setEnabled(true);
                        img_answ2.setEnabled(true);
                        img_answ3.setEnabled(true);
                        img_answ4.setEnabled(true);
                        img_answ5.setEnabled(true);
                        img_answ6.setEnabled(true);
                        img_answ7.setEnabled(true);
                        img_answ8.setEnabled(true);
                        img_answ13.setEnabled(true);
                        img_answ14.setEnabled(true);
                        img_answ15.setEnabled(true);
                        img_answ16.setEnabled(true);
                    }
                }
                return true;
            }
        });
        img_answ12.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    img_answ1.setEnabled(false);
                    img_answ2.setEnabled(false);
                    img_answ3.setEnabled(false);
                    img_answ4.setEnabled(false);
                    img_answ5.setEnabled(false);
                    img_answ6.setEnabled(false);
                    img_answ7.setEnabled(false);
                    img_answ8.setEnabled(false);
                    img_answ13.setEnabled(false);
                    img_answ14.setEnabled(false);
                    img_answ15.setEnabled(false);
                    img_answ16.setEnabled(false);
                    if(rightAns == 2) {
                        img_answ9.setImageResource(R.drawable.img_true);
                        img_answ10.setImageResource(R.drawable.img_true);
                        img_answ11.setImageResource(R.drawable.img_true);
                        img_answ12.setImageResource(R.drawable.img_true);
                    } else{
                        img_answ9.setImageResource(R.drawable.img_false);
                        img_answ10.setImageResource(R.drawable.img_false);
                        img_answ11.setImageResource(R.drawable.img_false);
                        img_answ12.setImageResource(R.drawable.img_false);

                    }
                } else if(motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    if(rightAns == 2) {
                        if(count < 20) {
                            count++;
                        }

                        for (int i = 0; i < 20; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points);
                        }

                        for(int i = 0; i < count; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points_green);
                        }

                    } else {
                        if(count > 0) {
                            if(count == 1) {
                                count = 0;
                            } else {
                                count -= 2;
                            }
                        }
                        for (int i = 0; i < 19; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points);
                        }

                        for(int i = 0; i < count; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points_green);
                        }
                    }
                    if(count == 20) {
                        dialogEnd2.show();
                        sound.stop();
                    } else{
                        numLeft1 = a1.nextInt(10);
                        numLeft2 = a2.nextInt(10);
                        numRight1 = b1.nextInt(10);
                        numRight2 = b2.nextInt(10);
                        znak1 = znak.nextInt(3);
                        img_znak1.setImageResource(array.znaki[znak1]);
                        while (((numLeft1 * 10 + numLeft2) < (numRight1 * 10 + numRight2)) && (znak1 == 1)) {
                            numLeft1 = a1.nextInt(10);
                            numLeft2 = a2.nextInt(10);
                            numRight1 = b1.nextInt(10);
                            numRight2 = b2.nextInt(10);
                        }
                        img_left1.setImageResource(array.smallnum[numLeft1]);
                        img_left2.setImageResource(array.smallnum[numLeft2]);
                        img_right1.setImageResource(array.smallnum[numRight1]);
                        img_right2.setImageResource(array.smallnum[numRight2]);

                        rightAns = trueAns.nextInt(4);

                        // вычисление и вывод ответов на экран - начало

                        if (znak1 == 0)
                            answer1 = (numLeft1 * 10 + numLeft2) + (numRight1 * 10 + numRight2);
                        else if (znak1 == 2)
                            answer1 = (numLeft1 * 10 + numLeft2) * (numRight1 * 10 + numRight2);
                        else {
                            answer1 = (numLeft1 * 10 + numLeft2) - (numRight1 * 10 + numRight2);
                        }

                        if (rightAns == 0) {

                            img_answ1.setImageResource(array.smallnum[answer1 / 1000]);
                            img_answ2.setImageResource(array.smallnum[answer1 / 100 % 10]);
                            img_answ3.setImageResource(array.smallnum[answer1 / 10 % 10]);
                            img_answ4.setImageResource(array.smallnum[answer1 % 10]);

                            answer2 = ans2.nextInt(1000);
                            img_answ5.setImageResource(array.smallnum[answer2 / 1000]);
                            img_answ6.setImageResource(array.smallnum[answer2 / 100 % 10]);
                            img_answ7.setImageResource(array.smallnum[answer2 / 10 % 10]);
                            img_answ8.setImageResource(array.smallnum[answer2 % 10]);

                            answer3 = ans3.nextInt(1000);
                            img_answ9.setImageResource(array.smallnum[answer3 / 1000]);
                            img_answ10.setImageResource(array.smallnum[answer3 / 100 % 10]);
                            img_answ11.setImageResource(array.smallnum[answer3 / 10 % 10]);
                            img_answ12.setImageResource(array.smallnum[answer3 % 10]);

                            answer4 = ans4.nextInt(1000);
                            img_answ13.setImageResource(array.smallnum[answer4 / 1000]);
                            img_answ14.setImageResource(array.smallnum[answer4 / 100 % 10]);
                            img_answ15.setImageResource(array.smallnum[answer4 / 10 % 10]);
                            img_answ16.setImageResource(array.smallnum[answer4 % 10]);

                        } else if (rightAns == 1) {
                            answer2 = ans2.nextInt(1000);
                            img_answ1.setImageResource(array.smallnum[answer2 / 1000]);
                            img_answ2.setImageResource(array.smallnum[answer2 / 100 % 10]);
                            img_answ3.setImageResource(array.smallnum[answer2 / 10 % 10]);
                            img_answ4.setImageResource(array.smallnum[answer2 % 10]);

                            img_answ5.setImageResource(array.smallnum[answer1 / 1000]);
                            img_answ6.setImageResource(array.smallnum[answer1 / 100 % 10]);
                            img_answ7.setImageResource(array.smallnum[answer1 / 10 % 10]);
                            img_answ8.setImageResource(array.smallnum[answer1 % 10]);

                            answer3 = ans3.nextInt(1000);
                            img_answ9.setImageResource(array.smallnum[answer3 / 1000]);
                            img_answ10.setImageResource(array.smallnum[answer3 / 100 % 10]);
                            img_answ11.setImageResource(array.smallnum[answer3 / 10 % 10]);
                            img_answ12.setImageResource(array.smallnum[answer3 % 10]);

                            answer4 = ans4.nextInt(1000);
                            img_answ13.setImageResource(array.smallnum[answer4 / 1000]);
                            img_answ14.setImageResource(array.smallnum[answer4 / 100 % 10]);
                            img_answ15.setImageResource(array.smallnum[answer4 / 10 % 10]);
                            img_answ16.setImageResource(array.smallnum[answer4 % 10]);
                        } else if (rightAns == 2) {
                            answer2 = ans2.nextInt(1000);
                            img_answ1.setImageResource(array.smallnum[answer2 / 1000]);
                            img_answ2.setImageResource(array.smallnum[answer2 / 100 % 10]);
                            img_answ3.setImageResource(array.smallnum[answer2 / 10 % 10]);
                            img_answ4.setImageResource(array.smallnum[answer2 % 10]);

                            answer3 = ans3.nextInt(1000);
                            img_answ5.setImageResource(array.smallnum[answer3 / 1000]);
                            img_answ6.setImageResource(array.smallnum[answer3 / 100 % 10]);
                            img_answ7.setImageResource(array.smallnum[answer3 / 10 % 10]);
                            img_answ8.setImageResource(array.smallnum[answer3 % 10]);

                            img_answ9.setImageResource(array.smallnum[answer1 / 1000]);
                            img_answ10.setImageResource(array.smallnum[answer1 / 100 % 10]);
                            img_answ11.setImageResource(array.smallnum[answer1 / 10 % 10]);
                            img_answ12.setImageResource(array.smallnum[answer1 % 10]);

                            answer4 = ans4.nextInt(1000);
                            img_answ13.setImageResource(array.smallnum[answer4 / 1000]);
                            img_answ14.setImageResource(array.smallnum[answer4 / 100 % 10]);
                            img_answ15.setImageResource(array.smallnum[answer4 / 10 % 10]);
                            img_answ16.setImageResource(array.smallnum[answer4 % 10]);
                        } else {
                            answer2 = ans2.nextInt(1000);
                            img_answ1.setImageResource(array.smallnum[answer2 / 1000]);
                            img_answ2.setImageResource(array.smallnum[answer2 / 100 % 10]);
                            img_answ3.setImageResource(array.smallnum[answer2 / 10 % 10]);
                            img_answ4.setImageResource(array.smallnum[answer2 % 10]);

                            answer3 = ans3.nextInt(1000);
                            img_answ5.setImageResource(array.smallnum[answer3 / 1000]);
                            img_answ6.setImageResource(array.smallnum[answer3 / 100 % 10]);
                            img_answ7.setImageResource(array.smallnum[answer3 / 10 % 10]);
                            img_answ8.setImageResource(array.smallnum[answer3 % 10]);

                            answer4 = ans4.nextInt(1000);
                            img_answ9.setImageResource(array.smallnum[answer4 / 1000]);
                            img_answ10.setImageResource(array.smallnum[answer4 / 100 % 10]);
                            img_answ11.setImageResource(array.smallnum[answer4 / 10 % 10]);
                            img_answ12.setImageResource(array.smallnum[answer4 % 10]);

                            img_answ13.setImageResource(array.smallnum[answer1 / 1000]);
                            img_answ14.setImageResource(array.smallnum[answer1 / 100 % 10]);
                            img_answ15.setImageResource(array.smallnum[answer1 / 10 % 10]);
                            img_answ16.setImageResource(array.smallnum[answer1 % 10]);
                        }

                        img_answ1.setEnabled(true);
                        img_answ2.setEnabled(true);
                        img_answ3.setEnabled(true);
                        img_answ4.setEnabled(true);
                        img_answ5.setEnabled(true);
                        img_answ6.setEnabled(true);
                        img_answ7.setEnabled(true);
                        img_answ8.setEnabled(true);
                        img_answ13.setEnabled(true);
                        img_answ14.setEnabled(true);
                        img_answ15.setEnabled(true);
                        img_answ16.setEnabled(true);
                    }
                }
                return true;
            }
        });
            //третья кнопка - конец

            //четвертая кнопка - начало
        img_answ13.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    img_answ1.setEnabled(false);
                    img_answ2.setEnabled(false);
                    img_answ3.setEnabled(false);
                    img_answ4.setEnabled(false);
                    img_answ5.setEnabled(false);
                    img_answ6.setEnabled(false);
                    img_answ7.setEnabled(false);
                    img_answ8.setEnabled(false);
                    img_answ9.setEnabled(false);
                    img_answ10.setEnabled(false);
                    img_answ11.setEnabled(false);
                    img_answ12.setEnabled(false);
                    if(rightAns == 3) {
                        img_answ13.setImageResource(R.drawable.img_true);
                        img_answ14.setImageResource(R.drawable.img_true);
                        img_answ15.setImageResource(R.drawable.img_true);
                        img_answ16.setImageResource(R.drawable.img_true);
                    } else{
                        img_answ13.setImageResource(R.drawable.img_false);
                        img_answ14.setImageResource(R.drawable.img_false);
                        img_answ15.setImageResource(R.drawable.img_false);
                        img_answ16.setImageResource(R.drawable.img_false);

                    }
                } else if(motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    if(rightAns == 3) {
                        if(count < 20) {
                            count++;
                        }

                        for (int i = 0; i < 20; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points);
                        }

                        for(int i = 0; i < count; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points_green);
                        }

                    } else {
                        if(count > 0) {
                            if(count == 1) {
                                count = 0;
                            } else {
                                count -= 2;
                            }
                        }
                        for (int i = 0; i < 19; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points);
                        }

                        for(int i = 0; i < count; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points_green);
                        }
                    }
                    if(count == 20) {
                        dialogEnd2.show();
                        sound.stop();
                    } else{
                        numLeft1 = a1.nextInt(10);
                        numLeft2 = a2.nextInt(10);
                        numRight1 = b1.nextInt(10);
                        numRight2 = b2.nextInt(10);
                        znak1 = znak.nextInt(3);
                        img_znak1.setImageResource(array.znaki[znak1]);
                        while (((numLeft1 * 10 + numLeft2) < (numRight1 * 10 + numRight2)) && (znak1 == 1)) {
                            numLeft1 = a1.nextInt(10);
                            numLeft2 = a2.nextInt(10);
                            numRight1 = b1.nextInt(10);
                            numRight2 = b2.nextInt(10);
                        }
                        img_left1.setImageResource(array.smallnum[numLeft1]);
                        img_left2.setImageResource(array.smallnum[numLeft2]);
                        img_right1.setImageResource(array.smallnum[numRight1]);
                        img_right2.setImageResource(array.smallnum[numRight2]);

                        rightAns = trueAns.nextInt(4);

                        // вычисление и вывод ответов на экран - начало

                        if (znak1 == 0)
                            answer1 = (numLeft1 * 10 + numLeft2) + (numRight1 * 10 + numRight2);
                        else if (znak1 == 2)
                            answer1 = (numLeft1 * 10 + numLeft2) * (numRight1 * 10 + numRight2);
                        else {
                            answer1 = (numLeft1 * 10 + numLeft2) - (numRight1 * 10 + numRight2);
                        }

                        if (rightAns == 0) {

                            img_answ1.setImageResource(array.smallnum[answer1 / 1000]);
                            img_answ2.setImageResource(array.smallnum[answer1 / 100 % 10]);
                            img_answ3.setImageResource(array.smallnum[answer1 / 10 % 10]);
                            img_answ4.setImageResource(array.smallnum[answer1 % 10]);

                            answer2 = ans2.nextInt(1000);
                            img_answ5.setImageResource(array.smallnum[answer2 / 1000]);
                            img_answ6.setImageResource(array.smallnum[answer2 / 100 % 10]);
                            img_answ7.setImageResource(array.smallnum[answer2 / 10 % 10]);
                            img_answ8.setImageResource(array.smallnum[answer2 % 10]);

                            answer3 = ans3.nextInt(1000);
                            img_answ9.setImageResource(array.smallnum[answer3 / 1000]);
                            img_answ10.setImageResource(array.smallnum[answer3 / 100 % 10]);
                            img_answ11.setImageResource(array.smallnum[answer3 / 10 % 10]);
                            img_answ12.setImageResource(array.smallnum[answer3 % 10]);

                            answer4 = ans4.nextInt(1000);
                            img_answ13.setImageResource(array.smallnum[answer4 / 1000]);
                            img_answ14.setImageResource(array.smallnum[answer4 / 100 % 10]);
                            img_answ15.setImageResource(array.smallnum[answer4 / 10 % 10]);
                            img_answ16.setImageResource(array.smallnum[answer4 % 10]);

                        } else if (rightAns == 1) {
                            answer2 = ans2.nextInt(1000);
                            img_answ1.setImageResource(array.smallnum[answer2 / 1000]);
                            img_answ2.setImageResource(array.smallnum[answer2 / 100 % 10]);
                            img_answ3.setImageResource(array.smallnum[answer2 / 10 % 10]);
                            img_answ4.setImageResource(array.smallnum[answer2 % 10]);

                            img_answ5.setImageResource(array.smallnum[answer1 / 1000]);
                            img_answ6.setImageResource(array.smallnum[answer1 / 100 % 10]);
                            img_answ7.setImageResource(array.smallnum[answer1 / 10 % 10]);
                            img_answ8.setImageResource(array.smallnum[answer1 % 10]);

                            answer3 = ans3.nextInt(1000);
                            img_answ9.setImageResource(array.smallnum[answer3 / 1000]);
                            img_answ10.setImageResource(array.smallnum[answer3 / 100 % 10]);
                            img_answ11.setImageResource(array.smallnum[answer3 / 10 % 10]);
                            img_answ12.setImageResource(array.smallnum[answer3 % 10]);

                            answer4 = ans4.nextInt(1000);
                            img_answ13.setImageResource(array.smallnum[answer4 / 1000]);
                            img_answ14.setImageResource(array.smallnum[answer4 / 100 % 10]);
                            img_answ15.setImageResource(array.smallnum[answer4 / 10 % 10]);
                            img_answ16.setImageResource(array.smallnum[answer4 % 10]);
                        } else if (rightAns == 2) {
                            answer2 = ans2.nextInt(1000);
                            img_answ1.setImageResource(array.smallnum[answer2 / 1000]);
                            img_answ2.setImageResource(array.smallnum[answer2 / 100 % 10]);
                            img_answ3.setImageResource(array.smallnum[answer2 / 10 % 10]);
                            img_answ4.setImageResource(array.smallnum[answer2 % 10]);

                            answer3 = ans3.nextInt(1000);
                            img_answ5.setImageResource(array.smallnum[answer3 / 1000]);
                            img_answ6.setImageResource(array.smallnum[answer3 / 100 % 10]);
                            img_answ7.setImageResource(array.smallnum[answer3 / 10 % 10]);
                            img_answ8.setImageResource(array.smallnum[answer3 % 10]);

                            img_answ9.setImageResource(array.smallnum[answer1 / 1000]);
                            img_answ10.setImageResource(array.smallnum[answer1 / 100 % 10]);
                            img_answ11.setImageResource(array.smallnum[answer1 / 10 % 10]);
                            img_answ12.setImageResource(array.smallnum[answer1 % 10]);

                            answer4 = ans4.nextInt(1000);
                            img_answ13.setImageResource(array.smallnum[answer4 / 1000]);
                            img_answ14.setImageResource(array.smallnum[answer4 / 100 % 10]);
                            img_answ15.setImageResource(array.smallnum[answer4 / 10 % 10]);
                            img_answ16.setImageResource(array.smallnum[answer4 % 10]);
                        } else {
                            answer2 = ans2.nextInt(1000);
                            img_answ1.setImageResource(array.smallnum[answer2 / 1000]);
                            img_answ2.setImageResource(array.smallnum[answer2 / 100 % 10]);
                            img_answ3.setImageResource(array.smallnum[answer2 / 10 % 10]);
                            img_answ4.setImageResource(array.smallnum[answer2 % 10]);

                            answer3 = ans3.nextInt(1000);
                            img_answ5.setImageResource(array.smallnum[answer3 / 1000]);
                            img_answ6.setImageResource(array.smallnum[answer3 / 100 % 10]);
                            img_answ7.setImageResource(array.smallnum[answer3 / 10 % 10]);
                            img_answ8.setImageResource(array.smallnum[answer3 % 10]);

                            answer4 = ans4.nextInt(1000);
                            img_answ9.setImageResource(array.smallnum[answer4 / 1000]);
                            img_answ10.setImageResource(array.smallnum[answer4 / 100 % 10]);
                            img_answ11.setImageResource(array.smallnum[answer4 / 10 % 10]);
                            img_answ12.setImageResource(array.smallnum[answer4 % 10]);

                            img_answ13.setImageResource(array.smallnum[answer1 / 1000]);
                            img_answ14.setImageResource(array.smallnum[answer1 / 100 % 10]);
                            img_answ15.setImageResource(array.smallnum[answer1 / 10 % 10]);
                            img_answ16.setImageResource(array.smallnum[answer1 % 10]);
                        }

                        img_answ1.setEnabled(true);
                        img_answ2.setEnabled(true);
                        img_answ3.setEnabled(true);
                        img_answ4.setEnabled(true);
                        img_answ5.setEnabled(true);
                        img_answ6.setEnabled(true);
                        img_answ7.setEnabled(true);
                        img_answ8.setEnabled(true);
                        img_answ9.setEnabled(true);
                        img_answ10.setEnabled(true);
                        img_answ11.setEnabled(true);
                        img_answ12.setEnabled(true);
                    }
                }
                return true;
            }
        });
        img_answ14.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    img_answ1.setEnabled(false);
                    img_answ2.setEnabled(false);
                    img_answ3.setEnabled(false);
                    img_answ4.setEnabled(false);
                    img_answ5.setEnabled(false);
                    img_answ6.setEnabled(false);
                    img_answ7.setEnabled(false);
                    img_answ8.setEnabled(false);
                    img_answ9.setEnabled(false);
                    img_answ10.setEnabled(false);
                    img_answ11.setEnabled(false);
                    img_answ12.setEnabled(false);
                    if(rightAns == 3) {
                        img_answ13.setImageResource(R.drawable.img_true);
                        img_answ14.setImageResource(R.drawable.img_true);
                        img_answ15.setImageResource(R.drawable.img_true);
                        img_answ16.setImageResource(R.drawable.img_true);
                    } else{
                        img_answ13.setImageResource(R.drawable.img_false);
                        img_answ14.setImageResource(R.drawable.img_false);
                        img_answ15.setImageResource(R.drawable.img_false);
                        img_answ16.setImageResource(R.drawable.img_false);

                    }
                } else if(motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    if(rightAns == 3) {
                        if(count < 20) {
                            count++;
                        }

                        for (int i = 0; i < 20; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points);
                        }

                        for(int i = 0; i < count; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points_green);
                        }

                    } else {
                        if(count > 0) {
                            if(count == 1) {
                                count = 0;
                            } else {
                                count -= 2;
                            }
                        }
                        for (int i = 0; i < 19; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points);
                        }

                        for(int i = 0; i < count; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points_green);
                        }
                    }
                    if(count == 20) {
                        dialogEnd2.show();
                        sound.stop();
                    } else{
                        numLeft1 = a1.nextInt(10);
                        numLeft2 = a2.nextInt(10);
                        numRight1 = b1.nextInt(10);
                        numRight2 = b2.nextInt(10);
                        znak1 = znak.nextInt(3);
                        img_znak1.setImageResource(array.znaki[znak1]);
                        while (((numLeft1 * 10 + numLeft2) < (numRight1 * 10 + numRight2)) && (znak1 == 1)) {
                            numLeft1 = a1.nextInt(10);
                            numLeft2 = a2.nextInt(10);
                            numRight1 = b1.nextInt(10);
                            numRight2 = b2.nextInt(10);
                        }
                        img_left1.setImageResource(array.smallnum[numLeft1]);
                        img_left2.setImageResource(array.smallnum[numLeft2]);
                        img_right1.setImageResource(array.smallnum[numRight1]);
                        img_right2.setImageResource(array.smallnum[numRight2]);

                        rightAns = trueAns.nextInt(4);

                        // вычисление и вывод ответов на экран - начало

                        if (znak1 == 0)
                            answer1 = (numLeft1 * 10 + numLeft2) + (numRight1 * 10 + numRight2);
                        else if (znak1 == 2)
                            answer1 = (numLeft1 * 10 + numLeft2) * (numRight1 * 10 + numRight2);
                        else {
                            answer1 = (numLeft1 * 10 + numLeft2) - (numRight1 * 10 + numRight2);
                        }

                        if (rightAns == 0) {

                            img_answ1.setImageResource(array.smallnum[answer1 / 1000]);
                            img_answ2.setImageResource(array.smallnum[answer1 / 100 % 10]);
                            img_answ3.setImageResource(array.smallnum[answer1 / 10 % 10]);
                            img_answ4.setImageResource(array.smallnum[answer1 % 10]);

                            answer2 = ans2.nextInt(1000);
                            img_answ5.setImageResource(array.smallnum[answer2 / 1000]);
                            img_answ6.setImageResource(array.smallnum[answer2 / 100 % 10]);
                            img_answ7.setImageResource(array.smallnum[answer2 / 10 % 10]);
                            img_answ8.setImageResource(array.smallnum[answer2 % 10]);

                            answer3 = ans3.nextInt(1000);
                            img_answ9.setImageResource(array.smallnum[answer3 / 1000]);
                            img_answ10.setImageResource(array.smallnum[answer3 / 100 % 10]);
                            img_answ11.setImageResource(array.smallnum[answer3 / 10 % 10]);
                            img_answ12.setImageResource(array.smallnum[answer3 % 10]);

                            answer4 = ans4.nextInt(1000);
                            img_answ13.setImageResource(array.smallnum[answer4 / 1000]);
                            img_answ14.setImageResource(array.smallnum[answer4 / 100 % 10]);
                            img_answ15.setImageResource(array.smallnum[answer4 / 10 % 10]);
                            img_answ16.setImageResource(array.smallnum[answer4 % 10]);

                        } else if (rightAns == 1) {
                            answer2 = ans2.nextInt(1000);
                            img_answ1.setImageResource(array.smallnum[answer2 / 1000]);
                            img_answ2.setImageResource(array.smallnum[answer2 / 100 % 10]);
                            img_answ3.setImageResource(array.smallnum[answer2 / 10 % 10]);
                            img_answ4.setImageResource(array.smallnum[answer2 % 10]);

                            img_answ5.setImageResource(array.smallnum[answer1 / 1000]);
                            img_answ6.setImageResource(array.smallnum[answer1 / 100 % 10]);
                            img_answ7.setImageResource(array.smallnum[answer1 / 10 % 10]);
                            img_answ8.setImageResource(array.smallnum[answer1 % 10]);

                            answer3 = ans3.nextInt(1000);
                            img_answ9.setImageResource(array.smallnum[answer3 / 1000]);
                            img_answ10.setImageResource(array.smallnum[answer3 / 100 % 10]);
                            img_answ11.setImageResource(array.smallnum[answer3 / 10 % 10]);
                            img_answ12.setImageResource(array.smallnum[answer3 % 10]);

                            answer4 = ans4.nextInt(1000);
                            img_answ13.setImageResource(array.smallnum[answer4 / 1000]);
                            img_answ14.setImageResource(array.smallnum[answer4 / 100 % 10]);
                            img_answ15.setImageResource(array.smallnum[answer4 / 10 % 10]);
                            img_answ16.setImageResource(array.smallnum[answer4 % 10]);
                        } else if (rightAns == 2) {
                            answer2 = ans2.nextInt(1000);
                            img_answ1.setImageResource(array.smallnum[answer2 / 1000]);
                            img_answ2.setImageResource(array.smallnum[answer2 / 100 % 10]);
                            img_answ3.setImageResource(array.smallnum[answer2 / 10 % 10]);
                            img_answ4.setImageResource(array.smallnum[answer2 % 10]);

                            answer3 = ans3.nextInt(1000);
                            img_answ5.setImageResource(array.smallnum[answer3 / 1000]);
                            img_answ6.setImageResource(array.smallnum[answer3 / 100 % 10]);
                            img_answ7.setImageResource(array.smallnum[answer3 / 10 % 10]);
                            img_answ8.setImageResource(array.smallnum[answer3 % 10]);

                            img_answ9.setImageResource(array.smallnum[answer1 / 1000]);
                            img_answ10.setImageResource(array.smallnum[answer1 / 100 % 10]);
                            img_answ11.setImageResource(array.smallnum[answer1 / 10 % 10]);
                            img_answ12.setImageResource(array.smallnum[answer1 % 10]);

                            answer4 = ans4.nextInt(1000);
                            img_answ13.setImageResource(array.smallnum[answer4 / 1000]);
                            img_answ14.setImageResource(array.smallnum[answer4 / 100 % 10]);
                            img_answ15.setImageResource(array.smallnum[answer4 / 10 % 10]);
                            img_answ16.setImageResource(array.smallnum[answer4 % 10]);
                        } else {
                            answer2 = ans2.nextInt(1000);
                            img_answ1.setImageResource(array.smallnum[answer2 / 1000]);
                            img_answ2.setImageResource(array.smallnum[answer2 / 100 % 10]);
                            img_answ3.setImageResource(array.smallnum[answer2 / 10 % 10]);
                            img_answ4.setImageResource(array.smallnum[answer2 % 10]);

                            answer3 = ans3.nextInt(1000);
                            img_answ5.setImageResource(array.smallnum[answer3 / 1000]);
                            img_answ6.setImageResource(array.smallnum[answer3 / 100 % 10]);
                            img_answ7.setImageResource(array.smallnum[answer3 / 10 % 10]);
                            img_answ8.setImageResource(array.smallnum[answer3 % 10]);

                            answer4 = ans4.nextInt(1000);
                            img_answ9.setImageResource(array.smallnum[answer4 / 1000]);
                            img_answ10.setImageResource(array.smallnum[answer4 / 100 % 10]);
                            img_answ11.setImageResource(array.smallnum[answer4 / 10 % 10]);
                            img_answ12.setImageResource(array.smallnum[answer4 % 10]);

                            img_answ13.setImageResource(array.smallnum[answer1 / 1000]);
                            img_answ14.setImageResource(array.smallnum[answer1 / 100 % 10]);
                            img_answ15.setImageResource(array.smallnum[answer1 / 10 % 10]);
                            img_answ16.setImageResource(array.smallnum[answer1 % 10]);
                        }

                        img_answ1.setEnabled(true);
                        img_answ2.setEnabled(true);
                        img_answ3.setEnabled(true);
                        img_answ4.setEnabled(true);
                        img_answ5.setEnabled(true);
                        img_answ6.setEnabled(true);
                        img_answ7.setEnabled(true);
                        img_answ8.setEnabled(true);
                        img_answ9.setEnabled(true);
                        img_answ10.setEnabled(true);
                        img_answ11.setEnabled(true);
                        img_answ12.setEnabled(true);
                    }
                }
                return true;
            }
        });
        img_answ15.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    img_answ1.setEnabled(false);
                    img_answ2.setEnabled(false);
                    img_answ3.setEnabled(false);
                    img_answ4.setEnabled(false);
                    img_answ5.setEnabled(false);
                    img_answ6.setEnabled(false);
                    img_answ7.setEnabled(false);
                    img_answ8.setEnabled(false);
                    img_answ9.setEnabled(false);
                    img_answ10.setEnabled(false);
                    img_answ11.setEnabled(false);
                    img_answ12.setEnabled(false);
                    if(rightAns == 3) {
                        img_answ13.setImageResource(R.drawable.img_true);
                        img_answ14.setImageResource(R.drawable.img_true);
                        img_answ15.setImageResource(R.drawable.img_true);
                        img_answ16.setImageResource(R.drawable.img_true);
                    } else{
                        img_answ13.setImageResource(R.drawable.img_false);
                        img_answ14.setImageResource(R.drawable.img_false);
                        img_answ15.setImageResource(R.drawable.img_false);
                        img_answ16.setImageResource(R.drawable.img_false);

                    }
                } else if(motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    if(rightAns == 3) {
                        if(count < 20) {
                            count++;
                        }

                        for (int i = 0; i < 20; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points);
                        }

                        for(int i = 0; i < count; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points_green);
                        }

                    } else {
                        if(count > 0) {
                            if(count == 1) {
                                count = 0;
                            } else {
                                count -= 2;
                            }
                        }
                        for (int i = 0; i < 19; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points);
                        }

                        for(int i = 0; i < count; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points_green);
                        }
                    }
                    if(count == 20) {
                        dialogEnd2.show();
                        sound.stop();
                    } else{
                        numLeft1 = a1.nextInt(10);
                        numLeft2 = a2.nextInt(10);
                        numRight1 = b1.nextInt(10);
                        numRight2 = b2.nextInt(10);
                        znak1 = znak.nextInt(3);
                        img_znak1.setImageResource(array.znaki[znak1]);
                        while (((numLeft1 * 10 + numLeft2) < (numRight1 * 10 + numRight2)) && (znak1 == 1)) {
                            numLeft1 = a1.nextInt(10);
                            numLeft2 = a2.nextInt(10);
                            numRight1 = b1.nextInt(10);
                            numRight2 = b2.nextInt(10);
                        }
                        img_left1.setImageResource(array.smallnum[numLeft1]);
                        img_left2.setImageResource(array.smallnum[numLeft2]);
                        img_right1.setImageResource(array.smallnum[numRight1]);
                        img_right2.setImageResource(array.smallnum[numRight2]);

                        rightAns = trueAns.nextInt(4);

                        // вычисление и вывод ответов на экран - начало

                        if (znak1 == 0)
                            answer1 = (numLeft1 * 10 + numLeft2) + (numRight1 * 10 + numRight2);
                        else if (znak1 == 2)
                            answer1 = (numLeft1 * 10 + numLeft2) * (numRight1 * 10 + numRight2);
                        else {
                            answer1 = (numLeft1 * 10 + numLeft2) - (numRight1 * 10 + numRight2);
                        }

                        if (rightAns == 0) {

                            img_answ1.setImageResource(array.smallnum[answer1 / 1000]);
                            img_answ2.setImageResource(array.smallnum[answer1 / 100 % 10]);
                            img_answ3.setImageResource(array.smallnum[answer1 / 10 % 10]);
                            img_answ4.setImageResource(array.smallnum[answer1 % 10]);

                            answer2 = ans2.nextInt(1000);
                            img_answ5.setImageResource(array.smallnum[answer2 / 1000]);
                            img_answ6.setImageResource(array.smallnum[answer2 / 100 % 10]);
                            img_answ7.setImageResource(array.smallnum[answer2 / 10 % 10]);
                            img_answ8.setImageResource(array.smallnum[answer2 % 10]);

                            answer3 = ans3.nextInt(1000);
                            img_answ9.setImageResource(array.smallnum[answer3 / 1000]);
                            img_answ10.setImageResource(array.smallnum[answer3 / 100 % 10]);
                            img_answ11.setImageResource(array.smallnum[answer3 / 10 % 10]);
                            img_answ12.setImageResource(array.smallnum[answer3 % 10]);

                            answer4 = ans4.nextInt(1000);
                            img_answ13.setImageResource(array.smallnum[answer4 / 1000]);
                            img_answ14.setImageResource(array.smallnum[answer4 / 100 % 10]);
                            img_answ15.setImageResource(array.smallnum[answer4 / 10 % 10]);
                            img_answ16.setImageResource(array.smallnum[answer4 % 10]);

                        } else if (rightAns == 1) {
                            answer2 = ans2.nextInt(1000);
                            img_answ1.setImageResource(array.smallnum[answer2 / 1000]);
                            img_answ2.setImageResource(array.smallnum[answer2 / 100 % 10]);
                            img_answ3.setImageResource(array.smallnum[answer2 / 10 % 10]);
                            img_answ4.setImageResource(array.smallnum[answer2 % 10]);

                            img_answ5.setImageResource(array.smallnum[answer1 / 1000]);
                            img_answ6.setImageResource(array.smallnum[answer1 / 100 % 10]);
                            img_answ7.setImageResource(array.smallnum[answer1 / 10 % 10]);
                            img_answ8.setImageResource(array.smallnum[answer1 % 10]);

                            answer3 = ans3.nextInt(1000);
                            img_answ9.setImageResource(array.smallnum[answer3 / 1000]);
                            img_answ10.setImageResource(array.smallnum[answer3 / 100 % 10]);
                            img_answ11.setImageResource(array.smallnum[answer3 / 10 % 10]);
                            img_answ12.setImageResource(array.smallnum[answer3 % 10]);

                            answer4 = ans4.nextInt(1000);
                            img_answ13.setImageResource(array.smallnum[answer4 / 1000]);
                            img_answ14.setImageResource(array.smallnum[answer4 / 100 % 10]);
                            img_answ15.setImageResource(array.smallnum[answer4 / 10 % 10]);
                            img_answ16.setImageResource(array.smallnum[answer4 % 10]);
                        } else if (rightAns == 2) {
                            answer2 = ans2.nextInt(1000);
                            img_answ1.setImageResource(array.smallnum[answer2 / 1000]);
                            img_answ2.setImageResource(array.smallnum[answer2 / 100 % 10]);
                            img_answ3.setImageResource(array.smallnum[answer2 / 10 % 10]);
                            img_answ4.setImageResource(array.smallnum[answer2 % 10]);

                            answer3 = ans3.nextInt(1000);
                            img_answ5.setImageResource(array.smallnum[answer3 / 1000]);
                            img_answ6.setImageResource(array.smallnum[answer3 / 100 % 10]);
                            img_answ7.setImageResource(array.smallnum[answer3 / 10 % 10]);
                            img_answ8.setImageResource(array.smallnum[answer3 % 10]);

                            img_answ9.setImageResource(array.smallnum[answer1 / 1000]);
                            img_answ10.setImageResource(array.smallnum[answer1 / 100 % 10]);
                            img_answ11.setImageResource(array.smallnum[answer1 / 10 % 10]);
                            img_answ12.setImageResource(array.smallnum[answer1 % 10]);

                            answer4 = ans4.nextInt(1000);
                            img_answ13.setImageResource(array.smallnum[answer4 / 1000]);
                            img_answ14.setImageResource(array.smallnum[answer4 / 100 % 10]);
                            img_answ15.setImageResource(array.smallnum[answer4 / 10 % 10]);
                            img_answ16.setImageResource(array.smallnum[answer4 % 10]);
                        } else {
                            answer2 = ans2.nextInt(1000);
                            img_answ1.setImageResource(array.smallnum[answer2 / 1000]);
                            img_answ2.setImageResource(array.smallnum[answer2 / 100 % 10]);
                            img_answ3.setImageResource(array.smallnum[answer2 / 10 % 10]);
                            img_answ4.setImageResource(array.smallnum[answer2 % 10]);

                            answer3 = ans3.nextInt(1000);
                            img_answ5.setImageResource(array.smallnum[answer3 / 1000]);
                            img_answ6.setImageResource(array.smallnum[answer3 / 100 % 10]);
                            img_answ7.setImageResource(array.smallnum[answer3 / 10 % 10]);
                            img_answ8.setImageResource(array.smallnum[answer3 % 10]);

                            answer4 = ans4.nextInt(1000);
                            img_answ9.setImageResource(array.smallnum[answer4 / 1000]);
                            img_answ10.setImageResource(array.smallnum[answer4 / 100 % 10]);
                            img_answ11.setImageResource(array.smallnum[answer4 / 10 % 10]);
                            img_answ12.setImageResource(array.smallnum[answer4 % 10]);

                            img_answ13.setImageResource(array.smallnum[answer1 / 1000]);
                            img_answ14.setImageResource(array.smallnum[answer1 / 100 % 10]);
                            img_answ15.setImageResource(array.smallnum[answer1 / 10 % 10]);
                            img_answ16.setImageResource(array.smallnum[answer1 % 10]);
                        }

                        img_answ1.setEnabled(true);
                        img_answ2.setEnabled(true);
                        img_answ3.setEnabled(true);
                        img_answ4.setEnabled(true);
                        img_answ5.setEnabled(true);
                        img_answ6.setEnabled(true);
                        img_answ7.setEnabled(true);
                        img_answ8.setEnabled(true);
                        img_answ9.setEnabled(true);
                        img_answ10.setEnabled(true);
                        img_answ11.setEnabled(true);
                        img_answ12.setEnabled(true);
                    }
                }
                return true;
            }
        });
        img_answ16.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    img_answ1.setEnabled(false);
                    img_answ2.setEnabled(false);
                    img_answ3.setEnabled(false);
                    img_answ4.setEnabled(false);
                    img_answ5.setEnabled(false);
                    img_answ6.setEnabled(false);
                    img_answ7.setEnabled(false);
                    img_answ8.setEnabled(false);
                    img_answ9.setEnabled(false);
                    img_answ10.setEnabled(false);
                    img_answ11.setEnabled(false);
                    img_answ12.setEnabled(false);
                    if(rightAns == 3) {
                        img_answ13.setImageResource(R.drawable.img_true);
                        img_answ14.setImageResource(R.drawable.img_true);
                        img_answ15.setImageResource(R.drawable.img_true);
                        img_answ16.setImageResource(R.drawable.img_true);
                    } else{
                        img_answ13.setImageResource(R.drawable.img_false);
                        img_answ14.setImageResource(R.drawable.img_false);
                        img_answ15.setImageResource(R.drawable.img_false);
                        img_answ16.setImageResource(R.drawable.img_false);

                    }
                } else if(motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    if(rightAns == 3) {
                        if(count < 20) {
                            count++;
                        }

                        for (int i = 0; i < 20; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points);
                        }

                        for(int i = 0; i < count; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points_green);
                        }

                    } else {
                        if(count > 0) {
                            if(count == 1) {
                                count = 0;
                            } else {
                                count -= 2;
                            }
                        }
                        for (int i = 0; i < 19; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points);
                        }

                        for(int i = 0; i < count; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points_green);
                        }
                    }
                    if(count == 20) {
                        dialogEnd2.show();
                        sound.stop();
                    } else{
                        numLeft1 = a1.nextInt(10);
                        numLeft2 = a2.nextInt(10);
                        numRight1 = b1.nextInt(10);
                        numRight2 = b2.nextInt(10);
                        znak1 = znak.nextInt(3);
                        img_znak1.setImageResource(array.znaki[znak1]);
                        while (((numLeft1 * 10 + numLeft2) < (numRight1 * 10 + numRight2)) && (znak1 == 1)) {
                            numLeft1 = a1.nextInt(10);
                            numLeft2 = a2.nextInt(10);
                            numRight1 = b1.nextInt(10);
                            numRight2 = b2.nextInt(10);
                        }
                        img_left1.setImageResource(array.smallnum[numLeft1]);
                        img_left2.setImageResource(array.smallnum[numLeft2]);
                        img_right1.setImageResource(array.smallnum[numRight1]);
                        img_right2.setImageResource(array.smallnum[numRight2]);

                        rightAns = trueAns.nextInt(4);

                        // вычисление и вывод ответов на экран - начало

                        if (znak1 == 0)
                            answer1 = (numLeft1 * 10 + numLeft2) + (numRight1 * 10 + numRight2);
                        else if (znak1 == 2)
                            answer1 = (numLeft1 * 10 + numLeft2) * (numRight1 * 10 + numRight2);
                        else {
                            answer1 = (numLeft1 * 10 + numLeft2) - (numRight1 * 10 + numRight2);
                        }

                        if (rightAns == 0) {

                            img_answ1.setImageResource(array.smallnum[answer1 / 1000]);
                            img_answ2.setImageResource(array.smallnum[answer1 / 100 % 10]);
                            img_answ3.setImageResource(array.smallnum[answer1 / 10 % 10]);
                            img_answ4.setImageResource(array.smallnum[answer1 % 10]);

                            answer2 = ans2.nextInt(1000);
                            img_answ5.setImageResource(array.smallnum[answer2 / 1000]);
                            img_answ6.setImageResource(array.smallnum[answer2 / 100 % 10]);
                            img_answ7.setImageResource(array.smallnum[answer2 / 10 % 10]);
                            img_answ8.setImageResource(array.smallnum[answer2 % 10]);

                            answer3 = ans3.nextInt(1000);
                            img_answ9.setImageResource(array.smallnum[answer3 / 1000]);
                            img_answ10.setImageResource(array.smallnum[answer3 / 100 % 10]);
                            img_answ11.setImageResource(array.smallnum[answer3 / 10 % 10]);
                            img_answ12.setImageResource(array.smallnum[answer3 % 10]);

                            answer4 = ans4.nextInt(1000);
                            img_answ13.setImageResource(array.smallnum[answer4 / 1000]);
                            img_answ14.setImageResource(array.smallnum[answer4 / 100 % 10]);
                            img_answ15.setImageResource(array.smallnum[answer4 / 10 % 10]);
                            img_answ16.setImageResource(array.smallnum[answer4 % 10]);

                        } else if (rightAns == 1) {
                            answer2 = ans2.nextInt(1000);
                            img_answ1.setImageResource(array.smallnum[answer2 / 1000]);
                            img_answ2.setImageResource(array.smallnum[answer2 / 100 % 10]);
                            img_answ3.setImageResource(array.smallnum[answer2 / 10 % 10]);
                            img_answ4.setImageResource(array.smallnum[answer2 % 10]);

                            img_answ5.setImageResource(array.smallnum[answer1 / 1000]);
                            img_answ6.setImageResource(array.smallnum[answer1 / 100 % 10]);
                            img_answ7.setImageResource(array.smallnum[answer1 / 10 % 10]);
                            img_answ8.setImageResource(array.smallnum[answer1 % 10]);

                            answer3 = ans3.nextInt(1000);
                            img_answ9.setImageResource(array.smallnum[answer3 / 1000]);
                            img_answ10.setImageResource(array.smallnum[answer3 / 100 % 10]);
                            img_answ11.setImageResource(array.smallnum[answer3 / 10 % 10]);
                            img_answ12.setImageResource(array.smallnum[answer3 % 10]);

                            answer4 = ans4.nextInt(1000);
                            img_answ13.setImageResource(array.smallnum[answer4 / 1000]);
                            img_answ14.setImageResource(array.smallnum[answer4 / 100 % 10]);
                            img_answ15.setImageResource(array.smallnum[answer4 / 10 % 10]);
                            img_answ16.setImageResource(array.smallnum[answer4 % 10]);
                        } else if (rightAns == 2) {
                            answer2 = ans2.nextInt(1000);
                            img_answ1.setImageResource(array.smallnum[answer2 / 1000]);
                            img_answ2.setImageResource(array.smallnum[answer2 / 100 % 10]);
                            img_answ3.setImageResource(array.smallnum[answer2 / 10 % 10]);
                            img_answ4.setImageResource(array.smallnum[answer2 % 10]);

                            answer3 = ans3.nextInt(1000);
                            img_answ5.setImageResource(array.smallnum[answer3 / 1000]);
                            img_answ6.setImageResource(array.smallnum[answer3 / 100 % 10]);
                            img_answ7.setImageResource(array.smallnum[answer3 / 10 % 10]);
                            img_answ8.setImageResource(array.smallnum[answer3 % 10]);

                            img_answ9.setImageResource(array.smallnum[answer1 / 1000]);
                            img_answ10.setImageResource(array.smallnum[answer1 / 100 % 10]);
                            img_answ11.setImageResource(array.smallnum[answer1 / 10 % 10]);
                            img_answ12.setImageResource(array.smallnum[answer1 % 10]);

                            answer4 = ans4.nextInt(1000);
                            img_answ13.setImageResource(array.smallnum[answer4 / 1000]);
                            img_answ14.setImageResource(array.smallnum[answer4 / 100 % 10]);
                            img_answ15.setImageResource(array.smallnum[answer4 / 10 % 10]);
                            img_answ16.setImageResource(array.smallnum[answer4 % 10]);
                        } else {
                            answer2 = ans2.nextInt(1000);
                            img_answ1.setImageResource(array.smallnum[answer2 / 1000]);
                            img_answ2.setImageResource(array.smallnum[answer2 / 100 % 10]);
                            img_answ3.setImageResource(array.smallnum[answer2 / 10 % 10]);
                            img_answ4.setImageResource(array.smallnum[answer2 % 10]);

                            answer3 = ans3.nextInt(1000);
                            img_answ5.setImageResource(array.smallnum[answer3 / 1000]);
                            img_answ6.setImageResource(array.smallnum[answer3 / 100 % 10]);
                            img_answ7.setImageResource(array.smallnum[answer3 / 10 % 10]);
                            img_answ8.setImageResource(array.smallnum[answer3 % 10]);

                            answer4 = ans4.nextInt(1000);
                            img_answ9.setImageResource(array.smallnum[answer4 / 1000]);
                            img_answ10.setImageResource(array.smallnum[answer4 / 100 % 10]);
                            img_answ11.setImageResource(array.smallnum[answer4 / 10 % 10]);
                            img_answ12.setImageResource(array.smallnum[answer4 % 10]);

                            img_answ13.setImageResource(array.smallnum[answer1 / 1000]);
                            img_answ14.setImageResource(array.smallnum[answer1 / 100 % 10]);
                            img_answ15.setImageResource(array.smallnum[answer1 / 10 % 10]);
                            img_answ16.setImageResource(array.smallnum[answer1 % 10]);
                        }

                        img_answ1.setEnabled(true);
                        img_answ2.setEnabled(true);
                        img_answ3.setEnabled(true);
                        img_answ4.setEnabled(true);
                        img_answ5.setEnabled(true);
                        img_answ6.setEnabled(true);
                        img_answ7.setEnabled(true);
                        img_answ8.setEnabled(true);
                        img_answ9.setEnabled(true);
                        img_answ10.setEnabled(true);
                        img_answ11.setEnabled(true);
                        img_answ12.setEnabled(true);
                    }
                }
                return true;
            }
        });
            //четвертая кнопка - конец

        }

    private void soundPlayButton(MediaPlayer sound) {
        if(sound.isPlaying()) {
            sound.stop();
        }
        sound.start();
        sound.setLooping(true);
        sound.seekTo(10000);
    }


    public void onBackPressed(){
        try {
            Intent intent = new Intent(Level2.this, GameLevels.class);
            startActivity(intent);
            finish();
        } catch(Exception e) {

        }
    }


}

