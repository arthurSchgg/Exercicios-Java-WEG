import java.util.ArrayList;

public class Ativ010 {
	public static void main(String[] args) {
		ArrayList<Integer> lista01 = new ArrayList<Integer>();
		ArrayList<Integer> lista02 = new ArrayList<Integer>();

		lista01.add(1);
		lista01.add(2);
		lista01.add(3);
		lista01.add(4);
		lista01.add(5);

		System.out.println("Lista 1:" + lista01);

		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=");
		lista02.add(6);
		lista02.add(7);
		lista02.add(8);
		lista02.add(9);
		lista02.add(10);

		System.out.println("Lista 2:" + lista02);

		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=");

		ArrayList<Integer> listaCompleta = new ArrayList<>();

		listaCompleta.addAll(lista01);
		listaCompleta.addAll(lista02);

		System.out.println("Lista depois de ser contatenada: " + listaCompleta);

	}

}
