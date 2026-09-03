package Parcial1;

import java.util.Scanner;

public class ifAnidado {
    static void main() {
        String tipo = "Asalariado";
        int ganas = 400000;
        int cantidadtrabajos = 2;
        if(tipo.equals("Asalariado")){
            System.out.println("Patron");
            if(ganas >= 400000 || cantidadtrabajos >= 2){
                System.out.println("Declaracion anual");
            }
        } else{
            System.out.println("Obligaciones");
            System.out.println("Declaracion Anual");
            System.out.println("Declaracion Mensual");
        }


    }
}
