package primeiroProjeto;

import java.util.Scanner;

public class Lista04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//1 - Verificar maioridade
		System.out.println("Qual a sua idade? ");
		int idade = scanner.nextInt();
		if (idade >= 18) {
			System.out.println("Você tem " + idade + " anos");
			System.out.println("é maior de idade!");
		}else {
			System.out.println("Você tem " + idade + " anos");
			System.out.println("é menor de idade!");
		}
		//2 - Comparar dois números
		System.out.println("Digite o primeiro numero: ");
		double num1 = scanner.nextDouble();
		System.out.println("Digite o segundo numero: ");
		double num2 = scanner.nextDouble();
		if(num1>num2) {
		System.out.println("o primeiro numero é maior");
		}else {
		System.out.println("O segundo número é maior ou eles são iguais");
			}
		
		//3 - Aprovação por nota
		double nota;
		System.out.println("Informe sua nota: ");
		nota = scanner.nextDouble();
		
	if (nota >= 7) {
		System.out.println("Aprovado! sua nota foi: " + nota);
	} else {
		System.out.println("Reprovado! sua nota foi: " + nota);
	}
		//4 - Verificar número positivo
	System.out.println("Informe um numero: ");
	double numero = scanner.nextDouble();
	if (numero >0) {
		System.out.println("O numero é positivo");
	}else {
		System.out.println("o numero é negativo");
	}
		//5 - Cálculo de frete
	System.out.print("Informe a distância em km: ");
    double distancia = scanner.nextDouble();
    double frete;
    if (distancia <= 50) {
        frete = 10.00;
    } else {
        frete = distancia * 0.5;
    }
    System.out.println("Valor do frete: R$ " + frete);
		//6 - O Número é 10?
		System.out.println("Informe o número: ");
		double num6 = scanner.nextDouble();
		
		if(num6 == 10) {
			System.out.println("o número é 10");
		} else {
			System.out.println("o número não é 10");
		}
		//7 - Desconto para Associados
		String socio;
		System.out.println("Você é associado da loja?  ");
		socio = scanner.next();
		if(socio.equals("sim")) {
			System.out.println("Você tem um desconto! ");
		} else {
			System.out.println("Você não tem desconto ");
		//8 - Cálculo de bônus por horas extras
	        System.out.print("Digite o número de horas extras trabalhadas: ");
	        int horasExtras = scanner.nextInt();
	        double bonus;
	        
	        if (horasExtras < 10) {
	            bonus = horasExtras * 20.00;
	        } else {
	            bonus = horasExtras * 15.00;
	        }
	        
	        System.out.printf("Bônus por hora extra: R$ %.2f%n", bonus);
	}
}}
