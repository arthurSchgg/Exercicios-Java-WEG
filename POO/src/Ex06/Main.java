package Ex06;

public class Main {
	public static void main(String[] args) {

		Roda roda = new Roda();

		roda.setModelo("TE37");
		roda.setMarca("Volk Racing");
		roda.setAro(17);

		System.out.println("O modelo dessa roda é: " + roda.getModelo());
		System.out.println("A marca dessa roda é: " + roda.getMarca());
		System.out.println("O aro dessa roda é: " + roda.getAro());

		System.out.println("=-=-=-=-=-=-=-=-=");

		Roda roda1 = new Roda("BBS", "RPF1", 18);

		roda1.setModelo("CV3-R");
		roda1.setMarca("Vossen");
		roda1.setAro(20);

		System.out.println("O modelo dessa roda é: " + roda1.getModelo());
		System.out.println("A marca dessa roda é: " + roda1.getMarca());
		System.out.println("O aro dessa roda é: " + roda1.getAro());

		System.out.println("=-=-=-=-=-=-=-=-=");

		Roda roda2 = new Roda("OZ Racing", "Snowflake", 22);

		roda2.setModelo("Torq Thrust");
		roda2.setMarca("American Racing");
		roda2.setAro(15);

		System.out.println("O modelo dessa roda é: " + roda2.getModelo());
		System.out.println("A marca dessa roda é: " + roda2.getMarca());
		System.out.println("O aro dessa roda é: " + roda2.getAro());
	}

}
