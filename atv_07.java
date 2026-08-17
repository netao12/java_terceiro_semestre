package java_terceiro_semestre.desafio_java_17;
import java.util.Scanner;

public class atv_07 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.err.println("Digite a cor do CD; Amarelo, Azul, Verde, Vermelho: ");
        String cor=sc.nextLine();

        if(cor.equals("Verde")){
        System.out.println("Você selecionou o CD de R$10,00");
        }else if(cor.equals("Amarelo")){
            System.out.println("Você selecionou o CD de R$30,00");
        }else if(cor.equals("Vermelho")){
            System.out.println("Você selecionou o CD de R$40,00");
        }else if(cor.equals("Azul")){
            System.out.println("Você selecionoiu o CD de R$20,00");
        }

        sc.close();
    }
}
