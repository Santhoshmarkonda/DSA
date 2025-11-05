package ps.day22;

public class ShortestPath {

	public static double getShortestPath(String str) {
		int x = 0;
		int y = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'N') {
				y++;
			} else if (ch == 'S') {
				y--;
			} else if (ch == 'E') {
				x++;
			} else {
				x--;
			}
		}

		int x2 = x * x;
		int y2 = y * y;

		return Math.sqrt(x2 + y2);
	}

	public static void main(String[] args) {
		String str = "WNEENESENNN";
		System.out.println("The shortest path is: " + getShortestPath(str));
	}

}

// Time Complexity: O(n)
