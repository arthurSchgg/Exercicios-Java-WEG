import java.util.List;
import java.util.LinkedList;


public class Ex9 {
	public static void main(String[] args) {
		List<String> Lista = new LinkedList<String>();
		
		Lista.add("Maça");
		Lista.add("Banana");
		Lista.add("Manga");
		Lista.add("Laranja");
		Lista.add(0, "Morango");
		Lista.add(5, "Abacaxi");
		
		for(String l: Lista) {
			System.out.println(l);
		}
	}

}
