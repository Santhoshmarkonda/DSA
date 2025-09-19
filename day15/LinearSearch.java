package ps.day15;

public class LinearSearch {

	public static int searchElement(String arr[], String target) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		String array[] = { "dosa", "chole bhature", "idly", "poori", "samosa" };
		String target = "idly";
		int index = searchElement(array, target);

		if (index == -1) {
			System.out.println("Element Not Found");
		} else {
			System.out.println("Element found at index: " + index);
		}

	}

}
