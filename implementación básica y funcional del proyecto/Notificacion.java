import java.util.Date;

public class Notificacion {
    private int id;
    private Envio envio;
    private Estado estado;
    private Date fecha;

    // Constructor, getters y setters

    public Notificacion(int id, Envio envio, Estado estado, Date fecha) {
        this.id = id;
        this.envio = envio;
        this.estado = estado;
        this.fecha = fecha;
    }

    public void enviarNotificacion(Cliente cliente) {
        cliente.recibirNotificacion(envio, estado);
    }

    // Getters y setters...
}