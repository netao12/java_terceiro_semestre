package java_terceiro_semestre;
public class Contato {
    
    private String nome;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    private String numero;
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public Contato(String nome, String numero) {
        this.nome = nome;
        this.numero = numero;
    }

public String ToString(){
    return nome+" - "+numero;
}
}
