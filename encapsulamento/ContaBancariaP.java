package encapsulamento;

public class ContaBancariaP {

	public class ContaP {
	    public static void main(String[] args) {
	        ContaBancaria conta = new ContaBancaria("Fernanda");

	        conta.depositar(500);
	        conta.sacar(100);

	        System.out.println("Titular: " + conta.getTitular());
	        System.out.println("Saldo final: " + conta.getSaldo());
	    }
	}
}
