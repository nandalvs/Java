public class MyClass {
  public static void main(String args[]) {
 
//Váriaveis
int idade = 16; //números ineiros
double salario = 1.75; //números quebrados
char letra = 'F'; //letra ou simbolo
boolean estudante = true; //verdadeiro ou falso
 String nome = "Fernanda"; //Texto
 
 System.out.println(idade);
 System.out.println("Minha idade é " + idade);
 System.out.println("O sálario é " + salario);
 System.out.println("A letra é " + letra);
 System.out.println("Você estuda?" + estudante);
 System.out.println("Meu nome é " + nome);
 
 // Operadores Aritmeticos
 int num1 = 5;
 int num2 = 3;
 int soma = num1 + num2;
 int sub = num1 - num2; 
 int mult = num1 * num2;
 double div = div = num1 / num2;
 System.out.println("Soma " + soma);
 System.out.println("Subtração " + sub);
 System.out.println("Divisão "+ div);
 System.out.println("Multiplicação "+ mult);
 
 /*Calculo da aréa d um Retângulo*/
 /*Largura * Comprimento*/
 double largura = 7.5;
 double comprimento = 3.0;
 double area= largura * comprimento;
 System.out.println("Aréa: " + area);

 //Cálculo do desconto
    double valor = 100;
    double desconto = 15; //%
    double vaDesv = valor * (desconto / 100);
    double valorF1 = valor - vaDesv;  // Corrected variable name
    System.out.println ("A pagar "+ valorF1);  // Corrected variable name
  }
}