package encapsulamento;

public class CarroP {
	
    public static void main(String[] args) {
        Carro c1 = new Carro("Civic", 2022);

        c1.acelerar(50);
        System.out.println("Velocidade atual: " + c1.getVelocidadeAtual());

        c1.frear(30);
        System.out.println("Velocidade após frear: " + c1.getVelocidadeAtual());

        c1.frear(50);
        System.out.println("Velocidade final: " + c1.getVelocidadeAtual());
    }
}

