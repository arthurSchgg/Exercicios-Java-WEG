import java.util.ArrayList;

public class Ativ03 {
	public static void main(String[] args) {
		ArrayList<Double> notas = new ArrayList<Double>();

		notas.add(10.0);
		notas.add(8.6);
		notas.add(7.7);
		notas.add(5.65);

		System.out.println("lista de notas: " + notas);

		double somaTotal = 0.0;
		double media = 0.0;

		for (Double nota : notas) {
			somaTotal = somaTotal + nota;
		}

		for (Double nota : notas) {
			media = somaTotal / nota;
		}

		System.out.printf("A média das notas foi: %.2f", media);

	}

}
