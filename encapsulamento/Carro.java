package encapsulamento;

public class Carro {
    private String modelo;
    private int ano;
    private int velocidadeAtual = 0;

    public Carro(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    public void acelerar(int valor) {
        if (valor > 0) {
            velocidadeAtual += valor;
        }
    }

    public void frear(int valor) {
        if (valor > 0) {
            velocidadeAtual -= valor;
            if (velocidadeAtual < 0) {
                velocidadeAtual = 0;
            }
        }
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }
}

