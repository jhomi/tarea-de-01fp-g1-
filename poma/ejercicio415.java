import java.util.Scanner;

public class ejercicio415 {
    public static void main(String[] args) {
        Scanner lt=new Scanner(System.in);
        //definir variable
        String cat="";
        double s=1;
        int sel,q,u=1;
        //datos de entrada
       System.out.println("elige una opcion\n");
       System.out.println("1. Mostrar los 20 primeros cubos\n");
       System.out.println("2. Mostrar los cubos que tengan hasta 4 digitos\n");
       System.out.println("3. Mostrar los cubos que exactamente tengan 4 digitos\n");
       sel=lt.nextInt();
       //proceso
       if(sel==1){
           for(q=1;q<21;q++){
               cat=cat+" "+Math.pow(q, 3);
           }
       }
       if(sel==2){
           while(s<10000){
               cat=cat+" "+s;
               u++;
               s=Math.pow(u, 3);
           }
       }
       if(sel==3){
           while(s<10000){
               if(s>=1000){
                   cat=cat+" "+s;                 
               }
                u++;
                s=Math.pow(u, 3);
           }
       }
       //datos de salida
       System.out.println(cat);
      }
    
}
