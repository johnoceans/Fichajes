public class Entrenador {
    // ATRIBUTOS
    private String nombre;
    private String formacionPreferida;

    // CONSTRUCTORES
    public Entrenador(String nom, String formacionPrefe) {
        this.nombre = nom;
        this.formacionPreferida = formacionPrefe;
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

    // FUNCIONES

}
