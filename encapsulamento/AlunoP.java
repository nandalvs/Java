package encapsulamento;

public class AlunoP {
	 public static void main(String[] args) {
	        Aluno a1 = new Aluno();
	        a1.setNome("Fernanda");
	        a1.setIdade(16);

	        System.out.println("Nome: " + a1.getNome());
	        System.out.println("Idade: " + a1.getIdade());
	    }
}
