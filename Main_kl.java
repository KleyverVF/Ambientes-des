 import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("[A] Número Primo");
            System.out.println("[B] Somatório");
            System.out.println("[C] Fibonacci");
            System.out.println("[D] Máximo Divisor Comum (MDC)");
            System.out.println("[E] Ordenação (QuickSort)");
            System.out.println("[F] Contagem");
            System.out.println("[S] Sair");
            System.out.print("\nEscolha uma opção: ");

            opcao = sc.next().toUpperCase();

            switch (opcao) {
                case "A": NumeroPrimo.executar(); break;
                case "B": Somatorio.executar(); break;
                case "C": Fibonacci.executar(); break;
                case "D": MDC.executar(); break;
                case "E": Ordenacao.executar(); break;
                case "F": Contagem.executar(); break;
                case "S": System.out.println("👋 Saindo..."); break;
                default: System.out.println("❌ Opção inválida!");
            }
        } while (!opcao.equals("S"));

        sc.close();
    }
}

// =========================
// Classes auxiliares abaixo
// =========================

class NumeroPrimo {
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

class Somatorio {
    public static void executar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de números: ");
        int qtd = sc.nextInt();

        int soma = 0;
        for (int i = 1; i <= qtd; i++) {
            System.out.print("Número " + i + ": ");
            soma += sc.nextInt();
        }

        System.out.println("Somatório = " + soma);
    }
}

class Fibonacci {
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

class MDC {
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

class Ordenacao {
    public static void executar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantidade de números: ");
        int n = sc.nextInt();
        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = sc.nextInt();
        }

        quicksort(vetor, 0, n - 1);

        System.out.print("Vetor ordenado: ");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static void quicksort(int[] v, int ini, int fim) {
        if (ini < fim) {
            int p = dividir(v, ini, fim);
            quicksort(v, ini, p - 1);
            quicksort(v, p + 1, fim);
        }
    }

    private static int dividir(int[] v, int ini, int fim) {
        int pivo = v[fim];
        int i = ini - 1;
        for (int j = ini; j < fim; j++) {
            if (v[j] <= pivo) {
                i++;
                int aux = v[i];
                v[i] = v[j];
                v[j] = aux;
            }
        }
        int aux = v[i + 1];
        v[i + 1] = v[fim];
        v[fim] = aux;
        return i + 1;
    }
}

class Contagem {
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
