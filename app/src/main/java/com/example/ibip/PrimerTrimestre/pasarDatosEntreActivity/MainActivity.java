package com.example.ibip.PrimerTrimestre.pasarDatosEntreActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.ibip.R;

public class MainActivity extends AppCompatActivity {
    private EditText et1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pasardatos1_activity);
        et1 = (EditText) findViewById(R.id.mensaje);  //Lo que introduce el usuario
    }

    //Método para enviar
    public void enviarTextoAOtraActivity(View view){
        Intent i = new Intent(this, MainActivity2.class);
        i.putExtra("llaveReferencia", et1.getText().toString());  //Etiqueta de referencia
        startActivity(i);
    }

   /* public void enviarNumeroAOtraActivity(View view){
        Intent i = new Intent(this, MainActivity2.class);
        i.putExtra("llaveNumero",)
    }*/


    public void gobackmenu(View view){
        Intent i = new Intent(this, com.example.ibip.ibipExtra.ascreen.Main.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
        finish();

    }
}