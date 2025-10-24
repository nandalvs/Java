
public class Musicap {
    public static void main(String[] args) {
        Musica m1 = new Musica();
        m1.titulo = "Artista Genérico";
        m1.artista = "Veigh";
        m1.duracao = 4.2;
        
        Musica m2 = new Musica();
        m2.titulo = "Swim";
        m2.artista = "Chase Atlantic";
        m2.duracao = 3.5;
        
        Musica m3 = new Musica();
        m3.titulo = "On Melancholy Hill";
        m3.artista = "Gorillaz";
        m3.duracao = 4.4;
        
        m1.tocar();
        m1.mostrarDetalhes();
        m1.pausar();
        
        System.out.println("--------------------");
        
        m2.tocar();
        m2.mostrarDetalhes();
        m2.pausar();
        
        System.out.println("--------------------");
        
        m3.tocar();
        m3.mostrarDetalhes();
        m3.pausar();
    }
}

