package java_terceiro_semestre;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("informe o nome do cliente: ");
        String nome = sc.nextLine();

        Cliente1 cliente = new Cliente1(nome);
        cliente.mostrarDados();

        System.out.println("Informe o nome do produto: ");
        String produto = sc.nextLine();

        System.out.println("Informe a quantidade do produto: ");
        int quantidade = sc.nextInt();

        System.out.println("informe o valor unitário do produto: ");
        double valor = sc.nextDouble();

        System.out.println("\n<<<COMPRAS>>>");
        cliente.comprar(produto);
        System.out.println();

        cliente.comprar(produto, quantidade);

        System.out.println();
        cliente.comprar(produto, quantidade, valor);

        double total=quantidade*valor;

        System.out.println("\n<<<PAGAMENTO>>>");
        cliente.pagar(total);


        sc.close();
    }
}
