package com.aluracursos.screenmatch.calculos;

public class FiltroRecomendacion {

    public void filtra(Clasificable clasificable){
        if (clasificable.getClasificable() >= 4){
            System.out.println("Muy bien evaluado al momento");
        } else if (clasificable.getClasificable() >= 2){
            System.out.println("Popular en el momento");
        } else {
            System.out.println("Ponlo en tu lista para verlo después");
        }
    }
}
