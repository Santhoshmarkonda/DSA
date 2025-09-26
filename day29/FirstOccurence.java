package ps.day29;

public class FirstOccurence {

	public static int firstOcc(int[] arr, int key, int i) {
		if (i == arr.length) {
			return -1;
		}

		if (arr[i] == key) {
			return i;
		}

		return firstOcc(arr, key, i + 1);
	}

	public static void main(String[] args) {
		int[] nums = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };
		int key = 5;
		System.out.println(firstOcc(nums, key, 0));
	}

}
