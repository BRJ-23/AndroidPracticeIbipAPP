package com.example.ibip.spinnerConversor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.ibip.R;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    EditText et1;
    TextView resultMedida, resultMedida2, resultMedida3, resultMedida4, resultMedida5;
    String checker;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spinnerconversor_activity);
        spinner = (Spinner) findViewById(R.id.spinerciudad);
        et1 = (EditText) findViewById(R.id.numMedida);

        resultMedida = (TextView) findViewById(R.id.resulMedidas);
        resultMedida2 = (TextView)findViewById(R.id.resulMedidas2);
        resultMedida3 =(TextView) findViewById(R.id.resulMedidas3);
        resultMedida4 = (TextView)findViewById(R.id.resulMedidas4);
        resultMedida5 =(TextView) findViewById(R.id.resulciudad);
        String [] operaciones = {"Metro","Kilometro","Yardas","Pulgadas","Pies"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.spinner_item, operaciones );
        spinner.setAdapter(adapter);

        // EVENTO QUE SE ACTIVA TRAS LA MANIPULACIÓN DEL USUARIO EN UN EDITTEXT

        et1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String selecCheck = spinner.getSelectedItem().toString();
                if(!charSequence.equals("")){
                    calcular();
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {


            }
        });

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                calcular();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }

    private void calcular(){
        checker = et1.getText().toString();
        if(checker != null && checker.length() > 0) {
            Double value;
            value = Double.parseDouble(et1.getText().toString());
            String seleccion = spinner.getSelectedItem().toString();

            if (seleccion.equals("metro")) {
                Double metros = value;
                Double kilometros = value / 1000;
                Double yardas = value * 1.0936;
                Double pulgadas = value * 39.370;
                Double pies = value * 3.2808;

                mostrarTexto(metros, kilometros, yardas, pulgadas, pies);

            } else if (seleccion.equals("kilometro")) {
                Double metros = value * 1000;
                Double kilometros = value;
                Double yardas = value * 1.0936 * 1000;
                Double pulgadas = value * 39.370 * 1000;
                Double pies = value * 3.2808 * 1000;

                mostrarTexto(metros, kilometros, yardas, pulgadas, pies);

            } else if (seleccion.equals("yardas")) {
                Double metros = value / 1.0936;
                Double kilometros = value / 1093.6;
                Double yardas = value;
                Double pulgadas = value * 36.000;
                Double pies = value * 3.0000;

                mostrarTexto(metros, kilometros, yardas, pulgadas, pies);

            } else if (seleccion.equals("pulgadas")) {
                Double metros = value / 39.370;
                Double kilometros = value / 39370;
                Double yardas = value * 0.027778;
                Double pulgadas = value;
                Double pies = value * 0.083333;

                mostrarTexto(metros, kilometros, yardas, pulgadas, pies);


            } else if (seleccion.equals("pies")) {
                Double metros = value / 3.2808;
                Double kilometros = value / 3280.8;
                Double yardas = value * 0.33333;
                Double pulgadas = value * 12.000;
                Double pies = value;

                mostrarTexto(metros, kilometros, yardas, pulgadas, pies);

            }

        }else {
            resultMedida.setText("Metros: " + 0);
            resultMedida2.setText("Kilometros: " + 0);
            resultMedida3.setText("Yardas: " + 0);
            resultMedida4.setText("Pulgadas: " + 0);
            resultMedida5.setText("Pies: " + 0);


        }
    }


    public void mostrarTexto(double metros, double kilometros, double yardas, double pulgadas, double pies){
        resultMedida.setText("Metros: " + metros);
        resultMedida2.setText("Kilometros: " + kilometros);
        resultMedida3.setText("Yardas: " + yardas);
        resultMedida4.setText("Pulgadas: " + pulgadas);
        resultMedida5.setText("Pies: " + pies);
    }


}