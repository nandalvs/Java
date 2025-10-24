
public class Produtop {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.nome = "Camiseta";
        p1.preco = 59.90;
        p1.estoque = 10;
        
        Produto p2 = new Produto();
        p2.nome = "Tênis";
        p2.preco = 199.90;
        p2.estoque = 5;
        
        p1.mostrarInformacoes();
        p1.vender(3);
        p1.mostrarInformacoes();
        
        System.out.println("--------------------");
        
        p2.mostrarInformacoes();
        p2.vender(7);
        p2.mostrarInformacoes();
    }
}

