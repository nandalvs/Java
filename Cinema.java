package primeiroProjeto;

import java.util.Scanner;

public class Cinema {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in); 
		// Arrays de filmes e suas classificações
        String[] filmes = {
            "Divertida Mente (Livre)",
            "Harry Potter (10 anos)",
            "Jurassic Park (12 anos)",
            "Deadpool (14 anos)",
            "O Massacre da Serra Elétrica (16 anos)"
        };

        int[] classificacao = {0, 10, 12, 14, 16};

        // Mostrando os filmes disponíveis
        System.out.println("Filmes disponíveis: ");
        for (int i = 0; i < filmes.length; i++) {
            System.out.println((i + 1) + " - " + filmes[i]);
        }

        // Solicitar idade
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        // Perguntar se é estudante
        System.out.print("Você é estudante?:");
        String estudante = scanner.next();

        // Tipo de filme
        System.out.println("Tipo de filme:");
        System.out.println("1 - Normal R$20");
        System.out.println("2 - 3D R$30");
        System.out.print("Escolha o tipo de filme: ");
        int tipo = scanner.nextInt();

        double valorIngresso = 0;

        switch (tipo) {
            case 1:
                valorIngresso = 20.0;
                break;
            case 2:
                valorIngresso = 30.0;
                break;
            default:
                System.out.println("Tipo inválido!");
        }

        // Escolher filme
        System.out.print("Escolha o número do filme desejado: ");
        int opcao = scanner.nextInt();

        if (opcao < 1 || opcao > filmes.length) {
            System.out.println("Opção inválida!");
            scanner.close();
            return;
        }

        String nomeFilme = filmes[opcao - 1];
        int idadeMinima = classificacao[opcao - 1];

        // Verificar idade
        if (idade < idadeMinima) {
            System.out.println("Idade não permitida para ver esse filme!");
        } else {
            // Quantidade de ingressos
            System.out.print("Quantos ingressos deseja comprar? ");
            int qtd = scanner.nextInt();

            double total = valorIngresso * qtd;

            // Aplicar desconto
            boolean temDesconto = false;
            if (idade < 12 || idade > 60 || estudante.equalsIgnoreCase("S")) {
                temDesconto = true;
            }

            if (temDesconto) {
                total = total / 2;
            }

            // Exibir mensagem final
            System.out.println("Filme escolhido: " + nomeFilme);
            if (tipo == 1) {
                System.out.println("Tipo: Filme Normal");
            } else {
                System.out.println("Tipo: Filme 3D");
            }
            System.out.println("Quantidade de ingressos: " + qtd);
            System.out.println("Valor total da compra: R$ " + total);
        }
	}

}
