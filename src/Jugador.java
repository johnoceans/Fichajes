import java.time.LocalDate;

public class Jugador {
    // ATRIBUTOS
    private String nombreCamiseta;
    private LocalDate fechaNacimiento;
    private String posicion;
    private boolean traspasoSolicitado;
    private static int contadorJugadores = 0;

    // CONSTRUCTORES
    public Jugador(String nomCami, LocalDate fechaNac, String posi) {
        this.nombreCamiseta = nomCami;
        this.fechaNacimiento = fechaNac;
        this.posicion = posi;
        this.traspasoSolicitado = false;
        contadorJugadores++; 
    }

    // GETTERS & SETTERS
    public String getNombreCamiseta() {
        return nombreCamiseta;
    }

    public void setNombreCamiseta(String nombreCamiseta) {
        this.nombreCamiseta = nombreCamiseta;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public boolean isTraspasoSolicitado() {
        return traspasoSolicitado;
    }

    public void setTraspasoSolicitado(boolean traspasoSolicitado) {
        this.traspasoSolicitado = traspasoSolicitado;
    }

    public static int getContadorJugadores() {
        return contadorJugadores;
    }

    // FUNCIONES
    public void solicitarTraspaso() {
        this.traspasoSolicitado = true;
        System.out.println("El jugador " + nombreCamiseta + " ha solicitado un traspaso.");
    }

    public void cancelarTraspaso() {
        this.traspasoSolicitado = false;
        System.out.println("El jugador " + nombreCamiseta + " ha cancelado la solicitud de traspaso.");
    }

    // TO STRING
    @Override
    public String toString() {
        return "Jugador [nombreCamiseta=" + nombreCamiseta + ", fechaNacimiento=" + fechaNacimiento + ", posicion="
                + posicion + ", traspasoSolicitado=" + traspasoSolicitado + "]";
    }

}
