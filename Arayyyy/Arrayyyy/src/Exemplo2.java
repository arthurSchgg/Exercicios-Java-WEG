import java.util.ArrayList;
import java.util.List;

public class Exemplo2 {
    public static void main(String[] args) {
        // Criando uma lista de String
        List<String> listaDeFrutas = new ArrayList<>();

        // Adicionando elementos à lista
        listaDeFrutas.add("Maçã");
        listaDeFrutas.add("Banana");
        listaDeFrutas.add("Laranja");
        listaDeFrutas.add("Manga");

        // Exibindo a lista
        System.out.println("Lista de Frutas: " + listaDeFrutas);

        // Acessando um elemento específico (por índice)
        System.out.println("Fruta na posição 2: " + listaDeFrutas.get(2));  // Saída: Laranja

        // Removendo um elemento (por valor)
        listaDeFrutas.remove("Banana");

        // Exibindo a lista após remoção
        System.out.println("Lista após remoção de Banana: " + listaDeFrutas);

        // Verificando o tamanho da lista
        System.out.println("Tamanho da lista: " + listaDeFrutas.size());  // Saída: 3

        // Verificando se a lista contém um elemento específico
        System.out.println("A lista contém Laranja? " + listaDeFrutas.contains("Laranja"));  // Saída: true
    }
}
