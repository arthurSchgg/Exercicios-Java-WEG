import java.util.List;
import java.util.ArrayList;

public class Ex8 {
	public static void main(String[] args) {

		List<String> frutas = new ArrayList<>();

		frutas.add("Maçã");

		frutas.add("Banana");

		frutas.add("Laranja");

		for (int i = 0; i <= frutas.size() - 1; i++) {
			String f = frutas.get(i);
			System.out.println(f);
		}

		System.out.println("");

		frutas.remove("Banana");
		frutas.set(1, "Abacaxi");

		for (String f : frutas) {
			System.out.println(f);
		}

	}

}
