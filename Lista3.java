package primeiroProjeto;

import java.util.Scanner;

public class Lista3 {

	public static void main(String[] args) {
Scanner scanner =  new Scanner(System.in);
		
		//1 - Resultado de dois números
		int num1, num2;
		System.out.print("Escreva um número inteiro: ");
		num1 = scanner.nextInt();
		System.out.print("Escreva outro número inteiro: ");
		num2 = scanner.nextInt();
		int soma = num1 + num2;
		System.out.println("A soma dos números é: "+ soma);
		System.out.println("\n");
		
		//2 - Divisão e Resto
		int num3, num4;
		System.out.print("Escreva um número inteiro: ");
		num3 = scanner.nextInt();
		System.out.print("Escreva outro número inteiro: ");
		num4 = scanner.nextInt();
		int div = num3 / num4;
		int rest = num3 % num4;
		System.out.println("O resultado da divisão é: "+ div);
		System.out.println("O resto da divisão é: "+ rest);
		System.out.println("\n");
		
		//3 - Perímetro de um triângulo
		double ld1, ld2, ld3;
		System.out.print("Escreva o valor do primeiro lado: ");
		ld1 = scanner.nextDouble();
		System.out.print("Escreva o valor do segundo lado: ");
		ld2 = scanner.nextDouble();
		System.out.print("Escreva o valor do terceiro lado: ");
		ld3 = scanner.nextDouble();
		double perimetro = ld1+ld2+ld3;
		System.out.println("O perímetro do triângulo é: "+ perimetro);
		System.out.println("\n");
		
		//4 - Calculadora de Gorjeta
		double valor, gorjeta;
		System.out.print("Informe o valor da conta do restaurante: ");
		valor = scanner.nextDouble();
		System.out.print("Informe a porcentagem de gorjeta desejada: ");
		gorjeta = scanner.nextDouble();
		double totgorj = gorjeta / 100;
		double totgorj1 = totgorj * valor;
		double total = totgorj1 + valor;
		System.out.println("A gorjeta é: "+ totgorj1);
		System.out.println("O total é: "+ total);
		System.out.println("\n");
		
		//5 - Calculadora de área de círculo
		double raio;
		System.out.print("Informe o raio do círculo em metros: ");
		raio = scanner.nextDouble();
		double area = 3.14159 * raio * raio;
		System.out.println("O resultado da área do círculo é: "+area);
		System.out.println("\n");
		
		//6 - Conversor de idade em dias
		System.out.print("Anos: ");
	    int anos = scanner.nextInt();
	    System.out.print("Meses: ");
	    int meses = scanner.nextInt();
	    System.out.print("Dias: ");
	    int dias = scanner.nextInt();
	    int totalDias = (anos * 365) + (meses * 30) + dias;
	    System.out.println("Total de dias vividos: " + totalDias);
	    System.out.println("\n");
	    
		//7 - Calculadora de pagamento por hora
	    double hora, vphora;
	    System.out.print("Informe o número de horas trabalhadas: ");
	    hora = scanner.nextDouble();
	    System.out.print("Informe o valor pago por hora: ");
	    vphora = scanner.nextDouble();
	    double salariob = hora * vphora;
	    System.out.println("O salário bruto é de: "+ salariob);
	    double imposto = salariob * 0.10;
	    System.out.println("O imposto é de: "+ imposto);
	    double salarioli = salariob - imposto;
	    System.out.println("O salário líquido é de: "+ salarioli);
	    System.out.println("\n");

	}

}
