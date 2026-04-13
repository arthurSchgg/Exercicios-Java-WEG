public class Q3 {
    public static void main(String[] args) {
        int[][] matriz = {
            {5, 7, 2},
            {9, 1, 3},
            {4, 6, 8}
        };

        int maior = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
                System.out.println("maior = " + maior);
            }
        }
    }
}
	