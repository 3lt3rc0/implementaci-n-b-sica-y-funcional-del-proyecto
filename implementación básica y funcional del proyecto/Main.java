import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de Estado
        Estado enTransito = new Estado(1, "En tránsito");
        Estado entregado = new Estado(2, "Entregado");

        // Crear instancias de Envio
        Envio envio1 = new Envio(1, "Madrid", "Barcelona", new Date(), null, enTransito);

        // Crear instancia de Empleado
        Empleado empleado = new Empleado(1, "Juan Pérez", "Operador");

        // Registrar un envío
        empleado.registrarEnvio(envio1);

        // Actualizar el estado de un envío
        empleado.actualizarEstado(envio1, entregado);

        // Crear instancia de Cliente
        Cliente cliente = new Cliente(1, "Ana García", "ana@example.com");

        // Consultar historial de envíos
        cliente.consultarHistorial();

        // Crear instancia de Notificacion
        Notificacion notificacion = new Notificacion(1, envio1, entregado, new Date());

        // Enviar notificación al cliente
        notificacion.enviarNotificacion(cliente);
    }
}