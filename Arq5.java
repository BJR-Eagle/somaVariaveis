import java.util.Scanner;

public class Arq5 {
    public static void main(String[] args) {
        
        //Declarar o scanner
        Scanner sc = new Scanner(System.in);

        //Coleta o valor da primeira variavel
        System.out.println("Digite o valor 1");
        double v1 = sc.nextDouble();

        //Coleta o valor da segunda variavel
        System.out.println("Digite o valor 2");
        double v2 = sc.nextDouble();

        //Soma os valores da primeira e da segunda variavel
        double soma = v1+v2;

        //Emprime em tela o resultado da soma das variaveis
        System.out.println("Segundo Persian o resultado foi: "+ soma);
    }   
}
