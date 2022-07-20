package Lista;

import java.util.*;

public class ExercicioCrime {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> perguntas = new ArrayList<>();
        perguntas.add("Telefonou para a vítima?");
        perguntas.add("Esteve no local do crime?");
        perguntas.add("Mora perto da vítima");
        perguntas.add("Devia para a vítima?");
        perguntas.add("Já trabalhou com a vítima?");

        System.out.println("Responda as questões com S ou N");
        int questionario = 0;

        for (int i = 0; i < perguntas.size(); i++) {
            System.out.println(perguntas.get(i));
            String resposta = scanner.next();
            if (resposta.equals("S") || resposta.equals("s")) {
                questionario++;
            }
        }

        if (questionario == 2) {
            System.out.println("Suspeito");
        } else if (questionario > 2 && questionario <= 4) {
            System.out.println("Cúmplice");
        } else if (questionario == 5) {
            System.out.println("Assasino(a)");
        } else System.out.println("Inocente");

    }
}
