package Parcial2;

public class Metoditos {
    static void main() {
        int dinero = 10000
        mandarMensajeAmor();
        mandarMensajeAmor();
        mandarMensajeAmor();
        mandarMensajeAmor();
        mandarMensajeAmor();
        mandarMensajeAmor();
        mandarMensajeAmor();
    }

    static void mandarMensajeAmor(String nombreFulana , int dinero) {
        if (dinero == 0){
            dinero = 25000;
        }
        System.out.println("Buenos dias mi amor");
        System.out.println("Te ves sexy el dia de hoy" +dinero+ "el dinero");
        System.out.println("");
    }
}
