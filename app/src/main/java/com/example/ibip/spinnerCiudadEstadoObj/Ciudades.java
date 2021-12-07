package com.example.ibip.spinnerCiudadEstadoObj;

import android.media.Image;

public class Ciudades {
    public int ID;
    public String pais;
    public String capital;
    public int numHabitantes;
    public double extensionGeo;
    public int bandera;

    public Ciudades(int ID, String pais, String capital, int numHabitantes, double extensionGeo, int bandera) {
        this.ID = ID;
        this.pais = pais;
        this.capital = capital;
        this.numHabitantes = numHabitantes;
        this.extensionGeo = extensionGeo;
        this.bandera = bandera;
    }



    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getNumHabitantes() {
        return numHabitantes;
    }

    public void setNumHabitantes(int numHabitantes) {
        this.numHabitantes = numHabitantes;
    }

    public double getExtensionGeo() {
        return extensionGeo;
    }

    public void setExtensionGeo(double extensionGeo) {
        this.extensionGeo = extensionGeo;
    }

    public int getBandera() {
        return bandera;
    }

    public void setBandera(int bandera) {
        this.bandera = bandera;
    }

    @Override
    public String toString() {
        return pais;
    }
}
