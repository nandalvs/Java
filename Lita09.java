package primeiroProjeto;

import java.util.Scanner;

public class Lita09 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

		// 1 - Contador: 1 a 10
	        int contador1 = 1;
	        while (contador1 <= 10) {
	            System.out.println(contador1);
	            contador1++;
	        }
	        System.out.println("-----------------------------");

	        // 2 - Contagem regressiva: 10 a 1
	        int contador2 = 10;
	        while (contador2 >= 1) {
	            System.out.println(contador2);
	            contador2--;
	        }
	        System.out.println("-----------------------------");

	        // 3 - Sequência numérica: de 0 a 100 de 5 em 5
	        int contador3 = 0;
	        while (contador3 <= 100) {
	            System.out.println(contador3);
	            contador3 += 5;
	        }
	        System.out.println("-----------------------------");

	        // 4 - Mostrando mensagem 5 vezes
	        int contador4 = 1;
	        while (contador4 <= 5) {
	            System.out.println("Eu gosto de Java");
	            contador4++;
	        }
	        System.out.println("-----------------------------");

	        // 5 - Soma de 5 números digitados
	        int soma = 0;
	        int cont5 = 1;
	        while (cont5 <= 5) {
	            System.out.println("Digite o " + cont5 + "º número: ");
	            int numero = scanner.nextInt();
	            soma += numero;
	            cont5++;
	        }
	        System.out.println("A soma dos números é: " + soma);
	        System.out.println("-----------------------------");

	        // 6 - Validação de senha
	        System.out.println("Digite a senha: ");
	        int senha = scanner.nextInt();
	        while (senha != 1234) {
	            System.out.println("Senha incorreta, tente novamente: ");
	            senha = scanner.nextInt();
	        }
	        System.out.println("Senha correta! Acesso liberado.");
	        System.out.println("-----------------------------");

	        // 7 - Contagem regressiva a partir de um número informado
	        System.out.println("Digite um número inteiro positivo: ");
	        int numeroPositivo = scanner.nextInt();
	        while (numeroPositivo >= 1) {
	            System.out.println(numeroPositivo);
	            numeroPositivo--;
	        }
	        
	}

}
