import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência.");
        agencia = scanner.next();

        System.out.println("Por favor, digite o número da Conta.");
        numero = scanner.nextInt();

        System.out.println("Por favor, digite seu nome completo.");
        nomeCliente = scanner.next();

        scanner.next();

        System.out.println("Por favor, digite seu saldo.");
        saldo = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.%n", nomeCliente, agencia, numero, saldo);
    }
}
