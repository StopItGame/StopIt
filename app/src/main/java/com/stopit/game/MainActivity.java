package com.stopit.game;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.stopit.game.support.SharedPrefs;


public class MainActivity extends Activity implements View.OnClickListener {

    private static final String TAG = "MainActivity";
    private static int gameSpeed;
    private static int gameSet;
    private static int gameLevel;
    private static int targetCount;
    private static int target4StarMaxDiff;
    private static int target4StarMinDiff;
    private static int target3StarMaxDiff;
    private static int target3StarMinDiff;
    private static int target2StarMaxDiff;
    private static int target2StarMinDiff;
    private static int target1StarMaxDiff;
    private static int target1StarMinDiff;
    private CountDownTimer timer;
    private int count;
    private TextView countTextThousand;
    private TextView countTextHundred;
    private TextView countTextTen;
    private TextView countTextUnit;
    private ImageButton stopRestartButton;
    private ImageButton nextLevelButton;
    private boolean isGameFinished;
    private TextView setText;
    private TextView levelText;
    private ImageView starsImage;
    private TextView targetText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setText = (TextView) findViewById(R.id.activity_main_textview_set);
        levelText = (TextView) findViewById(R.id.activity_main_textview_level);
        targetText = (TextView) findViewById(R.id.activity_main_textview_target);
        starsImage = (ImageView) findViewById(R.id.activity_main_imageview_stars);
        stopRestartButton = (ImageButton) findViewById(R.id.activity_main_button_stopRestart);
        stopRestartButton.setOnClickListener(this);
        stopRestartButton.setImageDrawable(getResources().getDrawable(R.drawable.stop_button));
        nextLevelButton = (ImageButton) findViewById(R.id.activity_main_button_nextLevel);
        nextLevelButton.setOnClickListener(this);
        nextLevelButton.setVisibility(View.GONE);
        countTextThousand = (TextView) findViewById(R.id.activity_main_textview_thousand);
        countTextHundred = (TextView) findViewById(R.id.activity_main_textview_hundred);
        countTextTen = (TextView) findViewById(R.id.activity_main_textview_ten);
        countTextUnit = (TextView) findViewById(R.id.activity_main_textview_unit);
        Typeface tf = Typeface.createFromAsset(getAssets(), "digital.ttf");
        countTextThousand.setTypeface(tf);
        countTextHundred.setTypeface(tf);
        countTextTen.setTypeface(tf);
        countTextUnit.setTypeface(tf);
        setText.setTypeface(tf);
        levelText.setTypeface(tf);
        targetText.setTypeface(tf);
        starsImage.setImageDrawable(getResources().getDrawable(R.drawable.zero_star));
        getGameConfiguration();
        setText.setText("SET - " + gameSet);
        levelText.setText("LEVEL - " + gameLevel);
        targetText.setText("TARGET - " + targetCount);
        startNewGame();
    }

    private void getGameConfiguration() {

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey("SET")) {
                gameSet = extras.getInt("SET");
            } else {
                gameSet = 1;
            }
            if (extras.containsKey("LEVEL")) {
                gameLevel = extras.getInt("LEVEL");
            } else {
                gameLevel = 1;
            }
        } else {
            gameSet = 1;
            gameLevel = 1;
        }
        gameSpeed = SharedPrefs.getInt("GAME_SPEED_" + gameSet + "_" + gameLevel, 250, getApplicationContext());
        targetCount = SharedPrefs.getInt("GAME_TARGET_" + gameSet + "_" + gameLevel, 30, getApplicationContext());
        target4StarMaxDiff = SharedPrefs.getInt("GAME_4_STAR_MAX_" + gameSet + "_" + gameLevel, 1, getApplicationContext());
        target4StarMinDiff = SharedPrefs.getInt("GAME_4_STAR_MIN_" + gameSet + "_" + gameLevel, 1, getApplicationContext());
        target3StarMaxDiff = SharedPrefs.getInt("GAME_3_STAR_MAX_" + gameSet + "_" + gameLevel, 3, getApplicationContext());
        target3StarMinDiff = SharedPrefs.getInt("GAME_3_STAR_MIN_" + gameSet + "_" + gameLevel, 2, getApplicationContext());
        target2StarMaxDiff = SharedPrefs.getInt("GAME_2_STAR_MAX_" + gameSet + "_" + gameLevel, 5, getApplicationContext());
        target2StarMinDiff = SharedPrefs.getInt("GAME_2_STAR_MIN_" + gameSet + "_" + gameLevel, 4, getApplicationContext());
        target1StarMaxDiff = SharedPrefs.getInt("GAME_1_STAR_MAX_" + gameSet + "_" + gameLevel, 10, getApplicationContext());
        target1StarMinDiff = SharedPrefs.getInt("GAME_1_STAR_MIN_" + gameSet + "_" + gameLevel, 6, getApplicationContext());

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == stopRestartButton.getId()) {
            if (isGameFinished) {
                Bundle extras = new Bundle();
                extras.putInt("SET", gameSet);
                extras.putInt("LEVEL", gameLevel);
                Intent gameActivity = new Intent(getApplicationContext(), MainActivity.class);
                gameActivity.putExtras(extras);
                startActivity(gameActivity);
                this.finish();
            } else {
                timer.cancel();
                isGameFinished = true;
                stopRestartButton.setImageDrawable(getResources().getDrawable(R.drawable.try_again_button));
                nextLevelButton.setVisibility(View.VISIBLE);
                finishGame();
            }
        }
        if (v.getId() == nextLevelButton.getId()) {
            if (gameLevel < 15) {
                Bundle extras = new Bundle();
                extras.putInt("SET", gameSet);
                extras.putInt("LEVEL", gameLevel + 1);
                Intent gameActivity = new Intent(getApplicationContext(), MainActivity.class);
                gameActivity.putExtras(extras);
                startActivity(gameActivity);
                this.finish();
            } else {
                startActivity(new Intent(getApplicationContext(), StartActivity.class));
            }
        }
    }

    private void finishGame() {
        int stars = calculateStars();
        Toast.makeText(getApplicationContext(), "Stars = " + stars, Toast.LENGTH_SHORT).show();
        SharedPrefs.setInt(gameSet + "_" + gameLevel, stars, getApplicationContext());
        if (stars == 0) {
            nextLevelButton.setClickable(false);
        }
    }

    private int calculateStars() {

        int difference = Math.abs(count - targetCount);
        int stars;
        if (difference == 0) {
            stars = 5;
            starsImage.setImageDrawable(getResources().getDrawable(R.drawable.five_star));
        } else if (difference >= target4StarMinDiff && difference <= target4StarMaxDiff) {
            stars = 4;
            starsImage.setImageDrawable(getResources().getDrawable(R.drawable.four_star));
        } else if (difference >= target3StarMinDiff && difference <= target3StarMaxDiff) {
            stars = 3;
            starsImage.setImageDrawable(getResources().getDrawable(R.drawable.three_star));
        } else if (difference >= target2StarMinDiff && difference <= target2StarMaxDiff) {
            stars = 2;
            starsImage.setImageDrawable(getResources().getDrawable(R.drawable.two_star));
        } else if (difference >= target1StarMinDiff && difference <= target1StarMaxDiff) {
            stars = 1;
            starsImage.setImageDrawable(getResources().getDrawable(R.drawable.one_star));
        } else {
            stars = 0;
            starsImage.setImageDrawable(getResources().getDrawable(R.drawable.zero_star));
        }

        return stars;

    }

    private void startNewGame() {
        countTextThousand.setText("0");
        countTextHundred.setText("0");
        countTextTen.setText("0");
        countTextUnit.setText("0");
        timer = new CountDownTimer(10 * 60 * 1000, gameSpeed) {
            @Override
            public void onTick(long millisUntilFinished) {
                count++;
                if (count < 10000) {
                    int unit = count % 10;
                    int ten = (count / 10) % 10;
                    int hundred = (count / 100) % 10;
                    int thousand = (count / 1000);
                    countTextThousand.setText(thousand + "");
                    countTextHundred.setText(hundred + "");
                    countTextTen.setText(ten + "");
                    countTextUnit.setText(unit + "");
                }
            }

            @Override
            public void onFinish() {

            }
        };
        isGameFinished = false;
        timer.start();
    }
}
