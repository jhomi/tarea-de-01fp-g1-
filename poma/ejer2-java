import java.util.Scanner;

public class ejercicio413 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //definir variable
        int aprobados, i, n, desaprovado;
        double nota, nota_aprobatoria;
        aprobados = 0;
        desaprovado = 0;
        //datos de entrada
        System.out.print("Ingresa el valor de calificacion aprobatoria: ");
        nota_aprobatoria = in.nextDouble();
        in.nextLine();
        System.out.print("Ingresa el valor de n: ");
        n = in.nextInt();
        in.nextLine();
        //proceso
        for (i=1; i<=n; i++) {
            System.out.print("PROCESO " + i);
            System.out.print("Ingresa el valor de calificacion: ");
            nota = in.nextDouble();
            in.nextLine();
            if(nota>=nota_aprobatoria)
                aprobados=aprobados+1;
            else
            desaprovado=desaprovado+1;
            System.out.println();
        }
        //datos de salida
        System.out.println("Valor de aprobados: " + aprobados);
        System.out.println("Valor de reprobados: " + desaprovado);
    }

}
    
