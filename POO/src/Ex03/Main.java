package Ex03;

public class Main {
	public static void main(String[] args) {

		Livro livro = new Livro();

		livro.setTitulo("Frankenstein");
		livro.setAutor("Mary Shelley");
		livro.setDescricao(
				"Um jovem cientista cria um ser vivo em laboratório, mas se apavora com sua criação e a abandona, levando a um ciclo de vingança.");

		System.out.println("Título do livro: " + livro.getTitulo());
		System.out.println("Autor do livro: " + livro.getAutor());
		System.out.println("Descrição do livro: " + livro.getDescricao());

		System.out.println("=-=-=-=-=-=-=-=-=");

		Livro livro1 = new Livro("Cem Anos de Solidão", "Gabriel García Márquez",
				"Clássico da literatura latino-americana.");

		livro1.setTitulo("Crime e Castigo");
		livro1.setAutor("Fiódor Dostoiévski");
		livro1.setDescricao(
				"Um estudante pobre de São Petersburgo comete um assassinato para provar uma teoria, mas é consumido pela culpa e paranoia.");
		;

		System.out.println("Título do livro: " + livro1.getTitulo());
		System.out.println("Autor do livro: " + livro1.getAutor());
		System.out.println("Descrição do livro: " + livro1.getDescricao());

		System.out.println("=-=-=-=-=-=-=-=-=");

		Livro livro2 = new Livro("1984", "George Orwell", "Distopia clássica e influente.");

		livro2.setTitulo("O Hobbit");
		livro2.setAutor("J.R.R. Tolkien");
		livro2.setDescricao(
				"Um hobbit caseiro é convencido por um mago a se juntar a um grupo de anões em uma aventura para roubar um tesouro guardado por um dragão.");

		System.out.println("Título do livro: " + livro2.getTitulo());
		System.out.println("Autor do livro: " + livro2.getAutor());
		System.out.println("Descrição do livro: " + livro2.getDescricao());

		System.out.println("=-=-=-=-=-=-=-=-=");

	}

}
