package desafios;

import java.util.Arrays;
import java.util.List;

public class SumMixedArray {

	public static void main(String[] args) {
		
		List<?> aleatorios = Arrays.asList(5, "5", 10, "7", 15, "3");
		
		System.out.println(sumInteger(aleatorios));
		System.out.println(sumDouble(aleatorios));
		

	}
	
	public static Integer sumInteger(List<?> lista) {
		return lista.stream().map(i -> Integer.parseInt(i.toString())).reduce((a,b) -> a+b).get();		 
	}
	
	public static Double sumDouble(List<?> lista) {
		return lista.stream().map(i -> Double.parseDouble(i.toString())).reduce((a,b) -> a+b).get();
	}

}
