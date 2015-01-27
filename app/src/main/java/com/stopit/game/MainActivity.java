package com.stopit.game;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.widget.ImageView;


public class MainActivity extends Activity {

    private static final String TAG = "MainActivity";

    private CountDownTimer timer;
    private int count;

    private int prevUnit = 0;
    private int prevTen = 0;
    private int prevHundred = 0;
    private int prevThousand = 0;

    private ImageView thousandImage;
    private ImageView hundredImage;
    private ImageView tenImage;
    private ImageView unitImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        thousandImage = (ImageView) findViewById(R.id.activity_main_image_thousand);
        hundredImage = (ImageView) findViewById(R.id.activity_main_image_hundred);
        tenImage = (ImageView) findViewById(R.id.activity_main_image_ten);
        unitImage = (ImageView) findViewById(R.id.activity_main_image_unit);

        count = 0;
        updateLights(count);

        timer = new CountDownTimer(60 * 1000, 1) {
            @Override
            public void onTick(long millisUntilFinished) {
                Log.d(TAG, "Count = " + count);
                count++;
                if (count < 10000) {
                    updateLights(count);
                    Log.d(TAG, "Updated lights for count = " + count);
                }
            }

            @Override
            public void onFinish() {

            }
        };
        timer.start();

    }

    private void updateLights(int count) {

        int unit = count % 10;
        int ten = (count / 10) % 10;
        int hundred = (count / 100) % 10;
        int thousand = (count / 1000);

        if ((unit != prevUnit) || (count == 0)) {
            unitImage.setImageDrawable(getDrawableImage(unit));
        }
        if ((ten != prevTen) || (count == 0)) {
            tenImage.setImageDrawable(getDrawableImage(ten));
        }
        if ((hundred != prevHundred) || (count == 0)) {
            hundredImage.setImageDrawable(getDrawableImage(hundred));
        }
        if ((thousand != prevThousand) || (count == 0)) {
            thousandImage.setImageDrawable(getDrawableImage(thousand));
        }
        prevThousand = thousand;
        prevHundred = hundred;
        prevTen = ten;
        prevUnit = unit;
    }

    private Drawable getDrawableImage(int number) {
        switch (number) {
            case 0:
                return getResources().getDrawable(R.drawable.zero);
            case 1:
                return getResources().getDrawable(R.drawable.one);
            case 2:
                return getResources().getDrawable(R.drawable.two);
            case 3:
                return getResources().getDrawable(R.drawable.three);
            case 4:
                return getResources().getDrawable(R.drawable.four);
            case 5:
                return getResources().getDrawable(R.drawable.five);
            case 6:
                return getResources().getDrawable(R.drawable.six);
            case 7:
                return getResources().getDrawable(R.drawable.seven);
            case 8:
                return getResources().getDrawable(R.drawable.eight);
            case 9:
                return getResources().getDrawable(R.drawable.nine);
            default:
                return null;
        }
    }

}
