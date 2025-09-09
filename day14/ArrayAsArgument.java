package ps.day14;

public class ArrayAsArgument {

	public static void update(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] + 1;
		}
	}

	public static void main(String[] args) {
		int array[] = { 0, 2, 4, 6, 8, 10, 12, 14 };
		update(array);

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
