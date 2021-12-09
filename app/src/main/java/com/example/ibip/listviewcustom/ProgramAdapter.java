package com.example.ibip.listviewcustom;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.example.ibip.R;


public class ProgramAdapter extends ArrayAdapter<String> {
    Context context;

    String[]ciudadesNombre;
    String[]descripcionesTexto;
    int[] imagenesLugar;

    public ProgramAdapter(Context context, String[]ciudadesNombre, String[]descripcionesTexto, int[]imagenesLugar) {
        super(context, R.layout.listviewcustom_item_activity, R.id.nombrePais, ciudadesNombre);
        this.context = context;
        this.imagenesLugar = imagenesLugar;
        this.ciudadesNombre = ciudadesNombre;
        this.descripcionesTexto = descripcionesTexto;
    }



    @Override
    public View getView(int position,  View convertView, ViewGroup parent) {

       View v = convertView;
       ProgramViewHolder holder = null;
       if(v == null){
           LayoutInflater li = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
           v = li.inflate(R.layout.listviewcustom_item_activity, parent, false);
           holder = new ProgramViewHolder(v);
           v.setTag(holder);

       }else {
           holder = (ProgramViewHolder) v.getTag();
       }
       holder.itemImage.setImageResource(imagenesLugar[position]);
       holder.ciudades.setText(ciudadesNombre[position]);
       holder.descripciones.setText(descripcionesTexto[position]);

       v.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Toast.makeText(getContext(),"You clicked: "+ciudadesNombre[position], Toast.LENGTH_SHORT).show();

           }
       });


        return v;
    }
}
