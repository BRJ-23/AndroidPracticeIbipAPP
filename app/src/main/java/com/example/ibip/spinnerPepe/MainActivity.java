package com.example.ibip.spinnerPepe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.ibip.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Nombres> listaCiudades;
    Spinner sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spinner_pepe_activity);
        sp = (Spinner) findViewById(R.id.spinner);
        listaCiudades = new ArrayList<Nombres>();
        llenar();

        MiAdapter adapter = new MiAdapter(this, R.layout.spinner_pepe_linea_activity, listaCiudades);
        sp.setAdapter(adapter);

        //ojo al tipo de listener sobre AdapterView
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                TextView tv = findViewById(R.id.seleccion);
                tv.setText("Has pulsado: " + listaCiudades.get(position).getNombre());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

        });


    }

    private void llenar() {
        //Como pasar un drawable al constructor de la Clase Nombres
        listaCiudades.add(new Nombres("Albacete", "Albacete desc", R.drawable.albacete));
        listaCiudades.add(new Nombres("Ciudad Real", "Ciudad Real desc", R.drawable.ciudadreal));
        listaCiudades.add(new Nombres("Cuenca", "Cuenca desc", R.drawable.cuenca));
        listaCiudades.add(new Nombres("Guadalajara", "Guadalajara desc", R.drawable.guadalajara));
        listaCiudades.add(new Nombres("Toledo", "Toledo desc", R.drawable.toledo));
    }
}