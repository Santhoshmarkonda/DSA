package ps.day20;

public class SearchInSortedArray {

	public static void searchElement(int matrix[][], int key) {
		int row = 0;
		int col = matrix[0].length - 1;
		while (row < matrix.length && col >= 0) {
			if (matrix[row][col] == key) {
				System.out.println("key found at (" + row + ", " + col + ")");
				break;
			} else if (matrix[row][col] < key) {
				row++;
			} else {
				col--;
			}

		}
	}

	public static void main(String[] args) {
		int matrix[][] = { 
				{ 10, 20, 30, 40 }, 
				{ 15, 25, 25, 45 }, 
				{ 27, 29, 37, 48 }, 
				{ 32, 33, 39, 50 } 
				};
		int key = 33;
		searchElement(matrix, key);
	}

}

// Time Complexity: O(n+m)
