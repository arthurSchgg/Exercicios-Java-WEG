import java.util.ArrayList;
import java.util.Scanner;

public class Ativ08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> listaIdades = new ArrayList<Integer>();
		ArrayList<Double> listaAlturas = new ArrayList<>();

		int contadorPessoas = 0;

		double somaTotal = 0.0;
		double media = 0.0;
		int idade = 0;
		double altura = 0.0;

		for (int i = 0; i < 30; i++) {
			System.out.print("Escreva a idade da " + (i + 1) + "º pessoa: ");
			idade = sc.nextInt();

			listaIdades.add(idade);

			System.out.print("Escreva a altura da " + (i + 1) + "º pessoa: ");
			altura = sc.nextDouble();

			listaAlturas.add(altura);

		}

		for (Double alturas : listaAlturas) {
			somaTotal = somaTotal + alturas;
		}

		media = somaTotal / listaAlturas.size();

		System.out.printf("A média de altura é de: %.2f\n", media);

		for (int i = 0; i < 30; i++) {
			int idadePessoa = listaIdades.get(i);
			double alturaPessoa = listaAlturas.get(i);

			if (idadePessoa > 13 && alturaPessoa > media) {
				contadorPessoas++;
			}
		}

		System.out.println(
				"O total de pessoas maiores de 13 anos e maior que a média de idades é de: " + contadorPessoas);

		sc.close();

	}

}
