package stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio5 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        List<Integer>numerosMaiores = numeros.stream().filter(n -> n > 5).toList();

        System.out.println("Média dos números maiores que 5: ");
        double media = (double) numerosMaiores.stream().reduce(0, Integer::sum) / numerosMaiores.size();
        System.out.println(media);
    }
}
