package PadariaPolimórfica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ProdutoPadaria p1 = new Pao();
        ProdutoPadaria p2 = new Bolo();
        ProdutoPadaria p3 = new Torta();

        p1.preparar();
        p2.preparar();
        p3.preparar();

        System.out.print("Qual você escolheria (pão, bolo ou torta)? ");
        String escolha = sc.nextLine();

        System.out.println("Você escolheu: " + escolha);
    }


  
    }