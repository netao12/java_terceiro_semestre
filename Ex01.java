package java_terceiro_semestre;
import java.util.ArrayList;

public class Ex01{
    public static void main(String[] args) {
        
        ArrayList<String> nomes = new ArrayList<>();

        //ADICIONAR
        nomes.add("Ana");
        nomes.add("Carlos");
        nomes.add("Marcos");

        //Listar
        System.out.println("lista");
        for(String nome: nomes){
            System.out.println(nome);
        }

        //Alterar
        nomes.set(1, "mariogliotarze");

        System.out.println("lista após alterar");
        for(String nome: nomes){
            System.out.println(nome);
        }

        //Remover
        nomes.remove(0);
        System.out.println("lista após remover");
        for(String nome: nomes){
            System.out.println(nome);
        }
    }
}