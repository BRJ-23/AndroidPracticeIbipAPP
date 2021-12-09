package com.example.ibip.Utilities___X.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.ibip.R;

import java.util.List;


/*Grande el adaptador! Re épico.
* El adaptador en estos casos siempre va EXTENDER de un ArrayAdapter y DENTRO llevará el Objeto que creamos(InfoQueRecoger)
* Seguramente veas una pedazo linea roja.
* Nada, marcas create Constructor y eliges el 3º y se soluciona la vida
*
* ¡Info extra! A la hora de elegir salen varias opciones. Bueno, cada una es según el caso. En este caso
* solo interesa la 3º que es la que dice Objects:T[] al final*/

public class Adaptador extends ArrayAdapter<InfoQueRecoger> {

    //[PASO 2: Ahora declaramos un List y dentro metemos nuestro Objeto. Si sabes que es un List, no hay nada más que decir.
    private List<InfoQueRecoger> lista;
    //[PASO 4: Ahora referimos aquí lo que se usará en el adaptador que anda como parámetro.
    private Context contexto;


    /*[PASO 3: En el constructor que generamos antes. Quitamos un Array terrible que sale y declaramos de nuevo el List
    va al final del último @NonNull. NO BORRES objects.
     */
    public Adaptador(@NonNull Context context, int resource, @NonNull List<InfoQueRecoger> objects) {
        super(context, resource, objects);
        this.lista = objects;  //Se pilla lista de arriba y objects. Esto serán los objetos que tendrá el Adapter.
        this.contexto = context; //Esto es donde vamos asignar los datos.
    }

    /*[PASO 5: Ahora que ya está el adaptador. Toca BUSCAR LAS VISTAS.
    * Para ello escribe sin más getView y dale ENTER*/

    @NonNull
    @Override
    /*Retorna una vista inflada de todos los elementos que irán en cada posición del ListView*/
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView; //Esto es super obligatorio. Se entiende bien en inglés la idea.

        //Aquí son condiciones para evitar lios con la vista. Es necesario, si.
        if(view == null){
            /*Aquí ya pillamos el item xml. Pues vamos a rellenar el layout lista CON ESA PLANTILLA.
            El null es porque no es groupView. Si no se lo pones peta.*/
            view = LayoutInflater.from(contexto).inflate(R.layout.zexample_adapter_item_guide, null);

        }
        //Aquí pillamos la posición del elemento en el que se haga click
        InfoQueRecoger infoquerecoger = lista.get(position);

        //Ahora definimos lo del item para que lo encuentre. Vamos, las ID del xml item_guide.
        /*Aquí en pocas palabras estabos definiendo las ID y declaramos las vistas,  */
        ImageView foto = view.findViewById(R.id.imagenguia);
        foto.setImageResource(infoquerecoger.getImage());

        TextView nombre = view.findViewById(R.id.textoNombre);
        nombre.setText(infoquerecoger.getNombre());

        TextView edad = view.findViewById(R.id.textoEdad);
        edad.setText(infoquerecoger.getEdad());

        return view;
    }

/*
// CODIGO LIMPIO SIN COMENTARIOS GUIA


public class Adaptador extends ArrayAdapter<InfoQueRecoger> {

    private List<InfoQueRecoger> lista;
    private Context contexto;

    public Adaptador(@NonNull Context context, int resource, @NonNull List<InfoQueRecoger> objects) {
        super(context, resource, objects);
        this.lista = objects;
        this.contexto = context;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;
        if(view == null){
            view = LayoutInflater.from(contexto).inflate(R.layout.zexample_adapter_item_guide, null);

        }

        InfoQueRecoger infoquerecoger = lista.get(position);


        //Declaraciones
        ImageView foto = view.findViewById(R.id.imagenguia);
        foto.setImageResource(infoquerecoger.getImage());

        TextView nombre = view.findViewById(R.id.textoNombre);
        nombre.setText(infoquerecoger.getNombre());

        TextView edad = view.findViewById(R.id.textoEdad);
        edad.setText(infoquerecoger.getEdad());

        return view;
    }
}
*/


}
