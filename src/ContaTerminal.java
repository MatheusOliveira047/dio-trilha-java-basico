import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Por favor, digite o número da Agência!");
    int agencia = scan.nextInt();

    System.out.println("Por favor, digite o numero da conta");
    int numConta = scan.nextInt();

    System.out.println("Por favor, digite seu nome");
    scan.nextLine();
    String nome = scan.nextLine();

    System.out.println("Digite seu saldo");
    double saldo = scan.nextDouble();

    System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numConta + " e seu saldo " + saldo + " já está disponível para saque.");



    scan.close();
  }
}
