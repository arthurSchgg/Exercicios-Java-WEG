public class Ex01 {
	public static void main(String[] args) {
		double mat[][] = new double[3][3];
		int n = 3;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = 1 + i + j;
			}
		}

		System.out.println("Matriz completa:");

		String separadorLinha = "+-------+-------+-------+";

		System.out.println(separadorLinha);

		for (double[] linha : mat) {
			System.out.print("| ");

			for (double elemento : linha) {
				System.out.printf("%-5.1f | ", elemento);
			}

			System.out.println();
			System.out.println(separadorLinha);
		}
	}
}