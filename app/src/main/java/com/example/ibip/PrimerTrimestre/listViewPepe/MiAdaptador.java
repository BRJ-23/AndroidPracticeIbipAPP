package com.example.ibip.PrimerTrimestre.listViewPepe;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ibip.R;

import java.util.ArrayList;

public class MiAdaptador extends BaseAdapter {
    //variables globales necesarias
    private Context context;
    private int layout;
    private ArrayList<Nombres> names;

    public MiAdaptador(Context context, int layout, ArrayList<Nombres> names) {
        this.context = context;
        this.layout = layout;
        this.names = names;
    }

    public int getCount(){
        return this.names.size()
;    }

    public Object getItem(int position){
        return this.names.get(position);
    }

    public long getItemId(int id){
        return id;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        //Copiamos la vista

        View v = convertView;
    //Inflamos la vista con nuestro propio layour
        LayoutInflater layoutInflater = LayoutInflater.from(this.context);
        v = layoutInflater.inflate(R.layout.listview_pepe_linea_acivity,null);

        //valor actual segun la posicion
        String nombre = names.get(position).getNombre();
        String desc = names.get(position).getApellidos();
        int image = names.get(position).getBandera();

        // Referenciamos el elemento a modificar y lo rellenamos
        TextView textView1 = (TextView) v.findViewById(R.id.nombrePais);
        textView1.setText(nombre);
        TextView textView2 = (TextView) v.findViewById(R.id.capitalPais);
        textView2.setText(desc);
        ImageView iv = (ImageView) v.findViewById(R.id.imagenPais);
        iv.setImageResource(image);

        return v;

    }
}
