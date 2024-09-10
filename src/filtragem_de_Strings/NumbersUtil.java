package filtragem_de_Strings;

import java.util.ArrayList;
import java.util.List;

public class NumbersUtil {

    public static void removeNegativeNumbers(List<Integer> numeros) {
        // Usando removeIf com o predicado que testa se o número é negativo
        numeros.removeIf(n -> n < 0);
    }

    public static void main(String[] args) {
        // Exemplo de uso
        List<Integer> numeros = List.of(10, -5, 20, -3, 7, -8);

        // Convertendo para ArrayList porque List.of() retorna uma lista imutável
        List<Integer> numerosModificaveis = new ArrayList<>(numeros);

        // Chamando o método removeNegativeNumbers
        removeNegativeNumbers(numerosModificaveis);

        // Imprimindo o resultado
        System.out.println(numerosModificaveis);  // Saída: [10, 20, 7]
    }
}

