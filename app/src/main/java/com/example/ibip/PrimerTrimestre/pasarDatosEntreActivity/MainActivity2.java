package com.example.ibip.PrimerTrimestre.pasarDatosEntreActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.ibip.R;


public class MainActivity2 extends AppCompatActivity {

    private TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pasardatos2_activity);

        tv1 = findViewById(R.id.obtener);
        //Alojamos el dato enviado desde el 1º activity y usamos su llave de referencia
        String dato = getIntent().getStringExtra("llaveReferencia");
        tv1.setText("Hola " + dato);
    }

    // Método botón regresar
    public void regresando(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }


}