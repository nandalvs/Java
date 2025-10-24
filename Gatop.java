
public class Gatop {

	public static void main(String[] args) {
		Gato gato1 = new Gato();
		gato1.nome = "Luna";
		gato1.raca = "Siamês";
		gato1.idade = 3;
		        
		Gato gato2 = new Gato();
		gato2.nome = "Milo";
		gato2.raca = "Persa";
		gato2.idade = 2;
		        
		gato1.miar();
		gato1.comer();
		gato1.mostrarInformacoes();
		        
		System.out.println("--------------------");
		        
		 gato2.miar();
		 gato2.comer();
		 gato2.mostrarInformacoes();
	}
}
