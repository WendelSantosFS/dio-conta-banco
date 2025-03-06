import java.util.Locale;
import java.util.Scanner;

public class BancoTerminal {
    public static void main(String[] args) {
       String nomeClient;
       String agencia;
       int numeroConta;
       double saldo;

       Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

       System.out.println("Digite o número da Conta: ");
       numeroConta = scanner.nextInt();

        System.out.println("Digite o número da Agência: ");
        agencia = scanner.next();

        System.out.println("Digite o NOME do cliente: ");
        nomeClient = scanner.next();

        System.out.println("Digite o Saldo do cliente: ");
        saldo = scanner.nextDouble();

        System.out.println(
        "Olá " + nomeClient + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta +
                " e seu saldo R$" + saldo + " já está disponível para saque."
        );


    }
}