package subprogramas;
//import subprogramas.arimetica;
public class general {

    public static void main(String[] args) {
        arimetica a=new arimetica();
        int resultado=a.sumar(5,3); 
        System.out.println("suma:"+resultado);
        
        arimetica obj=new arimetica(5,3);
        resultado=obj.multiplicar();
        System.out.println("multiplicacion: "+resultado);
    }
}
