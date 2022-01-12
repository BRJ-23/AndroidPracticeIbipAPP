package com.example.ibip.PrimerTrimestre.listviewcustom;

import android.os.Bundle;
import android.widget.ListView;

import com.example.ibip.R;


import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    //datos a cargar mediante un adapter
    ListView lvProgram;
    String[] ciudades = {"Toledo", "Ciudad Real",
            "Albacete", "Cuenca", "Guadalajara"};

    String[] descripciones = {"La ciudad Imperial", "Qué gran ciudad",
            "Ciudad gastronómica", "Ciudad encantada", "Ciudad colgante"};

    int imagenes[] = {R.drawable.toledo, R.drawable.ciudadreal,
            R.drawable.albacete, R.drawable.cuenca,
            R.drawable.guadalajara};


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listviewcustom_activity);
        lvProgram = (ListView) findViewById(R.id.lvProgram);

        ProgramAdapter programAdapter = new ProgramAdapter(this, ciudades, descripciones, imagenes);
        lvProgram.setAdapter(programAdapter);


    }


}