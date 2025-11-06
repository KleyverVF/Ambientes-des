import java.util.Scanner;

public class Fibonacci {
    // Gera a sequência de Fibonacci até N termos
    public static void executar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos termos da sequência deseja? ");
        int n = sc.nextInt();

        int a = 0, b = 1;
        System.out.print("Série: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + (i < n - 1 ? ", " : "\n"));
            int prox = a + b;
            a = b;
            b = prox;
        }
    }
}
