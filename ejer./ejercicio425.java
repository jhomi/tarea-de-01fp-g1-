public class ejercicio425 {
    public static void main(String[] args) {
       //definir variable
        double numeros = 0;
        double numeroIntroducido = 0;
        double suma = 0;
       //datos de entrada
        System.out.println("Este programa calcula la media de los números positivos introducidos.");
        System.out.println("Para parar, introduzca un número negativo.");
        System.out.println("Vaya introduciendo números:");
       //proceso y datos de salida
        while (numeroIntroducido >= 0) {
          numeroIntroducido = Double.parseDouble(System.console().readLine());
          numeros++;
          suma += numeroIntroducido;
        }
        
        System.out.print("La media de los números positivos introducidos es ");
        System.out.println((suma - numeroIntroducido) / (numeros - 1));
      }
    }

    

