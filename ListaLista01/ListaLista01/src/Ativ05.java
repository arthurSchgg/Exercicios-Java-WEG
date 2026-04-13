import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ativ05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> listaIdade = new ArrayList<>();
		ArrayList<Double> listaAltura = new ArrayList<>();

		System.out.println("+==========================================+");
		System.out.println("| Bem-Vindo ao Sistema de idades e alturas |");
		System.out.println("+==========================================+");

		System.out.println("Escreva no mínimo 5 idades: ");

		for (int i = 0; i < 5; i++) {
			System.out.print("Escreva a sua idade: ");
			int idade = sc.nextInt();

			listaIdade.add(idade);
		}

		System.out.println("+==========================================+");

		System.out.println("Escreva no mínimo 5 alturas: ");

		for (int i = 0; i < 5; i++) {
			System.out.print("Escreva a sua altura: ");
			double altura = sc.nextDouble();

			listaAltura.add(altura);
		}

		System.out.println("+==========================================+");
		
		Collections.reverse(listaIdade);

		System.out.println("Lista de idades: " + listaIdade);

		Collections.reverse(listaAltura);
		
		System.out.println("Lista de alturas: " + listaAltura);

	}

}
