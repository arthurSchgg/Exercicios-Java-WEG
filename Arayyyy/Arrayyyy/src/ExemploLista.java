import java.util.ArrayList;
import java.util.List;

public class ExemploLista {
	public static void main(String[] args) {

		List<Integer> lista = new ArrayList<>();
		List<String> lista1 = new ArrayList<String>();
		
		lista.add(20);
		lista.add(10);
		lista.add(30);
		lista.add(40);
		lista.add(50);
		
		lista1.add("Feijão");
		
		
		int elemento  = lista.get(4);
		
		System.out.println("Elemento pego pelo get: " + elemento);
		
		System.out.println("---------------------------------");
		
		System.out.println("Lista: " + lista);
		
		System.out.println("---------------------------------------------------");
		
		lista.set(4, 100);
		
		System.out.println("Lista depois do set: " + lista);
		
		lista.remove(4);
		
		System.out.println("---------------------------------------------------");
		
		System.out.println("Lista depois de remover um elemento: " + lista);
		
		System.out.println("---------------------------------------------------");
		
		lista.remove(Integer.valueOf(20));  //remove o valor escolhido, no caso 20
		
		System.out.println("Lista depois de lista.remove(Integer.valueOf(20)): " + lista);
		
		for (int indice  = 0; indice < lista.size(); indice++) {
			
			int numeroLista = lista.get(indice);
			
			System.out.println("Número da lista:" + numeroLista);
		}
		
		System.out.println("---------------------------------------------------");
		
		System.out.println("Segunda lista: " + lista1);

	}

}
