package ps.day26;

class Animal {
	void eat() {
		System.out.println("Animal eats");
	}

	void sleep() {
		System.out.println("Animal sleeps");
	}
}

class Mammal extends Animal {
	int legs;

	void walk() {
		System.out.println("Mammal walks on " + legs + " legs");
	}
}

class Dog extends Mammal {
	String breed;

	void bark() {
		System.out.println(breed + " barks");
	}

	@Override
	void eat() {
		System.out.println(breed + " eats dog food");
	}
}

class Cat extends Animal {
	void meow() {
		System.out.println("Cat meows");
	}
}

class Elephant extends Animal {
	void trumpet() {
		System.out.println("Elephant trumpets");
	}
}

interface Pet {
	void play();
}

class Parrot extends Animal implements Pet {
	@Override
	public void play() {
		System.out.println("Parrot plays by mimicking sounds");
	}
}

public class Inheritance {
	public static void main(String[] args) {

		// Single inheritance
		Mammal m = new Mammal();
		m.legs = 4;
		m.walk();
		m.eat();

		// Multilevel inheritance
		Dog d = new Dog();
		d.legs = 4;
		d.breed = "Labrador";
		d.eat(); // overridden
		d.sleep(); // from Animal
		d.walk(); // from Mammal
		d.bark(); // from Dog

		// Hierarchical inheritance
		Cat c = new Cat();
		c.eat();
		c.meow();

		Elephant e = new Elephant();
		e.sleep();
		e.trumpet();

		// Hybrid inheritance (via interface)
		Parrot p = new Parrot();
		p.eat();
		p.play();
	}
}
