package com.example.ibip.listViewPepe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.ibip.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {

    private ListView listview;
    ArrayList<Nombres> listaCiudades;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.listview_pepe_inflate_activity);
        listview = (ListView) findViewById(R.id.listViewPais);
        listaCiudades = new ArrayList<Nombres>();
        llenar();

        MiAdaptador adapter = new MiAdaptador(this, R.layout.listview_pepe_linea_acivity, listaCiudades);
        listview.setAdapter(adapter);



        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                TextView tv = findViewById(R.id.seleccionPais);
                tv.setText("has pulsado" + listaCiudades.get(position).getNombre());
            }
        });


    }

    private void llenar() {
        //Como pasar un drawable al constructor de la Clase Nombres
        listaCiudades.add(new Nombres("Albacete", "Albacete desc", R.drawable.albacete) );
        listaCiudades.add(new Nombres("Ciudad Real", "Ciudad Real desc", R.drawable.ciudadreal) );
        listaCiudades.add(new Nombres("Cuenca", "Cuenca desc", R.drawable.cuenca) );
        listaCiudades.add(new Nombres("Guadalajara", "Guadalajara desc", R.drawable.guadalajara) );
        listaCiudades.add(new Nombres("Toledo", "Toledo desc", R.drawable.toledo) );
    }



}