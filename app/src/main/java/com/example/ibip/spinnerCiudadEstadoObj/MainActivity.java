package com.example.ibip.spinnerCiudadEstadoObj;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ibip.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    TextView resultCiudad;
    ImageView imagen;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spinnerciudadestado_activity);
        spinner = (Spinner) findViewById(R.id.spinerciudad);
        resultCiudad = (TextView) findViewById(R.id.resulciudad);



        List<Ciudades> paisLista = new ArrayList<>();
        Ciudades pais1  = new Ciudades(1, "España","Madrid",40000000,219391.29, R.drawable.aa);
        Ciudades pais2  = new Ciudades(2, "Alemania","Berlin",41000000,289391.29, R.drawable.ab);
        Ciudades pais3  = new Ciudades(3, "Francia","Paris",44440000,289391.29, R.drawable.ac);
        Ciudades pais4  = new Ciudades(4, "Italia","Roma",40033300,119391.29, R.drawable.ad);
        Ciudades pais5  = new Ciudades(5, "Lux","Lux",411100,9391.29, R.drawable.ae);
        paisLista.add(pais1);
        paisLista.add(pais2);
        paisLista.add(pais3);
        paisLista.add(pais4);
        paisLista.add(pais5);

        ArrayAdapter<Ciudades> adapter = new ArrayAdapter<Ciudades>(this, android.R.layout.simple_spinner_item, paisLista  );
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                Ciudades paiss = (Ciudades) parent.getSelectedItem();
                pillarpais(paiss);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }


    public void pillarpais(Ciudades v) {
        Ciudades pas = (Ciudades) spinner.getSelectedItem();
        displayUserData(pas);
    }

    private void displayUserData(Ciudades pas) {
        String pais = pas.getPais();
        String capital = pas.getCapital();
        int habitantes = pas.getNumHabitantes();
        Double extension = pas.getExtensionGeo();
        int banderas = pas.getBandera();
        imagen = (ImageView) findViewById(R.id.imgView);
        imagen.setImageDrawable(getResources().getDrawable(pas.bandera));
        resultCiudad.setText("Pais: " + pais + "\nCapital: " + capital + "\nHabitantes: " + habitantes + "\nExtension: " + extension + "\nBanderas: " + banderas);

    }
}