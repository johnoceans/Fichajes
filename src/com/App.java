package com;

import java.time.LocalDate;

import com.deporte.*;
import com.deporte.mister.Formacion;
import com.deporte.personas.Entrenador;
import com.deporte.personas.Jugador;
import com.deporte.player.Posicion;

/**
 * Clase principal del programa.
 * Contiene el método main para ejecutar pruebas.
 */
public class App {

  /**
   * Método principal de ejecución.
   * 
   * @param args argumentos de línea de comandos
   */
  public static void main(String[] args) {

    // Array de jugadores
    Jugador[] jugadores = new Jugador[5];
    jugadores[0] = new Jugador("Harry Kane", LocalDate.of(1993, 7, 28), Posicion.DELANTERO);
    jugadores[1] = new Jugador("Kevin De Bruyne", LocalDate.of(1991, 6, 28), Posicion.CENTROCAMPISTA);
    jugadores[2] = new Jugador("Virgil van Dijk", LocalDate.of(1991, 7, 8), Posicion.DEFENSA);
    jugadores[3] = new Jugador("Alisson Becker", LocalDate.of(1992, 10, 2), Posicion.PORTERO);
    jugadores[4] = new Jugador("Bukayo Saka", LocalDate.of(2001, 9, 5), Posicion.EXTREMO);

    // Array de entrenadores
    Entrenador[] entrenadores = new Entrenador[3];
    entrenadores[0] = new Entrenador("Pep Guardiola", Formacion._4_3_3);
    entrenadores[1] = new Entrenador("Jürgen Klopp", Formacion._4_3_3);
    entrenadores[2] = new Entrenador("Mikel Arteta", Formacion._4_2_3_1);

    // Array de equipos
    Equipo[] equipos = new Equipo[5];
    equipos[0] = new Equipo("Manchester City");
    equipos[1] = new Equipo("Liverpool");
    equipos[2] = new Equipo("Arsenal");
    equipos[3] = new Equipo("Tottenham Hotspur");
    equipos[4] = new Equipo("Chelsea");

    // ASIGNAR ENTRENADOR
    equipos[0].setEntrenador(entrenadores[0]);
    equipos[1].setEntrenador(entrenadores[1]);
    equipos[2].setEntrenador(entrenadores[2]);

    // AÑADIENDO JUGADORES A EQUIPOS
    equipos[0].añadirJugador(jugadores[1]);
    equipos[1].añadirJugador(jugadores[2]);
    equipos[1].añadirJugador(jugadores[3]);
    equipos[2].añadirJugador(jugadores[4]);
    equipos[3].añadirJugador(jugadores[0]);

    System.out.println(equipos[0]);
    equipos[1].verPlantilla();

    jugadores[2].solicitarTraspaso();
    equipos[1].transferirJugador(jugadores[2], equipos[0]);

    System.out.println("Total jugadores: " + Jugador.getContadorJugadores());
    System.out.println("Total entrenadores: " + Entrenador.getContadorEntrenadores());
    System.out.println("Total equipos: " + Equipo.getContadorEquipos());

  }

}
