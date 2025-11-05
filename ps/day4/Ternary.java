package ps.day4;

public class Ternary {

	public static void main(String[] args) {
		int a = 5;
		int b = 3;
		int number = (a > b) ? a : b;
		String type = (number % 2 == 0) ? "EVEN" : "ODD";
		System.out.println(number);
		System.out.println(type);
	}

}
