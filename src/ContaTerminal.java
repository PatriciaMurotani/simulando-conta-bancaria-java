import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite o número de sua agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o número de sua conta: ");
        int conta = scanner.nextInt();

        System.out.println("Digite seu saldo: ");
        double saldoCliente = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", agradecemos por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + ", o seu saldo de R$" + saldoCliente + " já está disponível para saque.");
    }
}
