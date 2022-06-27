package pe.edu.pe.jdpm.examen;

public class ejercicio5 {
    public void ejer5_1() {
        int n;
        do {
        System.out.print("Introduzca numero >0: ");
            n =leer.nextInt();
        } while (n < 0);
        System.out.print("Binario: ");
        ejer5_2(n);
    }

public static void ejer5_2(int n) {
        if (n < 2) {
            System.out.print(n);
            return;
        } else {
            ejer5_2(n / 2);
            System.out.print(n % 2);
            return;
        }
    }
}
public static void main(String[] args) {
    public static void ejer5(int n) {
        if (n < 2) {
            System.out.print(n);
            return;
        } else {
            ejer5_2(n / 2);
            System.out.print(n % 2);
            return;
        }
    }
}
