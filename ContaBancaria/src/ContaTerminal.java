import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor digite seu nome: ");
        String nome_Cliente = scanner.next();

        System.out.println("Agora digite quanto quer depositar: ");
        double saldo = scanner.nextDouble();

        System.out.println("O numero da agencia: ");
        String num_Agencia = scanner.next();
        
        System.out.println("Agora o numero da conta: ");
        int numero_Conta = scanner.nextInt();

        System.out.println("Olá " + nome_Cliente + " obrigado por criar uma conta em nosso banco,sua agência é " + num_Agencia + ",conta " + numero_Conta + " e seu saldo " + saldo + " já está diponivel para saque");

        scanner.close();
    }
    
}
