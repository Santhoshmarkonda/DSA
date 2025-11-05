package ps.day26;

abstract class Animal1 {

	abstract void sound();

	void sleep() {
		System.out.println("Animal is sleeping");
	}
}

class Dog1 extends Animal1 {
	@Override
	void sound() {
		System.out.println("Dog barks");
	}
}

class Cat1 extends Animal1 {
	@Override
	void sound() {
		System.out.println("Cat meows");
	}
}

interface Vehicle {
	void start();

	void stop();
}

class Car implements Vehicle {
	@Override
	public void start() {
		System.out.println("Car starts with a key");
	}

	@Override
	public void stop() {
		System.out.println("Car stops with brake");
	}
}

class Bike implements Vehicle {
	@Override
	public void start() {
		System.out.println("Bike starts with a kick");
	}

	@Override
	public void stop() {
		System.out.println("Bike stops with hand brake");
	}
}

public class Abstraction {
	public static void main(String[] args) {
		Animal1 a;

		a = new Dog1();
		a.sound();
		a.sleep();

		a = new Cat1();
		a.sound();
		a.sleep();

		System.out.println("----------------------");

		Vehicle v;

		v = new Car();
		v.start();
		v.stop();

		v = new Bike();
		v.start();
		v.stop();
	}
}
