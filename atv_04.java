package java_terceiro_semestre.desafio_java_17;

import java.util.Scanner;


public class atv_04 {

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informar a idade: ");
        int idade= sc.nextInt();

        if(idade>=18){
            System.out.println("Maior idade");
        }else{
            System.out.println("Menor idade:");
        }
        
        sc.close();
    }
}
