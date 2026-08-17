package java_terceiro_semestre.desafio_java_17;
import java.util.Scanner;

public class atv05 {
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);

            System.out.println("informe o nome: ");
                String nome= sc.nextLine();


            System.out.println("informe a senha: ");
                String senha=sc.nextLine();

            if (nome.equals("Netin")&& senha.equals("Netin55")) {
                System.out.println("PORTA ABERTA");
            }else{
                System.out.println("SENHA NAO CONFERE");
            }
    
        
        sc.close();
    }
}
