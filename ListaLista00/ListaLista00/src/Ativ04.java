import java.util.ArrayList;

public class Ativ04 {
	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<>();
		
		lista.add("Ana");
		lista.add("Bruno");
		lista.add("Carlos");
		lista.add("Diana");
		lista.add("Eduardo");
		
		String nomeBuscar = "Diana";
		
		int indice = lista.indexOf(nomeBuscar);
		
		System.out.println("Verificando de Carlos está na lista: " + lista.contains("Carlos"));
		
		if(indice != -1) {
			System.out.println(nomeBuscar + " foi encontrado no índice: " + indice);
		} else {
			System.out.println(nomeBuscar + " não foi encontrado.");
		}
		
		int indicePessoaNaoEncontrada = lista.indexOf("Ronaldo");
		System.out.println("O indice do 'Ronaldo' é: " + indicePessoaNaoEncontrada);
		//irá aparecer '-1' pois não existe na lista, poi ela começa a partir do 0
	}

}
