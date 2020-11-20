package com.kpjavaspringboot.interview;

public class KPJavaPermute {

	public static void main(String args[]) {
		System.out.println("KP : KPJavaInterview : Hello, world : Permute a String!");

		// KP : Java 8 : All Permutations of a Java String
		String str = "ABCDEF"; ///"XYZ"
		allStringPermute(str);
		// KP : Java 8 : All Permutations of a Java String
	}

	/*******************************************
	 * Java 8 : All Permutations of a Java String
	 *******************************************/

	// Java program to print all permutations of a
	// given string.
	public static void allStringPermute(String str) {

		// String str = "XYZ";
		int n = str.length();
		permute(str, 0, n - 1);
	}

	/**
	 * permutation function
	 * 
	 * @param str string to calculate permutation for
	 * @param l   starting index
	 * @param r   end index
	 */
	private static void permute(String str, int l, int r) {
		if (l == r)
			System.out.println(str);
		else {
			for (int i = l; i <= r; i++) {
				str = swap(str, l, i);
				permute(str, l + 1, r);
				str = swap(str, l, i);
			}
		}
	}

	/**
	 * Swap Characters at position
	 * 
	 * @param a string value
	 * @param i position 1
	 * @param j position 2
	 * @return swapped string
	 */
	public static String swap(String a, int i, int j) {
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

	/*******************************************
	 * Java 8 : All Permutations of a Java String
	 *******************************************/
}
