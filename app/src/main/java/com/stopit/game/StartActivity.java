package com.stopit.game;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;


public class StartActivity extends Activity implements View.OnClickListener {

    private ImageButton singlePlayerButton;
    private ImageButton multiPlayerButton;
    private ImageButton quitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        Globals.initializeGameConfig(getApplication());

        singlePlayerButton = (ImageButton) findViewById(R.id.activity_start_button_single);
        singlePlayerButton.setOnClickListener(this);
        multiPlayerButton = (ImageButton) findViewById(R.id.activity_start_button_multi);
        multiPlayerButton.setOnClickListener(this);
        multiPlayerButton.setImageDrawable(getResources().getDrawable(R.drawable.multi_player_locked));
        quitButton = (ImageButton) findViewById(R.id.activity_start_button_quit);
        quitButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == singlePlayerButton.getId()) {
            Intent gameActivity = new Intent(getApplicationContext(), SetActivity.class);
            Bundle extras = new Bundle();
            extras.putInt("SET", 1);
            gameActivity.putExtras(extras);
            startActivity(gameActivity);
        }

        if (v.getId() == multiPlayerButton.getId()) {
            Toast.makeText(getApplicationContext(), "Multi-Player is coming soon!!!", Toast.LENGTH_SHORT).show();
        }

        if (v.getId() == quitButton.getId()) {
            finish();
        }
    }
}
