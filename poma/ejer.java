import java.util.Scanner;

class Innerejercicio412 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //definir variable
        int i, n, ventas_de_0_a_10000, ventas_de_10000_a_20000;
        double cantidad_global, cantidad_ventas_de_0_a_10000, cantidad_ventas_de_10000_a_20000, venta;
        ventas_de_0_a_10000 = 0;
        ventas_de_10000_a_20000 = 0;
        cantidad_ventas_de_0_a_10000 = 0;
        cantidad_ventas_de_10000_a_20000 = 0;
        cantidad_global = 0;
        //datos de entrada
        System.out.print("Ingresa el valor de n: ");
        n = in.nextInt();
        in.nextLine();
        //proceso
        for (i=1; i<=n; i++) {
            System.out.print("PROCESO " + i);
            System.out.print("Ingresa el valor de venta: ");
            venta = in.nextDouble();
            in.nextLine();
            if(venta<=10000)
            {
                ventas_de_0_a_10000=ventas_de_0_a_10000+1;
                cantidad_ventas_de_0_a_10000=cantidad_ventas_de_0_a_10000+venta;
            }
            if(venta>10000&&venta<=20000)
            {
                ventas_de_10000_a_20000=ventas_de_10000_a_20000+1;
                cantidad_ventas_de_10000_a_20000=cantidad_ventas_de_10000_a_20000+venta;
            }
            cantidad_global=cantidad_global+venta;
            System.out.println();
        }
        //datos de salida
        System.out.println("Valor de ventas de 0 a 10000: " + ventas_de_0_a_10000);
        System.out.println("Valor de ventas de 10000 a 20000: " + ventas_de_10000_a_20000);
        System.out.println("Valor de monto ventas de 0 a 10000: " + cantidad_ventas_de_0_a_10000);
        System.out.println("Valor de monto ventas de 10000 a 20000: " + cantidad_ventas_de_10000_a_20000);
        System.out.println("Valor de monto global: " + cantidad_global);
    }

}
