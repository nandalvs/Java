package herança_atv;

public class Funcionario {
    private String nome;
    private double salarioBase;

    public String getNome() { return nome; }
    public void setNome(String n) { nome = n; }

    public double getSalarioBase() { return salarioBase; }
    public void setSalarioBase(double s) { salarioBase = s; }

    public double calcularSalario() { return salarioBase; }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário base: R$ " + salarioBase);
    }
}
