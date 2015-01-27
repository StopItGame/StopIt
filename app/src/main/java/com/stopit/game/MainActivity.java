package com.stopit.game;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;


public class MainActivity extends Activity {

    private GridView gridView;
    private LightAdapter lightAdapter;

    private Boolean lights[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lights = new Boolean[390];

        for (int i = 0; i < lights.length; i++) {

            if ((i % 15) == 0) {
                lights[i] = true;
            } else {
                lights[i] = false;
            }
        }

        gridView = (GridView) findViewById(R.id.activity_main_grid);

        lightAdapter = new LightAdapter(getApplicationContext(), lights);
        gridView.setAdapter(lightAdapter);

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
