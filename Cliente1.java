package java_terceiro_semestre;
public class Cliente1 extends Pessoa implements Pagamento {

    public Cliente1(String nome) {
        super(nome);
    }
    //metodo da interface 
    @Override 
    public void pagar(double valor) {
        System.out.println("Pagamento realizado: " + valor);
    }

//Sobrecarga de métodos
    public void comprar(String produto) {
        System.out.println("Produto comprado: "+produto);
    }
    public void comprar(String produto, int quantidade, double valor) {
        System.out.println("Produto comprado: "+produto);
        System.out.println("Quantidade: "+quantidade);
        System.out.println("Valor Unitátrio: "+valor);
        System.out.println("Total: R$" +(quantidade*valor));
        
    }


}