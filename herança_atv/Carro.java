package herança_atv;

public class Carro extends Veiculo {
    private int portas;

    public int getPortas() { return portas; }
    public void setPortas(int p) { portas = p; }

    public void abrirPortaMalas() {
        System.out.println("Abrindo o porta-malas do carro com " + portas + " portas.");
    }
}
