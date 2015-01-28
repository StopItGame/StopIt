package com.stopit.game;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.stopit.game.support.SharedPrefs;


public class StartActivity extends Activity implements View.OnClickListener {

    private Button play;
    private Button quit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        play = (Button) findViewById(R.id.activity_main_button_play);
        play.setOnClickListener(this);
        quit = (Button) findViewById(R.id.activity_main_button_quit);
        quit.setOnClickListener(this);

        initializeGameConfig();

    }

    private void initializeGameConfig() {

        SharedPrefs.setInt("GAME_SPEED_" + 1 + "_" + 1, 250, getApplicationContext());
        SharedPrefs.setInt("GAME_TARGET_" + 1 + "_" + 1, 30, getApplicationContext());
        SharedPrefs.setInt("GAME_4_STAR_MAX_" + 1 + "_" + 1, 1, getApplicationContext());
        SharedPrefs.setInt("GAME_4_STAR_MIN_" + 1 + "_" + 1, 1, getApplicationContext());
        SharedPrefs.setInt("GAME_3_STAR_MAX_" + 1 + "_" + 1, 3, getApplicationContext());
        SharedPrefs.setInt("GAME_3_STAR_MIN_" + 1 + "_" + 1, 2, getApplicationContext());
        SharedPrefs.setInt("GAME_2_STAR_MAX_" + 1 + "_" + 1, 5, getApplicationContext());
        SharedPrefs.setInt("GAME_2_STAR_MIN_" + 1 + "_" + 1, 4, getApplicationContext());
        SharedPrefs.setInt("GAME_1_STAR_MAX_" + 1 + "_" + 1, 10, getApplicationContext());
        SharedPrefs.setInt("GAME_1_STAR_MIN_" + 1 + "_" + 1, 6, getApplicationContext());
        SharedPrefs.setInt("GAME_SPEED_" + 1 + "_" + 2, 225, getApplicationContext());
        SharedPrefs.setInt("GAME_TARGET_" + 1 + "_" + 2, 30, getApplicationContext());
        SharedPrefs.setInt("GAME_4_STAR_MAX_" + 1 + "_" + 2, 1, getApplicationContext());
        SharedPrefs.setInt("GAME_4_STAR_MIN_" + 1 + "_" + 2, 1, getApplicationContext());
        SharedPrefs.setInt("GAME_3_STAR_MAX_" + 1 + "_" + 2, 3, getApplicationContext());
        SharedPrefs.setInt("GAME_3_STAR_MIN_" + 1 + "_" + 2, 2, getApplicationContext());
        SharedPrefs.setInt("GAME_2_STAR_MAX_" + 1 + "_" + 2, 5, getApplicationContext());
        SharedPrefs.setInt("GAME_2_STAR_MIN_" + 1 + "_" + 2, 4, getApplicationContext());
        SharedPrefs.setInt("GAME_1_STAR_MAX_" + 1 + "_" + 2, 10, getApplicationContext());
        SharedPrefs.setInt("GAME_1_STAR_MIN_" + 1 + "_" + 2, 6, getApplicationContext());
        SharedPrefs.setInt("GAME_SPEED_" + 1 + "_" + 3, 200, getApplicationContext());
        SharedPrefs.setInt("GAME_TARGET_" + 1 + "_" + 3, 30, getApplicationContext());
        SharedPrefs.setInt("GAME_4_STAR_MAX_" + 1 + "_" + 3, 1, getApplicationContext());
        SharedPrefs.setInt("GAME_4_STAR_MIN_" + 1 + "_" + 3, 1, getApplicationContext());
        SharedPrefs.setInt("GAME_3_STAR_MAX_" + 1 + "_" + 3, 3, getApplicationContext());
        SharedPrefs.setInt("GAME_3_STAR_MIN_" + 1 + "_" + 3, 2, getApplicationContext());
        SharedPrefs.setInt("GAME_2_STAR_MAX_" + 1 + "_" + 3, 5, getApplicationContext());
        SharedPrefs.setInt("GAME_2_STAR_MIN_" + 1 + "_" + 3, 4, getApplicationContext());
        SharedPrefs.setInt("GAME_1_STAR_MAX_" + 1 + "_" + 3, 10, getApplicationContext());
        SharedPrefs.setInt("GAME_1_STAR_MIN_" + 1 + "_" + 3, 6, getApplicationContext());
        SharedPrefs.setInt("GAME_SPEED_" + 1 + "_" + 4, 175, getApplicationContext());
        SharedPrefs.setInt("GAME_TARGET_" + 1 + "_" + 4, 50, getApplicationContext());
        SharedPrefs.setInt("GAME_4_STAR_MAX_" + 1 + "_" + 4, 1, getApplicationContext());
        SharedPrefs.setInt("GAME_4_STAR_MIN_" + 1 + "_" + 4, 1, getApplicationContext());
        SharedPrefs.setInt("GAME_3_STAR_MAX_" + 1 + "_" + 4, 3, getApplicationContext());
        SharedPrefs.setInt("GAME_3_STAR_MIN_" + 1 + "_" + 4, 2, getApplicationContext());
        SharedPrefs.setInt("GAME_2_STAR_MAX_" + 1 + "_" + 4, 5, getApplicationContext());
        SharedPrefs.setInt("GAME_2_STAR_MIN_" + 1 + "_" + 4, 4, getApplicationContext());
        SharedPrefs.setInt("GAME_1_STAR_MAX_" + 1 + "_" + 4, 10, getApplicationContext());
        SharedPrefs.setInt("GAME_1_STAR_MIN_" + 1 + "_" + 4, 6, getApplicationContext());
        SharedPrefs.setInt("GAME_SPEED_" + 1 + "_" + 5, 150, getApplicationContext());
        SharedPrefs.setInt("GAME_TARGET_" + 1 + "_" + 5, 50, getApplicationContext());
        SharedPrefs.setInt("GAME_4_STAR_MAX_" + 1 + "_" + 5, 1, getApplicationContext());
        SharedPrefs.setInt("GAME_4_STAR_MIN_" + 1 + "_" + 5, 1, getApplicationContext());
        SharedPrefs.setInt("GAME_3_STAR_MAX_" + 1 + "_" + 5, 3, getApplicationContext());
        SharedPrefs.setInt("GAME_3_STAR_MIN_" + 1 + "_" + 5, 2, getApplicationContext());
        SharedPrefs.setInt("GAME_2_STAR_MAX_" + 1 + "_" + 5, 5, getApplicationContext());
        SharedPrefs.setInt("GAME_2_STAR_MIN_" + 1 + "_" + 5, 4, getApplicationContext());
        SharedPrefs.setInt("GAME_1_STAR_MAX_" + 1 + "_" + 5, 10, getApplicationContext());
        SharedPrefs.setInt("GAME_1_STAR_MIN_" + 1 + "_" + 5, 6, getApplicationContext());
        SharedPrefs.setInt("GAME_SPEED_" + 1 + "_" + 6, 125, getApplicationContext());
        SharedPrefs.setInt("GAME_TARGET_" + 1 + "_" + 6, 50, getApplicationContext());
        SharedPrefs.setInt("GAME_4_STAR_MAX_" + 1 + "_" + 6, 1, getApplicationContext());
        SharedPrefs.setInt("GAME_4_STAR_MIN_" + 1 + "_" + 6, 1, getApplicationContext());
        SharedPrefs.setInt("GAME_3_STAR_MAX_" + 1 + "_" + 6, 3, getApplicationContext());
        SharedPrefs.setInt("GAME_3_STAR_MIN_" + 1 + "_" + 6, 2, getApplicationContext());
        SharedPrefs.setInt("GAME_2_STAR_MAX_" + 1 + "_" + 6, 5, getApplicationContext());
        SharedPrefs.setInt("GAME_2_STAR_MIN_" + 1 + "_" + 6, 4, getApplicationContext());
        SharedPrefs.setInt("GAME_1_STAR_MAX_" + 1 + "_" + 6, 10, getApplicationContext());
        SharedPrefs.setInt("GAME_1_STAR_MIN_" + 1 + "_" + 6, 6, getApplicationContext());
        SharedPrefs.setInt("GAME_SPEED_" + 1 + "_" + 7, 100, getApplicationContext());
        SharedPrefs.setInt("GAME_TARGET_" + 1 + "_" + 7, 50, getApplicationContext());
        SharedPrefs.setInt("GAME_4_STAR_MAX_" + 1 + "_" + 7, 1, getApplicationContext());
        SharedPrefs.setInt("GAME_4_STAR_MIN_" + 1 + "_" + 7, 1, getApplicationContext());
        SharedPrefs.setInt("GAME_3_STAR_MAX_" + 1 + "_" + 7, 3, getApplicationContext());
        SharedPrefs.setInt("GAME_3_STAR_MIN_" + 1 + "_" + 7, 2, getApplicationContext());
        SharedPrefs.setInt("GAME_2_STAR_MAX_" + 1 + "_" + 7, 5, getApplicationContext());
        SharedPrefs.setInt("GAME_2_STAR_MIN_" + 1 + "_" + 7, 4, getApplicationContext());
        SharedPrefs.setInt("GAME_1_STAR_MAX_" + 1 + "_" + 7, 10, getApplicationContext());
        SharedPrefs.setInt("GAME_1_STAR_MIN_" + 1 + "_" + 7, 6, getApplicationContext());
        SharedPrefs.setInt("GAME_SPEED_" + 1 + "_" + 8, 75, getApplicationContext());
        SharedPrefs.setInt("GAME_TARGET_" + 1 + "_" + 8, 100, getApplicationContext());
        SharedPrefs.setInt("GAME_4_STAR_MAX_" + 1 + "_" + 8, 2, getApplicationContext());
        SharedPrefs.setInt("GAME_4_STAR_MIN_" + 1 + "_" + 8, 1, getApplicationContext());
        SharedPrefs.setInt("GAME_3_STAR_MAX_" + 1 + "_" + 8, 5, getApplicationContext());
        SharedPrefs.setInt("GAME_3_STAR_MIN_" + 1 + "_" + 8, 3, getApplicationContext());
        SharedPrefs.setInt("GAME_2_STAR_MAX_" + 1 + "_" + 8, 10, getApplicationContext());
        SharedPrefs.setInt("GAME_2_STAR_MIN_" + 1 + "_" + 8, 6, getApplicationContext());
        SharedPrefs.setInt("GAME_1_STAR_MAX_" + 1 + "_" + 8, 15, getApplicationContext());
        SharedPrefs.setInt("GAME_1_STAR_MIN_" + 1 + "_" + 8, 11, getApplicationContext());
        SharedPrefs.setInt("GAME_SPEED_" + 1 + "_" + 9, 50, getApplicationContext());
        SharedPrefs.setInt("GAME_TARGET_" + 1 + "_" + 9, 100, getApplicationContext());
        SharedPrefs.setInt("GAME_4_STAR_MAX_" + 1 + "_" + 9, 2, getApplicationContext());
        SharedPrefs.setInt("GAME_4_STAR_MIN_" + 1 + "_" + 9, 1, getApplicationContext());
        SharedPrefs.setInt("GAME_3_STAR_MAX_" + 1 + "_" + 9, 5, getApplicationContext());
        SharedPrefs.setInt("GAME_3_STAR_MIN_" + 1 + "_" + 9, 3, getApplicationContext());
        SharedPrefs.setInt("GAME_2_STAR_MAX_" + 1 + "_" + 9, 10, getApplicationContext());
        SharedPrefs.setInt("GAME_2_STAR_MIN_" + 1 + "_" + 9, 6, getApplicationContext());
        SharedPrefs.setInt("GAME_1_STAR_MAX_" + 1 + "_" + 9, 15, getApplicationContext());
        SharedPrefs.setInt("GAME_1_STAR_MIN_" + 1 + "_" + 9, 11, getApplicationContext());
        SharedPrefs.setInt("GAME_SPEED_" + 1 + "_" + 10, 25, getApplicationContext());
        SharedPrefs.setInt("GAME_TARGET_" + 1 + "_" + 10, 200, getApplicationContext());
        SharedPrefs.setInt("GAME_4_STAR_MAX_" + 1 + "_" + 10, 3, getApplicationContext());
        SharedPrefs.setInt("GAME_4_STAR_MIN_" + 1 + "_" + 10, 1, getApplicationContext());
        SharedPrefs.setInt("GAME_3_STAR_MAX_" + 1 + "_" + 10, 6, getApplicationContext());
        SharedPrefs.setInt("GAME_3_STAR_MIN_" + 1 + "_" + 10, 4, getApplicationContext());
        SharedPrefs.setInt("GAME_2_STAR_MAX_" + 1 + "_" + 10, 10, getApplicationContext());
        SharedPrefs.setInt("GAME_2_STAR_MIN_" + 1 + "_" + 10, 7, getApplicationContext());
        SharedPrefs.setInt("GAME_1_STAR_MAX_" + 1 + "_" + 10, 15, getApplicationContext());
        SharedPrefs.setInt("GAME_1_STAR_MIN_" + 1 + "_" + 10, 11, getApplicationContext());
        SharedPrefs.setInt("GAME_SPEED_" + 1 + "_" + 11, 20, getApplicationContext());
        SharedPrefs.setInt("GAME_TARGET_" + 1 + "_" + 11, 200, getApplicationContext());
        SharedPrefs.setInt("GAME_4_STAR_MAX_" + 1 + "_" + 11, 3, getApplicationContext());
        SharedPrefs.setInt("GAME_4_STAR_MIN_" + 1 + "_" + 11, 1, getApplicationContext());
        SharedPrefs.setInt("GAME_3_STAR_MAX_" + 1 + "_" + 11, 6, getApplicationContext());
        SharedPrefs.setInt("GAME_3_STAR_MIN_" + 1 + "_" + 11, 4, getApplicationContext());
        SharedPrefs.setInt("GAME_2_STAR_MAX_" + 1 + "_" + 11, 10, getApplicationContext());
        SharedPrefs.setInt("GAME_2_STAR_MIN_" + 1 + "_" + 11, 7, getApplicationContext());
        SharedPrefs.setInt("GAME_1_STAR_MAX_" + 1 + "_" + 11, 15, getApplicationContext());
        SharedPrefs.setInt("GAME_1_STAR_MIN_" + 1 + "_" + 11, 11, getApplicationContext());
        SharedPrefs.setInt("GAME_SPEED_" + 1 + "_" + 12, 15, getApplicationContext());
        SharedPrefs.setInt("GAME_TARGET_" + 1 + "_" + 12, 200, getApplicationContext());
        SharedPrefs.setInt("GAME_4_STAR_MAX_" + 1 + "_" + 12, 3, getApplicationContext());
        SharedPrefs.setInt("GAME_4_STAR_MIN_" + 1 + "_" + 12, 1, getApplicationContext());
        SharedPrefs.setInt("GAME_3_STAR_MAX_" + 1 + "_" + 12, 6, getApplicationContext());
        SharedPrefs.setInt("GAME_3_STAR_MIN_" + 1 + "_" + 12, 4, getApplicationContext());
        SharedPrefs.setInt("GAME_2_STAR_MAX_" + 1 + "_" + 12, 10, getApplicationContext());
        SharedPrefs.setInt("GAME_2_STAR_MIN_" + 1 + "_" + 12, 7, getApplicationContext());
        SharedPrefs.setInt("GAME_1_STAR_MAX_" + 1 + "_" + 12, 15, getApplicationContext());
        SharedPrefs.setInt("GAME_1_STAR_MIN_" + 1 + "_" + 12, 11, getApplicationContext());
        SharedPrefs.setInt("GAME_SPEED_" + 1 + "_" + 13, 10, getApplicationContext());
        SharedPrefs.setInt("GAME_TARGET_" + 1 + "_" + 13, 500, getApplicationContext());
        SharedPrefs.setInt("GAME_4_STAR_MAX_" + 1 + "_" + 13, 5, getApplicationContext());
        SharedPrefs.setInt("GAME_4_STAR_MIN_" + 1 + "_" + 13, 1, getApplicationContext());
        SharedPrefs.setInt("GAME_3_STAR_MAX_" + 1 + "_" + 13, 10, getApplicationContext());
        SharedPrefs.setInt("GAME_3_STAR_MIN_" + 1 + "_" + 13, 6, getApplicationContext());
        SharedPrefs.setInt("GAME_2_STAR_MAX_" + 1 + "_" + 13, 15, getApplicationContext());
        SharedPrefs.setInt("GAME_2_STAR_MIN_" + 1 + "_" + 13, 11, getApplicationContext());
        SharedPrefs.setInt("GAME_1_STAR_MAX_" + 1 + "_" + 13, 20, getApplicationContext());
        SharedPrefs.setInt("GAME_1_STAR_MIN_" + 1 + "_" + 13, 16, getApplicationContext());
        SharedPrefs.setInt("GAME_SPEED_" + 1 + "_" + 14, 5, getApplicationContext());
        SharedPrefs.setInt("GAME_TARGET_" + 1 + "_" + 14, 500, getApplicationContext());
        SharedPrefs.setInt("GAME_4_STAR_MAX_" + 1 + "_" + 14, 5, getApplicationContext());
        SharedPrefs.setInt("GAME_4_STAR_MIN_" + 1 + "_" + 14, 1, getApplicationContext());
        SharedPrefs.setInt("GAME_3_STAR_MAX_" + 1 + "_" + 14, 10, getApplicationContext());
        SharedPrefs.setInt("GAME_3_STAR_MIN_" + 1 + "_" + 14, 6, getApplicationContext());
        SharedPrefs.setInt("GAME_2_STAR_MAX_" + 1 + "_" + 14, 15, getApplicationContext());
        SharedPrefs.setInt("GAME_2_STAR_MIN_" + 1 + "_" + 14, 11, getApplicationContext());
        SharedPrefs.setInt("GAME_1_STAR_MAX_" + 1 + "_" + 14, 20, getApplicationContext());
        SharedPrefs.setInt("GAME_1_STAR_MIN_" + 1 + "_" + 14, 16, getApplicationContext());
        SharedPrefs.setInt("GAME_SPEED_" + 1 + "_" + 15, 1, getApplicationContext());
        SharedPrefs.setInt("GAME_TARGET_" + 1 + "_" + 15, 1000, getApplicationContext());
        SharedPrefs.setInt("GAME_4_STAR_MAX_" + 1 + "_" + 15, 10, getApplicationContext());
        SharedPrefs.setInt("GAME_4_STAR_MIN_" + 1 + "_" + 15, 1, getApplicationContext());
        SharedPrefs.setInt("GAME_3_STAR_MAX_" + 1 + "_" + 15, 20, getApplicationContext());
        SharedPrefs.setInt("GAME_3_STAR_MIN_" + 1 + "_" + 15, 11, getApplicationContext());
        SharedPrefs.setInt("GAME_2_STAR_MAX_" + 1 + "_" + 15, 30, getApplicationContext());
        SharedPrefs.setInt("GAME_2_STAR_MIN_" + 1 + "_" + 15, 21, getApplicationContext());
        SharedPrefs.setInt("GAME_1_STAR_MAX_" + 1 + "_" + 15, 50, getApplicationContext());
        SharedPrefs.setInt("GAME_1_STAR_MIN_" + 1 + "_" + 15, 31, getApplicationContext());

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == play.getId()) {
            Intent gameActivity = new Intent(getApplicationContext(), MainActivity.class);
            Bundle extras = new Bundle();
            extras.putInt("SET", 1);
            extras.putInt("LEVEL", 1);
            gameActivity.putExtras(extras);
            startActivity(gameActivity);
        }
        if (v.getId() == quit.getId()) {
            finish();
        }
    }
}
