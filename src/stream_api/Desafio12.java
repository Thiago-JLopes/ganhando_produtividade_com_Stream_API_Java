package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Desafio12 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        BinaryOperator<Integer> multiplicar = (num1, num2) -> num1 * num2;
        System.out.println("A multiplicação dos números da lista: " + numeros.stream().reduce(1, multiplicar));
    }
}
