package com.example.gym_buddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class WorkoutAct extends AppCompatActivity implements View.OnClickListener {

    TextView titlepage, intropage, subintropage, btnextexecise, fitonetitle, fitonedesc,
    fittwotitle, fittwodesc, fitthreetitle, fitthreedesc, fitfourtitle, fitfourdesc;

    View divpage;

    Animation bttone, bttwo, btthree, bttfour, bttfive, bttsix, bttseven;

    LinearLayout fitone, fittwo, fitthree, fitfour;

    private Button logout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);
        //load animation
        bttone = AnimationUtils.loadAnimation(this,R.anim.bttone);
        bttwo = AnimationUtils.loadAnimation(this,R.anim.bttwo);
        btthree = AnimationUtils.loadAnimation(this,R.anim.btthree);
        bttfour = AnimationUtils.loadAnimation(this,R.anim.bttfour);
        bttfive = AnimationUtils.loadAnimation(this,R.anim.bttfive);
        bttsix = AnimationUtils.loadAnimation(this,R.anim.bttsix);
        bttseven = AnimationUtils.loadAnimation(this,R.anim.bttseven);


        titlepage = (TextView) findViewById(R.id.titlepage);
        intropage = (TextView) findViewById(R.id.intropage);
        subintropage = (TextView) findViewById(R.id.subintropage);
        btnextexecise = (TextView) findViewById(R.id.btnextexecise );
        fitonetitle = (TextView) findViewById(R.id.fitonetitle);
        fitonedesc = (TextView) findViewById(R.id.fitonedesc);
        fittwotitle = (TextView) findViewById(R.id.fittwotitle);
        fittwodesc = (TextView) findViewById(R.id.fitwodesc );
        fitthreetitle = (TextView) findViewById(R.id.fitthreetitle);
        fitthreedesc = (TextView) findViewById(R.id.fitthreedesc);
        fitfourtitle = (TextView) findViewById(R.id.fitfourtitle);
        fitfourdesc = (TextView) findViewById(R.id.fitfourdesc );

        fitone = (LinearLayout) findViewById(R.id.fitone );
        fittwo = (LinearLayout) findViewById(R.id.fittwo);
        fitthree = (LinearLayout) findViewById(R.id.fitthree);
        fitfour = (LinearLayout) findViewById(R.id.fitfour);


        divpage  = (View) findViewById(R.id.divpage );

        logout  = (Button) findViewById(R.id.signOut );

        //assigning animation
        titlepage.startAnimation(bttone);
        intropage.startAnimation(bttwo);
        subintropage.startAnimation(bttwo);

        intropage.startAnimation(bttwo);
        subintropage.startAnimation(bttwo);

        divpage.startAnimation(bttone);

        fitone.startAnimation(bttwo);
        fittwo.startAnimation(bttfour);
        fitthree.startAnimation(bttfive);
        fitfour.startAnimation(bttsix);

        logout.startAnimation(bttseven);

        btnextexecise.startAnimation(bttseven);

        fitone = (LinearLayout) findViewById(R.id.fitone);
        fitone.setOnClickListener(this);

        fittwo = (LinearLayout) findViewById(R.id.fittwo);
        fittwo.setOnClickListener(this);

        fitthree = (LinearLayout) findViewById(R.id.fitthree);
        fitthree.setOnClickListener(this);

        fitfour = (LinearLayout) findViewById(R.id.fitfour);
        fitfour.setOnClickListener(this);

        btnextexecise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(WorkoutAct.this,Workout2.class);
                a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(a);
            }
        });

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseAuth.getInstance().signOut();
                Intent a = new Intent(WorkoutAct.this,MainActivity.class);
                a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(a);
            }
        });



    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.fitone:
                startActivity(new Intent(this, Chest.class));
                break;
            case R.id.fittwo:
                startActivity(new Intent(this, Arms.class));
                break;
            case R.id.fitthree:
                startActivity(new Intent(this, AbsPage.class));
                break;
            case R.id.fitfour:
                startActivity(new Intent(this, Back.class));
                break;

        }

    }
}