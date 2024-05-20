import java.util.Date;

public class Envio {
    private int id;
    private String origen;
    private String destino;
    private Date fechaEnvio;
    private Date fechaEntrega;
    private Estado estado;

    // Constructor, getters y setters

    public Envio(int id, String origen, String destino, Date fechaEnvio, Date fechaEntrega, Estado estado) {
        this.id = id;
        this.origen = origen;
        this.destino = destino;
        this.fechaEnvio = fechaEnvio;
        this.fechaEntrega = fechaEntrega;
        this.estado = estado;
    }

    public void registrarEnvio() {
        // Lógica para registrar un envío
    }

    public void actualizarEstado(Estado nuevoEstado) {
        this.estado = nuevoEstado;
        // Lógica para actualizar el estado en la base de datos
    }

    public static void consultarHistorial() {
        // Lógica para consultar el historial de envíos
    }

    // Getters y setters...
}