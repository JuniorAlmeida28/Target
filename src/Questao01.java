import java.util.Scanner;

public class Questao01 {
    /*
     * 1) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores
     * (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número,
     * ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
     * IMPORTANTE: Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;
    */

    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        System.out.print("Informe um número para saber se faz parte da sequência de Fibonacci:");
        int num = en.nextInt();


        if (pertenceFib(num)){
            System.out.println(num + " Pertence a sequência de Fibonacci.");
        }
        else {
            System.out.println(num + " Não Pertence a sequência de Fibonacci.");
        }

        en.close();
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int fib = 1, prev = 1;
        for (int i = 2; i <= n; i++) {
            int temp = fib;
            fib += prev;
            prev = temp;
        }
        return fib;
    }

    public static boolean pertenceFib(int num){
        int i = 0;
        int fib = fibonacci(i);
        while (fib <= num){
            if (fib == num){
                return true;
            }
            i++;
            fib = fibonacci(i);
        }
        return false;
    }
}
