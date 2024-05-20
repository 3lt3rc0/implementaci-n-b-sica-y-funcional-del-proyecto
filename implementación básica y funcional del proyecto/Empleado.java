public class Empleado {
    private int id;
    private String nombre;
    private String puesto;

    // Constructor, getters y setters

    public Empleado(int id, String nombre, String puesto) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
    }

    public void registrarEnvio(Envio envio) {
        envio.registrarEnvio();
    }

    public void actualizarEstado(Envio envio, Estado estado) {
        envio.actualizarEstado(estado);
    }

    // Getters y setters...
}