package java_terceiro_semestre.desafio_java_17;
import java.util.Scanner;

public class atv_02 {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);

    System.err.println("digite o número: ");
    int numero = sc.nextInt();

    if(numero %2==0){
        System.out.println("número PAR");
    }else{
        System.out.println("Número Impar");
    }
    sc.close();
    }
}
