package java_terceiro_semestre;
import java.util.Scanner;

public class Cond03 {
        Scanner sc= new Scanner(System.in);


        public static void main(String[] args) {
            
        
        System.out.println("informa a idade: ");
        int idade=sc.nextInt();

        System.out.println("É estudante? Digite 1 para Sim ou 0 Não");
        int estudante=sc.nextInt();

        if (idade>=60 || estudante==1){
            System.out.println("Você tem direito ao desconto");
        }else{
            System.out.println("Você não tem direito ao desconto");

        }

        sc.close();
    }
}

