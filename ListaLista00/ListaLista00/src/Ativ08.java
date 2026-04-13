import java.util.ArrayList;

public class Ativ08 {
	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();

		lista.add("Maçã");
		lista.add("Uva");
		lista.add("Kiwi");
		lista.add("Maracujá");

		System.out.println("Lista antes das adições: " + lista);

		lista.add(1, "Banana");
		lista.add(3, "Laranja");

		System.out.println("Lista depois das adições: " + lista);

	}

}
