package java_terceiro_semestre.Animal;

public class Cachorro extends Animal{
    
    private String raca;

    public Cachorro(){

    }
    public Cachorro(String nome, int idade, String raca){
        super(nome, idade);
        this.raca = raca;
    }
    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }
    public String exibirInfo(){
        return "Nome: " + getNome() + "\nIdade: " + getIdade() + "\nRaça: " +(raca==null ? "": raca);
    }
}

