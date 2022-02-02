package calculoDaArea;

public class Teste {

    public static void main (String [] args){

        Quadrado quadrado = new Quadrado(3.0);
        System.out.println("A área do quadrado é: " + quadrado.calculoDaArea());

        Retangulo retangulo = new Retangulo(9.0, 4.0);
        System.out.println("A área do retângulo é: " + retangulo.calculoDaArea());

        Circulo circulo = new Circulo(4.0);
        System.out.println("A área do circulo é: " + circulo.calculoDaArea());
        
    }
}
