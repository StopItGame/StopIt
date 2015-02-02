package com.stopit.game;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.stopit.game.support.SharedPrefs;


public class LevelActivity extends Activity implements View.OnClickListener {

    private TextView setText;
    private ImageButton level1;
    private ImageButton level2;
    private ImageButton level3;
    private ImageButton level4;
    private ImageButton level5;
    private ImageButton level6;
    private ImageButton level7;
    private ImageButton level8;
    private ImageButton level9;
    private ImageButton level10;
    private ImageButton level11;
    private ImageButton level12;
    private ImageButton level13;
    private ImageButton level14;
    private ImageButton level15;
    private ImageView stars1;
    private ImageView stars2;
    private ImageView stars3;
    private ImageView stars4;
    private ImageView stars5;
    private ImageView stars6;
    private ImageView stars7;
    private ImageView stars8;
    private ImageView stars9;
    private ImageView stars10;
    private ImageView stars11;
    private ImageView stars12;
    private ImageView stars13;
    private ImageView stars14;
    private ImageView stars15;
    private ImageButton backButton;

    private int gameSet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey("SET")) {
                gameSet = extras.getInt("SET");
            }
        }

        int totalStars = getTotalStars(gameSet);

        setText = (TextView) findViewById(R.id.activity_level_textview_set);
        Typeface tf = Typeface.createFromAsset(getAssets(), "digital.ttf");
        setText.setTypeface(tf);
        setText.setText("SET - " + gameSet + " - " + totalStars + "/75");

        level1 = (ImageButton) findViewById(R.id.activity_level_button_1);
        level2 = (ImageButton) findViewById(R.id.activity_level_button_2);
        level3 = (ImageButton) findViewById(R.id.activity_level_button_3);
        level4 = (ImageButton) findViewById(R.id.activity_level_button_4);
        level5 = (ImageButton) findViewById(R.id.activity_level_button_5);
        level6 = (ImageButton) findViewById(R.id.activity_level_button_6);
        level7 = (ImageButton) findViewById(R.id.activity_level_button_7);
        level8 = (ImageButton) findViewById(R.id.activity_level_button_8);
        level9 = (ImageButton) findViewById(R.id.activity_level_button_9);
        level10 = (ImageButton) findViewById(R.id.activity_level_button_10);
        level11 = (ImageButton) findViewById(R.id.activity_level_button_11);
        level12 = (ImageButton) findViewById(R.id.activity_level_button_12);
        level13 = (ImageButton) findViewById(R.id.activity_level_button_13);
        level14 = (ImageButton) findViewById(R.id.activity_level_button_14);
        level15 = (ImageButton) findViewById(R.id.activity_level_button_15);
        level1.setImageDrawable(getLevelDrawable(1));
        level2.setImageDrawable(getLevelDrawable(2));
        level3.setImageDrawable(getLevelDrawable(3));
        level4.setImageDrawable(getLevelDrawable(4));
        level5.setImageDrawable(getLevelDrawable(5));
        level6.setImageDrawable(getLevelDrawable(6));
        level7.setImageDrawable(getLevelDrawable(7));
        level8.setImageDrawable(getLevelDrawable(8));
        level9.setImageDrawable(getLevelDrawable(9));
        level10.setImageDrawable(getLevelDrawable(10));
        level11.setImageDrawable(getLevelDrawable(11));
        level12.setImageDrawable(getLevelDrawable(12));
        level13.setImageDrawable(getLevelDrawable(13));
        level14.setImageDrawable(getLevelDrawable(14));
        level15.setImageDrawable(getLevelDrawable(15));
        level1.setOnClickListener(this);
        level2.setOnClickListener(this);
        level3.setOnClickListener(this);
        level4.setOnClickListener(this);
        level5.setOnClickListener(this);
        level6.setOnClickListener(this);
        level7.setOnClickListener(this);
        level8.setOnClickListener(this);
        level9.setOnClickListener(this);
        level10.setOnClickListener(this);
        level11.setOnClickListener(this);
        level12.setOnClickListener(this);
        level13.setOnClickListener(this);
        level14.setOnClickListener(this);
        level15.setOnClickListener(this);
        stars1 = (ImageView) findViewById(R.id.activity_level_stars_1);
        stars2 = (ImageView) findViewById(R.id.activity_level_stars_2);
        stars3 = (ImageView) findViewById(R.id.activity_level_stars_3);
        stars4 = (ImageView) findViewById(R.id.activity_level_stars_4);
        stars5 = (ImageView) findViewById(R.id.activity_level_stars_5);
        stars6 = (ImageView) findViewById(R.id.activity_level_stars_6);
        stars7 = (ImageView) findViewById(R.id.activity_level_stars_7);
        stars8 = (ImageView) findViewById(R.id.activity_level_stars_8);
        stars9 = (ImageView) findViewById(R.id.activity_level_stars_9);
        stars10 = (ImageView) findViewById(R.id.activity_level_stars_10);
        stars11 = (ImageView) findViewById(R.id.activity_level_stars_11);
        stars12 = (ImageView) findViewById(R.id.activity_level_stars_12);
        stars13 = (ImageView) findViewById(R.id.activity_level_stars_13);
        stars14 = (ImageView) findViewById(R.id.activity_level_stars_14);
        stars15 = (ImageView) findViewById(R.id.activity_level_stars_15);
        stars1.setImageDrawable(getStarDrawable(1));
        stars2.setImageDrawable(getStarDrawable(2));
        stars3.setImageDrawable(getStarDrawable(3));
        stars4.setImageDrawable(getStarDrawable(4));
        stars5.setImageDrawable(getStarDrawable(5));
        stars6.setImageDrawable(getStarDrawable(6));
        stars7.setImageDrawable(getStarDrawable(7));
        stars8.setImageDrawable(getStarDrawable(8));
        stars9.setImageDrawable(getStarDrawable(9));
        stars10.setImageDrawable(getStarDrawable(10));
        stars11.setImageDrawable(getStarDrawable(11));
        stars12.setImageDrawable(getStarDrawable(12));
        stars13.setImageDrawable(getStarDrawable(13));
        stars14.setImageDrawable(getStarDrawable(14));
        stars15.setImageDrawable(getStarDrawable(15));
        backButton = (ImageButton) findViewById(R.id.activity_level_button_back);
        backButton.setOnClickListener(this);
    }

    private int getTotalStars(int gameSet) {
        int stars = 0;
        for (int i = 1; i <= 15; i++) {
            stars = stars + SharedPrefs.getInt("STARS_" + gameSet + "_" + i, 0, getApplicationContext());
        }
        return stars;
    }

    private Drawable getLevelDrawable(int level) {
        int stars = SharedPrefs.getInt("STARS_" + gameSet + "_" + (level
                - 1), 0, getApplicationContext());
        if (stars > 3) {
            switch (level) {
                case 1:
                    return getResources().getDrawable(R.drawable.level_1);
                case 2:
                    return getResources().getDrawable(R.drawable.level_2);
                case 3:
                    return getResources().getDrawable(R.drawable.level_3);
                case 4:
                    return getResources().getDrawable(R.drawable.level_4);
                case 5:
                    return getResources().getDrawable(R.drawable.level_5);
                case 6:
                    return getResources().getDrawable(R.drawable.level_6);
                case 7:
                    return getResources().getDrawable(R.drawable.level_7);
                case 8:
                    return getResources().getDrawable(R.drawable.level_8);
                case 9:
                    return getResources().getDrawable(R.drawable.level_9);
                case 10:
                    return getResources().getDrawable(R.drawable.level_10);
                case 11:
                    return getResources().getDrawable(R.drawable.level_11);
                case 12:
                    return getResources().getDrawable(R.drawable.level_12);
                case 13:
                    return getResources().getDrawable(R.drawable.level_13);
                case 14:
                    return getResources().getDrawable(R.drawable.level_14);
                case 15:
                    return getResources().getDrawable(R.drawable.level_15);
                default:
                    return getResources().getDrawable(R.drawable.level_1);
            }
        } else {
            switch (level) {
                case 1:
                    return getResources().getDrawable(R.drawable.level_1);
                case 2:
                    return getResources().getDrawable(R.drawable.two_locked);
                case 3:
                    return getResources().getDrawable(R.drawable.three_locked);
                case 4:
                    return getResources().getDrawable(R.drawable.four_locked);
                case 5:
                    return getResources().getDrawable(R.drawable.five_locked);
                case 6:
                    return getResources().getDrawable(R.drawable.six_locked);
                case 7:
                    return getResources().getDrawable(R.drawable.seven_locked);
                case 8:
                    return getResources().getDrawable(R.drawable.eight_locked);
                case 9:
                    return getResources().getDrawable(R.drawable.nine_locked);
                case 10:
                    return getResources().getDrawable(R.drawable.ten_locked);
                case 11:
                    return getResources().getDrawable(R.drawable.eleven_locked);
                case 12:
                    return getResources().getDrawable(R.drawable.twelve_locked);
                case 13:
                    return getResources().getDrawable(R.drawable.thirteen_locked);
                case 14:
                    return getResources().getDrawable(R.drawable.fourteen_locked);
                case 15:
                    return getResources().getDrawable(R.drawable.fifteen_locked);
                default:
                    return getResources().getDrawable(R.drawable.level_1);
            }
        }
    }

    private Drawable getStarDrawable(int level) {

        int stars = SharedPrefs.getInt(
                "STARS_" + gameSet + "_" + level, 0, getApplicationContext());
        switch (stars) {
            case 0:
                return getResources().getDrawable(R.drawable.zero_star);
            case 1:
                return getResources().getDrawable(R.drawable.one_star);
            case 2:
                return getResources().getDrawable(R.drawable.two_star);
            case 3:
                return getResources().getDrawable(R.drawable.three_star);
            case 4:
                return getResources().getDrawable(R.drawable.four_star);
            case 5:
                return getResources().getDrawable(R.drawable.five_star);
            default:
                return getResources().getDrawable(R.drawable.zero_star);
        }
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == level1.getId()) {
            Intent gameActivity = new Intent(getApplicationContext(), GameActivity.class);
            Bundle extras = new Bundle();
            extras.putInt("SET", 1);
            extras.putInt("LEVEL", 1);
            gameActivity.putExtras(extras);
            startActivity(gameActivity);
        }
        if (v.getId() == level2.getId()) {
            if (getStarsAtPreviousLevel(2) > 3) {
                Intent gameActivity = new Intent(getApplicationContext(), GameActivity.class);
                Bundle extras = new Bundle();
                extras.putInt("SET", 1);
                extras.putInt("LEVEL", 2);
                gameActivity.putExtras(extras);
                startActivity(gameActivity);
            } else {
                Toast.makeText(getApplicationContext(), "You need at least 4 stars in level 1 to unlock level 2", Toast.LENGTH_SHORT).show();
            }
        }
        if (v.getId() == level3.getId()) {
            if (getStarsAtPreviousLevel(3) > 3) {
                Intent gameActivity = new Intent(getApplicationContext(), GameActivity.class);
                Bundle extras = new Bundle();
                extras.putInt("SET", 1);
                extras.putInt("LEVEL", 3);
                gameActivity.putExtras(extras);
                startActivity(gameActivity);
            } else {
                Toast.makeText(getApplicationContext(), "You need at least 4 stars in level 2 to unlock level 3", Toast.LENGTH_SHORT).show();
            }
        }
        if (v.getId() == level4.getId()) {
            if (getStarsAtPreviousLevel(4) > 3) {
                Intent gameActivity = new Intent(getApplicationContext(), GameActivity.class);
                Bundle extras = new Bundle();
                extras.putInt("SET", 1);
                extras.putInt("LEVEL", 4);
                gameActivity.putExtras(extras);
                startActivity(gameActivity);
            } else {
                Toast.makeText(getApplicationContext(), "You need at least 4 stars in level 3 to unlock level 4", Toast.LENGTH_SHORT).show();
            }
        }
        if (v.getId() == level5.getId()) {
            if (getStarsAtPreviousLevel(5) > 3) {
                Intent gameActivity = new Intent(getApplicationContext(), GameActivity.class);
                Bundle extras = new Bundle();
                extras.putInt("SET", 1);
                extras.putInt("LEVEL", 5);
                gameActivity.putExtras(extras);
                startActivity(gameActivity);
            } else {
                Toast.makeText(getApplicationContext(), "You need at least 4 stars in level 4 to unlock level 5", Toast.LENGTH_SHORT).show();
            }
        }
        if (v.getId() == level6.getId()) {
            if (getStarsAtPreviousLevel(6) > 3) {
                Intent gameActivity = new Intent(getApplicationContext(), GameActivity.class);
                Bundle extras = new Bundle();
                extras.putInt("SET", 1);
                extras.putInt("LEVEL", 6);
                gameActivity.putExtras(extras);
                startActivity(gameActivity);
            } else {
                Toast.makeText(getApplicationContext(), "You need at least 4 stars in level 5 to unlock level 6", Toast.LENGTH_SHORT).show();
            }
        }
        if (v.getId() == level7.getId()) {
            if (getStarsAtPreviousLevel(7) > 3) {
                Intent gameActivity = new Intent(getApplicationContext(), GameActivity.class);
                Bundle extras = new Bundle();
                extras.putInt("SET", 1);
                extras.putInt("LEVEL", 7);
                gameActivity.putExtras(extras);
                startActivity(gameActivity);
            } else {
                Toast.makeText(getApplicationContext(), "You need at least 4 stars in level 6 to unlock level 7", Toast.LENGTH_SHORT).show();
            }
        }
        if (v.getId() == level8.getId()) {
            if (getStarsAtPreviousLevel(8) > 3) {
                Intent gameActivity = new Intent(getApplicationContext(), GameActivity.class);
                Bundle extras = new Bundle();
                extras.putInt("SET", 1);
                extras.putInt("LEVEL", 8);
                gameActivity.putExtras(extras);
                startActivity(gameActivity);
            } else {
                Toast.makeText(getApplicationContext(), "You need at least 4 stars in level 7 to unlock level 8", Toast.LENGTH_SHORT).show();
            }
        }
        if (v.getId() == level9.getId()) {
            if (getStarsAtPreviousLevel(9) > 3) {
                Intent gameActivity = new Intent(getApplicationContext(), GameActivity.class);
                Bundle extras = new Bundle();
                extras.putInt("SET", 1);
                extras.putInt("LEVEL", 9);
                gameActivity.putExtras(extras);
                startActivity(gameActivity);
            } else {
                Toast.makeText(getApplicationContext(), "You need at least 4 stars in level 8 to unlock level 9", Toast.LENGTH_SHORT).show();
            }
        }
        if (v.getId() == level10.getId()) {
            if (getStarsAtPreviousLevel(10) > 3) {
                Intent gameActivity = new Intent(getApplicationContext(), GameActivity.class);
                Bundle extras = new Bundle();
                extras.putInt("SET", 1);
                extras.putInt("LEVEL", 10);
                gameActivity.putExtras(extras);
                startActivity(gameActivity);
            } else {
                Toast.makeText(getApplicationContext(), "You need at least 4 stars in level 9 to unlock level 10", Toast.LENGTH_SHORT).show();
            }
        }
        if (v.getId() == level11.getId()) {
            if (getStarsAtPreviousLevel(11) > 3) {
                Intent gameActivity = new Intent(getApplicationContext(), GameActivity.class);
                Bundle extras = new Bundle();
                extras.putInt("SET", 1);
                extras.putInt("LEVEL", 11);
                gameActivity.putExtras(extras);
                startActivity(gameActivity);
            } else {
                Toast.makeText(getApplicationContext(), "You need at least 4 stars in level 10 to unlock level 11", Toast.LENGTH_SHORT).show();
            }
        }
        if (v.getId() == level12.getId()) {
            if (getStarsAtPreviousLevel(12) > 3) {
                Intent gameActivity = new Intent(getApplicationContext(), GameActivity.class);
                Bundle extras = new Bundle();
                extras.putInt("SET", 1);
                extras.putInt("LEVEL", 12);
                gameActivity.putExtras(extras);
                startActivity(gameActivity);
            } else {
                Toast.makeText(getApplicationContext(), "You need at least 4 stars in level 11 to unlock level 12", Toast.LENGTH_SHORT).show();
            }
        }
        if (v.getId() == level13.getId()) {
            if (getStarsAtPreviousLevel(13) > 3) {
                Intent gameActivity = new Intent(getApplicationContext(), GameActivity.class);
                Bundle extras = new Bundle();
                extras.putInt("SET", 1);
                extras.putInt("LEVEL", 13);
                gameActivity.putExtras(extras);
                startActivity(gameActivity);
            } else {
                Toast.makeText(getApplicationContext(), "You need at least 4 stars in level 12 to unlock level 13", Toast.LENGTH_SHORT).show();
            }
        }
        if (v.getId() == level14.getId()) {
            if (getStarsAtPreviousLevel(14) > 3) {
                Intent gameActivity = new Intent(getApplicationContext(), GameActivity.class);
                Bundle extras = new Bundle();
                extras.putInt("SET", 1);
                extras.putInt("LEVEL", 14);
                gameActivity.putExtras(extras);
                startActivity(gameActivity);
            } else {
                Toast.makeText(getApplicationContext(), "You need at least 4 stars in level 13 to unlock level 14", Toast.LENGTH_SHORT).show();
            }
        }
        if (v.getId() == level15.getId()) {
            if (getStarsAtPreviousLevel(15) > 3) {
                Intent gameActivity = new Intent(getApplicationContext(), GameActivity.class);
                Bundle extras = new Bundle();
                extras.putInt("SET", 1);
                extras.putInt("LEVEL", 15);
                gameActivity.putExtras(extras);
                startActivity(gameActivity);
            } else {
                Toast.makeText(getApplicationContext(), "You need at least 4 stars in level 14 to unlock level 15", Toast.LENGTH_SHORT).show();
            }
        }
        if (v.getId() == backButton.getId()) {
            this.finish();
        }
    }

    private int getStarsAtPreviousLevel(int i) {
        return SharedPrefs.getInt("STARS_" + gameSet + "_" + (i - 1), 0, getApplicationContext());
    }


}
