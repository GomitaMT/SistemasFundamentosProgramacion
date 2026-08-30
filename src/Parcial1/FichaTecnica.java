package Parcial1;

public class FichaTecnica {
    static void main() {
        //Ficha Tecnica de pc
        String Procesador = "Ryzen 7 5700";
        String TarjetaGrafica = "AMD RX 6600";
        short MemoriaRam = 16;
        int Almacenamiento = 2000;
        double HzMonitor = 165.0;
        boolean TieneWifi = true;
        char Clasificacion = 'A';

        String Ficha = "Ficha Tecnica De Un Pc";
        System.out.println(Ficha);
        System.out.println("Procesador: " + Procesador);
        System.out.println("Tarjeta Grafica: " + TarjetaGrafica);
        System.out.println("Memoria Ram: " + MemoriaRam);
        System.out.println("Almacenamiento(GB): " + Almacenamiento);
        System.out.println("Frecuencia Del Monitor(Hz): " + HzMonitor);
        System.out.println("Tiene wifi: " + TieneWifi);
        System.out.println("Clasificación: " + Clasificacion);
    }
}
