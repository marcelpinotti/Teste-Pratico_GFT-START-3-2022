package fraseInvertida;

import java.util.Scanner;

public class FraseInvertida {

    public static void main (String [] args){

        Scanner teclado = new Scanner(System.in);
        Boolean comparação = true;

        String frase = teclado.nextLine();

        String fraseInvertida = new StringBuilder(frase).reverse().toString();

        if (frase.equals(fraseInvertida)){
            System.out.println(frase  + " -> " +  comparação);
        } else {
            comparação = false;
            System.out.println(frase + " -> " + comparação);
        }
        teclado.close();
    }
}
