import java.util.Scanner;

public class Ordenacao {
    // Ordena um vetor de números usando o método QuickSort
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

    // Função de ordenação rápida
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
