package com.stopit.game;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.stopit.game.support.SharedPrefs;


public class SetActivity extends Activity implements View.OnClickListener {

    private TextView setText;
    private ImageButton set1;
    private ImageButton set2;
    private ImageButton set3;
    private ImageButton set4;
    private ImageButton set5;
    private ImageButton backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set);

        setText = (TextView) findViewById(R.id.activity_set_textView_set);
        Typeface tf = Typeface.createFromAsset(getAssets(), "digital.ttf");
        setText.setTypeface(tf);
        set1 = (ImageButton) findViewById(R.id.activity_set_button_set1);
        set1.setOnClickListener(this);
        set2 = (ImageButton) findViewById(R.id.activity_set_button_set2);
        set2.setOnClickListener(this);
        set3 = (ImageButton) findViewById(R.id.activity_set_button_set3);
        set3.setOnClickListener(this);
        set4 = (ImageButton) findViewById(R.id.activity_set_button_set4);
        set4.setOnClickListener(this);
        set5 = (ImageButton) findViewById(R.id.activity_set_button_set5);
        set5.setOnClickListener(this);

        set2.setImageDrawable(getResources().getDrawable(R.drawable.set_2_locked));
        set3.setImageDrawable(getResources().getDrawable(R.drawable.set_3_locked));
        set4.setImageDrawable(getResources().getDrawable(R.drawable.set_4_locked));
        set5.setImageDrawable(getResources().getDrawable(R.drawable.set_5_locked));

        backButton = (ImageButton) findViewById(R.id.activity_level_button_back);
        backButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == set1.getId()) {
            Intent levelActivity = new Intent(getApplicationContext(), LevelActivity.class);
            Bundle extras = new Bundle();
            extras.putInt("SET", 1);
            levelActivity.putExtras(extras);
            startActivity(levelActivity);
        }
        if (v.getId() == set2.getId()) {
            int set1Stars = SharedPrefs.getInt("SET_1_STARS", 0, getApplicationContext());
            if (set1Stars != 75) {
                Toast.makeText(getApplicationContext(), "You need all 75 stars in Set 1 to Unlock Set 2", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getApplicationContext(), "Set 2 is coming soon", Toast.LENGTH_SHORT).show();
            }
        }
        if (v.getId() == set3.getId()) {
            int set1Stars = SharedPrefs.getInt("SET_2_STARS", 0, getApplicationContext());
            if (set1Stars != 75) {
                Toast.makeText(getApplicationContext(), "You need all 75 stars in Set 2 to Unlock Set 3", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getApplicationContext(), "Set 3 is coming soon", Toast.LENGTH_SHORT).show();
            }
        }
        if (v.getId() == set4.getId()) {
            int set1Stars = SharedPrefs.getInt("SET_3_STARS", 0, getApplicationContext());
            if (set1Stars != 75) {
                Toast.makeText(getApplicationContext(), "You need all 75 stars in Set 3 to Unlock Set 4", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getApplicationContext(), "Set 4 is coming soon", Toast.LENGTH_SHORT).show();
            }
        }
        if (v.getId() == set5.getId()) {
            int set1Stars = SharedPrefs.getInt("SET_4_STARS", 0, getApplicationContext());
            if (set1Stars != 75) {
                Toast.makeText(getApplicationContext(), "You need all 75 stars in Set 4 to Unlock Set 5", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getApplicationContext(), "Set 5 is coming soon", Toast.LENGTH_SHORT).show();
            }
        }
        if(v.getId() == backButton.getId()) {
            finish();
        }
    }
}
