package ps.day11;

public class Average {
	
	public static void average(int i, int j, int k) {
		double average = (i+j+k)/3;
		System.out.println("Average: "+average);
	}
	
	public static void main(String[] args) {
		int a = 10;
		int b = 7;
		int c = 9;
		average(a, b, c);
	}

}
