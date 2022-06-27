package pe.edu.pe.jdpm.examen;

public class ejercicio2 {
    public static void main() {
    
         int i, n=3;
         double cate1, cate2, cate3, clave, costo;
         double impuesto, impuestopagar;
         cate1 = 0;
         cate2 = 0;
         cate3 = 0;
         impuestopagar = 0;
         System.out.print("Ingresa el numero de automiviles: ");
         n =leer.nextInt();
         leer.nextLine();
         for (i=1; i<=n; i++) {
            System.out.print("proceso " + i);
            System.out.print("  Ingresa la categoria 1-2-3 : ");
            clave = leer.nextDouble();
            leer.nextLine();
            System.out.print("Ingresa el costo del vehiculo: ");
            costo = leer.nextDouble();
            leer.nextLine();
            impuesto=0;
            if(clave==1)
            {
                impuesto=costo*0.1;
                cate1=cate1+impuesto;
            }
            if(clave==2)
            {
                impuesto=costo*0.07;
                cate2=cate2+impuesto;
            }
            if(clave==3)
            {
                impuesto=costo*0.05;
                cate3=cate3+impuesto;
            }
            impuestopagar=impuestopagar+impuesto;
            System.out.println("total del impuesto: " + impuesto);
            System.out.println();
        }
        System.out.println("total del impuesto categoria 1: " + cate1);
        System.out.println("total del impuesto categoria 2: " + cate2);
        System.out.println("total del impuesto 3: " + cate3);
        System.out.println("total a pagar del impuesto es de : " + impuestopagar);
    }
              
 }     
