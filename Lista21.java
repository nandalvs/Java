package primeiroProjeto;

import java.util.Scanner;

public class Lista21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=== Exercícios com funções que retornam valores ===\n");
		
		// 1 - Somar
		System.out.println("Digite dois números para somar:");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int soma = somar(n1, n2);
		System.out.println("A soma é: " + soma);
		
		// 2 - Subtrair
		int sub = subtrair(n1, n2);
		System.out.println("A diferença é: " + sub);
		
		// 3 - Multiplicar
		int mult = multiplicar(n1, n2);
		System.out.println("O produto é: " + mult);
		
		// 4 - Dividir
		double div = dividir(n1, n2);
		System.out.println("Resultado da divisão: " + div);
		
		// 5 - Média
		System.out.println("\nDigite duas notas:");
		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		double media = calcularMedia(nota1, nota2);
		System.out.println("Média: " + media);
		
		// 6 - Aprovação
		String situacao = verificarAprovacao(nota1, nota2);
		System.out.println("Situação: " + situacao);
		
		// 7 - Maior número
		int maior = maiorNumero(n1, n2);
		System.out.println("Maior número: " + maior);
		
		// 8 - Celsius para Fahrenheit
		System.out.println("\nDigite a temperatura em Celsius:");
		double celsius = sc.nextDouble();
		double fahrenheit = converterCelsiusParaFahrenheit(celsius);
		System.out.println("Em Fahrenheit: " + fahrenheit);
		
		// 9 - Área do retângulo
		System.out.println("\nDigite a base e a altura do retângulo:");
		double base = sc.nextDouble();
		double altura = sc.nextDouble();
		double area = calcularAreaRetangulo(base, altura);
		System.out.println("Área do retângulo: " + area);
		
		// 10 - Gerar mensagem
		System.out.println("\nDigite seu nome:");
		sc.nextLine(); // limpar buffer
		String nome = sc.nextLine();
		String mensagem = gerarMensagem(nome);
		System.out.println(mensagem);
		
		// 11 - Juntar nomes
		System.out.println("\nDigite o primeiro nome:");
		String nome1 = sc.nextLine();
		System.out.println("Digite o segundo nome:");
		String nome2 = sc.nextLine();
		String juntos = juntarNomes(nome1, nome2);
		System.out.println("Nomes juntos: " + juntos);
		
		// 12 - Avaliar idade
		System.out.println("\nDigite sua idade:");
		int idade = sc.nextInt();
		String classificacao = avaliarIdade(idade);
		System.out.println("Você é: " + classificacao);
		
		sc.close();
	}

	// 1
	public static int somar(int a, int b) {
		return a + b;
	}

	// 2
	public static int subtrair(int a, int b) {
		return a - b;
	}

	// 3
	public static int multiplicar(int a, int b) {
		return a * b;
	}

	// 4
	public static double dividir(double a, double b) {
		if (b == 0) {
			System.out.println("Não é possível dividir por 0.");
			return 0;
		}
		return a / b;
	}

	// 5
	public static double calcularMedia(double nota1, double nota2) {
		return (nota1 + nota2) / 2;
	}

	// 6
	public static String verificarAprovacao(double nota1, double nota2) {
		double media = calcularMedia(nota1, nota2);
		if (media >= 6) {
			return "Aprovado";
		} else {
			return "Reprovado";
		}
	}

	// 7
	public static int maiorNumero(int a, int b) {
		if (a > b) {
			return a;
		} else if (b > a) {
			return b;
		} else {
			System.out.println("Eles são iguais.");
			return a;
		}
	}

	// 8
	public static double converterCelsiusParaFahrenheit(double celsius) {
		return (celsius * 9 / 5) + 32;
	}

	// 9
	public static double calcularAreaRetangulo(double base, double altura) {
		return base * altura;
	}

	// 10
	public static String gerarMensagem(String nome) {
		return "Olá, " + nome + "!";
	}

	// 11
	public static String juntarNomes(String nome1, String nome2) {
		return nome1 + " " + nome2;
	}

	// 12
	public static String avaliarIdade(int idade) {
		if (idade < 12) {
			return "Criança";
		} else if (idade < 18) {
			return "Adolescente";
		} else if (idade < 60) {
			return "Adulto";
		} else {
			return "Idoso";
		}
	}
}

