
public class ContaBancariap {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.titular = "Fernanda";
        conta.saldo = 0;
        
        conta.mostrarSaldo();
        conta.depositar(500);
        conta.sacar(150);
        conta.mostrarSaldo();
    }
}

