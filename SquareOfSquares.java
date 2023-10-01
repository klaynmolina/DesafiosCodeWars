package desafios;

public class SquareOfSquares {

	public static void main(String[] args) {
		
		int numeroRecebido = 2209;
						
		System.out.println(perfectSquare(numeroRecebido));
		System.out.println("raiz "+ Math.sqrt(numeroRecebido));
		System.out.println("floor raiz "+ Math.round(Math.sqrt(numeroRecebido)));
		

	}

	private static boolean perfectSquare(int n) {
		if(n < 0) {
			return false;
		}
		double raiz = Math.sqrt(n);		
		boolean teste = raiz < Math.floor(raiz) ? false : true;
		return teste;		
	}

}
