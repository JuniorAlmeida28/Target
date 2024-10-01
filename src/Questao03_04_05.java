public class Questao03_04_05 {
    /*
     * 3) Observe o trecho de código abaixo: int INDICE = 12, SOMA = 0, K = 1; enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; } imprimir(SOMA);
     * Ao final do processamento, qual será o valor da variável SOMA?
     */

    public static void main(String[] args) {
        int INDICE = 12, SOMA = 0, K = 1;
        while (K < INDICE){
            K = K + 1;
            SOMA = SOMA + K;
        }
        System.out.println(SOMA);
    }
}

/*
 * 4) Descubra a lógica e complete o próximo elemento:
 * a) 1, 3, 5, 7, (9)
 * b) 2, 4, 8, 16, 32, 64, (128)
 * c) 0, 1, 4, 9, 16, 25, 36, (49)
 * d) 4, 16, 36, 64, (100)
 * e) 1, 1, 2, 3, 5, 8, (13)
 * f) 2,10, 12, 16, 17, 18, 19, (200)
 */

/*
 *5) Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em salas diferentes.
 * Você não pode ver as lâmpadas da sala em que está, mas pode ligar e desligar os interruptores quantas vezes quiser.
 * Seu objetivo é descobrir qual interruptor controla qual lâmpada. Como você faria para descobrir,
 * usando apenas duas idas até uma das salas das lâmpadas, qual interruptor controla cada lâmpada?
 *
 * R) Para descobrir qual interruptor controla cada lâmpada com apenas duas idas até a sala das lâmpadas,
 * a estratégia é a seguinte: Ligue um interruptor e deixe-o ligado por alguns minutos. Em seguida,
 * desligue-o e ligue um segundo interruptor. Vá até a sala das lâmpadas.
 * A lâmpada que estiver acesa será controlada pelo segundo interruptor,
 * a lâmpada que estiver apagada mas quente será controlada pelo primeiro interruptor,
 * e a lâmpada que estiver apagada e fria será controlada pelo terceiro interruptor.
 */