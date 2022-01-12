package com.example.ibip.PrimerTrimestre.spinnerPepe;

public class Nombres {


    private final String nombre;
    private final String apellidos;
    private final int bandera;

    public Nombres(String nombre, String info, int bandera) {
        this.nombre = nombre;
        this.apellidos = info;
        this.bandera = bandera;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getBandera() {
        return bandera;
    }
}

