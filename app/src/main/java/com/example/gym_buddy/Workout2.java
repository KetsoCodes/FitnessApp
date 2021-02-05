package com.example.gym_buddy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Workout2 extends AppCompatActivity {

    TextView blevelTitle, bAbsOneTitle, bAbsOneDesc, bAbsTwoTitle, bAbsTwoDesc,
             ilevelTitle, iAbsOneTitle, iAbsOneDesc;


    Animation bttone, bttwo, btthree, bttfour, bttfive;

    LinearLayout bAbsOne, bAbsTwo, iAbsOne;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout2);

        bttone = AnimationUtils.loadAnimation(this, R.anim.bttone);
        bttwo = AnimationUtils.loadAnimation(this, R.anim.bttwo);
        btthree = AnimationUtils.loadAnimation(this, R.anim.btthree);
        bttfour = AnimationUtils.loadAnimation(this, R.anim.bttfour);
        bttfive = AnimationUtils.loadAnimation(this, R.anim.bttfive);



        blevelTitle = (TextView) findViewById(R.id.blevelTitle);
        bAbsOneTitle = (TextView) findViewById(R.id.bAbsOneTitle);
        bAbsOneDesc = (TextView) findViewById(R.id.bAbsOneDesc);
        bAbsTwoTitle = (TextView) findViewById(R.id.bAbsTwoTitle);
        bAbsTwoDesc = (TextView) findViewById(R.id.bAbsTwoDesc);
        ilevelTitle = (TextView) findViewById(R.id.ilevelTitle);
        iAbsOneTitle = (TextView) findViewById(R.id.iAbsOneTitle);
        iAbsOneDesc = (TextView) findViewById(R.id.iAbsOneDesc);


        bAbsOne = (LinearLayout) findViewById(R.id.bAbsOne);
        bAbsTwo = (LinearLayout) findViewById(R.id.bAbsTwo);

        iAbsOne = (LinearLayout) findViewById(R.id.iAbsOne);


        blevelTitle.startAnimation(bttone);
        ilevelTitle.startAnimation(bttwo);


        bAbsOne.startAnimation(bttwo);
        bAbsTwo.startAnimation(bttfour);

        iAbsOne.startAnimation(bttwo);



    }
}