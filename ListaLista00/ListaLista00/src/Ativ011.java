import java.util.ArrayList;

public class Ativ011 {
	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();

		lista.add("Alice");
		lista.add("Bob");
		lista.add("Carol");
		lista.add("David");
		lista.add("Eve");

		System.out.println("Lista antes da substituição: " + lista);

		lista.set(2, "Carlos");

		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

		System.out.println("Lista depois da substituição: " + lista);

	}

}
