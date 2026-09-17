package java_terceiro_semestre;
public class Pessoa {
    protected String nome;
    
    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
    }
}
