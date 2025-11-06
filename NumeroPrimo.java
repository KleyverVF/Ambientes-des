import java.util.Scanner;

public class NumeroPrimo {
    // Um número é primo se for divisível apenas por 1 e por ele mesmo
    public static void executar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println("❌ O número deve ser maior que 1.");
            return;
        }

        boolean primo = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                primo = false;
                break;
            }
        }

        System.out.println(primo ? "✅ " + n + " é primo." : "❌ " + n + " não é primo.");
    }
}
