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

public class Plank extends AppCompatActivity {

    TextView instructTitle, instructions, fittitle, instTitle, fitdesc, timerValue, btNextExercise;

    View divpage;

    LinearLayout fit;

    private static final long START_TIME_IN_MILLIS = 60000;
    private static CountDownTimer countDownTimer;
    private boolean mTimerRunning;
    private long mTimeLeftInMills = START_TIME_IN_MILLIS;

    Animation ttbone, ttbtwo, alphago, bttwo, btthree, bttfour, bttfive, bttsix, bttseven;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plank);

        ttbone = AnimationUtils.loadAnimation(this, R.anim.ttbone);
        ttbtwo = AnimationUtils.loadAnimation(this, R.anim.ttbtwo);
        alphago = AnimationUtils.loadAnimation(this, R.anim.alphago);
        bttwo = AnimationUtils.loadAnimation(this, R.anim.bttwo);
        btthree = AnimationUtils.loadAnimation(this, R.anim.btthree);
        bttfour = AnimationUtils.loadAnimation(this, R.anim.bttfour);
        bttfive = AnimationUtils.loadAnimation(this, R.anim.bttfive);
        bttsix = AnimationUtils.loadAnimation(this, R.anim.bttsix);
        bttseven = AnimationUtils.loadAnimation(this, R.anim.bttseven);


        instructTitle = (TextView) findViewById(R.id.instructTitlePlanks);
        instructions = (TextView) findViewById(R.id.instructionsPlanks);
        fittitle = (TextView) findViewById(R.id.fittitlePlanks);
        instTitle = (TextView) findViewById(R.id.instTitlePlanks);
        fitdesc = (TextView) findViewById(R.id.fitdescPlanks);
        timerValue = (TextView) findViewById(R.id.timerValuePlanks);
        btNextExercise = (TextView) findViewById(R.id.btNextExercisePlanks);

        divpage = (View) findViewById(R.id.divpagePlanks);
        fit = (LinearLayout) findViewById(R.id.fitPlanks);





        //assigning animation
        btNextExercise.startAnimation(ttbtwo);
        instructions.startAnimation(ttbtwo);
        fittitle.startAnimation(ttbone);
        instTitle.startAnimation(ttbtwo);
        divpage.startAnimation(alphago);
        fitdesc.startAnimation(bttfive);
        timerValue.startAnimation(bttsix);
        btNextExercise.startAnimation(bttseven);

        startTimer();

        btNextExercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Plank.this,Climbers.class);
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
        timerValue.setText(timeLeft);
    }

}