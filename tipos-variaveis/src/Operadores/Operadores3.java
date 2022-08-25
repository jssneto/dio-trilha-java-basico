package Operadores;
public class Operadores3 {

    public static void main(String[] args) {

        int a, b;

        a = 6;
        b = 6;

        /*String resultado = "";
        if(a==b)
            resultado = "verdadeiro";  ##Sem operadores ternários
        else
            resultado = "falso";''*/

        String resultado = a==b ? "verdadeiro" : "falso"; //Operador ternário

        System.out.println(resultado);
        

    }
    
}
