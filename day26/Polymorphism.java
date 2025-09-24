package ps.day26;

class Calculator {

	int add(int a, int b) {
		return a + b;
	}

	double add(double a, double b) {
		return a + b;
	}

	int add(int a, int b, int c) {
		return a + b + c;
	}
}

class Animals {
	void sound() {
		System.out.println("Animal makes a sound");
	}
}

class Dogs extends Animals {
	@Override
	void sound() {
		System.out.println("Dog barks");
	}
}

class Cats extends Animals {
	@Override
	void sound() {
		System.out.println("Cat meows");
	}
}

public class Polymorphism {
	public static void main(String[] args) {

		Calculator calc = new Calculator();
		System.out.println("Sum of 2 ints: " + calc.add(10, 20));
		System.out.println("Sum of 2 doubles: " + calc.add(5.5, 4.5));
		System.out.println("Sum of 3 ints: " + calc.add(1, 2, 3));

		System.out.println("----------------------");

		Animals a;

		a = new Dogs();
		a.sound();

		a = new Cats();
		a.sound();
	}
}
