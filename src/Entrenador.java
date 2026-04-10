public class Entrenador {
    // ATRIBUTOS
    private String nombre;
    private String formacionPreferida;
    private static int contadorEntrenadores = 0;

    // CONSTRUCTORES
    public Entrenador(String nom, String formacionPrefe) {
        this.nombre = nom;
        this.formacionPreferida = formacionPrefe;
        contadorEntrenadores++;
    }
    // GETTERS & SETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFormacionPreferida() {
        return formacionPreferida;
    }

    public void setFormacionPreferida(String formacionPreferida) {
        this.formacionPreferida = formacionPreferida;
    }

    public static int getContadorEntrenadores() {
        return contadorEntrenadores;
    }

    // FUNCIONES

    // TO STRING
    @Override
    public String toString() {
        return "Entrenador [nombre=" + nombre + ", formacionPreferida=" + formacionPreferida + "]";
    }
}