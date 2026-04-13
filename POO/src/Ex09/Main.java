package Ex09;

public class Main {
	public static void main(String[] args) {

		ContaBancaria contaBancaria = new ContaBancaria();

		contaBancaria.setNumeroDaConta("0012 013.00456-7");
		contaBancaria.setSaldo(1250.30);

		System.out.println("Número da conta: " + contaBancaria.getNumeroDaConta());
		System.out.printf("Saldo da conta: R$ %.2f", contaBancaria.getSaldo());

		System.out.println("\n=-=-=-=-=-=-=-=-=");

		ContaBancaria contaBancaria1 = new ContaBancaria("98765-4", -210.00);

		contaBancaria1.setNumeroDaConta("10456-2 Ag. 0089");
		contaBancaria1.setSaldo(14200.00);

		System.out.println("Número da conta: " + contaBancaria1.getNumeroDaConta());
		System.out.printf("Saldo da conta: R$ %.2f", contaBancaria1.getSaldo());

		System.out.println("\n=-=-=-=-=-=-=-=-=");

		ContaBancaria contaBancaria2 = new ContaBancaria("00102-X", 0.00);

		contaBancaria2.setNumeroDaConta("33240098-1");
		contaBancaria2.setSaldo(-75.22);

		System.out.println("Número da conta: " + contaBancaria2.getNumeroDaConta());
		System.out.printf("Saldo da conta: R$ %.2f", contaBancaria2.getSaldo());
	}

}
