package com.example.ibip.spinnerPepe;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.ibip.R;

import java.util.ArrayList;

public class MiAdapter extends ArrayAdapter<Nombres> {

    private Context context;
    private int layout;
    private ArrayList<Nombres> names;


    public MiAdapter(Context ctx, int layout, ArrayList<Nombres> names){
        super(ctx,layout,names);
        this.context = ctx;
        this.layout = layout;
        this.names = names;

    }

    @Override
    public View getDropDownView(int position, View cnvtView, ViewGroup prnt){
        return crearFilaPersonalizada(position, cnvtView, prnt);
    }

    @Override
    public View getView(int pos, View cnvtView, ViewGroup prnt){

        // Copiamos la vista
        View v = cnvtView;

        //Inflamos la vista con nuestro propio layout
        LayoutInflater layoutInflater = LayoutInflater.from(this.context);
        v= layoutInflater.inflate(R.layout.spinner_pepe_linea_activity, null);

        // Valor actual según la posición
        String nombre  = names.get(pos).getNombre();
        String desc = names.get(pos).getApellidos();
        int image = names.get(pos).getBandera();

        // Referenciamos el elemento a modificar y lo rellenamos
        TextView textView1 = (TextView) v.findViewById(R.id.nombre);
        textView1.setText(nombre);
        TextView textView2 = (TextView) v.findViewById(R.id.descripcion);
        textView2.setText(desc);
        ImageView iv = (ImageView) v.findViewById(R.id.imagenCiudad);
        iv.setImageResource(image);

        //Devolvemos la vista inflada
        return v;

    }

    //ARREGLADO
    public View crearFilaPersonalizada(int position, View convertView, ViewGroup parent){

        LayoutInflater inflater = LayoutInflater.from(this.context);
        View miFila = inflater.inflate(R.layout.spinner_pepe_linea_activity, parent, false);
        TextView nombre = (TextView) miFila.findViewById(R.id.nombre);
        nombre.setText(names.get(position).getNombre());
        TextView descripcion = (TextView) miFila.findViewById(R.id.descripcion);
        descripcion.setText(names.get(position).getApellidos());
        ImageView imagen = (ImageView) miFila.findViewById(R.id.imagenCiudad);
        imagen.setImageResource(names.get(position).getBandera());
        return miFila;

    }

    /* @Override
    public int getCount() {
        return this.names.size();
    }

    @Override
    public Object getItem(int position) {
        return this.names.get(position);
    }

    @Override
    public long getItemId(int id) {
        return id;
    }
    */
}