public class ClientePf extends Cliente1{
    private String Cpf;

    
    public ClientePf(String nome, String endereço, String Cpf){
        super(nome, endereço);
        this.Cpf=Cpf;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String cpf) {
        Cpf = cpf;
    
    }

    @Override 
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Cpf: "+Cpf);
    }
    
}