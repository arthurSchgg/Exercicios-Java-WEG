import java.util.ArrayList;

public class Ativ09 {
	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<Integer>();

		lista.add(100);
		lista.add(200);
		lista.add(300);
		lista.add(400);
		lista.add(500);

		System.out.println("Lista antes da adição: " + lista);

		System.out.println("Tamanho da lista antes da adição: " + lista.size());

		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

		lista.add(600);

		System.out.println("Lista depois da adição: " + lista);

		System.out.println("Tamanho da lista depois da adição: " + lista.size());

	}

}
