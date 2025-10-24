
public class Filmep {
    public static void main(String[] args) {
        Filme f1 = new Filme();
        f1.titulo = "Pânico";
        f1.genero = "Terror/Mistério";
        f1.duracao = 122;
        
        Filme f2 = new Filme();
        f2.titulo = "Titanic";
        f2.genero = "Romance";
        f2.duracao = 195;
        
        Filme f3 = new Filme();
        f3.titulo = "O Rei Leão";
        f3.genero = "Animação";
        f3.duracao = 88;
        
        f1.assistir();
        f1.mostrarInformacoes();
        
        System.out.println("--------------------");
        
        f2.assistir();
        f2.mostrarInformacoes();
        
        System.out.println("--------------------");
        
        f3.assistir();
        f3.mostrarInformacoes();
    }
}

