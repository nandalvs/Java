public class MyClass {
  public static void main(String args[]) {
    //1 - Cálculo para empresas
    int insta = 300;
    int limp = 150;
    double manu = 499.99;
    double calculo = insta + limp + manu;
    System.out.println("Cálculo para empresas: R$" + calculo);
    
    //2 - Cálculo de salário 
    double hora = 35;
    int dia = 8;
    double finalDia = hora * dia;
    System.out.println("Ele ganhará por dia R$" + finalDia);
    
    //3 - Caixa de bombons
    int caixa = 27;
    int bombom = 16;
    int caixasPam = caixa * bombom;
    System.out.println("Quantidade de bombons de Pamela: " + caixasPam);
    
    //4 - Garrafas D'água
    int garrafa = 300;
    int cx = 20;
    int vendidas = garrafa/cx;
    System.out.println("A quantidade de caixas ultilizadas foram: " + vendidas);
    
    //5 - Cálculo para camisetas 
        int estoqueinicial = 120;
        int camisetasvenda = 80;
        int novacompra = 50;
        double preco = 30.00;

        
        int estoqueatual = estoqueinicial - camisetasvenda + novacompra;

        
        double faturamento = camisetasvenda * preco;

       
        System.out.println("Estoque atual: " + estoqueatual);
        System.out.println("Faturamento: R$" + faturamento);
    //6- Dobro e Metade
    int coisa = 500;
    int sl = 2;
    int half = coisa/sl;
    int mult = coisa * sl;
    System.out.println("O número é: " + coisa);
    System.out.println("O seu dobro é: " + mult);
    System.out.println("A sua metade é: " + half);
    