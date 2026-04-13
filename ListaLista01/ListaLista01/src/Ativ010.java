import java.util.ArrayList;
import java.util.Scanner;

public class Ativ010 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Double> notas = new ArrayList<>();

		double somaNotas = 0;
		int contadorNotasMenoresQueSete = 0;

		while (true) {

			System.out.println("Insira uma nota (Negativos para Sair): ");
			double nota = sc.nextDouble();

			if (nota < 0) {
				break;
			}

			if (nota < 7) {
				contadorNotasMenoresQueSete++;
			}

			somaNotas += nota;
			notas.add(nota);
		}

		double media = 0.0;
		if (!notas.isEmpty()) {
			media = somaNotas / notas.size();
		}

		System.out.println("O total de notas inseridas foi: " + notas.size());

		System.out.print("Valores na ordem que foram informados: ");

		for (double valor : notas) {
			System.out.print(valor + " ");
		}

		System.out.println("\n");
		System.out.println("+---Valores-invertidos---+");

		for (int i = notas.size() - 1; i >= 0; i--) {
			System.out.println(notas.get(i));
		}

		System.out.println("+-----------FIM----------+");
		System.out.println("");

		System.out.println("Soma das notas: " + somaNotas);

		System.out.println("Media das notas: " + String.format("%.2f", media));

		int contadorAcimaMedia = 0;

		for (double valor : notas) {
			if (valor > media) {
				contadorAcimaMedia++;
			}
		}

		System.out.println("O número de notas acima da média é: " + contadorAcimaMedia);
		System.out.println("O número de pessoas abaixo de 7 é: " + contadorNotasMenoresQueSete);

		System.out.println("Finalizando Sistema...");

		sc.close();
	}

}