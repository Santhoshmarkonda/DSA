package ps.day19;

public class Sorting {

	public static void countingSort(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int num : arr) {
			max = Math.max(max, num);
		}

		int[] count = new int[max + 1];

		for (int num : arr) {
			count[num]++;
		}

		int j = 0;
		for (int i = 0; i < count.length; i++) {
			while (count[i] > 0) {
				arr[j] = i;
				j++;
				count[i]--;
			}
		}
	}

	public static void insertionSort(int[] arr) {
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

	public static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int minPos = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minPos]) {
					minPos = j;
				}
			}
			int temp = arr[minPos];
			arr[minPos] = arr[i];
			arr[i] = temp;
		}
	}

	public static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] nums = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
		bubbleSort(nums);
		printArray(nums);
		selectionSort(nums);
		printArray(nums);
		insertionSort(nums);
		printArray(nums);
		countingSort(nums);
		printArray(nums);
	}
}
