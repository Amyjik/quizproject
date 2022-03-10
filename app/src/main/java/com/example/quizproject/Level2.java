package com.example.quizproject;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
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
    Dialog dialogEnd;

    public int numLeft1 = 0;
    public int numLeft2 = 0;
    public int numRight1 = 0;
    public int numRight2 = 0;
    public int znak1 = 0;
    public int answer1 = 0;
    public int answer2 = 0;
    public int answer3 = 0;
    public int answer4 = 0;
    Array array = new Array();
    Random a1 = new Random();
    Random a2 = new Random();
    Random b1 = new Random();
    Random b2 = new Random();
    Random znak = new Random();
    Random ans2 = new Random();
    Random ans3 = new Random();
    Random ans4 = new Random();
    public int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.universal2);

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
        img_answ1.setClipToOutline(true);

        final ImageView img_answ2 = (ImageView) findViewById(R.id.img_answ2);
        img_answ2.setClipToOutline(true);

        final ImageView img_answ3 = (ImageView) findViewById(R.id.img_answ3);
        img_answ3.setClipToOutline(true);

        final ImageView img_answ4 = (ImageView) findViewById(R.id.img_answ4);
        img_answ4.setClipToOutline(true);


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
        dialogEnd = new Dialog(this);
        dialogEnd.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialogEnd.setContentView(R.layout.dialogend);
        dialogEnd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialogEnd.getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.MATCH_PARENT);
        dialogEnd.setCancelable(false);

        TextView btnclose2 = (TextView) dialogEnd.findViewById(R.id.btnclose);
        btnclose2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(com.example.quizproject.Level2.this, GameLevels.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {

                }
                dialogEnd.dismiss();
            }
        });

        Button btncontinue2 = (Button) dialogEnd.findViewById(R.id.btncontinue);
        btncontinue2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(com.example.quizproject.Level2.this, Level2.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {

                }
                dialogEnd.dismiss();
            }
        });


        //______________________________________________________________________________________________________________________________________________________________

        Button btn_back = (Button) findViewById(R.id.button_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
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



            numLeft1 = a1.nextInt(10);
            img_left1.setImageResource(array.images1[numLeft1]);

            numLeft2 = a2.nextInt(10);
            img_left2.setImageResource(array.images1[numLeft2]);

            numRight1 = b1.nextInt(10);
            img_right1.setImageResource(array.images1[numRight1]);

            numRight2 = b2.nextInt(10);
            img_right2.setImageResource(array.images1[numRight2]);

            //znak1 = znak.nextInt(3);
            znak1=2;
            img_znak1.setImageResource(array.znaki[znak1]);



            if (znak1 == 0)
                answer1 = (numLeft1 * 10 + numLeft2) + (numRight1 * 10 + numRight2);
            else if (znak1 == 2)
                answer1 = (numLeft1 * 10 + numLeft2) * (numRight1 * 10 + numRight2);
            else



            img_answ1.setImageResource(array.images1[answer1/1000]);
            img_answ2.setImageResource(array.images1[answer1/100%10]);
            img_answ3.setImageResource(array.images1[answer1/10%10]);
            img_answ4.setImageResource(array.images1[answer1%10]);

           /* answer2 = ans2.nextInt(200);

            img_answ2.setImageResource(array.images1[answer2/10%10]);

            answer3 = ans3.nextInt(200);

            img_answ3.setImageResource(answer3);

            answer4 = ans4.nextInt(200);

            img_answ4.setImageResource(answer4);


            //левая кнопка - начало

            //левая кнопка - конец

            //правая кнопка - начало

            //правая кнопка - конец

        } */


    }
}