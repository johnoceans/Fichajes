public class Equipo {
    // ATRIBUTOS
    private String nombreEquipo;

    // CONSTRUCTORES
    public Equipo(String nomEq) {
        this.nombreEquipo = nomEq;
    }
    // GETTERS & SETTERS

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    // FUNCIONES

    // TO STRING
    @Override
    public String toString() {
        return "Equipo [nombreEquipo=" + nombreEquipo + "]";
    }

}
