package com.example.ibip.PrimerTrimestre.spinnerPaisBandera;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ibip.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<PaisInfo> listaPaises;
    Spinner sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spinner_paisbandera_activity);
        sp = (Spinner) findViewById(R.id.spinnerPais);
        listaPaises = new ArrayList<PaisInfo>();

        llenar();

        MiAdapter adapter = new MiAdapter(this, R.layout.spinner_paisbandera_linea_activity, listaPaises);
        sp.setAdapter(adapter);

        //ojo al tipo de listener sobre AdapterView
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                TextView tv = findViewById(R.id.seleccionPais);
                ImageView iv = findViewById(R.id.seleccionimagenpais);
                tv.setText("Has pulsado: " + listaPaises.get(position).getNombre());
                iv.setImageResource(listaPaises.get(position).getBandera());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

        });


    }

    private void llenar() {
        //Como pasar un drawable al constructor de la Clase Nombres
        listaPaises.add(new PaisInfo("Austria", "Capital: Viena", "Extensión: 80000", "Habitantes: 27304912", R.drawable.austriabandera));
        listaPaises.add(new PaisInfo("Alemania", "Capital: Berlin", "Extensión: 123552", "Habitantes: 42839123", R.drawable.alemaniabandera));
        listaPaises.add(new PaisInfo("Francia", "Capital: Paris", "Extensión: 100293", "Habitantes: 38291023", R.drawable.franciabandera));
        listaPaises.add(new PaisInfo("España", "Capital: Madrid", "Extensión: 102013", "Habitantes: 53918293", R.drawable.espanabandera));
        listaPaises.add(new PaisInfo("Grecia", "Capital: Atenas", "Extensión: 91244", "Habitantes: 49228310", R.drawable.greciabandera));
    }
}