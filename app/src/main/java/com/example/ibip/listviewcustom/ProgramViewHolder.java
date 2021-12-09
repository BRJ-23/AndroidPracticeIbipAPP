package com.example.ibip.listviewcustom;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ibip.R;

public class ProgramViewHolder {

    ImageView itemImage;
    TextView ciudades;
    TextView descripciones;
    ProgramViewHolder(View view){
        itemImage = view.findViewById(R.id.imagenPais);
        ciudades = view.findViewById(R.id.nombrePais);
        descripciones = view.findViewById(R.id.capitalPais);
    }

}
