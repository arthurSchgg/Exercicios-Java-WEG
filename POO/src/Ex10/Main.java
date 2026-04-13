package Ex10;

public class Main {
	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario();

		funcionario.setNome("Jorge São Tuffi Neto");
		funcionario.setSalario(18910.00);
		funcionario.setCargo("Gerente de Defesa de Prazos");

		System.out.println("Nome: " + funcionario.getNome());
		System.out.printf("Salário: R$ %.2f", funcionario.getSalario());
		System.out.println("\nCargo: " + funcionario.getCargo());

		System.out.println("=-=-=-=-=-=-=-=-=");

		Funcionario funcionario1 = new Funcionario("Lucas Pereira", 9800.00, "Desenvolvedor Sênior");

		funcionario1.setNome("Cássia Ramos Albuquerque");
		funcionario1.setSalario(12012.00);
		funcionario1.setCargo("Analista de Segurança Sênior");

		System.out.println("Nome: " + funcionario1.getNome());
		System.out.printf("Salário: R$ %.2f", funcionario1.getSalario());
		System.out.println("\nCargo: " + funcionario1.getCargo());

		System.out.println("=-=-=-=-=-=-=-=-=");

		Funcionario funcionario2 = new Funcionario("Ana Clara Souza", 4200.00, "Analista de RH");

		funcionario2.setNome("Wilson Mosqueteiro Guedes");
		funcionario2.setSalario(7777.00);
		funcionario2.setCargo("Especialista em Relações Públicas");

		System.out.println("Nome: " + funcionario2.getNome());
		System.out.printf("Salário: R$ %.2f", funcionario2.getSalario());
		System.out.println("\nCargo: " + funcionario2.getCargo());

	}

}
