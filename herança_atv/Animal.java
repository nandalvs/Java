package herança_atv;

public class Animal {
    private String nome;
    private int idade;

    public String getNome() { return nome; }
    public void setNome(String n) { nome = n; }

    public int getIdade() { return idade; }
    public void setIdade(int i) { idade = i; }

    public void mostrarInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
    }
}
