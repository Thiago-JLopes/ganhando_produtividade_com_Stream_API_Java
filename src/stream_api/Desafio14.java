package stream_api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Desafio14 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        Predicate<Integer> ePrimo = new Predicate<Integer>() {
            @Override
            public boolean test(Integer numero) {
                if(numero <= 1)
                    return false;
                for(int n = 2; n <= Math.sqrt(numero); n++) {
                    if(numero % n == 0)
                        return false;
                }
                return true;
            }
        };
        List<Integer> numerosPrimos = numeros.stream().filter(ePrimo).toList();
        System.out.println("O maior Número primo é: "+ numerosPrimos.stream().max(Comparator.naturalOrder()));
    }
}
