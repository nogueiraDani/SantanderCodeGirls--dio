package Lista;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExercicioTemperatura {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Float> temperaturas = new ArrayList<>();

        do {
            System.out.println("Digite a temperatura: ");
            temperaturas.add(scanner.nextFloat());
        } while (temperaturas.size() != 6);

        Iterator<Float> interator = temperaturas.iterator();
        Float soma = 0f;

        while (interator.hasNext()) {
            Float next = interator.next();
            soma += next;
        }

        float mediaSemestral = (soma / temperaturas.size());

        System.out.println("A temperatura média semestral é " + mediaSemestral);


        for (int i = 0; i < temperaturas.size(); i++) {
            boolean result = temperaturas.get(i) > mediaSemestral;

            String mes;
            if (i == 0) mes = "Janeiro";
            else if (i == 1) mes = "Fevereiro";
            else if (i == 2) mes = "Março";
            else if (i == 3) mes = "Abril";
            else if (i == 4) mes = "Maio";
            else if (i == 5) mes = "Junho";
            else mes = "indefinido";

            if (result) {
                System.out.println(temperaturas.get(i) + "ºC em " + mes);
            }
        }
    }
}
