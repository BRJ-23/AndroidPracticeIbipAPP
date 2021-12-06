package com.example.ibip.gridlayoutButtons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.ibip.R;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gridlayoutbuttons_activity);
        Poblar();
        //Recorrer();
    }

    public void Poblar() {
        GridLayout gl = (GridLayout) findViewById(R.id.griddre);
        int nBtns = gl.getColumnCount() * gl.getRowCount();
        for (int i = 0; i < nBtns; i++) {
            Button btn = new Button(this);
            btn.setId(i+1);

            if (nBtns == btn.getId()){
                btn.setText("Reset");
                btn.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(), Integer.toString(btn.getId()), Toast.LENGTH_SHORT).show();
                        if (btn.isPressed()) {
                            Pintar();
                        }
                    }
                });
            } else {
                btn.setText("Btn " + (i + 1));
                btn.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(), Integer.toString(btn.getId()), Toast.LENGTH_SHORT).show();
                        if (btn.isPressed()) {
                            findViewById(btn.getId()).setBackgroundColor(getResources().getColor(R.color.white));
                        }
                    }
                });
            }
            btn.setHeight(ViewGroup.LayoutParams.MATCH_PARENT);
            btn.setWidth(ViewGroup.LayoutParams.MATCH_PARENT);
            btn.requestLayout();
            gl.addView(btn);

        }

    }

    public void Pintar(){
        GridLayout gl = (GridLayout) findViewById(R.id.griddre);
        int nBtns = gl.getColumnCount() * gl.getRowCount();
        for (int i = 0; i < nBtns; i++){
            Button btn = findViewById(i+1);
            switch (i+1) {
                case 1:
                case 7:
                case 13:
                    btn.setBackgroundColor(getResources().getColor(R.color.teal_200));
                    break;
                case 2:
                case 8:
                case 14:
                    btn.setBackgroundColor(getResources().getColor(R.color.purple_200));
                    break;
                case 3:
                case 9:
                case 15:
                    btn.setBackgroundColor(getResources().getColor(R.color.purple_500));
                    break;
                case 4:
                case 10:
                case 16:
                    btn.setBackgroundColor(getResources().getColor(R.color.purple_700));
                    break;
                case 5:
                case 11:
                case 17:
                    btn.setBackgroundColor(getResources().getColor(R.color.teal_700));
                    break;
                case 6:
                case 12:
                case 18:
                    btn.setBackgroundColor(getResources().getColor(R.color.black));
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + i);
            }
        }
    }

    public void Recorrer() {
        View v;
        GridLayout gl = (GridLayout) findViewById(R.id.griddre);
        for (int i = 0; i < gl.getChildCount(); i++) {
            v = gl.getChildAt(i);
            Toast.makeText(this, "objeto: " + v.toString(), Toast.LENGTH_SHORT).show();
        }
    }
}