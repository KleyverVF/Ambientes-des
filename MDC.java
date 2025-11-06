import java.util.Scanner;

public class MDC {
    // Calcula o MDC entre dois números usando o método de Euclides
    public static void executar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Primeiro número: ");
        int a = sc.nextInt();
        System.out.print("Segundo número: ");
        int b = sc.nextInt();

        while (b != 0) {
            int resto = a % b;
            a = b;
            b = resto;
        }

        System.out.println("MDC = " + a);
    }
}
