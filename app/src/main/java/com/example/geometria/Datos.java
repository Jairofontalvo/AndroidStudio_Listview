package com.example.geometria;

import java.util.ArrayList;

public class Datos {
    private static ArrayList<Calculos> Calculos = new ArrayList();

    public static void guardar(Calculos c){
        Calculos.add(c);
    }

    public static ArrayList<Calculos> obtener(){
        return Calculos;
    }
}
