package com.example.myapplication;

public class Marcas {
    private String marcas;
    private String mostrarMarcas;

    public Marcas(String marcas){
        this.marcas = marcas;
    }

    public String getMarcas(){
        return marcas;
    }
    public void setMarcas(String marcas){
        this.marcas = marcas;
    }

    @Override
    public String toString(){
        this.mostrarMarcas =  this.mostrarMarcas = marcas;
        return mostrarMarcas;
    }
}
