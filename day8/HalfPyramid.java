package ps.day8;

public class HalfPyramid {
	
	public static void main(String[] args) {
		
		for(int i = 1; i<= 4; i++) {
			for(int number = 1; number <= i; number++) {
				System.out.print(number+" ");
			}
			System.out.println();
		}
	}

}
