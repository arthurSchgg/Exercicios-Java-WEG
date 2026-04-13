package Ex12;

public class Main {
	public static void main(String[] args) {

		Emprestimo emprestimo = new Emprestimo();

		emprestimo.setValor(5000.00);
		emprestimo.setDataEmprestimo("15/10/2025");
		emprestimo.setNumeroDeParcelas(24);

		System.out.printf("Valor do empréstimo: R$ %.2f", emprestimo.getValor());
		System.out.println("\nData do empréstimo: " + emprestimo.getDataEmprestimo());
		System.out.println("Número de parcelas do empréstimo: " + emprestimo.getNumeroDeParcelas());

		System.out.println("=-=-=-=-=-=-=-=-=");

		Emprestimo emprestimo1 = new Emprestimo(75000.00, "20/03/2024", 60);

		emprestimo1.setValor(120000.00);
		emprestimo1.setDataEmprestimo("01/03/2025");
		emprestimo1.setNumeroDeParcelas(360);

		System.out.printf("Valor do empréstimo: R$ %.2f", emprestimo1.getValor());
		System.out.println("\nData do empréstimo: " + emprestimo1.getDataEmprestimo());
		System.out.println("Número de parcelas do empréstimo: " + emprestimo1.getNumeroDeParcelas());

		System.out.println("=-=-=-=-=-=-=-=-=");

		Emprestimo emprestimo2 = new Emprestimo(800.00, "01/11/2025", 3);

		emprestimo2.setValor(850.00);
		emprestimo2.setDataEmprestimo("02/11/2025");
		emprestimo2.setNumeroDeParcelas(3);

		System.out.printf("Valor do empréstimo: R$ %.2f", emprestimo2.getValor());
		System.out.println("\nData do empréstimo: " + emprestimo2.getDataEmprestimo());
		System.out.println("Número de parcelas do empréstimo: " + emprestimo2.getNumeroDeParcelas());

		System.out.println("=-=-=-=-=-=-=-=-=");

		Emprestimo emprestimo3 = new Emprestimo(450000.00, "10/01/2022", 360);

		emprestimo3.setValor(30000.00);
		emprestimo3.setDataEmprestimo("20/07/2025");
		emprestimo3.setNumeroDeParcelas(60);

		System.out.printf("Valor do empréstimo: R$ %.2f", emprestimo3.getValor());
		System.out.println("\nData do empréstimo: " + emprestimo3.getDataEmprestimo());
		System.out.println("Número de parcelas do empréstimo: " + emprestimo3.getNumeroDeParcelas());
	}

}
