package encapsulamento;

public class ProdutoP {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.setNome("Camiseta");
        p1.setPreco(79.90);
        p1.setEstoque(20);

        Produto p2 = new Produto();
        p2.setNome("Tênis");
        p2.setPreco(249.99);
        p2.setEstoque(15);

        System.out.println("Produto: " + p1.getNome() + " | Preço: " + p1.getPreco() + " | Estoque: " + p1.getEstoque());
        System.out.println("Produto: " + p2.getNome() + " | Preço: " + p2.getPreco() + " | Estoque: " + p2.getEstoque());
    }
}
