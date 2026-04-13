import java.util.ArrayList;
import java.util.List;

public class Exemplo1 {
    public static void main(String[] args) {
    	 List<String> frutas = new ArrayList<>();

    	 frutas.add("Maça"); // Inserção
    	 frutas.add("Abacate");
    	 frutas.add("Limão");
    	 frutas.add("Laranja");

    	 //iteração da forma tradicional
    	 for(int i = 0; i <= frutas.size()-1; i++){
    	 		String f = frutas.get(i);
    	 		System.out.println(f);
    	 }

    	 //Exemplo de For-Each
    	 for(String f : frutas) {
    		    System.out.println(f);
    		}

    	 
    }
}
