package com.example.ibip.PrimerTrimestre.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ibip.R;

import java.util.ArrayList;

public class MiAdaptador extends RecyclerView.Adapter<MiAdaptador.miSoporteVisual> {
    //variables globales necesarias
    ArrayList<Nombres> listaNombres;

    //constructor
    public MiAdaptador(ArrayList<Nombres> listaNombres) {

        this.listaNombres = listaNombres;
    }


    @NonNull
    @Override
    public miSoporteVisual onCreateViewHolder( ViewGroup parent, int viewType) {
        //sobrescribir el metodo para preparar la vista fila
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_fila,null,false);
        return new miSoporteVisual(view);


    }

    @Override
    public void onBindViewHolder( miSoporteVisual mSV, int position) {
        //
        // pillo un texto y lo coloco en el textView
        mSV.nombres.setText(listaNombres.get(position).getNombre());
        mSV.apellidos.setText(listaNombres.get(position).getApellidos());
        mSV.banderas.setImageResource(listaNombres.get(position).getBandera());



    }

    //Método clásico para contar el numero de elementos de la lista que pruebla el recicler
    @Override
    public int getItemCount() {
        if (listaNombres==null){
            return 0;
        }else {
            return listaNombres.size();
        }

    }


    //Borra un elemento del array y lo notifica
    private void remove(int position){
        listaNombres.remove(position);
        notifyItemRemoved(position);
    }



    static class miSoporteVisual extends RecyclerView.ViewHolder{

        public TextView nombres, apellidos;
        public ImageView banderas;
        public miSoporteVisual(View itemView) {
            super(itemView);
            nombres = (TextView) itemView.findViewById(R.id.idNombre) ;
            apellidos = (TextView) itemView.findViewById(R.id.idApellidos);
            banderas = (ImageView) itemView.findViewById(R.id.idBanderas);
        }



    }





}
