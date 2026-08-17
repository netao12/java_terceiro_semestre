package java_terceiro_semestre.desafio_java_17;
import java.util.Scanner;


public class atv06 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.err.println("Digite o 1° Número: ");
        int numero1= sc.nextInt();

        System.err.println("Digite o 2° Número: ");
        int numero2= sc.nextInt();

        double soma = numero1 + numero2;
        double subtracao = numero1 - numero2;
        double divisao = numero1 / numero2;
        double multiplicacao = numero1 * numero2;

        System.out.println("SOMA IGUAL A: "+soma);
        System.out.println("SUBTRAÇÃO IGUAL A: "+subtracao);
        System.out.println("DIVISAO IGUAL A: "+divisao);
        System.out.println("MULTIPLICAÇÃO IGUAL A: "+multiplicacao);

        sc.close();


    }    
}
