import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        //Criando o objeto scanner

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor digite o número da agência ");
        String agencia = scanner.next();

        System.out.println("Por favor digite o número da conta corrente: ");
        int contaCorrente = scanner.nextInt();

        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite o valor do primeiro deposito: ");
        double saldo = scanner.nextDouble();

        //imprimindo os dados obtidos pelo usuário

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + " conta corrente: " + contaCorrente + " e seu saldo de R$:" + saldo + " já está disponível para saque.");
    }
}
