package com.deporte;

import modelo.Formacion;

/**
 * Clase que representa a un entrenador de fútbol.
 * Contiene información sobre su nombre y su formación preferida.
 */
public class Entrenador {

    /** Nombre del entrenador */
    private String nombre;

    /** Formación táctica preferida del entrenador */
    private Formacion formacionPreferida;

    /** Contador total de entrenadores creados */
    private static int contadorEntrenadores = 0;

    /**
     * Constructor de la clase Entrenador.
     * 
     * @param nom Nombre del entrenador
     * @param formacionPrefe Formación táctica preferida
     */
    public Entrenador(String nom, Formacion formacionPrefe) {
        this.nombre = nom;
        this.formacionPreferida = formacionPrefe;
        contadorEntrenadores++;
    }

    /**
     * Obtiene el nombre del entrenador.
     * 
     * @return Nombre del entrenador
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del entrenador.
     * 
     * @param nombre Nuevo nombre del entrenador
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la formación preferida del entrenador.
     * 
     * @return Formación preferida
     */
    public Formacion getFormacionPreferida() {
        return formacionPreferida;
    }

    /**
     * Establece la formación preferida del entrenador.
     * 
     * @param formacionPreferida Nueva formación preferida
     */
    public void setFormacionPreferida(Formacion formacionPreferida) {
        this.formacionPreferida = formacionPreferida;
    }

    /**
     * Obtiene el número total de entrenadores creados.
     * 
     * @return Número de entrenadores
     */
    public static int getContadorEntrenadores() {
        return contadorEntrenadores;
    }

    /**
     * Devuelve una representación en texto del entrenador.
     * 
     * @return Información del entrenador
     */
    @Override
    public String toString() {
        return "Entrenador [nombre=" + nombre + ", formacionPreferida=" + formacionPreferida + "]";
    }
}