package primeiroProjeto;

import java.util.Scanner;

public class Lista07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//1 - Classificação de Filme
		System.out.println("Informe sua idade: ");
		int idade = scanner.nextInt();
		if (idade < 16 && idade > 70) {
			System.out.println("Classificação especial ");
		}else {
			System.out.println("Classificação regular");
		}
		//2 - Promoção de Produto
		double prod;
		System.out.println("Qual o valor do produto? ");
		prod = scanner.nextDouble();
		System.out.println("Quantos exemplares do mesmo produto você pegou? ");
		int quant ;
		quant = scanner.nextInt();
		double val = prod * quant;
		double desc = val * 0.15;
		
		if (val > 200 && quant < 5) {
			System.out.println("Você irá pagar R$" + desc + " com o desconto de 15%!!");
		}else {
			System.out.println("Você irá pagar R$" + val + " sem o desconto");
		}
		
		//3 - Alerta de Saúde
		 System.out.println("Qual a frequência cardíaca? ");
	     int frequencia = scanner.nextInt();
	     System.out.println("Você sente tontura? (sim/nao) ");
	     String tontura = scanner.next();

	     if (frequencia >= 100 || tontura.equalsIgnoreCase("sim")) {
	         System.out.println("Procure atendimento médico!");
	     } else {
	         System.out.println(" Sem sinais de alerta.");
	     }
		
		//4 - Participação em Concurso
	    System.out.println("Qual sua idade? ");
	    int idade2 = scanner.nextInt();
	    System.out.println("Você é residente do estado? (sim/nao) ");
	    String residente = scanner.next();

	    if (idade2 >= 18 && idade2 <= 30 && residente.equalsIgnoreCase("sim")) {
	            System.out.println("Elegível para o concurso!");
	        } else {
	            System.out.println("Não elegível para o concurso.");
	        }
		
		//5 - Recompensa por Desempenho
		 System.out.println("Quantos projetos já foram concluídos? ");
		 int projetos = scanner.nextInt();
		 System.out.println("E quantos erros já teve? ");
	     int erros = scanner.nextInt();
	     
	     if( projetos > 10 && erros < 3) {
	    	 System.out.println("Recompensa concedida");
	     } else { 
	    	 System.out.println("Sem recompensa");
	     }
	     
	     
		//6 - Autorização para Viagem
	     System.out.println("Qual a sua idade? ");
	     int idd = scanner.nextInt();
	     System.out.println("Você tem passaporte? ");
	     String passa = scanner.next();
	     
	     if (idd >= 18 && passa.equalsIgnoreCase("sim")) {
	    	 System.out.println("Viagem autorizada!");
	     }else {
	    	 System.out.println("Viagem não autorizada!");
	     }
		
		//7 - Aprovação em Curso Online
	     System.out.println("Digite a nota final (0 a 100): ");
	     int nota = scanner.nextInt();

	     System.out.println("Digite o número de aulas assistidas (0 a 50): ");
	     int aulasAssistidas = scanner.nextInt();

	     if (nota >= 70 && aulasAssistidas >= 40) {
	     System.out.println("Aprovado!");
	     } else {
	     System.out.println("Reprovdo.");
	     }
		

		//8 - Controle de Irrigação
	     System.out.println("Digite a umidade do solo: ");
	     int umidade = scanner.nextInt();

	     System.out.println("Digite a temperatura : ");
	     int temperatura = scanner.nextInt();

	      if (umidade < 30 || temperatura > 30) {
	          System.out.println("Irrigação necessária!");
	      } else {
	      System.out.println("Irrigação não necessária.");
	        }
		
	    //9 - Inscrição em Feira Profissional
	        System.out.println("Qual a sua idade? ");
	        int idad = scanner.nextInt();

	        System.out.println("Você possui experiência prévia? (sim/nao) ");
	        String experiencia = scanner.next();

	        if (idad >= 20 && idad <= 40 && experiencia.equalsIgnoreCase("sim")) {
	            System.out.println(" Inscrição aceita!");
	        } else {
	            System.out.println(" Inscrição não permitida.");
	        }
	        
	}

}
