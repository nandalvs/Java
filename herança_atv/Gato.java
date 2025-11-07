package herança_atv;

public class Gato extends Animal {
    private String cor;

    public String getCor() { return cor; }
    public void setCor(String c) { cor = c; }

    public void subirNoMuro() {
        System.out.println("O gato " + cor + " está em cima do muro.");
    }
}
