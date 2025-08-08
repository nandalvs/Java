package primeiroProjeto;

import java.util.Scanner;

public class Primeira {

	public static void main(String[] args) {
		System.out.println("Olá Mundo");
		//Declaração de variavel
		int idade = 16;
		double salario = 2000.50;
		char letra = 'F';
		String nome = "Fernanda";
		boolean chuva = false;
		
		System.out.println(idade);
		System.out.println("O Sálario é: "+ salario);
		System.out.println("Letra: " + letra);
		System.out.println("O nome é: " + nome);
		System.out.println(chuva);
		
		//Operadores
		int num1 = 10;
		int num2 = 3;
		double soma = num1 + num2;
		double sub = num1 - num2;
		double div = num1 / num2;
		double mult = num1 * num2;
		double resto = num1 % num2; //Modulo - Resto da Divisao
		
		System.out.println("Soma: " + soma);
		System.out.println("Subtração: "+ sub);
		System.out.println("Multiplicação: " + mult);
		System.out.println("Divisão: " + div);
		System.out.println("Resto: "+ resto);
		
		//Entrada de Dados
		Scanner scanner = new Scanner(System.in);
		System.out.println("Qual seu nome? ");
		String nome1 = scanner.nextLine();
		System.out.println("Olá " + nome1);
		
		//Soma de dois numeros
		int numero1;
		int numero2;
		System.out.print("Informe um número: ");
		numero1 = scanner.nextInt();
		System.out.print("Informe outro número: ");
		numero2 = scanner.nextInt();
		int soma1 = numero1 + numero2;
		System.out.println("O resultado é: "+soma1);
		
		int data;
		int anoatual = 2025;
		System.out.println("Qual o ano do seu nascimento? ");
		data = scanner.nextInt();
		int soma3 = anoatual - data;
		System.out.println("A sua idade é: "+soma3);
		
		//Calcular descconto
		double preco;
		double desconto;
		System.out.println("Qual valor da compra?");
		preco = scanner.nextDouble();
		System.out.println("Qual valor do desconto?");
		desconto = scanner.nextDouble();
		double pagar = preco - desconto;
		System.out.println("Pague: "+ pagar);
		
		/*Peça duas notas decimais para o usuários, calcule média e mostre*/
		double nota1;
		double nota2;
		System.out.println("Primeira nota: ");
		nota1 = scanner.nextDouble();
		System.out.println("Segunda nota: ");
		nota2 = scanner.nextDouble();
		double media = (nota1 = nota2) /2;
		System.out.println("A Sua média é " +media);
		
	}
}
