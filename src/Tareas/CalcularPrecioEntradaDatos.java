package Tareas;

import java.util.Scanner;

public class CalcularPrecioEntradaDatos {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String[] productos = {"Coca Cola"};
        double precioCocaCola = 22.0;
        final double DESCUENTO = .10;

        System.out.println("ingrese el producto que va a comprar (Solo hay Coca Cola): ");
        String producto = sc.nextLine();
        System.out.println("Cuantas va a comprar?: ");
        int cantidadComprada = sc.nextInt();

        if (!producto.equalsIgnoreCase("Coca Cola")) {
            System.out.println("Dije que solo hay Coca Cola");
            System.exit(0);
        }
        if (cantidadComprada <= 0){
            System.out.println("Fuera de la tienda");
            System.exit(0);
        }
        double subtotal = cantidadComprada * precioCocaCola;
        double cantidadDescontada = subtotal * DESCUENTO;
        double total = subtotal - cantidadDescontada;

        System.out.printf("Subtotal: $ %.2f\n " , subtotal);
        System.out.printf("Descuento: $ %.2f\n" , cantidadDescontada);
        System.out.printf("Total a pagar: $ %.2f\n " , total);




    }
}
