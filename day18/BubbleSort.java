package ps.day18;

public class BubbleSort {

	public static void bubbleSort(int array[]) {
		for (int turn = 0; turn < array.length - 1; turn++) {
			for (int j = 0; j < array.length - turn - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int nums[] = { 5, 4, 1, 3, 2 };
		bubbleSort(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}

}
