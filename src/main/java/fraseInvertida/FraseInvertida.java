package fraseInvertida;

import java.util.Locale;
import java.util.Scanner;

public class FraseInvertida {

    public static void main (String [] args){

        Scanner teclado = new Scanner(System.in);
        Boolean comparacao = true;

        String frase = teclado.nextLine();

        //adicionando linha de código para aplicar regex
        String fraseLimpa = frase.toUpperCase(Locale.ROOT).replaceAll("[!?.,:;^[\\\"']+|[\\\"']+$\\S+]", "");

        String fraseInvertida = new StringBuilder(fraseLimpa).reverse().toString();

        //if (frase.equals(fraseInvertida)){ -> inserindo validação para String vazia
        if (fraseLimpa.equals(fraseInvertida) && fraseLimpa.isEmpty() == false){
            System.out.println(frase  + " -> " +  comparacao);
        } else {
            comparacao = false;
            System.out.println(frase + " -> " + comparacao);
        }
        teclado.close();
    }
}
