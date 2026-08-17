package java_terceiro_semestre.desafio_java_17;

import java.util.Scanner;

public class atv_03 {
        public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("informa a idade: ");
        int idade=sc.nextInt();

        if (idade<=12) {
            System.out.println("Criança");
        }else if(idade>=14 && idade<=17) {
            System.out.println("Adolescente");
        }else if(idade<60){
            System.out.println("Adulto");
        }else{
            System.out.println("Idoso");
        }

        sc.close();
    }
}

