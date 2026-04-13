
public class Ativ03 {
	public static void main(String[] args) {

		double alturaBrutus = 1.84;
		int pesoBrutus = 122;
		double alturaOlivia = 1.76;
		int pesoOlivia = 45;
		int pesoIdealBrutus = 88;
		int pesoIdealOlivia = 78;
		int imcBrutus = (int) ((int) pesoBrutus / (alturaBrutus * alturaBrutus));
		int imcOlivia = (int) ((int) pesoOlivia / (alturaOlivia * alturaOlivia));

		System.out.println("IMC do Brutus: " + imcBrutus);
		if (imcBrutus < 16) {
			System.out.println("Magreza grave");
			System.out.println(
					"Falta para Olivia perder/ganhar para ficar saúdavel: " + (pesoIdealOlivia - pesoOlivia) + "KG");
		} else if (imcBrutus <= 16 || imcBrutus < 17) {
			System.out.println("Magreza moderada");
		} else if (imcBrutus <= 17 || imcBrutus < 18.5) {
			System.out.println("Magreza leve");
		} else if (imcBrutus <= 18.5 || imcBrutus < 25) {
			System.out.println("Saúdavel");
		} else if (imcBrutus <= 25 || imcBrutus < 30) {
			System.out.println("Obesidade grau I");
		} else if (imcBrutus <= 30 || imcBrutus < 35) {
			System.out.println("Obesidade grau II (severa)");
		} else {
			System.out.println("Obesidade grau III (mórbida)");
			System.out.println(
					"Falta para Brutus perder/ganhar para ficar saúdavel: " + (pesoBrutus - pesoIdealBrutus) + "KG");
		}

		System.out.println("IMC da Olivia: " + imcOlivia);
		if (imcOlivia < 16) {
			System.out.println("Magreza grave");
			System.out.println(
					"Falta para Olivia perder/ganhar para ficar saúdavel: " + (pesoIdealOlivia - pesoOlivia) + "KG");
		} else if (imcOlivia <= 16 || imcOlivia < 17) {
			System.out.println("Magreza moderada");
		} else if (imcOlivia <= 17 || imcOlivia < 18.5) {
			System.out.println("Magreza leve");
		} else if (imcOlivia <= 18.5 || imcOlivia < 25) {
			System.out.println("Saúdavel");
		} else if (imcOlivia <= 25 || imcOlivia < 30) {
			System.out.println("Obesidade grau I");
		} else if (imcOlivia <= 30 || imcOlivia < 35) {
			System.out.println("Obesidade grau II (severa)");
		} else {
			System.out.println("Obesidade grau III (mórbida)");
			System.out.println(
					"Falta para Brutus perder/ganhar para ficar saúdavel: " + (pesoIdealBrutus - pesoBrutus) + "KG");
		}

	}

}
