package com.stopit.game;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;


public class MainActivity extends Activity {

    private static final String TAG = "MainActivity";

    private GridView gridViewThousand;
    private GridView gridViewHundred;
    private GridView gridViewTen;
    private GridView gridViewUnit;
    private LightAdapter lightAdapterThousand;
    private LightAdapter lightAdapterHundred;
    private LightAdapter lightAdapterTen;
    private LightAdapter lightAdapterUnit;

    private Boolean lightsThousand[];
    private Boolean lightsHundred[];
    private Boolean lightsTen[];
    private Boolean lightsUnit[];

    private CountDownTimer timer;
    private int count;

    private int prevUnit = 0;
    private int prevTen = 0;
    private int prevHundred = 0;
    private int prevThousand = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lightsThousand = new Boolean[91];
        lightsHundred = new Boolean[91];
        lightsTen = new Boolean[91];
        lightsUnit = new Boolean[91];

        gridViewUnit = (GridView) findViewById(R.id.activity_main_grid1);
        gridViewTen = (GridView) findViewById(R.id.activity_main_grid2);
        gridViewHundred = (GridView) findViewById(R.id.activity_main_grid3);
        gridViewThousand = (GridView) findViewById(R.id.activity_main_grid4);

        count = 0;
        updateLights(count);

        lightAdapterThousand = new LightAdapter(getApplicationContext(), lightsThousand);
        lightAdapterHundred = new LightAdapter(getApplicationContext(), lightsHundred);
        lightAdapterTen = new LightAdapter(getApplicationContext(), lightsTen);
        lightAdapterUnit = new LightAdapter(getApplicationContext(), lightsUnit);

        gridViewThousand.setAdapter(lightAdapterThousand);
        gridViewHundred.setAdapter(lightAdapterHundred);
        gridViewTen.setAdapter(lightAdapterTen);
        gridViewUnit.setAdapter(lightAdapterUnit);


        timer = new CountDownTimer(60 * 1000, 50) {
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
            updateLightsArray(unit, 1);
            lightAdapterUnit = new LightAdapter(getApplicationContext(), lightsUnit);
            gridViewUnit.setAdapter(lightAdapterUnit);
        }
        if ((ten != prevTen) || (count == 0)) {
            updateLightsArray(ten, 2);
            lightAdapterTen = new LightAdapter(getApplicationContext(), lightsTen);
            gridViewTen.setAdapter(lightAdapterTen);
        }
        if ((hundred != prevHundred) || (count == 0)) {
            updateLightsArray(hundred, 3);
            lightAdapterHundred = new LightAdapter(getApplicationContext(), lightsHundred);
            gridViewHundred.setAdapter(lightAdapterHundred);
        }
        if ((thousand != prevThousand) || (count == 0)) {
            updateLightsArray(thousand, 4);
            lightAdapterThousand = new LightAdapter(getApplicationContext(), lightsThousand);
            gridViewThousand.setAdapter(lightAdapterThousand);
        }

