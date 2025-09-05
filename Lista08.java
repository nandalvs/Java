package primeiroProjeto;

import java.util.Scanner;

public class Lista08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

        // 1 - Classificação de Dia da Semana
        System.out.println("Digite um número de 1 a 7 para o dia da semana: ");
        int dia = scanner.nextInt();
        switch (dia) {
            case 1: 
            case 7:
                System.out.println("Fim de semana");
                break;
            case 2: case 3: case 4: case 5: case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Dia inválido");
        }

        // 2 - Menu de Bebidas
        System.out.println("Digite o código da bebida (1 = Café, 2 = Chá, 3 = Suco, 4 = Refrigerante): ");
        int bebida = scanner.nextInt();
        switch (bebida) {
            case 1: System.out.println("Café = R$5,00"); 
            break;
            case 2: System.out.println("Chá = R$3,50"); 
            break;
            case 3: System.out.println("Suco = R$4,00"); 
            break;
            case 4: System.out.println("Refrigerante = R$4,50"); 
            break;
            default: System.out.println("Código inválido");
        }

        // 3 - Tipo de Veículo
        System.out.println("Digite o código do veículo (1 = Carro, 2 = Moto, 3 = Caminhão): ");
        int veiculo = scanner.nextInt();
        switch (veiculo) {
            case 1: System.out.println("Leve"); 
            break;
            case 2: System.out.println("Motocicleta"); 
            break;
            case 3: System.out.println("Pesado"); 
            break;
            default: System.out.println("Veículo inválido");
        }

        // 4 - Plano de Assinatura
        System.out.println("Digite o código do plano (1 = Básico, 2 = Intermediário, 3 = Premium): ");
        int plano = scanner.nextInt();
        switch (plano) {
            case 1: System.out.println("Acesso limitado"); 
            break;
            case 2: System.out.println("Acesso padrão + suporte"); 
            break;
            case 3: System.out.println("Acesso total + suporte prioritário"); 
            break;
            default: System.out.println("Plano inválido");
        }

        // 5 - Seleção de Mês
        System.out.println("Digite o número do mês (1 a 12): ");
        int mes = scanner.nextInt();
        switch (mes) {
            case 12: case 1: case 2:
                System.out.println("Verão");
                break;
            case 3: case 4: case 5:
                System.out.println("Outono");
                break;
            case 6: case 7: case 8:
                System.out.println("Inverno");
                break;
            case 9: case 10: case 11:
                System.out.println("Primavera");
                break;
            default:
                System.out.println("Mês inválido");
        }

        // 6 - Tipo de Ingresso
        System.out.println("Digite o código do ingresso (1 = Inteira, 2 = Meia, 3 = VIP): ");
        int ingresso = scanner.nextInt();
        switch (ingresso) {
            case 1: System.out.println("Inteira = R$50,00"); 
            break;
            case 2: System.out.println("Meia-entrada = R$25,00"); 
            break;
            case 3: System.out.println("VIP = R$100,00"); 
            break;
            default: System.out.println("Ingresso inválido");
        }

        // 7 - Idioma
        System.out.println("Digite o código do idioma (1 = Português, 2 = Inglês, 3 = Espanhol): ");
        int idioma = scanner.nextInt();
        switch (idioma) {
            case 1: System.out.println("Olá!"); 
            break;
            case 2: System.out.println("Hello!"); 
            break;
            case 3: System.out.println("Hola!"); 
            break;
            default: System.out.println("Idioma inválido");
        }

        // 8 - Nível de Acesso
        System.out.println("Digite o código do nível (1 = Usuário, 2 = Moderador, 3 = Administrador): ");
        int nivel = scanner.nextInt();
        switch (nivel) {
            case 1: System.out.println("Acesso básico"); 
            break;
            case 2: System.out.println("Acesso básico + edição"); 
            break;
            case 3: System.out.println("Acesso total"); 
            break;
            default: System.out.println("Nível inválido");
        }

        // 9 - Tipo de Pagamento
        System.out.println("Digite o código do pagamento (1 = Dinheiro, 2 = Cartão de Crédito, 3 = Pix): ");
        int pagamento = scanner.nextInt();
        switch (pagamento) {
            case 1: System.out.println("Pagamento em dinheiro confirmado"); 
            break;
            case 2: System.out.println("Pagamento com cartão processado"); 
            break;
            case 3: System.out.println("Pagamento via Pix realizado"); 
            break;
            default: System.out.println("Método inválido");
        }
	}

}
