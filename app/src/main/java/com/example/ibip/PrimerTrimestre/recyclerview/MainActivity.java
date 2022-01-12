package com.example.ibip.PrimerTrimestre.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.ibip.R;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ArrayList<Nombres>listaNombres;

    RecyclerView recyclerNombres;
    Integer[] ava = {
            R.drawable.aa,
            R.drawable.ab,
            R.drawable.ac,
            R.drawable.ad,
            R.drawable.ae,
            R.drawable.af,
            R.drawable.ag,
            R.drawable.ah,
            R.drawable.ai,
            R.drawable.aj,
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recyclerview_base);


        listaNombres = new ArrayList<>();
        recyclerNombres = (RecyclerView) findViewById((R.id.RecyclerId));
        recyclerNombres.setLayoutManager(new LinearLayoutManager(MainActivity.this));

        llenarNombres();
        MiAdaptador adaptador = new MiAdaptador(listaNombres);
        recyclerNombres.setAdapter(adaptador);
    }


    public static String generateRandomID() {
        int number = (int) (Math.random()*(15 - 10)+10);
        String chars = "1234567890QWERTYUIOPASDFGHJKLZXCVBNMqwertyuioplkjhgfdsazxcvbnm";
        Random ra = new Random();
        StringBuilder sb = new StringBuilder(number);
        for (int i = 0; i < number; i++) {
            sb.append(chars.charAt(ra.nextInt(chars.length())));
        }
        return sb.toString();
    }

    public static String generateRandomUserName(){
        int nx = (int) (Math.random()*(3-1)+1);
        String[] fullName = new String[nx];
        String[] vocals ={"a", "ae", "ai", "ao", "au", "e", "ea", "ei", "eo", "eu"
                , "ia", "ie", "io", "iu", "oa", "oe", "oi", "ou", "ua", "ue", "ui", "uo", "o"
                , "u", "i"};
        String[] conso = {"q","w","r","t","y","p","s","d","f","g","h","j","k","l","z","x","c","v","b","n","m","pr","br","cr","cl","pl",
                "bl","gl","gr","dr","gg","bb","tr","tl","tt","mb","mp","nb","nc","nd","nl","nt","xr","xl"};
        for(int i = 0; i<nx;i++) {
            int vocalRandom = (int) (Math.random()*(25-0)+0);
            int consoRandom = (int) (Math.random()*(44-0)+0);
            fullName[i]=vocals[vocalRandom]+conso[consoRandom];


        }
        StringBuffer cadena = new StringBuffer();
        for(int x =0;x<fullName.length;x++) {
            cadena = cadena.append(fullName[x]);
        }
        String saved = cadena.toString();
        String newName = saved.toUpperCase().charAt(0) + saved.substring(1, saved.length()).toLowerCase();
        return newName;
    }


    private void llenarNombres() {

        int number;
        int objects = (int) (Math.random()*14+1);
        if(listaNombres.isEmpty()) {
            for (int i = 0; i < objects; i++) {
                number = (int) (Math.random() * (10 - 0) + 0);
                listaNombres.add(new Nombres(generateRandomUserName(), generateRandomID(), ava[number]));

            }
        }


    }



}