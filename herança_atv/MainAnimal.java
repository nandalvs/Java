package herança_atv;

public class MainAnimal {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro();
        dog.setNome("Bolt");
        dog.setIdade(4);
        dog.setRaca("Labrador");
        dog.mostrarInfo();
        dog.abanarRabo();

        System.out.println();

        Gato cat = new Gato();
        cat.setNome("Mimi");
        cat.setIdade(2);
        cat.setCor("preto");
        cat.mostrarInfo();
        cat.subirNoMuro();
    }
}
