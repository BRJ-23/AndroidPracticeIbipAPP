package com.example.ibip.intro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ibip.R;

public class Intro extends AppCompatActivity {

    int delay = 4000;
    ConstraintLayout cons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN );
        setContentView(R.layout.intro_activity);

        TextView mtext = findViewById(R.id.mainText);
        ImageView mLogo = findViewById(R.id.mainLogo);
        ImageView mMano = findViewById(R.id.mainMano);
        //Animaciones
        Animation animation1 = AnimationUtils.loadAnimation(this, R.anim.desplazararriba);
        Animation animation2 = AnimationUtils.loadAnimation(this, R.anim.desplazarabajo);
        Animation animation3 = AnimationUtils.loadAnimation(this, R.anim.desplazarizquierda);
        mLogo.setAnimation(animation1);
        mMano.setAnimation(animation3);
        mtext.setAnimation(animation2);

        //Quitar animacion
        cons = (ConstraintLayout) findViewById(R.id.introbox);
        cons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intro.this, com.example.ibip.sharedPreferencesLogin.MainActivity.class);
                startActivity(i);
                finish();


            }
        });


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(Intro.this, com.example.ibip.sharedPreferencesLogin.MainActivity.class);
                if(!isFinishing()){
                    startActivity(i);
                    finish();
                }


            }
        },delay);





    }
}