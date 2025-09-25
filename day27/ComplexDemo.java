package ps.day27;

import java.util.Scanner;

class Complex {
	int real, imag;

	public Complex(int r, int i) {
		real = r;
		imag = i;
	}

	public Complex add(Complex c) {
		return new Complex(this.real + c.real, this.imag + c.imag);
	}

	public Complex subtract(Complex c) {
		return new Complex(this.real - c.real, this.imag - c.imag);
	}

	public Complex multiply(Complex c) {
		int r = this.real * c.real - this.imag * c.imag;
		int i = this.real * c.imag + this.imag * c.real;
		return new Complex(r, i);
	}

	public void display() {
		if (imag >= 0)
			System.out.println(real + " + " + imag + "i");
		else
			System.out.println(real + " - " + (-imag) + "i");
	}
}

public class ComplexDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter real part of first complex number: ");
		int r1 = sc.nextInt();
		System.out.print("Enter imaginary part of first complex number: ");
		int i1 = sc.nextInt();

		System.out.print("Enter real part of second complex number: ");
		int r2 = sc.nextInt();
		System.out.print("Enter imaginary part of second complex number: ");
		int i2 = sc.nextInt();

		Complex c1 = new Complex(r1, i1);
		Complex c2 = new Complex(r2, i2);

		// Operations
		Complex sum = c1.add(c2);
		Complex diff = c1.subtract(c2);
		Complex prod = c1.multiply(c2);

		System.out.print("Sum = ");
		sum.display();
		System.out.print("Difference = ");
		diff.display();
		System.out.print("Product = ");
		prod.display();

		sc.close();
	}
}
