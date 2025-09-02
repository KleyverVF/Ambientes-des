import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=== MENU PRINCIPAL ===");
        System.out.println("A - Testar se um número é primo");
        System.out.println("B - Sequência de Fibonacci");
        System.out.println("C - Contagem até N");
        System.out.println("D - Ordenação com QuickSort");
        System.out.println("E - Trocar valores de duas variáveis");
        System.out.println("F - Calcular MDC (Máximo Divisor Comum)");
        System.out.println("G - Criar uma Pessoa");

        System.out.print("Digite a opção desejada: ");
        String escolha = entrada.next().toUpperCase();

        switch (escolha) {
            case "C":
                Contagem.runDemo();
                break;
            case "B":
                Fibonacci.runDemo();
                break;
            case "F":
                MaximoDivisorComum.runDemo();
                break;
            case "A":
                NumeroPrimo.runDemo();
                break;
            case "G":
                Pessoa.runDemo();
                break;
            case "D":
                QuickSort.runDemo();
                break;
            case "E":
                TrocaDeVariaveis.runDemo();
                break;
            default:
                System.out.println("Opção não reconhecida!");
        }

        entrada.close();
    }
}

// --------- Classes auxiliares ---------

class Contagem {
    public static void runDemo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um número limite: ");
        int limite = sc.nextInt();
        int i = 1;
        while (i <= limite) {
            System.out.println("Número: " + i);
            i++;
        }
    }
}

class Fibonacci {
    public static void runDemo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos termos deseja? ");
        int quantidade = sc.nextInt();

        int anterior = 0, atual = 1;
        System.out.print("Série: " + anterior);
        int cont = 1;
        while (cont < quantidade) {
            System.out.print(", " + atual);
            int auxiliar = anterior + atual;
            anterior = atual;
            atual = auxiliar;
            cont++;
        }
        System.out.println();
    }
}

class MaximoDivisorComum {
    public static void runDemo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Primeiro número: ");
        int x = sc.nextInt();
        System.out.print("Segundo número: ");
        int y = sc.nextInt();

        // Algoritmo de Euclides
        while (y != 0) {
            int auxiliar = y;
            y = x % y;
            x = auxiliar;
        }
        System.out.println("O MDC é: " + x);
    }
}

class NumeroPrimo {
    public static void runDemo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int valor = sc.nextInt();

        if (valor <= 1) {
            System.out.println("Não é primo.");
            return;
        }

        int divisor = 2;
        boolean primo = true;
        while (divisor <= Math.sqrt(valor)) {
            if (valor % divisor == 0) {
                primo = false;
                break;
            }
            divisor++;
        }

        if (primo) {
            System.out.println(valor + " é primo!");
        } else {
            System.out.println(valor + " não é primo.");
        }
    }
}

class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void mostrar() {
        System.out.println(">>> Nome: " + nome + " | Idade: " + idade);
    }

    public static void runDemo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome da pessoa: ");
        String n = sc.nextLine();
        System.out.print("Idade: ");
        int i = sc.nextInt();

        Pessoa p = new Pessoa(n, i);
        p.mostrar();
    }
}

class QuickSort {
    public static void runDemo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tamanho do vetor: ");
        int n = sc.nextInt();
        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor[i] = sc.nextInt();
        }

        ordenar(vetor, 0, n - 1);

        System.out.println("Vetor organizado:");
        for (int valor : vetor) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }

    private static void ordenar(int[] arr, int inicio, int fim) {
        if (inicio < fim) {
            int pos = dividir(arr, inicio, fim);
            ordenar(arr, inicio, pos - 1);
            ordenar(arr, pos + 1, fim);
        }
    }

    private static int dividir(int[] arr, int inicio, int fim) {
        int pivo = arr[fim];
        int i = inicio - 1;
        for (int j = inicio; j < fim; j++) {
            if (arr[j] <= pivo) {
                i++;
                int troca = arr[i];
                arr[i] = arr[j];
                arr[j] = troca;
            }
        }
        int troca = arr[i + 1];
        arr[i + 1] = arr[fim];
        arr[fim] = troca;
        return i + 1;
    }
}

class TrocaDeVariaveis {
    public static void runDemo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor de X: ");
        int x = sc.nextInt();
        System.out.print("Valor de Y: ");
        int y = sc.nextInt();

        System.out.println("Antes -> X: " + x + " | Y: " + y);

        // Troca usando variável auxiliar
        int auxiliar = x;
        x = y;
        y = auxiliar;

        System.out.println("Depois -> X: " + x + " | Y: " + y);
    }
}
