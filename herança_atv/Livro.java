package herança_atv;

public class Livro extends Produto {
    private String autor;

    public String getAutor() { return autor; }
    public void setAutor(String a) { autor = a; }

    public void lerTrecho() {
        System.out.println("Lendo um trecho do livro " + getNome() + " de " + autor + ".");
    }
}
