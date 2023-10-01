package desafios;

import java.util.Scanner;

public class IsANumberPrime {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		System.out.print("Número: ");
		int n = read.nextInt();
		System.out.println("Benita: " + isPrime(n));	
		System.out.println("Benito: " + isPrimeBenito(n));	
		System.out.println("isPrimeRapido: " + isPrimeRapido(n));	
		read.close();
		
	}
	
	public static boolean isPrime (int n) {
		int c = 0;
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				c++;
			}
		}		
		boolean result = c > 2 || c < 2 ? false : true;
		return result;		
	}
	
	public static boolean isPrimeRapido (int num) {
		if(num < 2) return false;
		if(num == 2) return true;
		for(int i = 2; i < Math.sqrt(num)+1;i++) {
			if(num % i == 0) return false;
		}
		return true;
	}
	
	public static boolean isPrimeBenito (int n) {		
		if(n < 2) return false;
		
		for(int i = 2; i < n; i++) {
			if(n % i == 0) {
				return false;
			}
		}				
		return true;
	}

}
