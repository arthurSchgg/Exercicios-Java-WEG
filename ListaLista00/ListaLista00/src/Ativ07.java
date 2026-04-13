import java.util.ArrayList;

public class Ativ07 {
	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<Integer>();

		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);
		lista.add(6);

		System.out.println("Lista antes da remoção: " + lista);

		lista.remove(2);

		System.out.println("Lista depois da remoção: " + lista);
	}

}
