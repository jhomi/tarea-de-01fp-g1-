public class ejercicio417 {
    public static void main(String[] args) {
        //definir variable
        double A, ahorros, i, S;
        A=2021-1961;
        S=1500.0;
        i=15.0/100.0;
        //proceso
        ahorros=A*Math.pow(1.0+i,S);
        //datos de salida
        System.out.println("Valor de P: " + S);
        System.out.println("Valor de ahorros: " + ahorros);
        System.out.println("Valor de i: " + i);
        System.out.println("Valor de n: " + S);
    }

}

