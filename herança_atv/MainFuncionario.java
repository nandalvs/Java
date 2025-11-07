package herança_atv;

public class MainFuncionario {
    public static void main(String[] args) {
        Gerente g = new Gerente();
        g.setNome("Thales");
        g.setSalarioBase(5000);
        g.setDepartamento("Vendas");

        g.exibirInfo();
        System.out.println("Salário total: R$ " + g.calcularSalario());
        g.gerenciar();

        System.out.println();

        Vendedor v = new Vendedor();
        v.setNome("Fernanda");
        v.setSalarioBase(2000);

        v.exibirInfo();
        System.out.println("Salário total: R$ " + v.calcularSalario());
        v.vender();
    }
}
