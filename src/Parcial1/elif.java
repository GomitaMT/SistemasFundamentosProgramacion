package Parcial1;

import java.util.Scanner;

public class elif {
    static void main() {
        Scanner leer2 = new Scanner(System.in);
        String tipoAmor;
        System.out.println("Descubre la verdad");
        tipoAmor = leer2.nextLine();

        if(tipoAmor.equals("Te amo")){
            System.out.println("Te ama");
        } else if(tipoAmor.equals("Te quiere")){
            System.out.println("Te quiere");
        } else if(tipoAmor.equals("Te gusta")){
            System.out.println("Le gustas");
        } else{
            System.out.println("ERES UN JUGUETE");
        }

        System.exit(0);


        Scanner leer = new Scanner(System.in);
        System.out.println("1 Debito 2 Credito 3 Efectivo");
        int opcion = leer.nextInt();
        if (opcion == 1) {
            System.out.println("Guarda dinero y transferencia");
            System.out.println("Clonar tarjeta");
            System.out.println("vaciar dinero");
            System.out.println("Robar identidad");
            System.out.println("No generas historial crediticio");

        } else if (opcion == 2) {
            System.out.println("generas historial crediticio");
            System.out.println("puntos");
            System.out.println("cashback");

        } else if (opcion == 3) {
            System.out.println("Descapitalización");

        } else{
            System.out.println("Opcion no valida");
        }

    }
}
