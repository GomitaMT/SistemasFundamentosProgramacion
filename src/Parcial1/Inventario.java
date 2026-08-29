package Parcial1;

import java.util.Scanner;

public class Inventario {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre del producto: ");
        String producto = sc.nextLine();

        System.out.println("Cantidad del producto: ");
        int cantidad = sc.nextInt();

        System.out.println("Cuantos productos caben en cada tarima? ");
        int cantidadProductos = sc.nextInt();

        int productoSobrantes = cantidadProductos;

        int cantidadLlenas = cantidad - cantidadProductos;
        System.out.println("Se pueden llenar" + cantidadLlenas);
    }
}
