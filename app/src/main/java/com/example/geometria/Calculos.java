package com.example.geometria;

public class Calculos {
    private String nombre_operacion;
    private String Data;
    private Double Resultado;

    public Calculos(String nombre_operacion, String datos, Double resultado) {
        this.nombre_operacion = nombre_operacion;
        Data = datos;
        Resultado = resultado;
    }

    public String getNombre_operacion() {
        return nombre_operacion;
    }

    public void setNombre_operacion(String nombre_operacion) {
        this.nombre_operacion = nombre_operacion;
    }

    public String getDatos() {
        return Data;
    }

    public void setDatos(String datos) {
        Data = datos;
    }

    public Double getResultado() {
        return Resultado;
    }

    public void setResultado(Double resultado) {
        Resultado = resultado;
    }
    public void guardar(){
        Datos.guardar(this);
    }
}
