import java.util.ArrayList;

public class Ativ03 {
	public static void main(String[] args) {
		ArrayList<Integer> listaNumeros = new ArrayList<>();
		
		listaNumeros.add(10);
		listaNumeros.add(20);
		listaNumeros.add(30);
		listaNumeros.add(40);
		listaNumeros.add(50);
		
		//removendo o número "30"
		listaNumeros.remove(2);
		
		System.out.println("Lista sem o número removido: " + listaNumeros);
	}

}
