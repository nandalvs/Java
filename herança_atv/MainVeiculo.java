package herança_atv;

public class MainVeiculo {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setMarca("Toyota");
        carro.setAno(2022);
        carro.setPortas(4);

        carro.exibirInfo();
        carro.abrirPortaMalas();
    }
}
