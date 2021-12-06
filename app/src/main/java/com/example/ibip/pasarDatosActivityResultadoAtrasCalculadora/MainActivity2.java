package com.example.ibip.pasarDatosActivityResultadoAtrasCalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.ibip.R;
import com.example.ibip.pasarDatosEntreActivity.MainActivity;

public class MainActivity2 extends AppCompatActivity {
    private TextView tv1;
    private TextView tv2;
    private TextView result;
    String value1, value2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pasardatosresultado_2_activity);
        tv1 = findViewById(R.id.mensajerecibido);
        tv2 = findViewById(R.id.mensajerecibido2);
        result = findViewById(R.id.resultadofgf);
        //Alojamos el dato enviado desde el 1º activity y usamos su llave de referencia
        String dato = getIntent().getStringExtra("llaveReferencia");
        String dato2 = getIntent().getStringExtra("llaveReferencia2");
        tv1.setText("Número: " + dato);
        tv2.setText("Número: " + dato2);
        value1 = dato;
        value2 = dato2;
    }


    public void sumaract(View view){
        double operacion = Double.parseDouble(value1) + Double.parseDouble(value2);
        result.setText("Resultado: "+operacion+"");
    }

    public void restaract(View view){
        double operacion = Double.parseDouble(value1) - Double.parseDouble(value2);
        result.setText("Resultado: "+operacion+"");
    }

    public void multiplicaract(View view){
        double operacion = Double.parseDouble(value1) * Double.parseDouble(value2);
        result.setText("Resultado: "+operacion+"");
    }

    public void dividiract(View view){
        double operacion = Double.parseDouble(value1) / Double.parseDouble(value2);
        result.setText("Resultado: "+operacion+"");
    }

    // Método botón regresar
    public void volverresultado(View view){
        Intent i = new Intent(this, com.example.ibip.pasarDatosActivityResultadoAtrasCalculadora.MainActivity.class);
        i.putExtra("llaveReferenciaBack", result.getText().toString());
        startActivity(i);
    }


}