        prevThousand = thousand;
        prevHundred = hundred;
        prevTen = ten;
        prevUnit = unit;
    }

    private void updateLightsArray(int unit, int position) {
        for (int i = 0; i < 91; i++) {
            if (position == 1) {
                lightsUnit[i] = false;
            } else if (position == 2) {
                lightsTen[i] = false;
            } else if (position == 3) {
                lightsHundred[i] = false;
            } else if (position == 4) {
                lightsThousand[i] = false;
            }
        }

        for (int i = 0; i < 91; i++) {
            boolean needToChange = false;
            switch (unit) {
                case 0:
                    if ((i == 1) || (i == 2) || (i == 3) || (i == 4) || (i == 5) || (i == 8) || (i == 12) || (i == 15) || (i == 19) || (i == 22) || (i == 26) || (i == 29) || (i == 33) || (i == 36) || (i == 40) || (i == 43) || (i == 47) || (i == 50) || (i == 54) || (i == 57) || (i == 61) || (i == 64) || (i == 68) || (i == 71) || (i == 75) || (i == 78) || (i == 82) || (i == 85) || (i == 86) || (i == 87) || (i == 88) || (i == 89)) {
                        needToChange = true;
                    }
                    break;
                case 1:
                    if ((i == 3) || (i == 10) || (i == 17) || (i == 24) || (i == 31) || (i == 38) || (i == 45) || (i == 52) || (i == 59) || (i == 66) || (i == 73) || (i == 80) || (i == 87)) {
                        needToChange = true;
                    }
                    break;
                case 2:
                    if ((i == 1) || (i == 2) || (i == 3) || (i == 4) || (i == 5) || (i == 12) || (i == 19) || (i == 26) || (i == 33) || (i == 40) || (i == 43) || (i == 44) || (i == 45) || (i == 46) || (i == 47) || (i == 50) || (i == 57) || (i == 64) || (i == 71) || (i == 78) || (i == 85) || (i == 86) || (i == 87) || (i == 88) || (i == 89)) {
                        needToChange = true;
                    }
                    break;
                case 3:
                    if ((i == 1) || (i == 2) || (i == 3) || (i == 4) || (i == 5) || (i == 12) || (i == 19) || (i == 26) || (i == 33) || (i == 40) || (i == 43) || (i == 44) || (i == 45) || (i == 46) || (i == 47) || (i == 54) || (i == 61) || (i == 68) || (i == 75) || (i == 82) || (i == 85) || (i == 86) || (i == 87) || (i == 88) || (i == 89)) {
                        needToChange = true;
                    }
                    break;
                case 4:
                    if ((i == 1) || (i == 5) || (i == 8) || (i == 12) || (i == 15) || (i == 19) || (i == 22) || (i == 26) || (i == 29) || (i == 33) || (i == 36) || (i == 40) || (i == 43) || (i == 44) || (i == 45) || (i == 46) || (i == 47) || (i == 54) || (i == 61) || (i == 68) || (i == 75) || (i == 82) || (i == 89)) {
                        needToChange = true;
                    }
                    break;
                case 5:
                    if ((i == 1) || (i == 2) || (i == 3) || (i == 4) || (i == 5) || (i == 8) || (i == 15) || (i == 22) || (i == 29) || (i == 36) || (i == 43) || (i == 44) || (i == 45) || (i == 46) || (i == 47) || (i == 54) || (i == 61) || (i == 68) || (i == 75) || (i == 82) || (i == 85) || (i == 86) || (i == 87) || (i == 88) || (i == 89)) {
                        needToChange = true;
                    }
                    break;
                case 6:
                    if ((i == 1) || (i == 2) || (i == 3) || (i == 4) || (i == 5) || (i == 8) || (i == 15) || (i == 22) || (i == 29) || (i == 36) || (i == 43) || (i == 44) || (i == 45) || (i == 46) || (i == 47) || (i == 50) || (i == 54) || (i == 57) || (i == 61) || (i == 64) || (i == 68) || (i == 71) || (i == 75) || (i == 78) || (i == 82) || (i == 85) || (i == 86) || (i == 87) || (i == 88) || (i == 89)) {
                        needToChange = true;
                    }
                    break;
                case 7:
                    if ((i == 1) || (i == 2) || (i == 3) || (i == 4) || (i == 5) || (i == 12) || (i == 19) || (i == 26) || (i == 33) || (i == 40) || (i == 47) || (i == 54) || (i == 61) || (i == 68) || (i == 75) || (i == 82) || (i == 89)) {
                        needToChange = true;
                    }
                    break;
                case 8:
                    if ((i == 1) || (i == 2) || (i == 3) || (i == 4) || (i == 5) || (i == 8) || (i == 12) || (i == 15) || (i == 19) || (i == 22) || (i == 26) || (i == 29) || (i == 33) || (i == 36) || (i == 40) || (i == 43) || (i == 44) || (i == 45) || (i == 46) || (i == 47) || (i == 50) || (i == 54) || (i == 57) || (i == 61) || (i == 64) || (i == 68) || (i == 71) || (i == 75) || (i == 78) || (i == 82) || (i == 85) || (i == 86) || (i == 87) || (i == 88) || (i == 89)) {
                        needToChange = true;
                    }
                    break;
                case 9:
                    if ((i == 1) || (i == 2) || (i == 3) || (i == 4) || (i == 5) || (i == 8) || (i == 12) || (i == 15) || (i == 19) || (i == 22) || (i == 26) || (i == 29) || (i == 33) || (i == 36) || (i == 40) || (i == 43) || (i == 44) || (i == 45) || (i == 46) || (i == 47) || (i == 54) || (i == 61) || (i == 68) || (i == 75) || (i == 82) || (i == 85) || (i == 86) || (i == 87) || (i == 88) || (i == 89)) {
                        needToChange = true;
                    }
                    break;
                default:
                    break;
            }
            if (needToChange) {
                if (position == 1) {
                    lightsUnit[i] = true;
                } else if (position == 2) {
                    lightsTen[i] = true;
                } else if (position == 3) {
                    lightsHundred[i] = true;
                } else if (position == 4) {
                    lightsThousand[i] = true;
                }
            }
        }
    }

    public class LightAdapter extends BaseAdapter {

        private Context context;
        private Boolean lights[];

        public LightAdapter(Context context, Boolean lights[]) {
            this.context = context;
            this.lights = lights;
        }

        @Override
        public int getCount() {
            return lights.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView light;
            if (convertView == null) {
                light = new ImageView(context);
                int height = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 10,
                        getResources().getDisplayMetrics());
                int width = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 10,
                        getResources().getDisplayMetrics());
                light.setLayoutParams(new GridView.LayoutParams(height, width));
            } else {
                light = (ImageView) convertView;
            }
            if (lights[position]) {
                light.setImageDrawable(context.getResources().getDrawable(R.drawable.on_light));
            } else {
                light.setImageDrawable(context.getResources().getDrawable(R.drawable.off_light));
            }
            return light;
        }
    }
}
