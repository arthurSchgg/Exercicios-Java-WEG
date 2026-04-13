import java.util.ArrayList;

public class Ativ02 {
	public static void main(String[] args) {
		ArrayList<String> listaDiasSemanas = new ArrayList<>();
		
		listaDiasSemanas.add("Domingo");
		listaDiasSemanas.add("Sábado");
		listaDiasSemanas.add("Segunda-feira");
		listaDiasSemanas.add("Terça-feira");
		listaDiasSemanas.add("Quarta-feira");
		listaDiasSemanas.add("Quinta-feira");
		listaDiasSemanas.add("Sexta-feira");

		
		System.out.println("A quantidade de elementos nessa lista é de: " + listaDiasSemanas.size());
		
		//imprimindo o terceiro dia
		System.out.println("O terceiro dia da semana é: " + listaDiasSemanas.get(3));
		
		//substindo o quinto dia por "sexta-feira"
		listaDiasSemanas.set(5, "Sexta-feira");
		System.out.println("A lista substituida: " + listaDiasSemanas);
	}

}
