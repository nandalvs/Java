package ContasBancárias;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Conta c1 = new ContaPoupanca();
        Conta c2 = new ContaInvestimentos();

        System.out.println("Rendimento poupança: " + c1.calcularRendimento());
        System.out.println("Rendimento investimento: " + c2.calcularRendimento());

        System.out.print("Qual conta você escolheria (poupança ou investimento)? ");
        String escolha = sc.nextLine();

        System.out.println("Você escolheu: " + escolha);
    }
}