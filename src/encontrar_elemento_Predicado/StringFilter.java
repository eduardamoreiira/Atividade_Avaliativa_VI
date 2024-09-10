package encontrar_elemento_Predicado;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StringFilter {

    public static List<String> filterStrings(List<String> strings, Predicate<String> predicado) {
        List<String> resultado = new ArrayList<>();
        for (String s : strings) {
            if (predicado.test(s)) {
                resultado.add(s);
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        // Exemplo de uso
        List<String> lista = List.of("Apple", "Banana", "Avocado", "Blueberry", "Apricot");

        // Predicado que filtra strings que começam com "A"
        Predicate<String> startsWithA = s -> s.startsWith("A");

        // Chamando o método filterStrings com o predicado
        List<String> resultado = filterStrings(lista, startsWithA);

        // Imprimindo o resultado
        System.out.println(resultado);  // Saída: [Apple, Avocado, Apricot]
    }
}
