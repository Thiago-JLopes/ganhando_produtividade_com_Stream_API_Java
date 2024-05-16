package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Desafio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println("Digite um intervalo: ");
        int primeiroTermo = 1, segundoTermo = 1;
        try {
            System.out.print("Primerio termo do intervalo: ");
            primeiroTermo = scanner.nextInt();
            System.out.print("Segundo termo do intervalo: ");
            segundoTermo = scanner.nextInt();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        int finalPrimeiroTermo = primeiroTermo;
        int finalSegundoTermo = segundoTermo;
        List<Integer> numerosDentroDoIntervalo = numeros.stream().filter(n -> (n >= finalPrimeiroTermo && n <= finalSegundoTermo)).toList();
        System.out.println(numerosDentroDoIntervalo);
    }
}
