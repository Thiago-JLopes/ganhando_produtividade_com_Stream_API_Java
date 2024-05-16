package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Desafio19 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> numeroPredicate = n -> n % 3 == 0 || n % 5 == 0;
        System.out.println("Números divisiveis por 3 e por 5: " + numeros.stream().filter(numeroPredicate).toList());
    }
}
