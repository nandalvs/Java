package encapsulamento;

public class RetanguloP {
	
    public static void main(String[] args) {
        Retangulo r1 = new Retangulo(5, 3);

        System.out.println("Área: " + r1.calcularArea());
        System.out.println("Perímetro: " + r1.calcularPerimetro());
    }
}

