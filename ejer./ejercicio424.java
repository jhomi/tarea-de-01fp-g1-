/**
 * ejercicio424
 */
public class ejercicio424 {
    public static void main(String[] args) {
      //definir variable
        int pruevas = 4;
        int indinumero;
        boolean encontrado = false;
      //proceso y datos de entrada y salida
        do {
          System.out.print("Introduzca la clave de la caja fuerte: ");
          indinumero = Integer.parseInt(System.console().readLine());
          
          if (indinumero == 8888) {
            encontrado = true;
          } else {
            System.out.println("Clave incorrecta");
          }
          
          pruevas--;
      
        } while((pruevas > 0) && (!encontrado));
        
        if (encontrado) {
          System.out.println("Ha abierto la caja fuerte.");
        } else {
          System.out.println("Lo siento, ha agotado las 4 oportunidades.");
        }
    }
}