package java_terceiro_semestre;
import java.util.Scanner;

public class Atv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int capacidade = 5;
        String[] nomes = new String[capacidade];
        int[] quantidades = new int[capacidade];
        int qtd = 0;
        
        System.out.println("=== Cadastro de Produtos ===");
        System.out.print("Quantos produtos vai cadastrar agora? (Máx " + capacidade + "): ");
        int numCadastro = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < numCadastro && qtd < capacidade; i++) {
            System.out.print("Digite o nome do produto: ");
            nomes[qtd] = sc.nextLine();
            
            System.out.print("Digite a quantidade em estoque: ");
            quantidades[qtd] = sc.nextInt();
            sc.nextLine(); 
            
            qtd++; 
        }

        listar(nomes, quantidades, qtd);

        System.out.println("\n=== Alterar Produto ===");
        System.out.print("Digite o nome do produto para alterar: ");
        String buscaAlterar = sc.nextLine();
        int posAlterar = -1; 

        for (int i = 0; i < qtd; i++) {
            if (nomes[i].equalsIgnoreCase(buscaAlterar)) {
                posAlterar = i;
                break;
            }
        }

        if (posAlterar != -1) {
            System.out.print("Digite o novo nome: ");
            nomes[posAlterar] = sc.nextLine();
            
            System.out.print("Digite a nova quantidade: ");
            quantidades[posAlterar] = sc.nextInt();
            sc.nextLine();
        } else {
            System.out.println("Produto não encontrado.");
        }

        System.out.println("\n=== Remover Produto ===");
        System.out.print("Digite o nome do produto para remover: ");
        String buscaRemover = sc.nextLine();
        int posRemover = -1;


        for (int i = 0; i < qtd; i++) {
            if (nomes[i].equalsIgnoreCase(buscaRemover)) {
                posRemover = i;
                break;
            }
        }

        if (posRemover != -1) {
            for (int i = posRemover; i < qtd - 1; i++) {
                nomes[i] = nomes[i + 1];
                quantidades[i] = quantidades[i + 1];
            }
            

            nomes[qtd - 1] = null;
            quantidades[qtd - 1] = 0;
            qtd--; 
            System.out.println("Produto removido com sucesso!");
        } else {
            System.out.println("Produto não encontrado.");
        }


        System.out.println("\n=== Lista Após Alterações ===");
        listar(nomes, quantidades, qtd);

        sc.close();
    }

    public static void listar(String[] nomes, int[] quantidades, int qtd) {
        System.out.println("\n--- Lista Atual ---");
        if (qtd == 0) {
            System.out.println("Nenhum produto cadastrado.");
        }
        for (int i = 0; i < qtd; i++) {
            System.out.println("Índice [" + i + "] | " + nomes[i] + " - " + quantidades[i] + " unidades");
        }
    }
}