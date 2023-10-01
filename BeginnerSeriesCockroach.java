package desafios;

public class BeginnerSeriesCockroach {

	public static void main(String[] args) {
		
		System.out.println(cockroachSpeed(1.08));

	}

	public static int cockroachSpeed(double x) {
		int cm = 0;
		if (x >= 0) {
			cm = (int) Math.floor(x * 27.778);
		}
		return cm;
	}

}