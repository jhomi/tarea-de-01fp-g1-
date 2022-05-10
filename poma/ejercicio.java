package poma;

import java.util.Scanner;

import javax.swing.plaf.BorderUIResource.EtchedBorderUIResource;

public class ejercicio {
    public void profesor() {
        System.out.println("enseñar");
    }

    public void estudiante() {
        System.out.println("aprender o estudiar");
    }

    public static void maquinapc() {
        System.out.println("procesar informacion");
    }
    public static void proyector() {
        System.out.println("mostrar informacion");
    }
    
    public static void main(String[] args) {
        ejercicio  obj=new ejercicio();
        Scanner lt=new Scanner(System.in);
        System.out.println("ingrese el numero de algoritmo:\n1profesor\n2=estudiante"+
        "\n3=maquinapc\n4=proyector");
        int opcionmet=lt.nextInt();

        switch (opcionmet) {
            case 1: obj.profesor(); break;
            case 2: obj.estudiante(); break;
            case 3: maquinapc(); break;
            case 4: proyector(); break;
            default: System.err.println("Esa opcion no existe");  break;
        }
    }
}
