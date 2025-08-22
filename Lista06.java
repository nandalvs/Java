package primeiroProjeto;

import java.util.Scanner;

public class Lista06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//1 - Intervalo numérico

		
				System.out.println("Me fale um número: ");
				int num = scanner.nextInt();
				
				if (num > 10 && num < 20) {
					System.out.println("Número está dentro do intervalo desejado!! ");
				}else {
					System.out.println("Número não está dentro do intervalo desejado...");
				}
				
				
				//2 - Acesso à festa

				System.out.println("------------------------");
				
				System.out.println("Me fale a sua idade: ");
				int id = scanner.nextInt();
				System.out.println("Você tem convite para a festa? (true/false)");
				boolean conv = scanner.nextBoolean();
				
				if(id >= 18 & conv) {
					System.out.println("A sua entrada é permitida na festa!");
				}else {
					System.out.println("A sua entrada não é permitida na festa...");
				}
				
				
				//3 - Categoria de esporte 
				System.out.println("------------------------");
				
				System.out.println("Me fale a sua idade: ");
				int esp = scanner.nextInt();
				
				if(esp <= 12 || esp >= 60) {
					System.out.println("Categoria especial! ");
				}else {
					System.out.println("Categoria normal...");
				}
				
				
				//4 - Desconto no produto


				System.out.println("------------------------");
		       
				System.out.println("Qual foi o valor do seu produto? ");
				double val = scanner.nextDouble();
				System.out.println("O pagamento vai ser feito a vista? (true/false)");
				boolean pag = scanner.nextBoolean();
				double des = val * 0.1;
				double fin = val - des;
				
				if(val > 100 || pag) {
					System.out.println("O valor a ser pago é R$" + fin );
				}else {
					System.out.println("O valor a ser pago é R$" + val);
				}
				
				//5 - Triagem médica

				System.out.println("------------------------");
				
				System.out.println("Digite a temperatura: ");
			    double temp = scanner.nextDouble();
			    System.out.println("Está com sintomas? (sim/nao): ");
			    String sint = scanner.next();
			        
			    if (temp >= 38 || sint.equalsIgnoreCase("sim")) {
			          System.out.println("Recomenda-se procurar um médico! ");
			    } else {
			          System.out.println("Sem sinais preocupantes....");
			    }
			    
			    //6 - Votação
			    System.out.println("------------------------");
			    
			    System.out.println("Digite sua idade: ");
		        int voto = scanner.nextInt();
		        System.out.println("É brasileiro? (sim/nao): ");
		        boolean br = scanner.nextBoolean();
		       
		        if (voto >= 16 && br) {
		            System.out.println("Pode votar.");
		        } else {
		            System.out.println("Não pode votar.");
		        }
		        
		        
		        //7 - Bônus de funcionário
		        System.out.println("------------------------");
		        
		        System.out.println("Quantidade de horas extras: ");
		        int horas = scanner.nextInt();
		        System.out.println("Número de faltas: ");
		        int faltas = scanner.nextInt();
		        
		        if (horas > 20 && faltas < 5) {
		            System.out.println("Ganha bônus!");
		        } else {
		            System.out.println("Não ganha bônus.");
		        }
		        
		        
		        //8 - Autorização para dirigir
		        System.out.println("------------------------");
		        
		        System.out.println("Digite sua idade: ");
		        int dirigir = scanner.nextInt();
		        System.out.println("Possui carteira de motorista? (sim/nao): ");
		        String car = scanner.next();
		        if (dirigir >= 18 && car.equalsIgnoreCase("sim")) {
		            System.out.println("Pode dirigir.");
		        } else {
		            System.out.println("Não pode dirigir.");
		        }
		        
		        //9 - Bolsa de estudos
		        System.out.println("------------------------");
		        
		        
		        System.out.println("Digite sua nota média (0 a 10): ");
		        double nota = scanner.nextDouble();
		        System.out.println("Digite sua frequência (0 a 100): ");
		        int freq = scanner.nextInt();
		        if (nota >= 8 && freq >= 80) {
		            System.out.println("Bolsa concedida!");
		        } else {
		            System.out.println("Bolsa não concedida.");
		        }

		        
		        //10 - Temperatura ambiente
		        System.out.println("------------------------");
		        
		        
		        System.out.println("Digite a temperatura (°C): ");
		        double amb = scanner.nextDouble();
		        System.out.println("Digite a umidade (%): ");
		        int umidade = scanner.nextInt();
		        if ((amb < 18 || amb > 26) && umidade > 60) {
		            System.out.println("Ajustar climatização.");
		        } else {
		            System.out.println("Climatização não necessária.");
		        }

	}

}
