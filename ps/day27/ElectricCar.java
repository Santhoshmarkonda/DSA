package ps.day27;

class Automobile {
	@SuppressWarnings("unused")
	private String drive() {
		return "Driving vehicle";
	}
}

class Car extends Automobile {

	protected String drive() {
		return "Driving car";
	}

}

public class ElectricCar extends Car {
	@Override
	public String drive() {
		return "Driving electric car";
	}

	public static void main(String[] wheels) {
		Car car = new ElectricCar();
		System.out.print(car.drive());
	}
}