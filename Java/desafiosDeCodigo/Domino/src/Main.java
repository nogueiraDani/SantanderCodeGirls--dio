import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*

        O tradicional jogo de dominó possui 28 peças, sendo que ada peça está dividida em dois quadrados e dentro de
        cada quadrado há entre 0 e 6 círculos. O jogo é chamado também de duplo-6 porque esse é o maior número de
        círculos que aparece num quadrado de uma peça.

        A figura junto desse desafio mostra uma forma de organizar as 28 peças do jogo em 7 linhas. Essa figura permite
        ver claramente quantas peças haveria num jogo de dominó, por exemplo, do tipo duplo-4: seriam todas as peças
        das 5 primeiras linhas, 15 peças no total. Também poderíamos ver, seguindo o padrão da figura, quantas peças
        possui o jogo de dominó conhecido como mexicano, que é o duplo-12. Seriam 91 peças, correspondendo a 13 linhas.

        Não de forma surpreendente, existe uma fórmula com a qual podemos calcular facilmente o número de peças de um
        jogo do tipo duplo-N, para um número N natural qualquer: ((N+1)*(N+2))/2. Bom, não é porque a fórmula existe
        que não temos um problema para você: estamos precisando da sua ajuda para escrever um programa que, dado o
        valor N, use esta fórmula para calcular e imprimir quantas peças existem num jogo de dominó do tipo duplo-N.

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite numero do tipo de domino:");
        int numero = scanner.nextInt();
        if (0 <= numero && numero <= 10000){
            System.out.println((numero+1)*(numero+2)/2);
        } else {
            System.out.println("número inválido");
        }
    }
}
