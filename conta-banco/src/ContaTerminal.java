import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        String nome1= "RENAN AUGUSTO DE SOUZA";
        int agencia2 = 12345-6;
        long saldo3= 9855775;

        System.out.println("Seu nome: "+ nome1);
        System.out.println("Sua agencia: "+agencia2);
        System.out.println("Seu saldo: " +saldo3);

       System.out.println("Nome:");
       String nome = scanner.next();


        System.out.println("Digite o numero da agencia:");
        int agencia = scanner.nextInt();

        System.out.println("Digite seu saldo:");
        double saldo = scanner.nextDouble();

        System.out.println("Novo Nome:" +nome);
        System.out.println("Nova Agencia:" + agencia);
        System.out.println("Seu Novo Saldo:" + saldo + "esse é um bom valor");

    }
}
