package DSA.day1;

public class MaxOf3 {

	public static void main(String[] args) {
		int a = 30;
		int b = 40;
		int c = 50;
		
		if(a>b) {
			if(a>c)
				System.out.println(a+" is greatest");
			else
				System.out.println(c+" is greatest");
		}
		else {
			if(b>c)
				System.out.println(b+" is greatest");
			else
				System.out.println(c+" is greatest");
		}
	}
}
