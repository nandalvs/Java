package herança_atv;

public class Gerente extends Funcionario {
    private String departamento;

    public String getDepartamento() { return departamento; }
    public void setDepartamento(String d) { departamento = d; }

    public double calcularSalario() {
        return getSalarioBase() * 1.2;
    }

    public void gerenciar() {
        System.out.println("O gerente do departamento " + departamento + " está gerenciando a equipe.");
    }
}
