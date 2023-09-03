import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o primeiro parâmetro:");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo parâmetro:");
        int numero2 = scanner.nextInt();

        try {
            contar(numero1, numero2);
        } catch(ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro precisa ser maior que o primeiro.");
        }
    }

    static void contar(int numero1, int numero2) throws ParametrosInvalidosException {
        int contagem = numero2 - numero1;
        if (numero2 > numero1) {
            for (int x = numero1; x < numero2; x++) {
                System.out.println("Imprimindo o número " + x);
            }
            System.out.println("Houveram " + contagem + " ocorrências nesse sistema.");
        } else 
            throw new ParametrosInvalidosException();
    }


}
