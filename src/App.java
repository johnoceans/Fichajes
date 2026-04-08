import java.time.LocalDate;

public class App {
  public static void main(String[] args) {

    // Array de jugadores
    Jugador[] jugadores = new Jugador[5];
    jugadores[0] = new Jugador("Harry Kane", LocalDate.of(1993, 7, 28), "Delantero");
    jugadores[1] = new Jugador("Kevin De Bruyne", LocalDate.of(1991, 6, 28), "Centrocampista");
    jugadores[2] = new Jugador("Virgil van Dijk", LocalDate.of(1991, 7, 8), "Defensa");
    jugadores[3] = new Jugador("Alisson Becker", LocalDate.of(1992, 10, 2), "Portero");
    jugadores[4] = new Jugador("Bukayo Saka", LocalDate.of(2001, 9, 5), "Extremo");

    // Array de entrenadores
    Entrenador[] entrenadores = new Entrenador[3];
    entrenadores[0] = new Entrenador("Pep Guardiola", "4-3-3");
    entrenadores[1] = new Entrenador("Jürgen Klopp", "4-3-3");
    entrenadores[2] = new Entrenador("Mikel Arteta", "4-2-3-1");

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
    equipos[0].addJugador(jugadores[1]);
    equipos[1].addJugador(jugadores[2]);
    equipos[1].addJugador(jugadores[3]);
    equipos[2].addJugador(jugadores[4]);
    equipos[3].addJugador(jugadores[0]);

  }

}
