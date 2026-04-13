import java.util.Arrays;

public class exemplos2 {
	public static void main(String[] args) {
		
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		
		System.out.println("Exemplo 1");
		
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		
		int v [] = new int [7];
		int w [] = new int [7];
		
		for(int a = 0; a < 3; a ++) {        
			v[a] = 5;                      
			w[a] = a;                       
			  }      
		
		System.out.println("Exemplo 1: " + Arrays.toString(v));
		
		System.out.println("Exemplo 1 com for: ");
		
		for(int i = 0; i < v.length; i++) {
			System.out.println(v[i]);
		}
		
		System.out.println("Exemplo 1: " + Arrays.toString(w));
		
		System.out.println("Exemplo 1 com for: ");
		
		for(int i = 0; i < w.length; i++) {
			System.out.println(w[i]);
		}
		
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		
		System.out.println("Exemplo 2");
		
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		
		int a2 = 2;                                         
		int b2 = 5;   
		int v2 [] = new int[8];
		int w2 [] = new int[8];
		
		for(int c = 0; c < 3; c ++) {        
			v2[c] = a2;                        
		    w2[c] = c * v2[c];                       
		  }    
		
		System.out.println("Exemplo 2: " + Arrays.toString(v2));
		
		System.out.println("Exemplo 2 com for: ");
		
		for(int i = 0; i < v2.length; i++) {
			System.out.println(v2[i]);
			
		}
		System.out.println("Exemplo 2: " + Arrays.toString(w2));
		
		System.out.println("Exemplo 2 com for: ");
		
		for(int i = 0; i < w2.length; i++) {
			System.out.println(w2[i]);
			
		}
		
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		
		System.out.println("Exemplo 3");
		
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		
		int v3 [] = new int[7];
		int w3 [] = new int[7];
		
		v3[0] = 2;                                                                  
		for(int d = 1; d < 4; d++) {                                     
		v3[d] = v3[d - 1] * 2;                               
		}                                                                      
		for (int  d = 0; d < 4; d++) {                                         
		w3[d] = v3[d] * 10;                                
		}         
		
		System.out.println("Exemplo 3: " + Arrays.toString(v3));
		
		System.out.println("Exemplo 3 com for: ");
		
		for(int i = 0; i < v3.length; i++) {
			System.out.println(v3[i]);
			
		}
		System.out.println("Exemplo 3: " + Arrays.toString(w3));
		
		System.out.println("Exemplo 3 com for: ");
		
		for(int i = 0; i < w3.length; i++) {
			System.out.println(w3[i]);
			
		}
		
		

	}

}
