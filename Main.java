import java.util.Scanner;

// Classe principal do programa
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== MENU ===");
        System.out.println("[A] Número Primo");
        System.out.println("[B] Somatório");
        System.out.println("[C] Fibonacci");
        System.out.println("[D] Máximo Divisor Comum (MDC)");
        System.out.println("[E] Ordenação (QuickSort)");
        System.out.println("[F] Contagem");
        System.out.print("\nEscolha uma opção: ");

        String opcao = sc.next().toUpperCase();

        switch (opcao) {
            case "A": NumeroPrimo.executar(); break;
            case "B": Somatorio.executar(); break;
            case "C": Fibonacci.executar(); break;
            case "D": MDC.executar(); break;
            case "E": Ordenacao.executar(); break;
            case "F": Contagem.executar(); break;
            default: System.out.println("❌ Opção inválida!");
        }

        sc.close();
    }
}
