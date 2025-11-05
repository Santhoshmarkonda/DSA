package ps.day18;

public class InsertionSort {

	public static void insertionSort(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			int current = arr[i];
			int prev = i - 1;

			while (prev >= 0 && arr[prev] > current) {
				arr[prev + 1] = arr[prev];
				prev--;
			}

			arr[prev + 1] = current;
		}
	}

	public static void main(String[] args) {
		int nums[] = { 5, 4, 1, 3, 2 };
		insertionSort(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}

}
