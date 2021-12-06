package com.example.ibip.pasarDatosActivityResultadoAtrasCalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.ibip.R;

public class MainActivity extends AppCompatActivity {
    private EditText et1;
    private EditText et2;
    private TextView result ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pasardatosresultado_1_activity);
        et1 = (EditText) findViewById(R.id.mensaje);  //Lo que introduce el usuario
        et2 = (EditText) findViewById(R.id.mensaje2);
        result = (TextView) findViewById(R.id.resultadoText);

        //Alojamos el dato enviado desde el 1º activity y usamos su llave de referencia
        String datoback = getIntent().getStringExtra("llaveReferenciaBack");
        result.setText(datoback);
    }

    //Método para enviar
    public void enviarTextoAOtraActivity(View view){
        Intent i = new Intent(this, com.example.ibip.pasarDatosActivityResultadoAtrasCalculadora.MainActivity2.class);
        i.putExtra("llaveReferencia", et1.getText().toString());  //Etiqueta de referencia
        i.putExtra("llaveReferencia2",et2.getText().toString());
        startActivity(i);
    }


    public void gobackmenu(View view){
        Intent i = new Intent(this, com.example.ibip.ascreen.Main.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
        finish();

    }
}