import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*

        O gerente de uma loja de produtos eletrodomésticos ficou maluco e decidiu que todos o produtos da loja estavam
        na promoção com 70% de desconto. Ele percebeu que precisa automatizar o seu sistema para que nessas promoções
         o novo preço seja automaticamente calculado e repassado para os vendedores. Faça um algoritmo que leia o
         desconto e o preço de um produto e e mostre o seu novo preço com esse desconto.

         */

        Scanner input = new Scanner(System.in);
        Integer desconto = input.nextInt();
        Integer precoAntigo = input.nextInt();


        Integer precoNovo = precoAntigo - ((precoAntigo * desconto) / 100);
        System.out.println(precoNovo);


    }
}
