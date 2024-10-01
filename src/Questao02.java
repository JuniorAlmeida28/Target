import java.util.Scanner;
/* 2) Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja maiúscula ou minúscula,
 * além de informar a quantidade de vezes em que ela ocorre.
 * IMPORTANTE: Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código; */

public class Questao02 {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String texto = en.nextLine();

        int contador = 0;
        for (int i = 0; i < texto.length(); i++){
            if(texto.charAt(i) == 'a' || texto.charAt(i) == 'A'){
                contador++;
            }

        }

        if (contador > 0){
            System.out.println("A letra 'a' existe e aparece " + contador + " vezes.");
        }
        else {
            System.out.println("A letra 'a' não existe e aparece " + contador + " vezes.");
        }

        en.close();
    }

}
