package herança_atv;

public class Cachorro extends Animal {
    private String raca;

    public String getRaca() { return raca; }
    public void setRaca(String r) { raca = r; }

    public void abanarRabo() {
        System.out.println("O cachorro da raça " + raca + " está abanando o rabo.");
    }
}
