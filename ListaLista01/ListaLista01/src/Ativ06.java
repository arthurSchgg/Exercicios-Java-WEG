import java.util.Scanner;

public class Ativ06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double[] listaMedias = new double[11];

		int contadorMediaNotas = 0;

		System.out.println("+==========================================+");
		System.out.println("|      Bem-Vindo ao Sistema de Notas       |");
		System.out.println("+==========================================+");

		System.out.println("Escreva 4 notas ");
		for (int i = 1; i < 11; i++) {
			System.out.println("Escreva as notas do aluno " + i + ": ");

			double soma = 0;

			for (int i2 = 0; i2 < 4; i2++) {
				System.out.print("Escreva uma nota (1-10): ");
				double nota = sc.nextDouble();

				soma = soma + nota;
			}

			double media = soma / 4.0;

			listaMedias[i] = media;

			System.out.println("Média do aluno " + (i + 1) + ": " + media);

			if (media >= 7.0) {
				contadorMediaNotas++;
			}

		}

		System.out.println("O total de alunos com a média maior que 7: " + contadorMediaNotas);

		sc.close();
	}

}
