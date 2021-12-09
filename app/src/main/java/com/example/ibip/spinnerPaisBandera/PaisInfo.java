package com.example.ibip.spinnerPaisBandera;

public class PaisInfo {


    private final String nombre;
    private final String capital;
    private final String extension;
    private final String habitantes;
    private final int bandera;

    public PaisInfo(String nombre, String info, String extension, String habitantes, int bandera) {
        this.nombre = nombre;
        this.capital = info;
        this.extension =extension;
        this.habitantes=habitantes;
        this.bandera = bandera;
    }


    public String getNombre() {
        return nombre;
    }

    public String getCapital() {
        return capital;
    }

    public String getExtension() {
        return extension;
    }

    public String getHabitantes() {
        return habitantes;
    }

    public int getBandera() {
        return bandera;
    }
}

