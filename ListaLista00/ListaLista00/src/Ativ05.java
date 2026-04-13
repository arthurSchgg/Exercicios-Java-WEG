import java.util.ArrayList;

public class Ativ05 {
	public static void main(String[] args) {
		ArrayList<Double> listaDouble = new ArrayList<>();

		listaDouble.add(10.90);
		listaDouble.add(35.60);
		listaDouble.add(22.61);
		listaDouble.add(12.90);
		listaDouble.add(16.90);

		double soma = 0.0;

		for (Double numero : listaDouble) {
			soma = soma + numero;
		}

		System.out.printf("O resultado da soma dos valores da lista é de: %.2f", soma);
	}

}
