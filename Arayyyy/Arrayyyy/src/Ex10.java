import java.util.ArrayList;

public class Ex10 {
	public static void main(String[] args) {

		ArrayList<Computador> elpepe = new ArrayList<>();

		elpepe.add(new Computador("pc1", 10));
		elpepe.add(new Computador("pc2", 15));
		elpepe.add(new Computador("pc3", 20));
		elpepe.add(new Computador("pc4", 25));

		ArrayList<Integer> teste = new ArrayList<>();

		teste.add(10);
		teste.add(15);
		teste.add(20);
		teste.add(20);

		System.out.println(indiceComputadorComMaisDe16GB(teste));

	}

	public static int indiceComputadorComMaisDe16GB(ArrayList<Integer> lista) {

		for (int i = 0; i < lista.size(); i++) {

			if (lista.get(i) >= 16) {
				return i;
			}

		}

		return -1;

	}

}
