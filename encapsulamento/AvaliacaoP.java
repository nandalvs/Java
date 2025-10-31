package encapsulamento;

public class AvaliacaoP {

	public static void main(String[] args) {
        Avaliacao a1 = new Avaliacao();
        a1.setNome("Fernanda");
        a1.setNota1(9.0);
        a1.setNota2(8.5);

        System.out.println("Aluno: " + a1.getNome());
        System.out.println("Média final: " + a1.calcularMedia());
    }
}
