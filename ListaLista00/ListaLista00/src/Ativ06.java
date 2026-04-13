import java.util.ArrayList;

public class Ativ06 {
	public static void main(String[] args) {

		ArrayList<String> lista = new ArrayList<>();

		lista.add("São Paulo");
		lista.add("Rio de Janeiro");
		lista.add("Belo Horizonte");
		lista.add("Curitiba");

		for (int i = 0; i < lista.size(); i++) {
			String cidadeAtual = lista.get(i);

			System.out.println("Posição " + i + ":" + cidadeAtual);
		}

	}
}
