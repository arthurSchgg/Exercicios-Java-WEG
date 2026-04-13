package Ex08;

public class Main {
	public static void main(String[] args) {

		Endereco endereco = new Endereco();

		endereco.setRua("Avenida das Magnólias");
		endereco.setNumero("1988");
		endereco.setCidade("Curitiba");

		System.out.println("Rua: " + endereco.getRua());
		System.out.println("Número: " + endereco.getNumero());
		System.out.println("Cidade: " + endereco.getCidade());

		System.out.println("=-=-=-=-=-=-=-=-=");

		Endereco endereco1 = new Endereco("Avenida Atlântica", "4240", "Rio de Janeiro");

		endereco1.setRua("Travessa dos Sabiás");
		endereco1.setNumero("72");
		endereco1.setCidade("Belo Horizonte");

		System.out.println("Rua: " + endereco1.getRua());
		System.out.println("Número: " + endereco1.getNumero());
		System.out.println("Cidade: " + endereco1.getCidade());

		System.out.println("=-=-=-=-=-=-=-=-=");

		Endereco endereco2 = new Endereco("Rua Direita", "105", "Ouro Preto");

		endereco2.setRua("Rua Augusta");
		endereco2.setNumero("902");
		endereco2.setCidade("São Paulo");

		System.out.println("Rua: " + endereco2.getRua());
		System.out.println("Número: " + endereco2.getNumero());
		System.out.println("Cidade: " + endereco2.getCidade());
	}
}
