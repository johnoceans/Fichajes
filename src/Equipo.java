import java.util.ArrayList;

public class Equipo {
    // ATRIBUTOS
    private String nombreEquipo;
    private Entrenador entrenador;
    private ArrayList<Jugador> jugadores;

    // CONSTRUCTORES
    public Equipo(String nomEq) {
        this.nombreEquipo = nomEq;
        this.jugadores = new ArrayList<>();
    }

    // GETTERS & SETTERS
    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    // FUNCIONES
    public void addJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    // TO STRING
    @Override
    public String toString() {
        return "Equipo [nombreEquipo=" + nombreEquipo + "]";
    }

}
