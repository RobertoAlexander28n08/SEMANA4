public class Reserva {
    private String nombre;
    private int dias;
    private String tipo;
    private String estado;

    public Reserva(String nombre, int dias, String tipo) {
        this.nombre = nombre;
        this.dias = dias;
        this.tipo = tipo;
        this.estado = "Activa";
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Días de estadía: " + dias);
        System.out.println("Tipo de habitación: " + tipo);
        System.out.println("Estado: " + estado);
    }

    public void actualizarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
    }
}