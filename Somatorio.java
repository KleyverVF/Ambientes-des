import java.util.Scanner;

public class Somatorio {
    // Soma todos os números até o valor informado
    public static void executar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de números: ");
        int qtd = sc.nextInt();

        int soma = 0;
        for (int i = 1; i <= qtd; i++) {
            System.out.print("Número " + i + ": ");
            int num = sc.nextInt();
            soma += num;
        }

        System.out.println("Somatório = " + soma);
    }
}
