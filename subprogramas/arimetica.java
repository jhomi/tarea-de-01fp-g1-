package subprogramas;

/**
 * arimetica
 */
public class arimetica {
    int va, vb;

    arimetica(){
    }



    arimetica(int va, int vb){
        this.va=va;
        this.vb=vb;
    }


    public int sumar(int a, int b) {
         return a+b; 
    }

    public int multiplicar(){
        return (va*vb);
    }


}