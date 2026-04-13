import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ativ09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> lista10Elementos = new ArrayList<Integer>();
		List<Integer> lista10Elementos2 = new ArrayList<Integer>();
		
		lista10Elementos.add(10);
		lista10Elementos.add(20);
		lista10Elementos.add(30);
		lista10Elementos.add(40);
		lista10Elementos.add(50);
		lista10Elementos.add(60);
		lista10Elementos.add(70);
		lista10Elementos.add(80);
		lista10Elementos.add(90);
		lista10Elementos.add(100);
		
		lista10Elementos2.add(110);
		lista10Elementos2.add(120);
		lista10Elementos2.add(130);
		lista10Elementos2.add(140);
		lista10Elementos2.add(150);
		lista10Elementos2.add(160);
		lista10Elementos2.add(170);
		lista10Elementos2.add(180);
		lista10Elementos2.add(190);
		lista10Elementos2.add(200);
		
		ArrayList<Integer> listaCompleta = new ArrayList<>();

		listaCompleta.addAll(lista10Elementos);
		listaCompleta.addAll(lista10Elementos2);
		
		System.out.println("Lista depois de ser contatenada: " + listaCompleta);
		
	}

}
