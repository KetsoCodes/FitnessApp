package com.example.gym_buddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class AbsPage extends AppCompatActivity implements View.OnClickListener {

    TextView blevelTitle, bAbsOneTitle, bAbsOneDesc, bAbsTwoTitle, bAbsTwoDesc,
            bAbsThreeTitle, bAbsThreeDesc, ilevelTitle,  iAbsOneTitle, iAbsOneDesc
            ,iAbsTwoTitle, iAbsTwoDesc, iAbsThreeTitle, iAbsThreeDesc;



    Animation bttone, bttwo, btthree, bttfour, bttfive, bttsix, bttseven;

    LinearLayout bAbsOne, bAbsTwo, bAbsThree, iAbsOne, iAbsTwo, iAbsThree, pAbsOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abs_page);

        bttone = AnimationUtils.loadAnimation(this,R.anim.bttone);
        bttwo = AnimationUtils.loadAnimation(this,R.anim.bttwo);
        btthree = AnimationUtils.loadAnimation(this,R.anim.btthree);
        bttfour = AnimationUtils.loadAnimation(this,R.anim.bttfour);
        bttfive = AnimationUtils.loadAnimation(this,R.anim.bttfive);
        bttsix = AnimationUtils.loadAnimation(this,R.anim.bttsix);
        bttseven = AnimationUtils.loadAnimation(this,R.anim.bttseven);


        blevelTitle = (TextView) findViewById(R.id.blevelTitle);
        bAbsOneTitle = (TextView) findViewById(R.id.bAbsOneTitle);
        bAbsOneDesc = (TextView) findViewById(R.id.bAbsOneDesc);
        bAbsTwoTitle = (TextView) findViewById(R.id.bAbsTwoTitle );
        bAbsTwoDesc = (TextView) findViewById(R.id.bAbsTwoDesc);
        bAbsThreeTitle = (TextView) findViewById(R.id.bAbsThreeTitle);
        bAbsThreeDesc = (TextView) findViewById(R.id.bAbsThreeDesc);
        ilevelTitle = (TextView) findViewById(R.id.ilevelTitle );
        iAbsOneTitle = (TextView) findViewById(R.id.iAbsOneTitle);
        iAbsOneDesc = (TextView) findViewById(R.id.iAbsOneDesc);
        iAbsTwoTitle = (TextView) findViewById(R.id.iAbsTwoTitle);
        iAbsTwoDesc = (TextView) findViewById(R.id.iAbsTwoDesc);
        iAbsThreeTitle = (TextView) findViewById(R.id.iAbsThreeTitle );
        iAbsThreeDesc = (TextView) findViewById(R.id.iAbsThreeDesc );

        bAbsOne = (LinearLayout) findViewById(R.id.bAbsOne );
        bAbsTwo = (LinearLayout) findViewById(R.id.bAbsTwo);
        bAbsThree = (LinearLayout) findViewById(R.id.bAbsThree);
        iAbsOne = (LinearLayout) findViewById(R.id.iAbsOne );
        iAbsTwo = (LinearLayout) findViewById(R.id.iAbsTwo);
        iAbsThree = (LinearLayout) findViewById(R.id.iAbsThree);
        pAbsOne = (LinearLayout) findViewById(R.id.pAbsOne);


        blevelTitle.startAnimation(bttone);
        ilevelTitle.startAnimation(bttwo);


        bAbsOne.startAnimation(bttwo);
        bAbsTwo.startAnimation(bttfour);
        bAbsThree.startAnimation(bttfive);

        iAbsOne.startAnimation(bttwo);
        iAbsTwo.startAnimation(bttfour);
        iAbsThree.startAnimation(bttfive);

        pAbsOne.startAnimation(bttwo);



        bAbsOne = (LinearLayout) findViewById(R.id.bAbsOne);
        bAbsOne.setOnClickListener(this);

        bAbsTwo = (LinearLayout) findViewById(R.id.bAbsTwo);
        bAbsTwo.setOnClickListener(this);

        bAbsThree = (LinearLayout) findViewById(R.id.bAbsThree);
        bAbsThree.setOnClickListener(this);

        iAbsOne = (LinearLayout) findViewById(R.id.iAbsOne);
        iAbsOne.setOnClickListener(this);

        iAbsTwo = (LinearLayout) findViewById(R.id.iAbsTwo);
        iAbsTwo.setOnClickListener(this);

        iAbsThree = (LinearLayout) findViewById(R.id.iAbsThree);
        iAbsThree.setOnClickListener(this);

        pAbsOne = (LinearLayout) findViewById(R.id.pAbsOne);
        pAbsOne.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bAbsOne:
                startActivity(new Intent(this, AbsEngage.class));
                break;
            case R.id.bAbsTwo:
                startActivity(new Intent(this, Plank.class));
                break;
            case R.id.bAbsThree:
                startActivity(new Intent(this, Climbers.class));
                break;
            case R.id.iAbsOne:
                startActivity(new Intent(this, RussianTwist.class));
                break;
            case R.id.iAbsTwo:
                startActivity(new Intent(this, LegRaises.class));
                break;
            case R.id.iAbsThree:
                startActivity(new Intent(this, BicycleCrunches.class));
                break;
            case R.id.pAbsOne:
                startActivity(new Intent(this, VSit.class));
                break;
        }

    }
}