package com.example.ibip.Utilities___X.adapter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import com.example.ibip.R;
import java.util.ArrayList;
import java.util.List;

/*Welcome a Inflar layouts en Listas con Objetos con un adaptador.

Para hacer esto necesitas 3 cosas:
* 1º - Crear una clase objeto        (Pues los datos a recoger y mostrar) -> InfoQueRecoger
* 2º - Crear un adaptador            (Sirve de intermediario entre el objeto, el item y el listview) -> Adaptador
* 3º - Crear un xml Item             (Donde irá la plantilla de como se va visualizar) -> zexample_adapter_item_guide.xml

* El orden de código va: 1º Clase Objeto, 2ºConfigurar activity_main, 3º Adaptador y por último el MainActivity.
* Así que aquí no tienes que ver nada hasta el final
*/

/*Para añadir un evento de clickeo (Clickar en un elemento de la lista y pase algo, se añade
* el implements y su método al clickar en el error.*/
public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView listview;  //Un adaptador necesita una listView xml base (activity_main.xml). Se declara el ListView.
    List<InfoQueRecoger> lista = new ArrayList<>(); //Se declara la lista con el objeto que hicimos.
    Adaptador adaptador; //Se declara el adaptador


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zexample_adapter_base_guide);

        listview = findViewById(R.id.guidelistview);//Se le asigna la ID del ListView del activity_main (zexample_adapter_base)

        //Se añaden los valores al objeto
        lista.add(new InfoQueRecoger("Gabriel", "Edad: 27", R.drawable.aa ));
        lista.add(new InfoQueRecoger("Eduardo Martinez", "Edad: 21", R.drawable.ae ));
        lista.add(new InfoQueRecoger("Cristobal", "Edad: 54", R.drawable.ab ));
        lista.add(new InfoQueRecoger("Belarmino Marcos", "Edad: 30", R.drawable.ad ));
        lista.add(new InfoQueRecoger("Gugu", "Edad: 17", R.drawable.aa ));
        lista.add(new InfoQueRecoger("Aritzel", "Edad: 40", R.drawable.ac ));
        lista.add(new InfoQueRecoger("Leviamar", "Edad: 68", R.drawable.ac ));
        lista.add(new InfoQueRecoger("Maria Pintos Santos", "Edad: 41", R.drawable.aa ));
        lista.add(new InfoQueRecoger("Jonathan Galea", "Edad: 33", R.drawable.ae ));

        //A la clase Adaptador se le introduce como parámetro:
        // this(aquí, este main),
        // el Layout plantilla (zexample_adapter_item... )
        // y la lista declarada arriba que contiene el objeto/clase InfoQueRecoger
        adaptador = new Adaptador(MainActivity.this,R.layout.zexample_adapter_item_guide,lista);


        listview.setAdapter(adaptador); //Se le añadie al listview el adaptador (Super importante)

        listview.setOnItemClickListener(this); //Esto es para indicar al implements a qué le estas haciendo click.
    }

    //Método generado con el implements. Requiere indicarle dónde se va ejecutar (Linea 57)
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int posicionlista, long l) {
        Toast.makeText(this, "Clickado: "+posicionlista, Toast.LENGTH_SHORT).show();
        //Esto es un simple Dialog. Puede ser un TextView o cualquier otra cosa.

    }
/*
CÓDIGO LIMPITO SIN TEXTOS !!!!! :))

    public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

        ListView listview;
        List<InfoQueRecoger> lista = new ArrayList<>();
        Adaptador adaptador;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.zexample_adapter_base_guide);

            listview = findViewById(R.id.guidelistview);

            lista.add(new InfoQueRecoger("Gabriel", "27", R.drawable.aa ));
            lista.add(new InfoQueRecoger("Eduardo Martinez", "21", R.drawable.ae ));
            lista.add(new InfoQueRecoger("Cristobal", "54", R.drawable.ab ));
            lista.add(new InfoQueRecoger("Belarmino Marcos", "30", R.drawable.ad ));
            lista.add(new InfoQueRecoger("Gugu", "17", R.drawable.aa ));
            lista.add(new InfoQueRecoger("Aritzel", "40", R.drawable.ac ));
            lista.add(new InfoQueRecoger("Leviamar", "68", R.drawable.ac ));
            lista.add(new InfoQueRecoger("Maria Pintos Santos", "41", R.drawable.aa ));
            lista.add(new InfoQueRecoger("Jonathan Galea", "33", R.drawable.ae ));
            adaptador = new Adaptador(com.example.ibip.Utilities___X.adapter.MainActivity.this,R.layout.zexample_adapter_item_guide,lista);


            listview.setAdapter(adaptador);
            listview.setOnItemClickListener(this);
        }

        //Método generado con el implements
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int posicionlista, long l) {
            Toast.makeText(this, "Clickado: "+posicionlista, Toast.LENGTH_SHORT).show();


        }
    }

    */



}