package ps.day14;

public class LinearSearchAlgorithm {

	public static int searchElement(int arr[], int target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int array[] = { 97, 56, 78, 90, 23, 45, 67, 88 };
		int target = 67;
		int index = searchElement(array, target);
		if (index == -1) {
			System.out.println("Element not Found");
		} else {
			System.out.println("Element found at index: " + index);
		}
	}

}
