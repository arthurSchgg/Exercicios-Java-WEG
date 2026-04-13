import java.util.ArrayList;

public class Ativ014 {
	public static void main(String[] args) {
		ArrayList<Integer> listaNumeros01 = new ArrayList<Integer>();
		ArrayList<Integer> listaNumeros02 = new ArrayList<Integer>();

		listaNumeros01.add(1);
		listaNumeros01.add(2);
		listaNumeros01.add(3);

		listaNumeros02.add(4);
		listaNumeros02.add(5);
		listaNumeros02.add(6);

		System.out.println("Verificando se a lista 1 é igual a 2: " + listaNumeros01.equals(listaNumeros02));

		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

		listaNumeros01.removeAll(listaNumeros01);
		listaNumeros02.removeAll(listaNumeros02);

		listaNumeros01.add(1);
		listaNumeros01.add(2);
		listaNumeros01.add(3);

		listaNumeros02.add(1);
		listaNumeros02.add(2);
		listaNumeros02.add(3);

		System.out.println("Verificando se a lista 1 é igual a 2: " + listaNumeros01.equals(listaNumeros02));

	}

}
