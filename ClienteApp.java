import java.util.Scanner;

public class ClienteApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;

        do {
            System.out.println("===Sistema de cadastro de clientes===");
            System.out.println("1-Pessoa física");
            System.out.println("2-Pessoa jurídica");
            System.out.println("0-Sair");
            System.out.println("Escolha a opção: ");

            while (!sc.hasNextInt()) {
                System.out.println("Opção inválida. Digite 0, 1 ou 2");
                sc.next();
            }
            op = sc.nextInt();
            sc.nextLine(); // Limpa o buffer do teclado

            switch (op) {
                case 1: { // Chave adicionada para isolar o escopo das variáveis
                    System.out.println("Informe o nome: ");
                    String nome = sc.nextLine();

                    System.out.println("Informe o endereço: ");
                    String endereço = sc.nextLine();

                    System.out.println("Informe o cpf: ");
                    String cpf = sc.nextLine();

                    ClientePf pf = new ClientePf(nome, endereço, cpf);
                    // Opcional: os 'setters' abaixo são redundantes se o construtor já atribui os valores
                    // pf.setNome(nome);
                    // pf.setEndereço(endereço);
                    // pf.setCpf(cpf);

                    System.out.println("\n --Dados do cliente PF--");
                    pf.exibirDados();
                    break;
                } // Fim do bloco case 1

                case 2: {
                    System.out.println("Informe o nome: ");
                    String nome = sc.nextLine();

                    System.out.println("Informe o endereço: ");
                    String endereço = sc.nextLine();

                    System.out.println("Informe o cnpj: ");
                    String cnpj = sc.nextLine();

                    ClientePj pj = new ClientePj(nome, endereço, cnpj);
                    // pj.setNome(nome);
                    // pj.setEndereço(endereço);
                    // pj.setCnpj(cnpj);

                    System.out.println("\n --Dados do cliente PJ--");
                    pj.exibirDados();
                    break;
                } // Fim do bloco case 2

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            } // Fechamento correto do switch

        } while (op != 0); // Fechamento do do-while

        sc.close();
    }
}