package ps.day26;

class Student {

	private String name;
	private int rollNo;

	Student(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRollNO(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public int getRollNo() {
		return rollNo;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + "]";
	}

}

public class Encapsulation {
	public static void main(String[] args) {
		Student s1 = new Student("Santhosh", 1);
		System.out.println(s1);
	}
}
