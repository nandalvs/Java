package primeiroProjeto;

import java.util.Scanner;

public class Lista14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Exercício - 1
        System.out.println("Exercício 1 - Contador:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("--------------------");

        // Exercício - 2
        System.out.println("Exercício 2 - Soma de 1 a 100:");
        int soma = 0;
        for (int i = 1; i <= 100; i++) {
            soma += i;
        }
        System.out.println("A soma é: " + soma);
        System.out.println("--------------------");

        // Exercício - 3
        System.out.println("Exercício 3 - Números pares de 1 a 20:");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("--------------------");

        // Exercício - 4
        System.out.println("Exercício 4 - Tabuada:");
        System.out.println("Digite um número para ver a tabuada:");
        int numTabuada = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(numTabuada + " x " + i + " = " + (numTabuada * i));
        }
        System.out.println("--------------------");

        // Exercício - 5
        System.out.println("Exercício 5 - Divisíveis por 3 de 1 a 50:");
        int contDiv = 0;
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0) {
                contDiv++;
            }
        }
        System.out.println("Quantidade de números divisíveis por 3: " + contDiv);
        System.out.println("--------------------");

        // Exercício - 6
        System.out.println("Exercício 6 - Ímpares até N:");
        System.out.println("Digite um valor para N:");
        int N = scanner.nextInt();
        for (int i = 1; i <= N; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        System.out.println("--------------------");

        // Exercício - 7
        System.out.println("Exercício 7 - Multiplicação de valores:");
        int mult = 1;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite o valor " + i + ":");
            int valor = scanner.nextInt();
            mult *= valor;
        }
        System.out.println("Resultado da multiplicação: " + mult);
        System.out.println("--------------------");

        // Exercício - 8 
        System.out.println("Exercício 8 - Premiação da empresa:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite os anos de empresa do funcionário " + i + ":");
            int anos = scanner.nextInt();
            if (anos > 10) {
                System.out.println("Parabéns! Você irá receber um prêmio");
            } else {
                System.out.println("Quase lá");
            }
        }
        System.out.println("--------------------");

	}

}
