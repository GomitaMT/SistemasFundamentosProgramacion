package Parcial1;

import java.util.Scanner;

public class EntradaDatos {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuál es tu nombre? ");
        String nombre = sc.nextLine();
        System.out.println("su nombre es: " + nombre);
        System.out.println("Cuántas veces has ido al cine");
    }
}
