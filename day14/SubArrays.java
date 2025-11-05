package ps.day14;

public class SubArrays {

	public static void getSubArrays(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				for (int k = i; k <= j; k++) {
					System.out.print(arr[k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int array[] = { 2, 4, 6, 8, 10 };
		getSubArrays(array);
	}

}
