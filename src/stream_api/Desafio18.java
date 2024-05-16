package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Desafio18 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 1, 1, 1, 1);
        Set<Integer> numeros2 = numeros.stream().collect(Collectors.toSet());
        System.out.println("Os números da lista são iguais: " + (numeros2.size() == 1));
    }
}
