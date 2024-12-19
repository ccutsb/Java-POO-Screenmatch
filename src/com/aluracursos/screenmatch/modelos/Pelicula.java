package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.calculos.Clasificable;

public class Pelicula extends Titulo implements Clasificable{

    private String director;
//   Se puede mantener el siguiente constructor, pero por diseño queremos que tenga string e int
//    public Pelicula(String  nombre) {
//        this.setNombre(nombre);
//    }

    public Pelicula(String nombre, int fechaDeLanzamiento) {
        super(nombre, fechaDeLanzamiento);
    }

    public String getDirector() {return director;}

    public void setDirector(String director) {this.director = director;}

    @Override
    public int getClasificable() {
        return (int) (calculaMedia() / 2);}

    @Override
    public String toString() {
        return "Pelicula: " + this.getNombre() + " (" + getFechaDeLanzamiento() + ")";

    }
}
