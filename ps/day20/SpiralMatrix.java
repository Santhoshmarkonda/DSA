package ps.day20;

public class SpiralMatrix {

	public static void printSpiralMatrix(int[][] matrix) {
		int top = 0;
		int left = 0;
		int bottom = matrix.length - 1;
		int right = matrix[0].length - 1;

		while (top <= bottom && left <= right) {
			// top
			for (int i = left; i <= right; i++) {
				System.out.print(matrix[top][i] + " ");
			}
			top++;

			// right
			for (int j = top; j <= bottom; j++) {
				System.out.print(matrix[j][right] + " ");
			}
			right--;

			// bottom
			if (top <= bottom) {
				for (int i = right; i >= left; i--) {
					System.out.print(matrix[bottom][i] + " ");
				}
				bottom--;
			}

			// left
			if (left <= right) {
				for (int j = bottom; j >= top; j--) {
					System.out.print(matrix[j][left] + " ");
				}
				left++;
			}

		}
	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		printSpiralMatrix(matrix);
	}

}

// Time Complexity: O(n^2)
