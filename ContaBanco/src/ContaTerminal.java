import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner sc=new Scanner(System.in);



        System.out.println("Numero da agencia: ");
        int numeroG=sc.nextInt();
        sc.nextLine();
        System.out.println("Numero da conta: ");
        String numeroC = sc.next();

        System.out.println("NOME DO CLIENTE:  ");
        String nome = sc.next();

        System.out.println("Saldo: ");
        double saldo = sc.nextDouble();
        
        System.out.println("Olá " + nome + " obrigado por criar uma conta em nosso banco, sua agência é " + numeroG + " conta: " + numeroC + " e seu saldo é: R$" + String.format("%.2f", saldo) );
        
    }
}
