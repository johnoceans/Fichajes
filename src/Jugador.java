import java.time.LocalDate;

/**
 * Clase que representa un jugador de fútbol.
 * Contiene información sobre su nombre, fecha de nacimiento,
 * posición en el campo y estado de traspaso.
 */
public class Jugador {

    /** Nombre del jugador en la camiseta */
    private String nombreCamiseta;

    /** Fecha de nacimiento del jugador */
    private LocalDate fechaNacimiento;

    /** Posición del jugador en el campo */
    private String posicion;

    /** Indica si el jugador ha solicitado un traspaso */
    private boolean traspasoSolicitado;

    /** Contador total de jugadores creados */
    private static int contadorJugadores = 0;

    /**
     * Constructor de la clase Jugador.
     * Inicializa el jugador con traspaso no solicitado por defecto.
     * 
     * @param nomCami Nombre del jugador en la camiseta
     * @param fechaNac Fecha de nacimiento
     * @param posi Posición en el campo
     */
    public Jugador(String nomCami, LocalDate fechaNac, String posi) {
        this.nombreCamiseta = nomCami;
        this.fechaNacimiento = fechaNac;
        this.posicion = posi;
        this.traspasoSolicitado = false;
        contadorJugadores++; 
    }

    /**
     * Obtiene el nombre del jugador.
     * 
     * @return Nombre del jugador
     */
    public String getNombreCamiseta() {
        return nombreCamiseta;
    }

    /**
     * Establece el nombre del jugador.
     * 
     * @param nombreCamiseta Nuevo nombre del jugador
     */
    public void setNombreCamiseta(String nombreCamiseta) {
        this.nombreCamiseta = nombreCamiseta;
    }

    /**
     * Obtiene la fecha de nacimiento del jugador.
     * 
     * @return Fecha de nacimiento
     */
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Establece la fecha de nacimiento del jugador.
     * 
     * @param fechaNacimiento Nueva fecha de nacimiento
     */
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Obtiene la posición del jugador.
     * 
     * @return Posición en el campo
     */
    public String getPosicion() {
        return posicion;
    }

    /**
     * Establece la posición del jugador.
     * 
     * @param posicion Nueva posición
     */
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    /**
     * Indica si el jugador ha solicitado un traspaso.
     * 
     * @return true si ha solicitado traspaso, false en caso contrario
     */
    public boolean isTraspasoSolicitado() {
        return traspasoSolicitado;
    }

    /**
     * Establece el estado de solicitud de traspaso.
     * 
     * @param traspasoSolicitado Estado del traspaso
     */
    public void setTraspasoSolicitado(boolean traspasoSolicitado) {
        this.traspasoSolicitado = traspasoSolicitado;
    }

    /**
     * Obtiene el número total de jugadores creados.
     * 
     * @return Número de jugadores
     */
    public static int getContadorJugadores() {
        return contadorJugadores;
    }

    /**
     * Marca al jugador como transferible e informa por pantalla.
     */
    public void solicitarTraspaso() {
        this.traspasoSolicitado = true;
        System.out.println("El jugador " + nombreCamiseta + " ha solicitado un traspaso.");
    }

    /**
     * Cancela la solicitud de traspaso del jugador e informa por pantalla.
     */
    public void cancelarTraspaso() {
        this.traspasoSolicitado = false;
        System.out.println("El jugador " + nombreCamiseta + " ha cancelado la solicitud de traspaso.");
    }

    /**
     * Devuelve una representación en texto del jugador.
     * 
     * @return Información del jugador
     */
    @Override
    public String toString() {
        return "Jugador [nombreCamiseta=" + nombreCamiseta + 
               ", fechaNacimiento=" + fechaNacimiento + 
               ", posicion=" + posicion + 
               ", traspasoSolicitado=" + traspasoSolicitado + "]";
    }
}