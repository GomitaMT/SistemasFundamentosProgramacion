package Parcial1;

import java.util.Scanner;

public class ifElse {
    static void main(String[] args) {
        // Retiro de cajero
        Scanner leer = new Scanner(System.in);
        double saldo = 4000.0,retiro;
        System.out.println("cuanto va a retirar: ");
        retiro = leer.nextDouble();

        if(retiro <= saldo && retiro > 0){
            saldo = saldo -retiro;
            System.out.println("saldo nuevo pobre es: " + saldo);

        }
        else{
            System.out.println("pobre saldo insuficiente, trabaja");
        }
    }
}
