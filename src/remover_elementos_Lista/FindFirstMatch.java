package remover_elementos_Lista;

import java.util.List;
import java.util.function.Predicate;

public class FindFirstMatch {

    public static Integer findFirstMatch(List<Integer> numbers, Predicate<Integer> predicate) {
        // Itera sobre cada número na lista
        for (Integer number : numbers) {
            // Verifica se o número satisfaz o predicado
            if (predicate.test(number)) {
                return number; // Retorna o primeiro número que satisfaz o predicado
            }
        }
        return null; // Retorna null se nenhum número satisfizer o predicado
    }

    public static void main(String[] args) {
        // Exemplo de uso
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        Predicate<Integer> isEven = num -> num % 2 == 0;

        Integer result = findFirstMatch(numbers, isEven);
        System.out.println(result); // Deve imprimir 2, que é o primeiro número par na lista
    }
}


