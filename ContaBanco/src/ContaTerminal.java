import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) throws Exception {   
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor, digite o seu primeiro nome!");
        String nome = scanner.next();
        
        System.out.println("Digite o seu sobrenome");
        String sobrenome = scanner.next();
        
        System.out.println("Digite o número da sua agência!");
        String agencia = scanner.next();
        
        System.out.println("Digite o número de sua conta corrente!");
        int numero = scanner.nextInt();
        
        System.out.println("Agora, por favor digite o valor que deseja depositar!");
        double saldo = scanner.nextDouble();

        String nomeCliente = nome + " " + sobrenome;

        System.out.println("Olá " + nomeCliente + ", obrigada por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
