package ps.day15;

public class BinarySearch {

	public static int searchElement(String array[], String value) {
		int start = 0;
		int end = array.length - 1;

		while (start <= end) {
			int mid = (start + end) / 2;

			if (array[mid].equals(value)) {
				return mid;
			}
			if (array[mid].compareTo(value) < 0) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		String fruits[] = { "apple", "banana", "jack fruit", "lemon", "mango", "orange" };
		String target = "mango";

		int index = searchElement(fruits, target);

		if (index == -1) {
			System.out.println("Element not found");
		} else {
			System.out.println("Element found at index: " + index);
		}
	}

}
