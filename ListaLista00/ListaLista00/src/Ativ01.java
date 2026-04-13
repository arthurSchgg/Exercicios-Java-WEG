import java.util.ArrayList;

public class Ativ01 {
	public static void main(String[] args) {
		ArrayList<String> listaFrutas = new ArrayList<>();
		
		listaFrutas.add("Morango");
		listaFrutas.add("Laranja");
		listaFrutas.add("Banana");
		listaFrutas.add("Maçã");
		listaFrutas.add("Kiwi");
		
		System.out.println("O tamanha da lista é de: " + listaFrutas.size());
		
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		
		System.out.println("Os elementos da lista são: ");
		
		for(String frutas : listaFrutas ) {
			System.out.println(frutas);
		}
	}

}
