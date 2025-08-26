package DSA.day1;

public class CalculateSI {

	public static void main(String[] args) {
		double p = 10000.00;  // principal amount
		double r = 2.50;      // Interest Rate
		double t = 1.5;      // time given

		double SI = (p * r * t) / 100;    //simple interest

		System.out.println(SI);
	}

}
