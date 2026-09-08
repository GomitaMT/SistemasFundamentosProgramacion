package Parcial1;

import java.util.Scanner;

public class Inventario {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Nombre del producto: ");
        String producto = sc.nextLine();
        System.out.println("Cantidad del producto: ");
        int cantidadProductos = sc.nextInt();
        System.out.println("Cuantos productos caben en cada tarima? ");
        int capacidadTarima = sc.nextInt();
        int tarimas_Llenas = cantidadProductos/capacidadTarima;
        int productosobrante = cantidadProductos%capacidadTarima;

        System.out.println("Producto: " + producto);
        System.out.println("Cantidad de " + producto + ": " + cantidadProductos);
        System.out.println("Tarimas completas: " + tarimas_Llenas);
        System.out.println("Producto sobrante: " +  productosobrante);


    }
}
