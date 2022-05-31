import java.util.Scanner;

public class ejercicio420 {
    public static void main(String[] args) {
        Scanner lt = new Scanner(System.in);
        //definir variable
        int monedas_de_1, monedas_de_2, monedas_de_5, billetes_de_10, billetes_de_20, billetes_de_50;
        int cantidad_de_dinero;
        //datos de entrada
        System.out.print("Ingresa el valor de monedas de 1: ");
        monedas_de_1 = lt.nextInt();
        lt.nextLine();
        System.out.print("Ingresa el valor de monedas de 2: ");
        monedas_de_2 = lt.nextInt();
        lt.nextLine();
        System.out.print("Ingresa el valor de monedas de 5: ");
        monedas_de_5 = lt.nextInt();
        lt.nextLine();
        System.out.print("Ingresa el valor de billetes de 10: ");
        billetes_de_10 = lt.nextInt();
        lt.nextLine();
        System.out.print("Ingresa el valor de billetes de 20: ");
        billetes_de_20 = lt.nextInt();
        lt.nextLine();
        System.out.print("Ingresa el valor de billetes de 50: ");
        billetes_de_50 = lt.nextInt();
        lt.nextLine();
        //datos de salida 
        cantidad_de_dinero=(monedas_de_1*1)+(monedas_de_2*1)+(billetes_de_10*1)+(billetes_de_20*1)+(billetes_de_50*1);
        System.out.println("Valor de cantidad de dinero: " + cantidad_de_dinero);
    }

}