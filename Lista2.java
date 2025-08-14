package primeiroProjeto;

import java.util.Scanner;

public class Lista2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//1 - Resultado de dois números
		double num1;
		double num2;
		System.out.println("Informe um número: ");
		num1 = scanner.nextDouble();
		System.out.println("Informe outro número: ");
		num2 = scanner.nextDouble();
		double soma = num1 + num2;
		double sub = num1 - num2;
		double mult = num1 * num2;
		double div = num1 / num2;
		System.out.println("A soma é: "+soma);
		System.out.println("A Subtração é: " + sub);
		System.out.println("A multiplicação é: "+ mult);
		System.out.println("A divisão é: "+div);
		
		
		//2 - Cálculo de temperatura
		System.out.println();
		System.out.println();
		double Cc;
		System.out.println("Informe a temperatura em graus célcius: ");
		Cc = scanner.nextDouble();
		double Ff = 1.8;
		double resultado = (Cc * Ff)+32;
		System.out.println("A temperatura em graus Fahrenheit é: "+ resultado);
		
		//3 - Conversão de valor
		System.out.println();
		System.out.println();
		System.out.println("Conversor de valores");
		System.out.println("Informe o valor em real e farei a conversão de real para dólar: ");
		double real;
		real = scanner.nextDouble();
		double dolar = 5.70;
		double total = real / dolar;
		System.out.println("O valor em dólar é US$: " + total);
		
		//4 - Área do retângulo
		System.out.println();
		System.out.println();
		System.out.println("Informe a base do seu retângulo: ");
		double base;
		base = scanner.nextDouble();
		System.out.println("Informe a altura: ");
		double altura;
		altura = scanner.nextDouble();
		double area = base * altura;
		System.out.println("A área do retângulo é: " + area);
		
		//5 - Conversor de idade
		System.out.println();
		System.out.println();
		System.out.println("Informe sua idade em anos: ");
		int idade;
		idade = scanner.nextInt();
		int idMes = idade * 12;
		System.out.println("Você já viveu " + idMes + " meses!");
		
		//6 - Conversor de minutos para segundos
		System.out.println();
		System.out.println();
		System.out.println("Fale um determinado tempo em minutos: ");
		double minutes;
		minutes = scanner.nextDouble();
		double seconds = minutes * 60;
		System.out.println("Isso esquivale a " + seconds + "segundos!");
		
		//7 - Custo da compra
		System.out.println();
		System.out.println();
		System.out.println("Informe o preço de um produto: ");
		double produto;
		produto = scanner.nextDouble();
		System.out.println("Agora, informe quantos produtos foram comprados: ");
		int quantidade;
		quantidade = scanner.nextInt();
		double custo = produto * quantidade;
		System.out.println("O custo total foi: " + custo);
		
		//8 - Divisão de uma conta de restaurante
		System.out.println();
		System.out.println();
		System.out.println("Informe o valor da conta do restaurante: ");
		double conta;
		conta = scanner.nextDouble();
		System.out.println("Quantas pessoas vão dividir está conta? ");
		int pessoas;
		pessoas = scanner.nextInt();
		double pagar = conta / pessoas;
		System.out.println("cada pessoa deve pagar R$: " + pagar);
		
		//9 - Cálculo de troco
		System.out.println();
		System.out.println();
		System.out.println("Informe o valor de uma compra: ");
		double compra;
		compra = scanner.nextDouble();
		System.out.println("Qual foi o valor pago? ");
		double pago;
		pago = scanner.nextDouble();
		double troco = pago - compra;
		System.out.println("O troco é R$: " + troco);
	}

}
