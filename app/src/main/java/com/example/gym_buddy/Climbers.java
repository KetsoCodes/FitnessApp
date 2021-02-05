package com.example.gym_buddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class Climbers extends AppCompatActivity {

    TextView instructTitleClimber, instructionsClimber, fittitleClimber, instTitleClimber, fitdescClimber, timerValueClimber, btNextExerciseClimber;

    View divpageClimber;

    LinearLayout fitClimber;

    private static final long START_TIME_IN_MILLIS = 40000;
    private static CountDownTimer countDownTimer;
    private boolean mTimerRunning;
    private long mTimeLeftInMills = START_TIME_IN_MILLIS;

    Animation ttbone, ttbtwo, alphago, bttwo, btthree, bttfour, bttfive, bttsix, bttseven;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_climbers);

        ttbone = AnimationUtils.loadAnimation(this, R.anim.ttbone);
        ttbtwo = AnimationUtils.loadAnimation(this, R.anim.ttbtwo);
        alphago = AnimationUtils.loadAnimation(this, R.anim.alphago);
        bttwo = AnimationUtils.loadAnimation(this, R.anim.bttwo);
        btthree = AnimationUtils.loadAnimation(this, R.anim.btthree);
        bttfour = AnimationUtils.loadAnimation(this, R.anim.bttfour);
        bttfive = AnimationUtils.loadAnimation(this, R.anim.bttfive);
        bttsix = AnimationUtils.loadAnimation(this, R.anim.bttsix);
        bttseven = AnimationUtils.loadAnimation(this, R.anim.bttseven);


        instructTitleClimber = (TextView) findViewById(R.id.instructTitleClimbers);
        instructionsClimber = (TextView) findViewById(R.id.instructionsClimbers);
        fittitleClimber = (TextView) findViewById(R.id.fittitleClimbers);
        instTitleClimber = (TextView) findViewById(R.id.instTitleClimbers);
        fitdescClimber = (TextView) findViewById(R.id.fitdescClimbers);
        timerValueClimber = (TextView) findViewById(R.id.timerValueClimbers);
        btNextExerciseClimber = (TextView) findViewById(R.id.btNextExerciseClimbers);

        divpageClimber = (View) findViewById(R.id.divpageClimbers);
        fitClimber = (LinearLayout) findViewById(R.id.fitClimbers);





        //assigning animation
        btNextExerciseClimber.startAnimation(ttbtwo);
        instructionsClimber.startAnimation(ttbtwo);
        fittitleClimber.startAnimation(ttbone);
        instTitleClimber.startAnimation(ttbtwo);
        divpageClimber.startAnimation(alphago);
        fitdescClimber.startAnimation(bttfive);
        timerValueClimber.startAnimation(bttsix);
        btNextExerciseClimber.startAnimation(bttseven);

        startTimer();

        btNextExerciseClimber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Climbers.this,RussianTwist.class);
                a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(a);
            }
        });



    }

    private  void startTimer(){
        countDownTimer = new CountDownTimer(mTimeLeftInMills, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                mTimeLeftInMills = millisUntilFinished;
                updateCountDownText();
            }
            @Override
            public void onFinish() {
                for(int i = 0; i < 3; i ++){
                    Toast.makeText(getApplicationContext(), "Well done!", Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), " ", Toast.LENGTH_SHORT).show();
                }
            }
        }.start();
        mTimerRunning = true;
    }

    private void updateCountDownText(){
        int minutes = (int) (mTimeLeftInMills/1000)/60;
        int seconds = (int) (mTimeLeftInMills/1000)%60;

        String timeLeft = String.format(Locale.getDefault(), "%02d:%02d", minutes, seconds);
        timerValueClimber.setText(timeLeft);
    }

}