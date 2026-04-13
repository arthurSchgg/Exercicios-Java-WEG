import java.util.ArrayList;

public class Ativ04 {
	public static void main(String[] args) {
		ArrayList<Integer> listaNumerosTotal = new ArrayList<Integer>();
		ArrayList<Integer> listaNumerosPares = new ArrayList<Integer>();
		ArrayList<Integer> listaNumerosImpares = new ArrayList<Integer>();

		listaNumerosTotal.add(1);
		listaNumerosTotal.add(2);
		listaNumerosTotal.add(3);
		listaNumerosTotal.add(4);
		listaNumerosTotal.add(5);
		listaNumerosTotal.add(6);
		listaNumerosTotal.add(7);
		listaNumerosTotal.add(8);
		listaNumerosTotal.add(9);
		listaNumerosTotal.add(10);
		listaNumerosTotal.add(11);
		listaNumerosTotal.add(12);
		listaNumerosTotal.add(13);
		listaNumerosTotal.add(14);
		listaNumerosTotal.add(15);
		listaNumerosTotal.add(16);
		listaNumerosTotal.add(17);
		listaNumerosTotal.add(18);
		listaNumerosTotal.add(19);
		listaNumerosTotal.add(20);

		for (int numero : listaNumerosTotal) {
			if (numero % 2 == 0) {
				listaNumerosPares.add(numero);
			} else {
				listaNumerosImpares.add(numero);
			}
		}

		System.out.println("--- Impressão das Listas ---");
		System.out.println("Lista Completa: " + listaNumerosTotal);
		System.out.println("Lista de Pares: " + listaNumerosPares);
		System.out.println("Lista de Ímpares: " + listaNumerosImpares);

	}

}
