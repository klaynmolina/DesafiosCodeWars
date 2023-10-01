package desafios;

public class VowelCount {
	
	public static void main(String[] args) {
		
		String nome = "vanessa";
		System.out.println(getCount(nome));
	}
	
	public static int getCount(String str) {
	    int vowelsCount = 0;
	    char[] letters = str.toCharArray();
		char[] vowels = {'a', 'e', 'i', 'o', 'u'};
		for(char l: letters) {
			for(char v: vowels) {
				if(v == l) {
					vowelsCount++;
				}				
			}			
		}
	    return vowelsCount;
	  }

}
