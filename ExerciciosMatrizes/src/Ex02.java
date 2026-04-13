
public class Ex02 {
	public static void main(String[] args) {
		
		double mat[][] = new double[2][4];
		
		int m = 2;
		int n = 4;
		int x = 0;

		for (int i = 0; i < m; i++) {
		    x = x + i;
		    
		    for (int j = 0; j < n; j++) {
		        x = x + j;
		        mat[i][j] = x;
		    }
		}
		
		System.out.println("Matriz completa:");

		String separadorLinha = "+-------+-------+-------+-------+";

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
