package java_terceiro_semestre;
public class Pix implements Pagamento {

    @Override 
    public void pagar(double valor) {
        System.out.println("Pagamento realizado vua PIX");
        System.out.println("valor pago: R$"+valor);
    }
    
}
