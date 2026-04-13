package Ex01;

public class ClassePrincipal {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome("Fabiano");
		pessoa.setIdade(50);
		
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("Idade: " + pessoa.getIdade());
		
		System.out.println("=-=-=-=-=-=-=-=");

		Pessoa pessoa1 = new Pessoa("Ronaldo", 40);
		
		pessoa1.setNome("André");
		pessoa1.setIdade(38);
		
		System.out.println("Nome: " + pessoa1.getNome());
		System.out.println("Idade: " + pessoa1.getIdade());
	}

}
