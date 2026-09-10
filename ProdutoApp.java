import java.util.Scanner;
public class ProdutoApp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Produto p =new Produto(null, 0, 0);


        System.out.println("Informe o nome do produto: ");
        p.setNome(sc.nextLine());

        System.out.println("informe o preço: ");
        p.setPreco(sc.nextInt());

        System.out.println("informe a quantidade: ");
        p.setQuantidade(sc.nextInt());

        System.out.println("O nome do produto é: "+p.getNome());
        System.out.println("O preço do produto é: "+p.getPreco());
        System.out.println("a quantidade do produto é: "+p.getQuantidade());



        sc.close();
    }
}
