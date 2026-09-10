public class Produto {

    public Produto(String nome, int preco, int quantidade){
        this.nome=nome;
        this.preco=preco;
        this.quantidade=quantidade;
    }
    private String nome;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    private int preco;
    public int getPreco() {
        return preco;
    }
    public void setPreco(int preco) {
        this.preco = preco;
    }
    private int quantidade;
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

}
