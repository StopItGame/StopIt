package com.stopit.game;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


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
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == play.getId()) {
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
        }
        if (v.getId() == quit.getId()) {
            finish();
        }
    }
}
