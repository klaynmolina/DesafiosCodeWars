package desafios;

public class DoIGetABonus {

	public static void main(String[] args) {
		System.out.println(bonusTime(100, true));
	}

	public static String bonusTime(int salary, boolean bonus) {
		if (bonus == true) {
			salary *= 10;
		}
		return "£ " + Integer.toString(salary);
	}

}