import java.util.Scanner;

public class ContaTerminalMain {
    public static void main(String[] args) {

        int numeroConta;
        String agencia;
        String nomeCliente;
        float saldo;
        ContaTerminal conta = new ContaTerminal();
        Scanner scan;
        try {
            scan = new Scanner(System.in);

            System.out.print("\nInforme o número da Conta: ");
            numeroConta = scan.nextInt();
            System.out.print("Informe a agência: ");
            agencia = scan.next();
            System.out.print("Informe o nome do Cliente: ");
            nomeCliente = scan.next();
            System.out.print("Informe o saldo do Cliente: ");
            saldo = scan.nextFloat();

            conta.numeroConta = numeroConta;
            conta.agencia = agencia;
            conta.nomeCliente = nomeCliente;
            conta.saldo = saldo;

            System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, conta %s e seu saldo de R$ %.2f já está disponível para saque.", nomeCliente, agencia, numeroConta, saldo);


        } catch (Exception e) {
            System.out.println("Formato de número incorreto!");
        }
    }
}
