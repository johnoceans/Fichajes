package com.deporte.personas;

import java.time.LocalDate;

import com.deporte.Equipo;

/**
 * Clase abstracta que representa un trabajador del sistema deportivo.
 */
public class Trabajador {
    //ATRIBUTOS
    protected String nombre;
    protected LocalDate fechaNacimiento;
    protected Equipo equipo;

    //CONSTRUCTORES
    public Trabajador (String nom, LocalDate fechaNac, Equipo equip){
        this.nombre =nom;
        this.fechaNacimiento = fechaNac;
        this.equipo = equip
    }

    //Getters & Setters
    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    //Funciones
    public boolean mismoEquipo (Trabajador t){
        if (this.equipo == null || t == null || t.getEquipo() == null) {
            return false;
        }

        return this.equipo.getNombreEquipo().equals(t.getEquipo().getNombreEquipo());
    }
    
    
}
