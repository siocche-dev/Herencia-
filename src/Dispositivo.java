public class Dispositivo {
    private String nombre;
    private boolean activo;

    public Dispositivo(boolean activo, String nombre) {
        this.activo = activo;
        this.nombre = nombre;
    }
    public void mostrarEstado() {
        System.out.println(nombre + " - " + activo);
    }
    public void ejecutarDiagnostico() {
        System.out.println("Ejecutando diagnóstico general...");
    }
}
