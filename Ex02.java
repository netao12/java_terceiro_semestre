package java_terceiro_semestre;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(4);
        numeros.add(69);
        numeros.add(88);

        System.out.println("lista de numeros Exus");
        for(Integer numero: numeros){
            System.out.println(numero);
        }

        //removendo objeto pelo caractere ao invés do indice
        System.out.println("\n Digite o numero que deseja remover: ");
        int numeroRemover = sc.nextInt();

        numeros.remove(Integer.valueOf(numeroRemover));
        System.out.println("\nApós remover");

        for (Integer numero : numeros) {
            System.out.println(numero);
        }



        sc.close();
    }
}
