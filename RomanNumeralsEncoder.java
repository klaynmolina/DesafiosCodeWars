package desafios;

public class RomanNumeralsEncoder {

	public static void main(String[] args) {

		System.out.println(solution(1666));
		
		int n = 3500;
		int m = n/1000;
		int resto = n%1000;
		
		int d = resto/500;
		resto = resto%500;
		
		int c = resto/100;
		resto = resto%100;
		
		int l = resto/50;
		resto = resto%50;
		
		int x = resto/10;
		resto = resto%10;
		
		int v = resto/5;
		resto = resto%5;
		
		int i = resto/1;
		
		System.out.println(m);
		System.out.println(d);
		System.out.println(c);
		System.out.println(l);
		System.out.println(x);
		System.out.println(v);
		System.out.println(i);
	}

	public static String solution(int n) {
		
		String letra = Integer.toString(n);
		int num = letra.length();
		
		String resultado = "";
		int m = n/1000;
		int d = (n%1000) / 500;
		
		switch (num){
		case 4: 			
			for(int i = 0; i < m; i++) {
				resultado += "M";
			}			
			for(int i = 0; i < d; i++) {
				resultado += "D";
			}
			break;
		case 3: 
			for(int i = 0; i < m; i++) {
				resultado += "D";
			}
			break;
		case 2: 
			break;
		case 1: 
			break;
		
				
		}
			
        return resultado;

	}
}
