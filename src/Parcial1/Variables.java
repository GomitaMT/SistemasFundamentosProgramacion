package Parcial1;

public class Variables {
    static void main(String[] args) {
        int cantidadProductos = 24;
        double precioProducto = 230.0;
        final double IVA = 0.16;

        double subTotal = cantidadProductos * precioProducto;
        double impuesto = subTotal*IVA;
        double total = impuesto*subTotal;
        System.out.println("cantidadProductos: " + cantidadProductos);
        System.out.println("precio: " + precioProducto);
        System.out.println("subTotal: " + subTotal);
        System.out.println("total: " + total);

        /**
        int salario = 0;
        System.out.println(salario);
        salario = 4000;
        System.out.println(salario);
        salario = 12000;
        System.out.println(salario);
        salario = 30000;
        System.out.println(salario);
        */
    }
}
