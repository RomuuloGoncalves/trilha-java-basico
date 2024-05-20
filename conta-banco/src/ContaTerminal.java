import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Banco sistemaBanco = new Banco();

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da agência");
        sistemaBanco.cadastrarNumeroAgencia(scanner.nextInt());

        System.out.println("Digite a agência");
        sistemaBanco.cadastrarAgencia(scanner.next());

        System.out.println("Digite o seu nome");
        sistemaBanco.cadastrarNomeCliente(scanner.next());

        System.out.println("Digite o número da agência");
        sistemaBanco.cadastrarSaldo(scanner.nextFloat());

        System.out.println("Olá " + sistemaBanco.nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + sistemaBanco.agencia + " conta "  + sistemaBanco.numeroAgencia  + " e seu saldo " + sistemaBanco.saldo  + " já está disponível para saque");
    }
}
