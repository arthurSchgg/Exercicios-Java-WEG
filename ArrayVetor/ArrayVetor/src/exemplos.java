import java.util.Arrays;

public class exemplos {
	public static void main(String[] args) {
		
		int n1 = 1;
		int n2 = 2;
		int n3 = 3;
		int n4 = 4;
		int n5 = 5;
		int n6 = 6;
		int n7 = 7;
		int n8 = 8;
		int n9 = 9;
		int n10 = 10;
		
		
		System.out.println("Números: " + n1 + ", " + n2 + ", " + n3 + ", " + n4 + ", " + n5 + ", " + n6 + ", " + n7 + ", " + n8 + ", " + n9 + ", " + n10);
		
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		
		System.out.println("Exemplo 1");
		
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

		// exemplo 1
		
		int a = 10;
		int b = 20;
		int c = (a + b) / 2;
		c = c - 40;
		int v [] = new int[7];
		
		v[4] = a + b + c;
		
		System.out.println("Exemplo 1: " + Arrays.toString(v));
		
		System.out.println("Exemplo 1 com for: ");
		
		for(int i = 0; i < v.length; i++) {
			System.out.println(v[i]);
		}
		
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		
		System.out.println("Exemplo 2");
		
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		
		// exemplo 2
		
		int a2 = 2;
		int v2 [] = new int[7];
		
		while(a2 < 6) {
			v2[a2] = 10 * a2;
			a2 = a2 + 1;
		}
		
		System.out.println("Exemplo 2: " + Arrays.toString(v2));
		
		System.out.println("Exemplo 2 com for: ");
		
		for(int i = 0; i < v2.length; i++) {
			System.out.println(v2[i]);
		}
		
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");		
		
		System.out.println("Exemplo 3");
		
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		
		int a3 = 7;
		int b3 = a3 - 6;
		int v3 [] = new int [7];
		
		while(b3 < a3) {
			v3[b3] = b3 * a3;
			b3 = b3 + 2;
			
		}

		System.out.println("Exemplo 3: " + Arrays.toString(v3));
		
		System.out.println("Exemplo 3 com for: ");
		
		for(int i = 0; i < v3.length; i++) {
			System.out.println(v3[i]);
		}		

		
	}

}
