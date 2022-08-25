package Operadores;
public class Operadores4 {

    public static void main(String[] args) {

        String nomeUm = "Neto";
        String nomeDois = new String("Neto");

        System.out.println(nomeUm.equals (nomeDois));


        
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1 == numero2);{ //true
            System.out.println("a nossa condicao e verdadeira");
        }

        System.out.println("numeroUm e igual ao numeroDois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm e diferente ao numeroDois? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numeroUm e maior que o numeroDois? " + simNao);

        boolean condicao1 = true;

        boolean condicao2 = true;

        if(condicao1 && condicao2){ // && = e
            System.out.println("as duas condicoes sao verdadeiras");
        }
        
        if(condicao1 || condicao2){ // || = ou
            System.out.println("uma das condicoes e verdadeiras");
        }

        System.out.println("fim");

    }
    
}
