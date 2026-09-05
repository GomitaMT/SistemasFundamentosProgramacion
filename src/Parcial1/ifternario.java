package Parcial1;

import java.util.Scanner;

public class ifternario {
    static void main() {
        Scanner sc = new Scanner(System.in);
        //Instancia de clase para usar sus metodo
        System.out.println("Ingrese la contraseña");
        String password = sc.nextLine();
        String buenaContrasena = password.length() >= 8 ? "Buena contrasena" : "Mala contrasena";
        System.exit(0);


        String tipo =  sc.nextLine();
        String serie = (tipo.equals("anime"))
                ? "Los 7 pecados capitales" : "Supernatural";
        System.out.println(serie);
    }
}
