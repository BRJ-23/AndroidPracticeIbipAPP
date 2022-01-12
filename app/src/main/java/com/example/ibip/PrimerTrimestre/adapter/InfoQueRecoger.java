package com.example.ibip.PrimerTrimestre.adapter;

/*
En este "InfoQueRecoger" se simulará un "DNI" o información de una persona para un carnet.
El objetivo de este objeto es meter y sacar información.
Puede ser info de un carnet, un coche, un supermercado, da igual.
Por ejemplo, quiero mostrar información de un coche. Pues los atributos serán Modelo, color, marca.
En este caso de un Carnet, serán nombre, edad, imagen (foto persona)

*/


public class InfoQueRecoger {

    private String nombre;
    private String edad;
    private int image;

/*Se crea su constructor y getters y setters según necesite tu programa.
* Un TIP:
*  para esto es [ click derecho dentro de la clase / generate ]
* y aparecen los constructores y lo que se puede generar*/

    public InfoQueRecoger(String nombre, String edad, int image) {
        this.nombre = nombre;
        this.edad = edad;
        this.image = image;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}



