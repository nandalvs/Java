
public class Pizzap {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza();
        pizza1.sabor = "Calabresa";
        pizza1.tamanho = "Grande";
        pizza1.bordaRecheada = true;
        
        Pizza pizza2 = new Pizza();
        pizza2.sabor = "Frango com Catupiry";
        pizza2.tamanho = "Média";
        pizza2.bordaRecheada = false;
        
        pizza1.preparar();
        pizza1.assando();
        pizza1.mostrarInformacoes();
        
        System.out.println("--------------------");
        
        pizza2.preparar();
        pizza2.assando();
        pizza2.mostrarInformacoes();
    }
}
