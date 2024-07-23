import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        int numero;
        String agencia, nomeCliente;
        double saldo;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência !");
        numero = scanner.nextInt();

        System.out.println("Por favor, digite a Agência !");
        agencia = scanner.next();

        System.out.println("Por favor, digite seu nome!");
        nomeCliente = scanner.next();

        System.out.println("Por favor, digite seu saldo!");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+ numero +" e seu saldo R$ "+ saldo +" já está disponível para saque!");

        scanner.close();
    }
}