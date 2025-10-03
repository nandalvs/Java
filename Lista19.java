package primeiroProjeto;

import java.util.Scanner;

public class Lista19 {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);

	        // 1 – Classificando valores
	        System.out.println("Digite um número para classificar (positivo/negativo/zero):");
	        int num = sc.nextInt();
	        classificarNumero(num);

	        // 2 – Maioridade
	        System.out.println("Digite sua idade:");
	        int idade = sc.nextInt();
	        verificarMaioridade(idade);

	        // 3 – Boas Vindas
	        boasVindas("Marcia");
	        boasVindas("Pedro");

	        // 4 – Tabuada
	        System.out.println("Digite um número para ver a tabuada:");
	        int valorTabuada = sc.nextInt();
	        tabuada(valorTabuada);

	        // 5 – Juntando palavras
	        System.out.println("Digite a primeira palavra:");
	        String palavra1 = sc.next();
	        System.out.println("Digite a segunda palavra:");
	        String palavra2 = sc.next();
	        juntarPalavras(palavra1 , palavra2);

	        // 6 – Verificando par ou ímpar
	        System.out.println("Digite um número inteiro para verificar se é par ou ímpar:");
	        int numero = sc.nextInt();
	        parOuImpar(numero);

	        // 7 – Classificando temperatura
	        System.out.println("Digite a temperatura:");
	        double temp = sc.nextDouble();
	        classificarTemperatura(temp);

	        // 8 – Saudação por turno
	        System.out.println("Digite o turno (manha, tarde ou noite):");
	        String turno = sc.next();
	        saudacaoPorTurno(turno);

	        // 9 – Calculando média
	        System.out.println("Digite três notas:");
	        double n1 = sc.nextDouble();
	        double n2 = sc.nextDouble();
	        double n3 = sc.nextDouble();
	        calcularMedia(n1, n2, n3);

	        // 10 – Verificando aprovação
	        System.out.println("Digite a nota final:");
	        double notaFinal = sc.nextDouble();
	        verificarAprovacao(notaFinal);

	        sc.close();
	    }

	    // 1
	    public static void classificarNumero(int numero) {
	        if (numero > 0) {
	            System.out.println("Positivo");
	        } else if (numero < 0) {
	            System.out.println("Negativo");
	        } else {
	            System.out.println("Zero");
	        }
	    }

	    // 2
	    public static void verificarMaioridade(int idade) {
	        if (idade >= 18) {
	            System.out.println("Maior de idade");
	        } else {
	            System.out.println("Menor de idade");
	        }
	    }

	    // 3
	    public static void boasVindas(String nome) {
	        System.out.println("Bem-vindo(a), " + nome + "!");
	    }

	    // 4
	    public static void tabuada(int numero) {
	        System.out.println("Tabuada do " + numero + ":");
	        for (int i = 1; i <= 10; i++) {
	            System.out.println(numero + " x " + i + " = " + (numero * i));
	        }
	    }

	    // 5
	    public static void juntarPalavras(String p1, String p2) {
	        System.out.println("Palavras concatenadas: " + p1 + p2);
	    }

	    // 6
	    public static void parOuImpar(int numero) {
	        if (numero % 2 == 0) {
	            System.out.println("Par");
	        } else {
	            System.out.println("Ímpar");
	        }
	    }

	    // 7
	    public static void classificarTemperatura(double temperatura) {
	        if (temperatura < 15) {
	            System.out.println("Frio");
	        } else if (temperatura <= 25) {
	            System.out.println("Agradável");
	        } else {
	            System.out.println("Quente");
	        }
	    }

	    // 8
	    public static void saudacaoPorTurno(String turno) {
	        if (turno.equalsIgnoreCase("manha")) {
	            System.out.println("Bom dia!");
	        } else if (turno.equalsIgnoreCase("tarde")) {
	            System.out.println("Boa tarde!");
	        } else if (turno.equalsIgnoreCase("noite")) {
	            System.out.println("Boa noite!");
	        } else {
	            System.out.println("Turno inválido!");
	        }
	    }

	    // 9
	    public static void calcularMedia(double n1, double n2, double n3) {
	        double media = (n1 + n2 + n3) / 3;
	        System.out.println("Média = " + media);
	    }

	    // 10
	    public static void verificarAprovacao(double notaFinal) {
	        if (notaFinal >= 7) {
	            System.out.println("Aprovado");
	        } else if (notaFinal >= 5) {
	            System.out.println("Em recuperação");
	        } else {
	            System.out.println("Reprovado");
	        }
	    }
	}
