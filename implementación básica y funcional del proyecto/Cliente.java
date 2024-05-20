import java.util.List;

public class Cliente {
    private int id;
    private String nombre;
    private String email;

    // Constructor, getters y setters

    public Cliente(int id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }

    public void consultarHistorial() {
        Envio.consultarHistorial();
    }

    public void recibirNotificacion(Envio envio, Estado estado) {
        // Lógica para recibir notificación
    }

    // Getters y setters...
}