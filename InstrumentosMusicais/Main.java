package InstrumentosMusicais;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Instrumento i1 = new Violao();
        Instrumento i2 = new Bateria();
        Instrumento i3 = new Piano();

        i1.tocar();
        i2.tocar();
        i3.tocar();

        System.out.print("Qual instrumento você escolheria (violão, bateria ou piano)? ");
        String escolha = sc.nextLine();

        System.out.println("Você escolheu: " + escolha);
    }
}