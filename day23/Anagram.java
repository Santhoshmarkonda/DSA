package ps.day23;

import java.util.Arrays;

public class Anagram {

	public static boolean isAnagram(String s1, String s2) {

		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();

		if (s1.length() != s2.length()) {
			return false;
		}

		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		return Arrays.equals(ch1, ch2);
	}

	public static void main(String[] args) {
		String str1 = "race";
		String str2 = "care";
		System.out.println("Is anagram? " + isAnagram(str1, str2));
	}
}
