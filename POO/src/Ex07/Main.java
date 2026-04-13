package Ex07;

public class Main {
	public static void main(String[] args) {

		Animal animal = new Animal();

		animal.setNome("Sr. Bits");
		animal.setRaca("Pembroke Welsh Corgi");
		animal.setIdade(3);

		System.out.println("Nome: " + animal.getNome());
		System.out.println("Raça: " + animal.getRaca());
		System.out.println("Idade: " + animal.getIdade());

		System.out.println("=-=-=-=-=-=-=-=-=");

		Animal animal1 = new Animal("Whey", "Golden Retriever", 3.0);

		animal1.setNome("Nebula");
		animal1.setRaca("Bombay");
		animal1.setIdade(5);

		System.out.println("Nome: " + animal1.getNome());
		System.out.println("Raça: " + animal1.getRaca());
		System.out.println("Idade: " + animal1.getIdade());

		System.out.println("=-=-=-=-=-=-=-=-=");

		Animal animal2 = new Animal("Dr. Rúcula", "Porquinho-da-Índia", 2.3);

		animal2.setNome("T-Ruffles");
		animal2.setRaca("Abissínio");
		animal2.setIdade(1);

		System.out.println("Nome: " + animal2.getNome());
		System.out.println("Raça: " + animal2.getRaca());
		System.out.println("Idade: " + animal2.getIdade());

		System.out.println("=-=-=-=-=-=-=-=-=");

		Animal animal3 = new Animal("Zé Delivery", "Vira-lata", 6.0);

		animal3.setNome("Barba-Roxa");
		animal3.setRaca("Peixe Betta");
		animal3.setIdade(0.8);

		System.out.println("Nome: " + animal3.getNome());
		System.out.println("Raça: " + animal3.getRaca());
		System.out.println("Idade: " + animal3.getIdade());
	}

}
