package ps.day26;

class Employee {
	private int id;
	private String name;

	public Employee(int id, String name) { // Normal Constructor
		this.id = id;
		this.name = name; // shallow copy
	}

	public Employee(Employee e) { // Copy Constructor
		this.id = e.id;
		this.name = e.name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "[Employee: " + id + " " + name + " ]";
	}
}

public class CopyConstructor {
	public static void main(String[] args) {
		Employee E1 = new Employee(1, "Santhosh");
		Employee E2 = new Employee(E1); // Deep Copy

		System.out.println(E1);
		System.out.println(E2);

	}
}
