package desafios;

import java.util.Set;
import java.util.TreeSet;

public class TwoToOne {

	public static void main(String[] args) {

		String a = "aretheyhere";
		String b = "yestheyarehere";
		System.out.println(sortedSb(a, b));
	}


	private static String sortedSb(String s1, String s2) {
		String x = s1 + s2;

		char[] caracteres = x.toCharArray();

		Set<Character> ordenados = new TreeSet<>();
		for (Character i : caracteres) {
			ordenados.add(i);
		}

		StringBuilder sb = new StringBuilder();
		for (Character j : ordenados) {
			sb.append(j);
		}
		return sb.toString();
	}

}
