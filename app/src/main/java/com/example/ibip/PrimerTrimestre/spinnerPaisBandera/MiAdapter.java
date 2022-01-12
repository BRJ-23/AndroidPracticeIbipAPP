package com.example.ibip.PrimerTrimestre.spinnerPaisBandera;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ibip.R;

import java.util.ArrayList;

public class MiAdapter extends ArrayAdapter<PaisInfo> {

    private Context context;
    private int layout;
    private ArrayList<PaisInfo> names;


    public MiAdapter(Context ctx, int layout, ArrayList<PaisInfo> names){
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
        v= layoutInflater.inflate(R.layout.spinner_paisbandera_linea_activity, null);

        // Valor actual según la posición
        String nombre  = names.get(pos).getNombre();
        String desc = names.get(pos).getCapital();
        String ext = names.get(pos).getExtension();
        String hab = names.get(pos).getHabitantes();
        int image = names.get(pos).getBandera();

        // Referenciamos el elemento a modificar y lo rellenamos
        TextView textView1 = (TextView) v.findViewById(R.id.nombrePais);
        textView1.setText(nombre);
        TextView textView2 = (TextView) v.findViewById(R.id.capitalPais);
        textView2.setText(desc);
        TextView tv3 = (TextView) v.findViewById(R.id.extensionpais);
        tv3.setText(ext);
        TextView tv4 = (TextView) v.findViewById(R.id.habitantepais);
        tv4.setText(hab);
        ImageView iv = (ImageView) v.findViewById(R.id.imagenPais);
        iv.setImageResource(image);

        //Devolvemos la vista inflada
        return v;

    }

    //ARREGLADO
    public View crearFilaPersonalizada(int position, View convertView, ViewGroup parent){

        LayoutInflater inflater = LayoutInflater.from(this.context);
        View miFila = inflater.inflate(R.layout.spinner_paisbandera_linea_activity, parent, false);
        TextView nombre = (TextView) miFila.findViewById(R.id.nombrePais);
        nombre.setText(names.get(position).getNombre());
        TextView descripcion = (TextView) miFila.findViewById(R.id.capitalPais);
        descripcion.setText(names.get(position).getCapital());
        TextView extension = (TextView) miFila.findViewById(R.id.extensionpais);
        extension.setText(names.get(position).getExtension());
        TextView habitantes = (TextView) miFila.findViewById(R.id.habitantepais);
        habitantes.setText(names.get(position).getHabitantes());
        ImageView imagen = (ImageView) miFila.findViewById(R.id.imagenPais);
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