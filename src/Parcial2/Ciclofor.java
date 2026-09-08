package Parcial2;

public class Ciclofor {
    static void main() {
        String nombre = "Expedition 33";
        System.out.println(nombre.charAt(0));
        System.out.println(nombre.charAt(1));
        System.out.println(nombre.charAt(2));

        for(int teQuiero = 0; teQuiero <= nombre.length(); teQuiero++) {
            System.out.println(nombre.charAt(teQuiero));
        }


        /*
        for(int iterador = -100; iterador <= 100; iterador = iterador + 5) {
            System.out.println(iterador);
        }

        */
    }
}
