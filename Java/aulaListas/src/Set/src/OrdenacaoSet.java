import java.util.*;

public class OrdenacaoSet {

    public static void main(String[] args) {

        class Serie implements Comparable<Serie> {
            private String nome;
            private String genero;
            private Integer anoDeLançamento;
            private Integer temporadas;

            public Serie(String nome, String genero, Integer anoDeLançamento, Integer temporadas) {
                this.nome = nome;
                this.genero = genero;
                this.anoDeLançamento = anoDeLançamento;
                this.temporadas = temporadas;
            }

            public String getNome() {
                return nome;
            }

            public String getGenero() {
                return genero;
            }

            public Integer getAnoDeLançamento() {
                return anoDeLançamento;
            }

            public Integer getTemporadas() {
                return temporadas;
            }

            public void setNome(String nome) {
                this.nome = nome;
            }

            public void setGenero(String genero) {
                this.genero = genero;
            }

            public void setAnoDeLançamento(Integer anoDeLançamento) {
                this.anoDeLançamento = anoDeLançamento;
            }

            public void setTemporadas(Integer temporadas) {
                this.temporadas = temporadas;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Serie series = (Serie) o;
                return Objects.equals(nome, series.nome) && Objects.equals(genero, series.genero) && Objects.equals(anoDeLançamento, series.anoDeLançamento)
                        && Objects.equals(temporadas, series.temporadas);
            }

            @Override
            public int hashCode() {
                return Objects.hash(nome, genero, anoDeLançamento, temporadas);
            }

            @Override
            public int compareTo(Serie o) {
                int anoDeLancamento = Integer.compare((this.getAnoDeLançamento()), o.getAnoDeLançamento());
                if (anoDeLancamento != 0) return anoDeLancamento;
                return this.getGenero().compareTo(o.getGenero());

            }
        }

        Set<Serie> minhasSeries = new HashSet<>() {{
            add(new Serie("this is us", "drama", 2016, 6));
            add(new Serie("vikings", "aventura", 2013, 6));
            add(new Serie("bom dia, Veronica", "policial", 2020, 2));
            add(new Serie("breaking bad", "drama", 2008, 5));
        }};

        for (Serie serie : minhasSeries)
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - "
                    + serie.getAnoDeLançamento() + " - " + serie.getTemporadas());

        System.out.println("------------------------------------");

        Set<Serie> minhasSeries1 = new LinkedHashSet<>() {{
            add(new Serie("this is us", "drama", 2016, 6));
            add(new Serie("vikings", "aventura", 2016, 6));
            add(new Serie("bom dia, Veronica", "policial", 2020, 2));
            add(new Serie("breaking bad", "drama", 2008, 5));
        }};

        for (Serie serie : minhasSeries1)
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - "
                    + serie.getAnoDeLançamento() + " - " + serie.getTemporadas());

        System.out.println("------------------------------------");

        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for (Serie serie : minhasSeries2)
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - "
                    + serie.getAnoDeLançamento() + " - " + serie.getTemporadas());


    }
}




