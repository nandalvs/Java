package herança_atv;

public class Vendedor extends Funcionario {
    private double comissao = 500;

    public double calcularSalario() {
        return getSalarioBase() + comissao;
    }

    public void vender() {
        System.out.println("O vendedor realizou uma venda!");
    }
}
