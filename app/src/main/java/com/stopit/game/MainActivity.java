package com.stopit.game;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;


public class MainActivity extends Activity {

    private static final String TAG = "MainActivity";

    private CountDownTimer timer;
    private int count;

    private int prevUnit = 0;
    private int prevTen = 0;
    private int prevHundred = 0;
    private int prevThousand = 0;

    private TextView countTextThousand;
    private TextView countTextHundred;
    private TextView countTextTen;
    private TextView countTextUnit;

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;
        countTextThousand = (TextView) findViewById(R.id.activity_main_textview_thousand);
        countTextHundred = (TextView) findViewById(R.id.activity_main_textview_hundred);
        countTextTen = (TextView) findViewById(R.id.activity_main_textview_ten);
        countTextUnit = (TextView) findViewById(R.id.activity_main_textview_unit);
        Typeface tf = Typeface.createFromAsset(getAssets(), "digital.ttf");
        countTextThousand.setTypeface(tf);
        countTextHundred.setTypeface(tf);
        countTextTen.setTypeface(tf);
        countTextUnit.setTypeface(tf);
        countTextThousand.setText("0");
        countTextHundred.setText("0");
        countTextTen.setText("0");
        countTextUnit.setText("0");
        timer = new CountDownTimer(60 * 1000, 50) {
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
        timer.start();

    }

}
