package com.deporte;
import java.util.ArrayList;

import com.deporte.personas.Entrenador;
import com.deporte.personas.Jugador;

/**
 * Clase que representa un equipo de fútbol.
 * Un equipo tiene un nombre, un entrenador y una lista de jugadores.
 */
public class Equipo {

    /** Nombre del equipo */
    private String nombreEquipo;

    /** Entrenador del equipo */
    private Entrenador entrenador;

    /** Lista de jugadores que pertenecen al equipo */
    private ArrayList<Jugador> jugadores;

    /** Contador total de equipos creados */
    private static int contadorEquipos = 0;

    /**
     * Constructor de la clase Equipo.
     * Inicializa el equipo sin entrenador y con una lista vacía de jugadores.
     * 
     * @param nomEq Nombre del equipo
     */
    public Equipo(String nomEq) {
        this.nombreEquipo = nomEq;
        this.entrenador = null;
        this.jugadores = new ArrayList<>();
        contadorEquipos++;
    }

    /**
     * Obtiene el nombre del equipo.
     * 
     * @return Nombre del equipo
     */
    public String getNombreEquipo() {
        return nombreEquipo;
    }

    /**
     * Establece el nombre del equipo.
     * 
     * @param nombreEquipo Nuevo nombre del equipo
     */
    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    /**
     * Obtiene el entrenador del equipo.
     * 
     * @return Entrenador del equipo
     */
    public Entrenador getEntrenador() {
        return entrenador;
    }

    /**
     * Asigna un entrenador al equipo.
     * 
     * @param entrenador Entrenador a asignar
     */
    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    /**
     * Obtiene la lista de jugadores del equipo.
     * 
     * @return Lista de jugadores
     */
    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    /**
     * Obtiene el número total de equipos creados.
     * 
     * @return Número de equipos
     */
    public static int getContadorEquipos() {
        return contadorEquipos;
    }

    /**
     * Añade un jugador al equipo sin realizar comprobaciones.
     * 
     * @param j Jugador a añadir
     */
    public void añadirJugador(Jugador j) {
        jugadores.add(j);
    }

    /**
     * Muestra por pantalla todos los jugadores del equipo.
     */
    public void verPlantilla() {
        System.out.println("Plantilla del equipo " + nombreEquipo + ":");

        for (int i = 0; i < jugadores.size(); i++) {
            System.out.println(jugadores.get(i));
        }
    }

    /**
     * Transfiere un jugador a otro equipo si:
     * - El jugador pertenece al equipo actual
     * - Ha solicitado el traspaso
     * 
     * Si la transferencia se realiza:
     * - Se elimina del equipo origen
     * - Se añade al equipo destino
     * - Se resetea su estado de traspaso
     * 
     * @param jug Jugador a transferir
     * @param destino Equipo al que se transfiere el jugador
     */
    public void transferirJugador(Jugador jug, Equipo destino) {
        if (jugadores.contains(jug) && jug.isTraspasoSolicitado()) {

            jugadores.remove(jug);
            destino.añadirJugador(jug);
            jug.setTraspasoSolicitado(false);

            System.out.println("El jugador " + jug.getNombreCamiseta() + 
                               " ha sido transferido a " + destino.getNombreEquipo() +
                               " exitosamente :)");
        } else {
            System.out.println("No se pudo realizar la transferencia de " + jug.getNombreCamiseta());
        }
    }

    /**
     * Devuelve una representación en texto del equipo,
     * incluyendo el entrenador y el número de jugadores.
     * 
     * @return Información del equipo
     */
    @Override
    public String toString() {
        return "Equipo [nombreEquipo=" + nombreEquipo + ", entrenador="
                + (entrenador != null ? entrenador.getNombre() : "Sin entrenador") + ", numJugadores="
                + jugadores.size() + "]";
    }
}