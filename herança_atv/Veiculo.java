package herança_atv;

public class Veiculo {
    private String marca;
    private int ano;

    public String getMarca() { return marca; }
    public void setMarca(String m) { marca = m; }

    public int getAno() { return ano; }
    public void setAno(int a) { ano = a; }

    public void exibirInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
    }
}
