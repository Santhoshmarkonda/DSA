package ps.day14;

public class BinarySearchAlgorithm {

	public static int searchElement(int arr[], int target) {

		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;

			if (arr[mid] == target) {
				return mid;
			}

			if (arr[mid] < target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int array[] = { 2, 4, 6, 8, 10, 12, 14 };
		int target = 16;
		int index = searchElement(array, target);

		if (index == -1) {
			System.out.println("Element Not Found");
		} else {
			System.out.println("Element sound at index: " + index);
		}
	}

}
