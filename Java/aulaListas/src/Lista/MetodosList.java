package Lista;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class MetodosList {

    public static void main(String[] args) {

        List<Double> notas = new ArrayList<>(); // diamond operator
        /*

        ArrayList<Double> notas = new ArrayList<>(); nao é recomendado usar
        List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 0d)); inicia ja add os itens da array
        List<Double> notas = Arrays.asList(7d, 8d, 8.5); tbm pode ser usada mas nao deixa add e remover itens

        */

        notas.add(10d);
        notas.add(15.5d);
        notas.add(25.9d);

        System.out.println(notas);
        System.out.println(notas.toString());
        System.out.println(notas.indexOf(15.5d));

        notas.add(7.8d);
        notas.add(2, 8d);

        System.out.println(notas);

        notas.set(notas.indexOf(8d), 9.8d);
        System.out.println(notas);

        System.out.println(notas.contains(3.2d));

        for (Double nota : notas) System.out.println(nota); // foreach

        System.out.println(notas.get(2));
        System.out.println(notas);
        System.out.println(Collections.min(notas));
        System.out.println(Collections.max(notas));

        Iterator<Double> iterator = notas.iterator(); // interator é a interação do console, barra ao digitar
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }

        System.out.println(soma);
        System.out.println(soma / notas.size());

        notas.remove(7.8d);
        System.out.println(notas);

        /*

        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 10) iterator1.remove();
        }

        */

        notas.removeIf(next -> next < 10);

        System.out.println(notas);

        notas.clear();
        System.out.println(notas);
        System.out.println(notas.isEmpty());



        /*

        List<Integer> idades = List.of(15, 25, 35); // cria lista imutavel
        idades.add(25);
        idades.add(6);
        idades.remove(3);
        System.out.println(idades);

        */


    }


}
