import java.util.ArrayList;

public class Equipo {
    // ATRIBUTOS
    private String nombreEquipo;
    private Entrenador entrenador;
    private ArrayList<Jugador> jugadores;

    // CONSTRUCTORES
    public Equipo(String nomEq) {
        this.nombreEquipo = nomEq;
        this.entrenador = null;
        this.jugadores = new ArrayList<>();
    }

    // GETTERS & SETTERS
    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

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
    public void añadirJugador(Jugador j) {
        jugadores.add(j);
    }

    public void verPlantilla() {
        System.out.println("Plantilla del equipo " + nombreEquipo + " es:");

        for (int i = 0; i < jugadores.size(); i++) {
            System.out.println(jugadores.get(i));
        }
    }

    public void transferirJugador(Jugador jug, Equipo destino) {
        if (jugadores.contains(jug) && jug.isTraspasoSolicitado()) {

            jugadores.remove(jug);
            destino.añadirJugador(jug);
            jug.setTraspasoSolicitado(false);

            System.out.println("Transferencia realizada correctamente.");
        } else {
            System.out.println("No se pudo realizar la transferencia de " + jug.getNombreCamiseta());
        }
    }

    // TO STRING
    @Override
    public String toString() {
        return "Equipo [nombreEquipo=" + nombreEquipo + ", entrenador="
                + (entrenador != null ? entrenador.getNombre() : "Sin entrenador") + ", numJugadores="
                + jugadores.size() + "]";
    }
}