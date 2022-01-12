package com.example.ibip.ibipExtra.ascreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.ibip.PrimerTrimestre.webview.MainActivity2;
import com.example.ibip.PrimerTrimestre.recyclerview.MainActivity;
import com.example.ibip.R;
import com.example.ibip.PrimerTrimestre.dialogos.DialogoActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class  Main extends AppCompatActivity {

    SharedPreferences preferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ascreen_activity);
        FloatingActionButton fab = findViewById(R.id.floatingbutton);
        preferences = this.getSharedPreferences("sesiones",Context.MODE_PRIVATE);
        editor = preferences.edit();

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editor.putBoolean("sesion", false);
                editor.apply();
                Toast.makeText(Main.this, "Sesión cerrada", Toast.LENGTH_SHORT).show();
                finish();

            }
        });

    }



    public void calculadora(View view){
        Intent i = new Intent(this, com.example.ibip.PrimerTrimestre.calculadora.MainActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);


    }

    public void vistaweb(View view){
        Intent i = new Intent(this, MainActivity2.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);

    }

    public void recyclers(View view){
        Intent i = new Intent(this, MainActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);

    }

    public void dialogos(View view){
        Intent i = new Intent(this, DialogoActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);

    }

    public void listVista(View view){
        Intent i = new Intent(this, com.example.ibip.PrimerTrimestre.listview.MainActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);

    }


    public void listacustom(View view){
        Intent i = new Intent(this, com.example.ibip.PrimerTrimestre.listviewcustom.MainActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);


    }


    public void verCiclo(View view){
        Intent i = new Intent(this, com.example.ibip.PrimerTrimestre.cicloVida.MainActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }

    public void pasarDatos(View view){
        Intent i = new Intent(this, com.example.ibip.PrimerTrimestre.pasarDatosEntreActivity.MainActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }


    public void gridviewcosas(View view){
        Intent i = new Intent(this, com.example.ibip.PrimerTrimestre.gridviewfrutas.MainActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }

    public void botonescolores(View view){
        Intent i = new Intent(this, com.example.ibip.PrimerTrimestre.gridlayoutButtons.MainActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }

    public void picker(View view){
        Intent i = new Intent(this, com.example.ibip.ibipExtra.colorpicker.MainActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }

    public void pasarDatosResultado(View view){
        Intent i = new Intent(this, com.example.ibip.PrimerTrimestre.calculadorapasarDatosActivityResultadoAtras.MainActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }


        public void conversorMedidas(View view){
            Intent i = new Intent(this, com.example.ibip.PrimerTrimestre.spinnerConversor.MainActivity.class);
            i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(i);
        }

        public void calendarview(View view){
            Intent i = new Intent(this, com.example.ibip.PrimerTrimestre.calendarAndVideoWidget.MainActivity.class);
            i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(i);

    }


    public void ciudadEstado(View view){
        Intent i = new Intent(this, com.example.ibip.PrimerTrimestre.spinnerCiudadEstadoObj.MainActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }


    public void smsenviar(View view){
        Intent i = new Intent(this, com.example.ibip.PrimerTrimestre.enviarsms.MainActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }

    public void listviewpepe(View view){
        Intent i = new Intent(this, com.example.ibip.PrimerTrimestre.listViewPepe.MainActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }

    public void spinnerpepe(View view){
        Intent i = new Intent(this, com.example.ibip.PrimerTrimestre.spinnerPepe.MainActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }


    public void listviewguide(View view){
        Intent i = new Intent(this, com.example.ibip.PrimerTrimestre.adapter.MainActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }

    public void spinnerpaisito(View view){
        Intent i = new Intent(this, com.example.ibip.PrimerTrimestre.spinnerPaisBandera.MainActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }







}