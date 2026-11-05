import java.util.Random;
import java.util.Scanner;

/**
 * Jogo de adivinhação.
 *
 * O programa sorteia um número entre 1 e 100 e o jogador tenta acertá-lo.
 * A cada palpite errado, o programa informa se o número sorteado é maior
 * ou menor que o palpite. Ao acertar, exibe o total de tentativas.
 *
 * Conceitos praticados: Scanner, Random, do-while, if/else if e contador.
 */
public class numeroAleatorio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Leitura de dados digitados no console
        Random random = new Random();         // Gerador de números aleatórios

        int numero = random.nextInt(100) + 1; // nextInt(100) gera de 0 a 99; o +1 ajusta para 1 a 100
        int tentativa;                        // Palpite atual do jogador
        int contador = 0;                     // Quantidade de palpites realizados

        // do-while garante que o jogador faça ao menos um palpite
        // antes de a condição de parada ser verificada
        do {
            System.out.print("Digite um número: ");
            tentativa = sc.nextInt();
            contador++;

            // Dica ao jogador: compara o palpite com o número sorteado
            if (tentativa > numero) {
                System.out.println("Menor que o que você digitou!");
            } else if (tentativa < numero) {
                System.out.println("Maior que o que você digitou!");
            }
        } while (tentativa != numero); // Repete até o jogador acertar

        System.out.println("Acertou em " + contador + " tentativa(s)!");

        sc.close(); // Libera o recurso do Scanner
    }
}