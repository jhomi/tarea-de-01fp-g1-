import java.util.Scanner;

public class ejercicio414 {
    public static void main(String[] args) {
        Scanner lt = new Scanner(System.in);
        //definir variable
        int i, n;
        double descuento, horas_trabajadas, salario_por_hora, salario_semanal;
        String trabajador;
        //datos de entrada
        System.out.print("Ingresa el valor de n: ");
        n = lt.nextInt();
        lt.nextLine();
        //proceso
        for (i=1; i<=n; i++) {
            System.out.print("PROCESO " + i);
            System.out.print("Ingresa el nombre del trabajador: ");
            trabajador = lt.nextLine();
            System.out.print("Ingresa el valor de horas trabajadas: ");
            horas_trabajadas = lt.nextDouble();
            lt.nextLine();
            System.out.print("Ingresa el valor de sueldo por hora: ");
            salario_por_hora = lt.nextDouble();
            lt.nextLine();
            lt.nextLine();
            salario_semanal=horas_trabajadas*salario_por_hora;
            descuento=0;
            if(salario_semanal>0&&salario_semanal<=150)
                descuento=salario_semanal*0.05;
            if(salario_semanal>150&&salario_semanal<=300)
                descuento=salario_semanal*0.07;
            if(salario_semanal>300&&salario_semanal<=450)
                descuento=salario_semanal*0.09;
                salario_semanal=salario_semanal-descuento;
        //datos de salida
            System.out.println("Nombre del trabajador: " + trabajador);
            System.out.println("Valor de descuento: " + descuento);
            System.out.println("Valor de sueldo semanal: " + salario_semanal);
            System.out.println();
        }
    }
    
}

