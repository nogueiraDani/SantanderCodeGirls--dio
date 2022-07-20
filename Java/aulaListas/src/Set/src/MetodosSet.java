import java.sql.Array;
import java.util.*;

public class MetodosSet {

    public static void main(String[] args) {

        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 5d, 15d, 12d, 19d, 12d)); // nao tem index
        System.out.println(notas);

        System.out.println(notas.contains(5d));

        System.out.println(Collections.min(notas));

        System.out.println(Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);
        System.out.println(soma / notas.size());

        notas.remove(7d);
        System.out.println(notas);

        Set<Double> notas2 = new LinkedHashSet<>(); // nao repete itens
        notas2.add(5.6d);
        notas2.add(7.8d);
        notas2.add(0.9d);
        notas2.add(9.4d);
        notas2.add(10d);

        System.out.println(notas2);

        Set<Double> notas3 = new TreeSet<>(notas2); // ordem crescente
        System.out.println(notas3);

        notas3.clear();
        System.out.println(notas3.isEmpty());







    }
}
