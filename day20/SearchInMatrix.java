package ps.day20;

public class SearchInMatrix {

	public static boolean search(int arr[][], int target) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] == target) {
					System.out.println("Element found at position: (" + i + ", " + j + ")");
					return true; 
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[][] matrix = { 
				{ 1, 2, 3 }, 
				{ 4, 5, 6 }, 
				{ 7, 8, 9 } 
				};
		int target = 5;
		if (!search(matrix, target)) {
			System.out.println("Element Not found");
		}
	}

}

// Time Complexity: O(n^2)