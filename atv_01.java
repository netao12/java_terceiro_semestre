package java_terceiro_semestre.desafio_java_17;
import java.util.Scanner;

public class atv_01 {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.err.println("digite um número: ");
        int numero = sc.nextInt();

        if (numero > 0){
            System.out.println("Número positivo");
        }else if(numero<0){
            System.out.println("Número Negativo");
        }else{
            System.out.println("Número Nulo");
        }
        sc.close();
    }
}
