package com.example.ibip.PrimerTrimestre.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.ibip.ibipExtra.ascreen.Main;
import com.example.ibip.R;

public class MainActivity extends AppCompatActivity {
    private EditText textnumA;
    private EditText textnumB;
    private TextView textresult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator_activity);

        textnumA = findViewById(R.id.numA);
        textnumB = findViewById(R.id.numB);
        textresult = findViewById(R.id.resultado);
    }


    public void sumar(View view){
        double operacion = Double.parseDouble(textnumA.getText().toString()) + Double.parseDouble(textnumB.getText().toString());
        textresult.setText(operacion+"");
    }

    public void restar(View view){
        double operacion = Double.parseDouble(textnumA.getText().toString()) - Double.parseDouble(textnumB.getText().toString());
        textresult.setText(operacion+"");
    }

    public void multiplicar(View view){
        double operacion = Double.parseDouble(textnumA.getText().toString()) * Double.parseDouble(textnumB.getText().toString());
        textresult.setText(operacion+"");
    }

    public void dividir(View view){
        double operacion = Double.parseDouble(textnumA.getText().toString()) / Double.parseDouble(textnumB.getText().toString());
        textresult.setText(operacion+"");
    }

    public void saltarPagina(View view){
        Intent i = new Intent(this, Main.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
        finish();


    }


}