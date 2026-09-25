public class Main  {

    public static void  main (String [] args) {

        Dispositivo dispositivo = new Dispositivo("Daniela", true);

        dispositivo.mostrarEstado();
        dispositivo.ejecutarDiagnostico();

    }

}
