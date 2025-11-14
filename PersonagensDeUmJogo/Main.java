package PersonagensDeUmJogo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Personagem p1 = new Guerreiro();
        Personagem p2 = new Mago();
        Personagem p3 = new Curandeiro();

        p1.realizarAcao();
        p2.realizarAcao();
        p3.realizarAcao();

        System.out.print("Qual personagem você escolheria (guerreiro, mago ou curandeiro)? ");
        String escolha = sc.nextLine();

        System.out.println("Você escolheu: " + escolha);
    }
}