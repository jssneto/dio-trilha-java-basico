import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        // TODO: Conhecer e importat a classe Scanner

        // Exibir as mensagens para o nosso usuário

        // Obter pela scanner os valores digitados no terminal

        // Exibir a mensagem da conta criada
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            
        System.out.println("Digite o número da Agência: ");
            int agencia = scanner.nextInt();

        System.out.println("Digite o número da Conta: ");
            int conta = scanner.nextInt();

        System.out.println("Digite o saldo da Conta: ");    
            double saldo = scanner.nextDouble();

        System.out.println("Digite o seu nome: ");
            String nome = scanner.next();

        System.out.println("Digite o seu sobrenome: ");
            String sobrenome = scanner.next();


        System.out.println("Olá, " + nome + " " + sobrenome + " obrigado por criar uma conta em nosso banco, "
         + " sua agência é: " + agencia + ", Conta: " + conta + " e seu saldo de: " + saldo + " já está disponível para saque! ");
    }


    
}
