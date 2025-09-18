package model;

import java.util.ArrayList;

public class Zoologico {
    private String nombre;
    private Arraylist <Animal> listaAnimales;

    public Zoologico(String nombre, Arraylist<Animal> listaAnimales) {
        this.nombre = nombre;
        this.listaAnimales = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Arraylist<Animal> getListaAnimales() {
        return listaAnimales;
    }

    public void setListaAnimales(Arraylist<Animal> listaAnimales) {
        this.listaAnimales = listaAnimales;
    }

    @Override
    public String toString() {
        return "Zoologico{" +
                "nombre='" + nombre + '\'' +
                ", listaAnimales=" + listaAnimales +
                '}';
    }
}
