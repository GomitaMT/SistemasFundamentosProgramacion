package Tareas;


public class CalcularPrecioFinal {
    static void main() {
        //Variables
        String producto = "Coca Cola";
        double precio = 20.50;
        int cantidadComprada = 0;
        final double DESCUENTO = 15.0;

        if(cantidadComprada <= 0){
            System.out.println("No eres comprador... Fueraaaaaa!");
            System.exit(0);
        }

        //Hacer los calculos
        double subtotal = cantidadComprada * precio;
        double cantidadDescontada = subtotal * (DESCUENTO / 100);
        double total = subtotal - cantidadDescontada;

        //Imprimir
        System.out.printf("Subtotal: $ %.2f\n " , subtotal);
        System.out.printf("Descuento: $ %.2f\n" , cantidadDescontada);
        System.out.printf("Total a pagar: $ %.2f\n " , total);

    }
}
