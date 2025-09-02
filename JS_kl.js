
// 1 - Contar inteiros em um conjunto até a posição N
function contaInteiros(lista, limite) {
    let qtd = 0;
    for (let i = 0; i < limite && i < lista.length; i++) {
        if (Number.isInteger(lista[i])) {
            qtd++;
        }
    }
    return qtd;
}

const dadosTeste = [1, 2.5, 3, 4, 'abc', 5, 9.9];
console.log("Total de inteiros encontrados:", contaInteiros(dadosTeste, 6));

// 2 - Somar todos os elementos de um array
function somaTotal(valores) {
    let resultado = 0;
    for (const v of valores) {
        resultado += v;
    }
    return resultado;
}

const lista = [10, 20, 30, 40];
console.log("Soma geral =", somaTotal(lista));

// 3 - Algoritmo QuickSort (recursivo)
function ordenarRapido(vetor) {
    if (vetor.length <= 1) return vetor;
    const meio = Math.floor(vetor.length / 2);
    const pivo = vetor[meio];
    const menores = [], iguais = [], maiores = [];

    for (const el of vetor) {
        if (el < pivo) menores.push(el);
        else if (el > pivo) maiores.push(el);
        else iguais.push(el);
    }
    return [...ordenarRapido(menores), ...iguais, ...ordenarRapido(maiores)];
}

const numeros = [12, 7, 5, 18, 3, 9];
console.log("Lista organizada:", ordenarRapido(numeros).join(" | "));

// 4 - Verificar se número é primo
function verificaPrimo(n) {
    if (n < 2) return false;
    if (n % 2 === 0 && n !== 2) return false;
    let divisor = 3;
    while (divisor <= Math.sqrt(n)) {
        if (n % divisor === 0) return false;
        divisor += 2;
    }
    return true;
}

const testePrimo = 29;
console.log(`O número ${testePrimo} é primo?`, verificaPrimo(testePrimo));

// 5 - Maximo Divisor Comum (MDC)
function calculaMDC(x, y) {
    do {
        let aux = y;
        y = x % y;
        x = aux;
    } while (y !== 0);
    return x;
}

console.log("MDC de 48 e 180:", calculaMDC(48, 180));

// 6 - Sequencia de Fibonacci
function geraFibonacci(qtd) {
    if (qtd <= 0) return [];
    if (qtd === 1) return [0];
    let resultado = [0, 1];
    let i = 2;
    while (i < qtd) {
        resultado.push(resultado[i - 1] + resultado[i - 2]);
        i++;
    }
    return resultado;
}

const termos = 8;
console.log(`Sequência de Fibonacci (${termos} termos):`, geraFibonacci(termos).join(", "));
