
package tarea2;

import java.util.Scanner;

/**
 * grafica
 */
public class grafica {

     Scanner leerT=new Scanner(System.in)
        


    public static void grafica(){ 
        System.out.println("ingrese altura de la letra:");
        int canF=leerT.nextlnt();
        System.out.println("ingrese num fila para linea:");
        int numFillinea=leerT.nextlnt();
        int medio=cantF+1
         for (int f  = 1; f <= cantF; f++) { 
             for (int c = 1; c <= 2*cantF+1; c++) {
                 if (f==1 &&  medio==C  && f>1);{
                     System.out.println("*");
                 }else if ( c== medio-f && f>1){
                     System.out.println("*");
                 }else if ( c== medio+f && f>1 )
                     System.out.println("*");
                 }else if ( f== numfillinea && c>medio-f ){
                    System.out.println("*");
                 }else{
                    System.out.println(" ");
                 }


                 }
                 System.out.println("\n");
                 
             }
             System.out.println("\n");
             
             
         }
         
        

    public static void main(String[] args) {
        grafica();
    }
}    

    
