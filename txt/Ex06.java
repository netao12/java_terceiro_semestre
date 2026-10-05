package java_terceiro_semestre.txt;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ex06 {
    public static void main(String[] args) {
        try{
            BufferedWriter bw =new BufferedWriter(new FileWriter("Dado.txt",true));
            bw.write("terceira LINHa0");
            bw.newLine();
            bw.write("Quarta LInha");

            bw.close();
            System.out.println("Escrita Concluida");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
