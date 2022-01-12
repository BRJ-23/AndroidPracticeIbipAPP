package com.example.ibip.ibipExtra.colorpicker;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ibip.R;

public class MainActivity extends AppCompatActivity {
    ImageView iv;
    TextView values;
    View colorview;

    Bitmap bitmap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.colorpicker_activity);

        iv = findViewById(R.id.color);
        values = findViewById(R.id.colorvalue);
        colorview = findViewById(R.id.displaycolor);

        iv.setDrawingCacheEnabled(true);
        iv.buildDrawingCache(true);

        iv.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN || motionEvent.getAction() == MotionEvent.ACTION_MOVE){
                    bitmap = iv.getDrawingCache();
                    int px = 0;
                    if ((((int)motionEvent.getY() < iv.getHeight()) && ((int)motionEvent.getY() > 10)) &&
                            (((int)motionEvent.getX() < iv.getWidth()) && ((int)motionEvent.getX() > 10))) {
                        px = bitmap.getPixel((int)motionEvent.getX(), (int) motionEvent.getY());
                    }


                    int r = Color.red(px);
                    int g = Color.green(px);
                    int b = Color.blue(px);

                    String hex = '#'+ Integer.toHexString(px);
                    colorview.setBackgroundColor(Color.rgb(r,g,b));
                    values.setText("RGB: "+r+", "+g+", "+b+" \nHEX:" +hex);
                }
                return true;
            }
        });

    }
}