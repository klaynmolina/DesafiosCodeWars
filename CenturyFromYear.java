package desafios;

public class CenturyFromYear {
	
	public static void main(String[] args) {
		
		System.out.println(century(1705));
		
	}
	
	public static int century(int number) {
		int century = 0;
		if(number % 100 == 0) {
			century = number/100;
		} else {
			century = (int) Math.ceil(number/100.0);
		}
		return century;
	  }

}
