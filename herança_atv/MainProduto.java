package herança_atv;

public class MainProduto {
    public static void main(String[] args) {
        Livro l = new Livro();
        l.setNome("O Pequeno Príncipe");
        l.setPreco(39.90);
        l.setAutor("Antoine de Saint-Exupéry");
        l.mostrarInfo();
        l.lerTrecho();

        System.out.println();

        Filme f = new Filme();
        f.setNome("Pânico");
        f.setPreco(44.90);
        f.setDiretor("Kevin Williamson");
        f.mostrarInfo();
        f.assistir();
    }
}
