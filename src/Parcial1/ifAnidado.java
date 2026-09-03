package Parcial1;


public class ifAnidado {
    static void main() {
        String tipo = "Asalariado";
        int ganas = 40000;
        int cantidadtrabajos = 1;
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
