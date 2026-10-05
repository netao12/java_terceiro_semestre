package java_terceiro_semestre.txt;
import java.io.FileWriter;
import java.io.IOException;

public class Ex02 {
    public static void main(String[] args) {
        try{
            FileWriter escritor = new FileWriter("Exemplo.txt",true);
            escritor.write("primeira linha\n");
            escritor.write("segunda linha\n");
            escritor.write("terceira linha\n");

            escritor.close();
            System.out.println("Escrita concluída");
        }catch(IOException e){
            System.out.println("Erro ao escrever no arquivo");
            e.printStackTrace();
        }
    }
}
