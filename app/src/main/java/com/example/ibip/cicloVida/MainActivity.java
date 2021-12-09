package com.example.ibip.cicloVida;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.ibip.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zexample_ciclovida_guide);
        Toast.makeText(this, "OnCreate",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart(){
        super.onStart();
        Toast.makeText(this, "OnStart",Toast.LENGTH_SHORT).show();
        //Actividad apunto de hacerse visible
    }

    @Override
    protected void onResume(){
        super.onResume();
        Toast.makeText(this, "OnResume",Toast.LENGTH_SHORT).show();
        //Actividad se ha vuelto visible y se reanuda
    }

    @Override
    protected void onPause(){
        super.onPause();
        Toast.makeText(this, "OnPause",Toast.LENGTH_SHORT).show();
        //Enfocarse a otra actividad. Se "detiene" la actividad
    }

    @Override
    protected void onStop(){
        super.onStop();
        Toast.makeText(this, "OnStop",Toast.LENGTH_SHORT).show();
        //La actividad ya no es visible
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(this, "OnDestroy",Toast.LENGTH_SHORT).show();
        //Actividad apunto de destruirse
    }




}