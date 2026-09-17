package java_terceiro_semestre;
public class FormaApp {
    
    public static void main(String[] args) {
        
        Circulo circulo = new Circulo(5);
        Retangulo retangulo = new Retangulo(4, 6);
        System.out.println("Área do círculo: " + circulo.CalcularArea());

        System.out.println("Área do retângulo: " + retangulo.CalcularArea());
    }
}
