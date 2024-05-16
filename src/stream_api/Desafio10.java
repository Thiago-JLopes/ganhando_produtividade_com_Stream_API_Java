package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Desafio10 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        Predicate<Integer> isNumbValid = numero -> Math.abs(numero) % 2 != 0 && (Math.abs(numero) % 3 == 0 || Math.abs(numero) % 5 == 0);

        List<Integer> numerosValidos = numeros.stream().filter(isNumbValid).toList();
        numerosValidos.forEach(System.out::println);
    }
}
