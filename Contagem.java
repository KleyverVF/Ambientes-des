import java.util.Scanner;

public class Contagem {
    // Conta de 1 até N e mostra os valores
    public static void executar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número N: ");
        int n = sc.nextInt();

        System.out.println("Contagem até " + n + ":");
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}
