package ps.day26;

class Pen {
	String colour;
	int tip;

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getTip() {
		return tip;
	}

	public void setTip(int tip) {
		this.tip = tip;
	}
}

class Bank {
	public String userName;
	private String password;

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}
}

public class OOPS {

	public static void main(String[] args) {
		Pen p1 = new Pen();
		p1.setColour("Blue");
		System.out.println(p1.getColour());
		p1.setTip(5);
		System.out.println(p1.getTip());
		// set manually
		p1.colour = "yellow";
		System.out.println(p1.getColour());
	}

}
