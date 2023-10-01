package desafios;

import java.util.Arrays;

public class CountPositivesSumNegatives {

	public static void main(String[] args) {
		
		
		//int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};
		//int[] array = {0, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};
		int[] array = null;
		
		System.out.println(Arrays.toString(countPositivesSumNegatives(array)));

	}

	public static int[] countPositivesSumNegatives(int[] input) {	
		if(input == null || input.length == 0) {
			int[] arr = {};
			return arr;
		}
		int count = 0;
		int sum = 0;
		for(int n: input) {
			if( n == 0) {
				continue;
			}
			if(n < 0) {
				sum += n;
			} else {
				count++;
			}
		}		
		int[] result = {count, sum};		
		return result;
	}

}
