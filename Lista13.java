package primeiroProjeto;

import java.util.Scanner;

public class Lista13 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
		  
		// -------------------- 1 - Contador --------------------
	        for (int cont = 10; cont <= 30; cont++) {
	            System.out.println(cont);
	        }
	        System.out.println("--------------------");

	        // -------------------- 2 - Classificação de Idades --------------------
	        for (int i = 1; i <= 10; i++) {
	            System.out.println("Digite sua idade:");
	            int idade = scanner.nextInt();
	            if (idade >= 18) {
	                System.out.println("Maior de idade");
	            } else {
	                System.out.println("Menor de idade");
	            }
	        }
	        System.out.println("--------------------");

	        // -------------------- 3 - Eleição --------------------
	        for (int i = 1; i <= 5; i++) {
	            System.out.println("Digite seu voto (1-4 candidatos, 5 nulo, 6 branco):");
	            int voto = scanner.nextInt();
	            switch (voto) {
	                case 1:
	                    System.out.println("Votou no Candidato 1");
	                    break;
	                case 2:
	                    System.out.println("Votou no Candidato 2");
	                    break;
	                case 3:
	                    System.out.println("Votou no Candidato 3");
	                    break;
	                case 4:
	                    System.out.println("Votou no Candidato 4");
	                    break;
	                case 5:
	                    System.out.println("Voto Nulo");
	                    break;
	                case 6:
	                    System.out.println("Voto em Branco");
	                    break;
	                default:
	                    System.out.println("Código inválido");
	            }
	        } 
	        System.out.println("--------------------");


	        // -------------------- 4 - Repetição de Frase --------------------
	        System.out.println("Digite uma frase (sem espaços):");
	        String frase = scanner.next();   
	        System.out.println("Digite um número:");
	        int vezes = scanner.nextInt();

	        for (int i = 1; i <= vezes; i++) {
	            System.out.println(frase);
	        }
	        System.out.println("--------------------");

	        // -------------------- 5 - Sequência --------------------
	        for (int i = 50; i >= 30; i--) {
	            System.out.println(i);
	        }
	        System.out.println("--------------------");

	        // -------------------- 6 - Números Alternados --------------------
	        for (int i = 1; i <= 50; i += 2) {
	            System.out.println(i);
	        }
	        System.out.println("--------------------");

	        // -------------------- 7 - Aprovado ou Reprovado --------------------
	        for (int i = 1; i <= 5; i++) {
	            System.out.println("Digite a nota:");
	            double nota = scanner.nextDouble();
	            if (nota >= 6) {
	                System.out.println("Aprovado");
	            } else {
	                System.out.println("Reprovado");
	            }
	        }
	        System.out.println("--------------------");

	        // -------------------- 8 - Categoria de Idade --------------------
	        for (int i = 1; i <= 5; i++) {
	            System.out.println("Digite a idade:");
	            int idade = scanner.nextInt();
	            if (idade <= 12) {
	                System.out.println("Criança");
	            } else if (idade <= 17) {
	                System.out.println("Adolescente");
	            } else if (idade <= 59) {
	                System.out.println("Adulto");
	            } else {
	                System.out.println("Idoso");
	            }
	        }
	        System.out.println("--------------------");

	        // -------------------- 9 - Número Positivo ou Negativo --------------------
	        for (int i = 1; i <= 7; i++) {
	            System.out.println("Digite um número:");
	            int numero = scanner.nextInt();
	            if (numero > 0) {
	                System.out.println("Positivo");
	            } else if (numero < 0) {
	                System.out.println("Negativo");
	            } else {
	                System.out.println("Zero");
	            }
	        }
	        System.out.println("--------------------");		  

	}

}
