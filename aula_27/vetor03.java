package java_terceiro_semestre.aula_27;

public class vetor03 {
    public static void main(String[] args) {
        int[] numero={10,10,30,40,50};

        for(int i=0;i<numero.length;i++){
            System.out.println("posição "+i+" ="+numero[i]);
        }
        for (int n: numero) {
            System.err.println(n);
        }
    }
}
