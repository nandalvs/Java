package primeiroProjeto;

import java.util.Scanner;

public class Lista05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 //1 - Classificação de idade
		
		System.out.println("Informe a sua idade: ");
		int idade = scanner.nextInt();
		if(idade <= 12) {
		   System.out.println("Você é criança.");
		}else if (idade <= 17) {
			System.out.println("Você é adolescente.");
		}else if (idade <= 59){
			System.out.println("Você é adulto.");
		}else {
			System.out.println("Você é idoso.");
		}
		//2 - Avaliação de Temperatura
		System.out.println("Informe a temperatura: ");
		int temp = scanner.nextInt();
		if(temp <= 10) {
		   System.out.println("Está muito Frio.");
		}else if (temp <= 20) {
			System.out.println("Está frio.");
		}else if (temp <= 30){
			System.out.println("O clima está agradável.");
		}else {
			System.out.println("Está muito Quente.");
		}
		//
		//3 - Sistema de Notas Escolares
				System.out.println("Informe sua nota: ");
				int nota = scanner.nextInt();
				if(nota >= 90) {
				   System.out.println("Parabéns você tirou A!");
				}else if (nota >= 80) {
					System.out.println("Parabéns você tirou B!");
				}else if (nota >= 70){
					System.out.println("Você tirou C.");
				}else if (nota >= 60){
					System.out.println("Você tirou D");
				} else {
					System.out.println("Você tirou F mais sorte da próxima.");
				}
				//4 - Verificação de senha
				System.out.println("Informe a sua senha: ");
				String senha = scanner.next();
				if (senha.equals("admin")) { 
					System.out.println("Acesso permitido!");
				}else {
					System.out.println("Acesso negado.");
				}
				//5 - Comparação de nomes
				System.out.println("Me fale um nome: ");
				String nome1 = scanner.next();
				System.out.println("Me fale outro nome: ");
				String nome2 = scanner.next();
				if (nome1.equalsIgnoreCase(nome2)) { 
					System.out.println("Os nomes são iguais.");
				}else {
					System.out.println("Os nomes são diferentes.");
				}
				//6 - Jogo da cor favorita
				System.out.println("Nos fale sua cor favorita: ");
				String cor = scanner.next();
				if(cor.equalsIgnoreCase("Azul")) {
					System.out.println("Boa escolha!");
				} else if (cor.equalsIgnoreCase("vermelho")) {
					System.out.println("Cor vibrante!");
				} else if (cor.equalsIgnoreCase("verde")) {
					System.out.println("Cor da natureza!");
				} else {
				System.out.println("Cor não cadastrada.");
				}
				//7 - Verificação de vogal
				System.out.println("Digite uma letra: ");
				String letter = scanner.next();
				if (letter.equalsIgnoreCase("a,e,i,o,u")) {
					System.out.println("É uma vogal");
				}else {
					System.out.println("Não é uma vogal.");
				}
				
				
	}

}
