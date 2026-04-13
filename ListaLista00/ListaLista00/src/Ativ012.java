import java.util.ArrayList;

public class Ativ012 {
	public static void main(String[] args) {
		ArrayList<String> listaFrutas = new ArrayList<String>();

		listaFrutas.add("Banana");
		listaFrutas.add("Maçã");
		listaFrutas.add("Laranja");
		listaFrutas.add("Kiwi");

		System.out.println("Lista antes da remoção: " + listaFrutas);

		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

		listaFrutas.removeAll(listaFrutas);

		System.out.println("Lista depois da remoção: " + listaFrutas);

	}

}
