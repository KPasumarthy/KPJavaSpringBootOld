package com.kpjavaspringboot;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class KPJavaInterview {

	public static void main(String[] args) {

		// KP : Debug Print
		System.out.println("KP : KPJavaInterview -  com.kpjavaspringboot : main()");

		// KP : SmallestIntegerInterviewTest
		// SmallestIntegerInterviewTest();

		// KP : addDigits
		// CountAndAddDigitsInANumber();

		// KP : Camel Case Seperartion
		// String[] words = { "is", "valid", "Valid", "right" };
		// String variableName = "isValid";
		// camelCaseSeparationInComplete(words, variableName);

		// KP : Check Palindrome
		isPalindrome("Madam");
		isPalindromeCaseSensitive("Madam", true);

		// KP : Compute Factorial
		int num = 27;
		int result = factorial(num);
		System.out.printf("Factorial of : '%d' = '%d'\n", num, result);

	}

	/*******************************************
	 * Java 8 : Factorial : Recursion
	 *******************************************/
	public static int factorial(int n) {

		int output;
		if (n == 1) {
			return 1;
		}
		// Recursion: Function calling itself!!
		output = factorial(n - 1) * n;
		return output;
	}
	
	/*******************************************
	 * Java 8 : Factorial : Recursion
	 *******************************************/

	/*******************************************
	 * Java 8 : isPalindrome : Check a Variable?
	 *******************************************/
	public static boolean isPalindrome(String str) {

		System.out.printf("Input Variable : '%s' \n", str);

		// Pointers pointing to the beginning
		// and the end of the string
		int i = 0, j = str.length() - 1;

		// While there are characters toc compare
		while (i < j) {

			// If there is a mismatch
			if (str.charAt(i) != str.charAt(j)) {
				System.out.printf("\t Input String : '%s', is NOT a Palindrome !\n", str);
				return false;
			}

			// Increment first pointer and
			// decrement the other
			i++;
			j--;
		}

		System.out.printf("\t Input String : '%s', is A Palindrome !\n", str);
		return true;
	}

	public static boolean isPalindromeCaseSensitive(String str, boolean ignoreCase) {

		System.out.printf("Input Variable : '%s'. Ignore Case : '%b' \n", str, ignoreCase);

		// Pointers pointing to the beginning
		// and the end of the string
		int i = 0, j = str.length() - 1;

		// While there are characters toc compare
		while (i < j) {

			if (ignoreCase == true) {
				// If there is a mismatch : Case Ignored
				if (str.toLowerCase().charAt(i) != str.toLowerCase().charAt(j)) {
					System.out.printf("\t Input String : '%s', is NOT a Palindrome. Case Ignored : '%b' !\n", str,
							ignoreCase);
					return false;
				}
			} else {
				// If there is a mismatch : Case Sensitive
				if (str.charAt(i) != str.charAt(j)) {
					System.out.printf("\t Input String : '%s', is NOT a Palindrome. Case Sensitive !\n", str);
					return false;
				}
			}

			// Increment first pointer and
			// decrement the other
			i++;
			j--;
		}

		System.out.printf("\t Input String : '%s', is A Palindrome !\n", str);
		return true;
	}

	/*******************************************
	 * Java 8 : isPalindrome : Check a Variable?
	 *******************************************/

	/*******************************************
	 * Java 8 : Check a Camel Case Variable?
	 *******************************************/
	public static boolean camelCaseSeparationInComplete(String[] words, String variableName) {

		String myString = "";
		String camelCaseString = "";
		String camelCaseWord = "";
		String[] outputCamelCase = new String[words.length];
		boolean isCamelCase = false;
		int i = 0;

		String word1stLetUpCase = "";
		String wordLowerCase = "";
		Set<String> setLowerCase = new HashSet<String>();
		Set<String> set1stLetUpCase = new HashSet<String>();

		HashMap<String, String> inHashMapWords = new HashMap<String, String>();

		for (String word : words) {

			// KP : Create a HashSet with Words having a First Letter as UpperCase
			word1stLetUpCase = word.substring(0, 1).toUpperCase() + word.substring(1);
			if (set1stLetUpCase.add(word1stLetUpCase) == false) {
				System.out.printf("\t Duplicate 'word' of 'word1stLetUpCase' : %s, %s \n", word, word1stLetUpCase);
			}

			// KP : Create another HashSet with Words having all Letters as LowerCase
			wordLowerCase = word.toLowerCase();
			if (setLowerCase.add(wordLowerCase) == false) {
				System.out.printf("\t Duplicate 'word' of 'word1stLetUpCase' : %s, %s \n", word, word1stLetUpCase);
			}

			// KP : Create a HashMap of Input Array of Words
			inHashMapWords.put(wordLowerCase, word1stLetUpCase);

		}

		System.out.printf("Set of Input Words : '%s' \n", set1stLetUpCase);
		System.out.printf("Set of Input Words : '%s' \n", setLowerCase);
		System.out.printf("HashMap of Input Words : '%s' \n", inHashMapWords);

		for (String low : setLowerCase) {
			System.out.printf("\t Lower Case Word : '%s' \n", low);

			for (String up : set1stLetUpCase) {
				System.out.printf("\t \t 1st Letter Upper Case Word : '%s' \n", up);

				if (!Objects.equals(low, up.toLowerCase())) {
					System.out.printf("\t \t \t Lower Case : '%s', 1st Letter Upper Case Word : '%s' \n", low, up);
					camelCaseString = low + up;

					System.out.printf("Concatenated String 'camelCaseString' : '%s'\n", camelCaseString);

					if (Objects.equals(camelCaseString, variableName)) {
						isCamelCase = true;
						System.out.printf(
								"CamelCase String 'camelCaseString' : '%s', Variable : '%s', isCamelCase : '%b' \n",
								camelCaseString, variableName, isCamelCase);
						break;
					} else {
						isCamelCase = false;
						System.out.printf(
								"CamelCase String 'camelCaseString' : '%s', Variable : '%s', isCamelCase : '%b' \n",
								camelCaseString, variableName, isCamelCase);
					}
				}
			}
		}

		for (String k : inHashMapWords.keySet()) {
			System.out.println("\t Key: " + k + "\t Value: " + inHashMapWords.get(k));
		}

		camelCaseString = camelCaseString + camelCaseWord;

		// myString = myString.concat(word);
		// System.out.printf("Concatenated String 'myString' : '%s'\n", myString);
		// System.out.printf("Concatenated String 'camelCaseString' : '%s'\n",
		// camelCaseString);

		if (Objects.equals(camelCaseString, variableName)) {
			isCamelCase = true;
		} else {
			isCamelCase = false;
		}

		// System.out.printf("Concatenated String 'ccWord' : '%s', variableName : '%s',
		// 'isCamelCase' : '%b' \n",
		// camelCaseString, variableName, isCamelCase);

		i++;

		/*
		 * KP : NOT All Cases Checked - Time Constraint // i = 0; //boolean isCamelCase
		 * = false; for ( String ccWord : outputCamelCase){
		 * 
		 * if( Objects.equals(ccWord, variableName ) ) { isCamelCase = true; }
		 * 
		 * System.out.
		 * printf("Concatenated String 'ccWord' : '%s', variableName : '%s', 'isCamelCase' : '%b' \n"
		 * , ccWord , variableName, isCamelCase);
		 * 
		 * i++; } /* KP : NOT All Cases Checked - Time Constraint //
		 */

		return isCamelCase;
	}

	public static boolean camelCaseSeparationPrevious(String[] words, String variableName) {

		String myString = "";
		String camelCaseString = "";
		String camelCaseWord = "";
		String[] outputCamelCase = new String[words.length];
		boolean isCamelCase = false;
		int i = 0;
		for (String word : words) {

			if (i != 0) {
				camelCaseWord = word.substring(0, 1).toUpperCase() + word.substring(1);
				outputCamelCase[i] = camelCaseWord;
			} else {
				camelCaseWord = word;
				outputCamelCase[i] = camelCaseWord;
			}

			camelCaseString = camelCaseString + camelCaseWord;

			myString = myString.concat(word);
			System.out.printf("Concatenated String 'myString' : '%s'\n", myString);
			System.out.printf("Concatenated String 'camelCaseString' : '%s'\n", camelCaseString);

			if (Objects.equals(camelCaseString, variableName)) {
				isCamelCase = true;
			} else {
				isCamelCase = false;
			}

			System.out.printf("Concatenated String 'ccWord' : '%s', variableName : '%s', 'isCamelCase' : '%b' \n",
					camelCaseString, variableName, isCamelCase);

			i++;
		}

		/*
		 * KP : NOT All Cases Checked - Time Constraint // i = 0; //boolean isCamelCase
		 * = false; for ( String ccWord : outputCamelCase){
		 * 
		 * if( Objects.equals(ccWord, variableName ) ) { isCamelCase = true; }
		 * 
		 * System.out.
		 * printf("Concatenated String 'ccWord' : '%s', variableName : '%s', 'isCamelCase' : '%b' \n"
		 * , ccWord , variableName, isCamelCase);
		 * 
		 * i++; } /* KP : NOT All Cases Checked - Time Constraint //
		 */

		return isCamelCase;
	}

	/*******************************************
	 * Java 8 : Check a Camel Case Variable?
	 *******************************************/

	/*******************************************
	 * Java 8 : Add Digits in an Integer Number
	 *******************************************/

	public static void CountAndAddDigitsInANumber() {

		/************************************
		 * Java 8 : Count Number of Digits and Return the Sum : Modulus '%' Operator
		 *****************************************/

		/***
		 * 
		 * Write a function: KP : Count Number of Digits and Return the Sum?
		 * 
		 ***/

		System.out.println("KP : Count Number of Digits and Return the Sum?");
		int num = 987654321;
		int count = numberOfDigits(num);
		int sum = addDigits(num);
		System.out.printf("\t Count & Sum of All Digitis inside the Number : '%d'. Count : '%d', Sum : '%d' \n", num,
				count, sum);

	}

	public static int numberOfDigits(int num) {
		/// KP : Count Number of Digits in an Number Operator - - Algorithm To Extract
		/// Individual Digits
		int count = 0;
		// num = 3452;

		while (num != 0) {
			// num = num/10
			num /= 10;
			++count;
		}
		return count;
	}

	public static int addDigits(int num) {

		int rem, sum = 0;
		while (num != 0) {

			rem = num % 10; // KP : 'rem' is the Remainder after the 'num' Modulus Operation.

			// Sum = sum + rem;
			sum += rem;
			System.out.printf(
					"KP : KPJavaInterview - addDigits() - num : '%d', sum : '%d',  Individual Digits 'rem' : '%d' \n",
					num, sum, rem);

			// num = num /10;
			num /= 10;
		}

		return sum;
	}

	/*******************************************
	 * Java 8 : Add Digits in an Integer Number
	 *******************************************/

	/************************************
	 * Java 8 : Arrays - Duplicates & Smallest Integers Solution
	 *****************************************/
	public static void SmallestIntegerInterviewTest() {

		/************************************
		 * Java 8 : Arrays - Duplicates & Smallest Integers Solution
		 *****************************************/

		/***
		 * 
		 * Write a function:
		 * 
		 * class Solution { public int solution(int[] A); } that, given an array A of N
		 * integers, returns the smallest positive integer (greater than 0) that does
		 * not occur in A.
		 * 
		 * For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
		 * Given A = [1, 2, 3], the function should return 4. Given A = [−1, −3], the
		 * function should return 1.
		 * 
		 * Write an efficient algorithm for the following assumptions: N is an integer
		 * within the range [1..100,000]; each element of array A is an integer within
		 * the range [−1,000,000..1,000,000]. /
		 ***/

		/// KP : Input Array
		// int[] A = { 1, 3, 6, 4, 1, 2, 2 };
		// int[] A = { 1, 2, 3 };
		// int[] A = { -7, -11, -3 };
		int[] A = { -7, -11, -3, 1, 3, 0, 0, 0, 9, 7, 8, 6, 4, 1, 2, 2, -100, 90, 98, 625 };

		/// KP : Get Duplicates Array
		int[] dup = getDuplicateInteger(A);
		System.out.println("KP : KPJavaInterview - com.kpjavaspringboot : Duplicate Array : " + dup);

		/// KP : Get Unique Non-Duplicates Array
		int[] uniquNonDup = getUniqueNonDuplicateArray(A);
		System.out.println("KP : KPJavaInterview - com.kpjavaspringboot : Unique Non-Duplicate Array : " + uniquNonDup);

		int val = getSmallestPositiveInteger(A);
		System.out.println("KP : KPJavaInterview -  com.kpjavaspringboot : Smallest Positive Integer : " + val);

	}

	public static int getSmallestPositiveInteger(int[] A) {

		//// KP : First Sort an Array
		Arrays.sort(A);
		System.out.printf("\t Sorted Array A[] : %s \n", Arrays.toString(A));

		//// KP : Create a Set
		int j = 0;
		Set<Integer> set = new HashSet<Integer>();
		for (int a : A) {
			if (set.add(a) == false) {
				// // your duplicate element
				// System.out.printf("\t Duplicate Value of 'a' : %d \n", a);
			} else {
				// System.out.printf("\t Value of 'a' : %d, 'j' : %d \n", a, j);

				if (a > 0) {

					j++;
				}

				System.out.printf("\t (1) Value of 'a' : %d, 'j' : %d \n", a, j);

				if (a > j) {

					return j;
				} else {
					if (a == A[A.length - 1]) {
						j++;
						System.out.printf("\t (2) Value of 'a' : %d, 'j' : %d \n", a, j);
						return j;
					}
				}
			}
		}

		return j++;
	}

	public static int[] getDuplicateInteger(int[] A) {

		System.out.println("KP : KPJavaInterview -  com.kpjavaspringboot : getDuplicateInteger(int[] A)");

		// KP : First Sort an Array
		Arrays.sort(A);
		System.out.printf("\t Sorted Array A[] : %s \n", Arrays.toString(A));

		// KP : Find Duplicate
		Set<Integer> set = new HashSet<Integer>();
		Set<Integer> dup = new HashSet<Integer>();
		Set<Integer> noDup = new HashSet<Integer>();
		for (int a : A) {
			if (set.add(a) == false) {
				// // your duplicate element
				System.out.printf("\t Duplicate Value of 'a' : %d \n", a);
				dup.add(a);
			} else {
				System.out.printf("\t Unique : NOT A Duplicate Value of 'a' : %d \n", a);
				noDup.add(a);
			}

			System.out.printf("\t Value of 'a' : %d \n", a);

		}

		//// Creating an empty integer array of No Duplicates
		int[] uniqueArr = new int[noDup.size()];
		int k = 0;
		System.out.printf("\t Array of Unique Non-Duplicate Values : [");
		for (int i : noDup) {
			uniqueArr[k++] = i;
			System.out.printf("%d, ", i);
		}
		System.out.printf("]\n");
		Arrays.sort(uniqueArr);
		System.out.printf("\t Sorted Array Unique[] : %s \n", Arrays.toString(uniqueArr));

		//// Creating an empty integer array
		int[] dupArr = new int[dup.size()];
		// Converting Set object to integer array
		int j = 0;
		System.out.printf("\t Array of Duplicate Values : [");
		for (int i : dup) {
			dupArr[j++] = i;
			System.out.printf("%d, ", i);
		}
		System.out.printf("]\n");

		return dupArr;
	}

	public static int[] getUniqueNonDuplicateArray(int[] A) {

		System.out.println("KP : KPJavaInterview -  com.kpjavaspringboot : getDuplicateInteger(int[] A)");

		// KP : First Sort an Array
		Arrays.sort(A);
		System.out.printf("\t Sorted Array A[] : %s \n", Arrays.toString(A));

		// KP : Find Duplicate
		Set<Integer> set = new HashSet<Integer>();
		Set<Integer> dup = new HashSet<Integer>();
		Set<Integer> noDup = new HashSet<Integer>();
		for (int a : A) {
			if (set.add(a) == false) {
				// // your duplicate element
				System.out.printf("\t Duplicate Value of 'a' : %d \n", a);
				dup.add(a);
			} else {
				System.out.printf("\t Unique : NOT A Duplicate Value of 'a' : %d \n", a);
				noDup.add(a);
			}

			System.out.printf("\t Value of 'a' : %d \n", a);

		}

		//// Creating an empty integer array of No Duplicates
		int[] uniqueArr = new int[noDup.size()];
		int k = 0;
		System.out.printf("\t Array of Unique Non-Duplicate Values : [");
		for (int i : noDup) {
			uniqueArr[k++] = i;
			System.out.printf("%d, ", i);
		}
		System.out.printf("]\n");
		Arrays.sort(uniqueArr);
		System.out.printf("\t Sorted Array Unique[] : %s \n", Arrays.toString(uniqueArr));

		//// Creating an empty integer array
		int[] dupArr = new int[dup.size()];
		// Converting Set object to integer array
		int j = 0;
		System.out.printf("\t Array of Duplicate Values : [");
		for (int i : dup) {
			dupArr[j++] = i;
			System.out.printf("%d, ", i);
		}
		System.out.printf("]\n");

		return uniqueArr;
	}

	/************************************
	 * Java 8 : Arrays - Duplicates & Smallest Integers Solution
	 *****************************************/

	/***
	 * 
	 * //KP : Smallest Integer //SmallestIntegerInterviewTest();
	 * 
	 * //KP : Interview Test : https://app.codility.com/c/run/demoPXAFZU-G2Y/
	 * //String S = "ab"; //int[] C = {1,3};
	 * 
	 * //KP : Return : 2 String S = "abccbd"; int[] C = {0,1,2,3,4,5};
	 * 
	 * ////KP : Return : 3 //String S = "aabbcc"; //int[] C = {1,2,1,2,1,2};
	 * 
	 * ////KP : Return : 3+4+5 = 12 //String S = "aaaa"; //int[] C = {3,4,5,6};
	 * 
	 * ////KP : Return : 0 //String S = "ababa"; //int[] C = {10,5,10,5,10};
	 * 
	 * //Input String S String[] arrS = S.split("");
	 * 
	 * // KP : Find Duplicate Set<String> setIn = new HashSet<String>();
	 * Set<Integer> set = new HashSet<Integer>(); Set<Integer> dup = new
	 * HashSet<Integer>();
	 * 
	 * String f = ""; int i = 0; int del = 0; for (String s : arrS) {
	 * 
	 * //KP : Init if (f == "") { f = s; }
	 * 
	 * if ( f == s) { del = i; } else { f = ""; }
	 * 
	 * //if (setIn.add(s) == false) { // // your duplicate element //
	 * System.out.printf("\t Duplicate Value of 'a' : %d \n", a); // dup.add(a); //}
	 * 
	 * System.out.printf("\t Value of 'i' : %d, 'del' : %d, 's' : %s, 'f' : %s \n",
	 * i, del, s, f); i++;
	 * 
	 * }
	 * 
	 */

	/*
	 * 
	 * 
	 * public static int addTwoDigits(int num) {
	 * 
	 * ///KP : Mod Operator - Extract Individual Digits : Steps //int u = num%10;
	 * int u = ( ( ( num - 0 ) / 1) %10 ); int t = ( ( ( num - u ) / 10) % 10 ) %
	 * 10; int h = ( ( ( num - t ) / 100) % 100 ) % 10; int th = ( ( ( num - h ) /
	 * 1000) % 1000 ) % 10; int tt = ( ( ( num - th ) / 10000) % 10000 ) % 10; int m
	 * = ( ( ( num - tt ) / 100000) % 100000 ) % 10;
	 * 
	 * // KP : Debug Print System.out.
	 * printf("KP : KPJavaInterview - addTwoDigits() - num : '%d', u : '%d, t : '%d', h : '%d', th : %d,  tt : %d, m : %d \n"
	 * , num, u, t, h, th, tt, m);
	 * 
	 * 
	 * ///KP : Mod Operator - - Algorithm To Extract Individual Digits int tmp = ( (
	 * ( num - 0 ) / 1) ) %10; int count = 0; int n = num; int r = 0;
	 * 
	 * while (n != 0) {
	 * 
	 * 
	 * //tmp = num; // num = num/10; r = n%10; System.out.
	 * printf("KP : KPJavaInterview - addTwoDigits() - n : '%d', r : '%d', num : '%d', count : '%d',  Individual Digits 'tmp' : '%d' \n"
	 * , n, r, num, count, tmp);
	 * 
	 * n /= 10; ++count; }
	 * 
	 * 
	 * int sum = 0; return sum; }
	 * 
	 */

}
