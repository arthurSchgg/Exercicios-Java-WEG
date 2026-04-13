import java.util.ArrayList;
import java.util.Collections;

public class Ativ02 {
	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<Integer>();

		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);
		lista.add(6);
		lista.add(7);
		lista.add(8);
		lista.add(9);
		lista.add(10);

		System.out.println("Lista do menor para o maior: " + lista);

		Collections.reverse(lista);

		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=");

		System.out.println("Lista do maior para o menor: " + lista);

	}

}
