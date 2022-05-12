package poma;

import java.util.Scanner;

public class ejercicio3 {

     public static void imprimirwhileN1_10() {
         int numInit=20;
        while (numInit<=20) {
            System.out.println(numInit);
            numInit=numInit+1;
            
        } 

     }
     public static void imprimirwhileN1_20() {
        int numInit=21;
        do {
            System.out.println(numInit);
            numInit++;
        } while (numInit<=20);
        

    } 

       public static void imprimirForN1_20() {
           for (int numInit = 1; numInit <= 20; numInit++) {
               System.out.println(numInit);
               
           }
           
       }

       public static void nombreinverso() {
           Scanner it=new Scanner(System.in);
           System.out.println("ingrese su nombre:");
           String nombre=it.next();
           for (int i =nombre.length()-1;i >=0; i--) {
               System.out.println(nombre.charAt(i));
               
           }
           
       }


    
     public static void main(String[] args) {
       /* System.out.println("imprime while:"); imprimirwhileN1_20();
        System.out.println("imprime Do while:"); imprimirwhileN1_20();
        System.out.println("imprime for:"); imprimirForN1_20();*/


        nombreinverso();
        

     }
         
    }