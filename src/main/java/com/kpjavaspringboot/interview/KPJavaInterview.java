package com.kpjavaspringboot.interview;

import java.util.*;

public class KPJavaInterview {

	public static void main(String[] args) {

		// KP : Debug Print
		System.out.println("KP : KPJavaInterview - com.kpjavaspringboot : main()");

		System.out.println("KP : KPJavaInterview - com.kpjavaspringboot : main()");

		//kptcsMinCoin.minCoin();


		//		////Java Strings  : Immutable
		//		String s1 = "Scott";
		//		String s2 = "Smith";
		//		s1 = s1 + s2;
		//		System.out.println("KP : Java Strings Immutable : Value-Based 's1' : " + s1);
		//
		//		String s3 = new String("Chubb");
		//		System.out.println("KP : Java Strings Immutable : Reference-Based 's3' : " + s3);
		//
		//
		//		////Java Data-Types int & Strings  : Immutable
		//		System.out.println("KP : Java Data-Types int & Strings ' : " + 10 + 20);
		//		System.out.println(10 + 20 + "KP : Java Data-Types int & Strings ' : " + 10 + 20) ;
		//		System.out.println(10 + 20 + "KP : Java Data-Types int & Strings ' : " + 10 + 20 + 'a' + "bcd") ;


		// Lottery
		//lotteryCoupons(12);
		// lotteryCoupons(22);
		// addDigits(3415);

		// Java 8 : All Permutations of a Java String
		String str = "ABCDEF";
		allStringPermute(str);
		// Java 8 : All Permutations of a Java String

		// Java 8 : Print Even & Odd Numbers
		printOddsNEvens(0, 100);
		// Java 8 : Print Even & Odd Numbers

		// Java 8 : Find a Number in an Array
		int[] A = { 1, 3, 2, 4, 2, 2, 4, 5, 6, 7, 2, 3, 1, 1, 3, 3, 2 };
		findANumber(2, A);
		// Java 8 : Find a Number in an Array
	}

	/*******************************************
	 * Java 8 : Find a Number in an Array
	 ********************************************/

	// Java program to find a number in an array
	public static boolean findANumber(int n, int[] A) {

		System.out.println("KP : KPJavaInterview - findANumber()");
		for (int a : A) {
			if (n == a) {
				System.out.printf("\t Number %d found in Array : " + Arrays.toString(A), n);
				return true;
			}
		}

		return false;

	}

	/*******************************************
	 * Java 8 : Find a Number in an Array
	 ********************************************/

	/*******************************************
	 * Java 8 : Print Even & Odd Numbers
	 ********************************************/

	// Java program to print all Odd and Even
	public static void printOddsNEvens(int l, int r) {

		System.out.println("KP : KPJavaInterview - printOddsNEvens()");
		int n = l;
		while (n <= r) {
			if (n == 0) {
				System.out.println("\t Composite Neither Even Nor Odd : " + n);
			} else {
				if (n % 2 == 0)
					System.out.println("\t Even : " + n);

				if (n % 2 != 0)
					System.out.println("\t Odd  : " + n);
			}

			n++;
		}

	}

	/*******************************************
	 * Java 8 : Print Even & Odd Numbers
	 ********************************************/


	/*******************************************
	 * Java 8 : Print Bubble Sort
	 ********************************************/

	public static void BubbleSortAlgorithm() {
		System.out.println("KP : Test - BubbleSort() ");

		/*
		 * 
		 * Create a function that takes integer array as input and returns integer
		 * array. Inside the function it requires to rearrange the array elements in
		 * such a way that all the positives and zeros are moves to left and negatives
		 * are moved to right. This is NOT sorting. Maintain the order of positives and
		 * negatives in the same order it is given.
		 * 
		 * For example: Input: [5, 3, -3, -4, 0, 2, -1, 4, -7, 2] Output: [5, 3, 0, 2,
		 * 4, 2, -3, -4, -1, -7]
		 * 
		 * 
		 */

		// int[] Input = {5, 3, -3, -4, 0, 2, -1, 4, -7, 2};
		// int[] Output = {5, 3, 0, 2, 4, 2, -3, -4, -1, -7};

		int[] Input = { 5, 3, -3, -4, 0, 2, -1, 4, -7, 2 };
		bubbleSort(Input);
		System.out.println("\t KP : Bubble Sorted Array : " + Arrays.toString(Input));

	}

	// An optimized version of Bubble Sort
	public static void bubbleSort(int arr[]) {

		int n = arr.length;

		int i, j, temp;
		boolean swapped;
		for (i = 0; i < n - 1; i++) {
			swapped = false;
			for (j = 0; j < n - i - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					// swap arr[j] and arr[j+1]
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}

			// IF no two elements were
			// swapped by inner loop, then break
			if (swapped == false)
				break;
		}
	}



	/*******************************************
	 * Java 8 : Print Bubble Sort
	 ********************************************/

	/*******************************************
	 * Java 8 : All Permutations of a Java String
	 *******************************************/

	// Java program to print all permutations of a
	// given string.
	public static void allStringPermute(String str) {

		System.out.println("KP : KPJavaInterview - allStringPermutes() : " + str);

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
			System.out.println("\t" + str);
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

	/*******************************************
	 * Java 8 : Lottery Coupons
	 *******************************************/
	/*
	 * Lottery Coupons There is a lottery with n coupons and n people take part in
	 * it. Each person picks exactly one coupon. Coupons are numbered consequetively
	 * from 1 to n, n being the maximum ticket number. The winner of the lottery is
	 * any person who owns a coupon where the sum of the digits on the coupon is
	 * equal to x. If there are multiple winners, the prize is split equally among
	 * them. Determine how many values of the s there are where there is at least
	 * one winner and the prize is split among most people Example n = 12 The list
	 * of coupon numbers generated from 1 to n is [1,2,3,4,5,6,7,8,9,10,11,12]. The
	 * sums of the digits are [1,2,3,4,5,6,7,8,9,1,2,3]. The largest number of
	 * winners is 2. The maximum number of possible winners occurs for any of these
	 * 3 possible values of s, so 3 is the answer. Complete the function
	 * lotteryCoupons in the editor below. The function must return the number of
	 * ways to choose s such a way that there is at least one winner and the prize
	 * is split among the greatest number of people. 'lotteryCoupons' has the
	 * following parameter(s): n: an integer that represents the maximum coupon
	 * number 1 <= n <= 10^4
	 */
	/*
	 * Complete the 'lotteryCoupons' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts INTEGER n
	 * as parameter.
	 */

	public static int lotteryCoupons(int n) {
		// Write your code here

		int[] A = new int[n];
		/// KP : Build an Integer Array with a length of 'n'
		int i = 0;
		while (i < n) {
			A[i] = i + 1;
			// System.out.printf("\t Integer Array A[%d] : %d \n", i, A[i] );

			i++;
		}

		System.out.printf("\t Integer Array A[] : %s \n", Arrays.toString(A));

		/// KP : Compute the Sum of all Individual Digits inside a Number
		int[] Sum = new int[n];
		i = 0;
		while (i < n) {
			int val = addDigitsInNum(A[i]);

			if (val >= 10)
				val = addDigitsInNum(val);

			Sum[i] = val;
			// System.out.printf("\t Integer Sum Array Sum[%d] : %d \n", i, Sum[i] );
			i++;
		}

		System.out.printf("\t SummedUp Array Sum[] : %s \n", Arrays.toString(Sum));

		// Get Duplicates
		// int dup[] = getDuplicateInteger(Sum);
		// System.out.printf("\t Duplicates Array A[] : %s, Number of Duplicates : %d
		// \n", Arrays.toString(dup), dup.length );

		// Get Maximun Occcurances of Duplicates
		// int maxOcc[] = getMaxOccuranceIntegers(Sum);
		HashMap maxOccMap = (HashMap) getMaxOccIntArr(Sum);
		// System.out.printf("\t Maximum Occurances Array A[] : %s, Number of Maximum
		// Occurances : %d \n", Arrays.toString(maxOcc), maxOcc.length );

		// int win = getTop3ElementsInArray(dup);
		// System.out.printf("\t Number of Winners : %d \n", win );
		// return win;
		// return maxOcc.length;
		return 0;

	}

	public static HashMap getMaxOccIntArr(int[] A) {

		System.out.println("KP : KPJavaInterview -  com.kpjavaspringboot : getMaxOccIntArr(int[] A)");

		// KP : First Sort an Array
		// Arrays.sort(A);
		// System.out.printf("\t Sorted Array A[] : %s \n", Arrays.toString(A));

		//// KP : First Sort an Array
		// Arrays.sort(A);
		// System.out.printf("\t Sorted Array A[] : %s \n", Arrays.toString(A));
		System.out.printf("Hash Map of Array A[] : %s \n", Arrays.toString(A));

		//// KP : Create a Hash Map
		int i = 0, j = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		// HashMap<Integer, Integer> mapMaxOcc = new HashMap<Integer, Integer>();
		// HashMap<Integer, Integer> mapIndex = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> mapMaxOcc = new HashMap<Integer, Integer>();
		HashMap<Integer, HashMap<Integer, Integer>> mapIndex = new HashMap<Integer, HashMap<Integer, Integer>>();
		// HashMap<Integer, Map.Entry<Integer, Integer>> mapIndex = new HashMap<Integer,
		// Map.Entry<Integer, Integer>>();

		// KP : 2D Integer Array to hold
		int[][] intMaxOcc = new int[2][A.length];

		for (int a : A) {
			j = 0;
			if (map.containsKey(a)) {
				j = map.get(a);
				map.put(a, ++j);
				intMaxOcc[0][i] = a;
				intMaxOcc[1][i] = i + 1;
				System.out.printf("\t (B) Value of 'a' : %d, 'j' : %d \n", a, j);
			} else {
				map.put(a, ++j);
				intMaxOcc[0][i] = a;
				intMaxOcc[1][i] = i + 1;
				System.out.printf("\t (A) Value of 'a' : %d, 'j' : %d \n", a, j);
			}

			// Check if the length
			// if (++i == A.length);
			i++;
		}

		// Print 2D Array
		int l = 0, m = 0;
		i = 0;
		j = 0;
		System.out.println("\t Print 2D Array : ");
		System.out.println("\t [");
		for (l = 0; l < intMaxOcc.length; l++) {
			for (m = 0; m < intMaxOcc[l].length; m++) {
				System.out.printf("\t intMaxOcc[%d][%d] : %d \n", l, m, intMaxOcc[l][m]);
				int a = intMaxOcc[l][m];
				if (mapMaxOcc.containsKey(a)) {
					j = mapMaxOcc.get(a);
					mapMaxOcc.put(a, j + 1);
					intMaxOcc[0][l] = a;
					intMaxOcc[1][l] = l + 1;

					// KP : Creating an Index
					HashMap<Integer, Integer> tmp = new HashMap<Integer, Integer>();
					tmp.put(a, j + 1);
					Map.Entry<Integer, Integer> meTmp = null;
					mapIndex.put(m + 1, tmp);

					System.out.printf("\t (B) Value of 'a' : %d, 'l' : %d, 'm' : %d \n", a, l, m);
				} else {
					mapMaxOcc.put(a, j + 1);
					intMaxOcc[0][m] = a;
					intMaxOcc[1][m] = m + 1;

					// KP : Creating an Index
					HashMap<Integer, Integer> tmp = new HashMap<Integer, Integer>();
					tmp.put(a, j + 1);
					mapIndex.put(m + 1, tmp);

					System.out.printf("\t (A) Value of 'a' : %d, 'l' : %d, 'm' : %d \n", a, l, m);
				}

			}
		}
		System.out.println("\t ]");

		System.out.println("\t HashMap Before Sorting:");
		// int[] arrMax = null;
		HashMap<Integer, Integer> mapMax2D = new HashMap<Integer, Integer>();
		Map.Entry<Integer, Integer> maxEntry2D = null;
		Set setMax2D = new HashSet<Integer>();
		Set setHM2D = mapMaxOcc.entrySet();
		Iterator iterator2D = setHM2D.iterator();
		i = 0;
		while (iterator2D.hasNext()) {
			Map.Entry entry2D = (Map.Entry) iterator2D.next();
			System.out.println("\t Entry : " + entry2D.getKey() + ": " + entry2D.getValue());
			// System.out.println(entry2D.getValue());
			if (maxEntry2D == null || ((Integer) entry2D.getValue()).compareTo(maxEntry2D.getValue()) >= 0) {
				maxEntry2D = entry2D;
				setMax2D.add(maxEntry2D.getKey());
				mapMax2D.put(maxEntry2D.getKey(), maxEntry2D.getValue());
				System.out.println("\t MaxEntry : " + maxEntry2D.getKey() + ": " + maxEntry2D.getValue());
			}

		}

		System.out.println("\t HashMap Before Sorting:");
		// int[] arrMax = null;
		HashMap<Integer, Integer> mapMax = new HashMap<Integer, Integer>();
		Map.Entry<Integer, Integer> maxEntry = null;
		Set setMax = new HashSet<Integer>();
		Set setHM = map.entrySet();
		Iterator iterator = setHM.iterator();
		i = 0;
		while (iterator.hasNext()) {
			Map.Entry entry = (Map.Entry) iterator.next();
			System.out.println("\t Entry : " + entry.getKey() + ": " + entry.getValue());
			// System.out.println(entry.getValue());
			if (maxEntry == null || ((Integer) entry.getValue()).compareTo(maxEntry.getValue()) >= 0) {
				maxEntry = entry;
				setMax.add(maxEntry.getKey());
				mapMax.put(maxEntry.getKey(), maxEntry.getValue());
				System.out.println("\t MaxEntry : " + maxEntry.getKey() + ": " + maxEntry.getValue());
			}

		}

		// Covert MaxOccurences Set to an Array
		// Integer[] arrMax = new Integer[setMax.size()];
		// set.toArray(arrMax);
		int[] intArrMax = new int[setMax.size()];
		// intArrMax = Arrays.stream(arrMax).mapToInt(Integer::intValue).toArray();
		// System.out.printf("\t Maximum Occurences Array A[] : %s \n",
		// Arrays.toString(arrMax));
		System.out.printf("\t Maximum Occurences SetMax : %s \n", setMax.toString());
		i = 0;
		for (Iterator<Integer> it = setMax.iterator(); it.hasNext();) {
			Integer f = it.next();
			System.out.println("\t SetMaxIterator : " + f.intValue());
			intArrMax[i] = f.intValue();
			i++;
		}

		System.out.printf("\t Maximum Occurences Array Max : %s \n", Arrays.toString(intArrMax));

		// return new int[0];
		return map;
	}

	public static int[] getMaxOccuranceIntegers(int[] A) {

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

		//// KP : First Sort an Array
		// Arrays.sort(A);
		// System.out.printf("\t Sorted Array A[] : %s \n", Arrays.toString(A));
		System.out.printf("Hash Map of Array A[] : %s \n", Arrays.toString(A));

		//// KP : Create a Hash Map
		int i = 0, j = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int a : A) {
			j = 0;
			if (map.containsKey(a)) {
				j = map.get(a);
				map.put(a, ++j);
				System.out.printf("\t (B) Value of 'a' : %d, 'j' : %d \n", a, j);
			} else {
				map.put(a, ++j);
				System.out.printf("\t (A) Value of 'a' : %d, 'j' : %d \n", a, j);
			}

			// Check if the length
			// if (++i == A.length);
			i++;
		}

		System.out.println("\t HashMap Before Sorting:");
		// int[] arrMax = null;
		HashMap<Integer, Integer> mapMax = new HashMap<Integer, Integer>();
		Map.Entry<Integer, Integer> maxEntry = null;
		Set setMax = new HashSet<Integer>();
		Set setHM = map.entrySet();
		Iterator iterator = setHM.iterator();
		i = 0;
		while (iterator.hasNext()) {
			Map.Entry entry = (Map.Entry) iterator.next();
			System.out.println("\t Entry : " + entry.getKey() + ": " + entry.getValue());
			// System.out.println(entry.getValue());
			if (maxEntry == null || ((Integer) entry.getValue()).compareTo(maxEntry.getValue()) >= 0) {
				maxEntry = entry;
				setMax.add(maxEntry.getKey());
				mapMax.put(maxEntry.getKey(), maxEntry.getValue());
				System.out.println("\t MaxEntry : " + maxEntry.getKey() + ": " + maxEntry.getValue());
			}

		}

		// Covert MaxOccurences Set to an Array
		// Integer[] arrMax = new Integer[setMax.size()];
		// set.toArray(arrMax);
		int[] intArrMax = new int[setMax.size()];
		// intArrMax = Arrays.stream(arrMax).mapToInt(Integer::intValue).toArray();
		// System.out.printf("\t Maximum Occurences Array A[] : %s \n",
		// Arrays.toString(arrMax));
		System.out.printf("\t Maximum Occurences SetMax : %s \n", setMax.toString());
		i = 0;
		for (Iterator<Integer> it = setMax.iterator(); it.hasNext();) {
			Integer f = it.next();
			System.out.println("\t SetMaxIterator : " + f.intValue());
			intArrMax[i] = f.intValue();
			i++;
		}

		System.out.printf("\t Maximum Occurences Array Max : %s \n", Arrays.toString(intArrMax));

		// return new int[0];
		return intArrMax;
	}

	public static int addDigitsInNum(int num) {

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
	 * Java 8 : Lottery
	 *******************************************/

	public static void BeforeTest(String[] args) {

		/// ************************************ KP : Interview Questions : Q&A
		/// *****************************************///

		/// KP : Q&A : 1 - Can we add a variable of datatype 'byte'? What will happen if
		/// we do not cast 'addition' operation?
		System.out.println(
				"KP : Can We add a variable of datatype 'byte'? What will happen if we do not cast 'addition' operation?");
		byte b = 10;
		b = (byte) (b + 1);
		System.out.println(
				"Value of the 'byte' type variable 'b' resulting in operation cast 'addition' operation? \n" + b);
		/// KP : Q&A : 1 - Can we add a variable of datatype 'byte'? What will happen if

		//// KP : Q&A : 2 - Can We declare a Top Level Class as Static in Java?
		System.out.println("KP : Can We declare a Top Level Class as Static in Java?");
		NestedStaticClass nscObj = new NestedStaticClass();
		nscObj.printMessage();
		//// KP : Q&A : 2 - Can We declare a Top Level Class as Static in Java?

		//// KP : Q&A : 3 - Can Java have multiple inheritances through interface
		//// implements?
		System.out.println("KP : Can Java have multiple inheritances through interface implements?");
		BiCycle bike = new BiCycle();
		bike.Wheels();
		bike.Axles();

		Car car = new Car();
		car.Wheels();
		car.Axles();
		car.Fuel();

		Truck truck = new Truck();
		truck.Wheels();
		truck.Axles();
		truck.Fuel();
		//// KP : Q&A : 3 - Can Java have multiple inheritances?

		//// KP : Q&A : 3 - Can Java have multiple inheritances?
		System.out.println("KP : Can Java have multiple inheritances?");
		Piglet piglet = new Piglet();
		piglet.canBreath();
		piglet.animalSound();
		piglet.sleep();
		piglet.willDie();

		System.out.println("KP : Can Java have a single implmentation of an Interface?");
		Pig pig = new Pig();
		pig.animalSound();
		pig.sleep();
		//// KP : Q&A : 3 - Can Java have multiple inheritances?

		//// KP : Q&A : 4 - Can Java have multiple inheritances through Java Abstracts &
		//// Extends
		System.out.println("KP : Can Java have multiple inheritances through Java Abstracts & Extends?");
		DebitCard dbCard = new DebitCard();
		dbCard.cardNumber("1234567890");
		dbCard.cardType();

		System.out.println("KP : Can Java have multiple inheritances through Java Abstracts & Extends?");
		CreditCard cdCard = new CreditCard();
		cdCard.cardNumber("0123456789");
		cdCard.cardType();
		//// KP : Q&A : 4 - Can Java have multiple inheritances through Java Abstracts &
		//// Extends

		//// KP : Q&A : 5 - Functional Interface implements only one function
		int a = 5;

		// lambda expression to define the calculate method
		Square s = (int x) -> x * x;

		// parameter passed and return type must be
		// same as defined in the prototype
		int ans = s.calculate(a);
		System.out.println("KP : Functional Interface implements only one function : Square : " + ans);
		//// KP : Q&A : 5 - Functional Interface implements only one function
		//// Extends

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

		// KP : Print Fizz Buzz
		int n = 2715;
		FizzBuzz(n);

		// KP : Print Top 3 Elements in Array
		int[] A = { 1, 3, 2, 4, 2, 2, 4, 5, 6, 7, 2, 3, 1, 1, 3, 3, 2 };
		getTop3ElementsInArray(A);
	}

	/*******************************************
	 * Java 8 : Print Top 3 Elements in Array
	 *******************************************/
	// Write a program to print top three elements based on their number of
	// occurrences.
	// Example array -> [1,3,2,4,2,2,4,5,6,7,2,3,1,1,3,3,2] Top three elements 2->5,
	// 3->4, 1 ->3
	public static int getTop3ElementsInArray(int[] A) {

		//// KP : First Sort an Array
		// Arrays.sort(A);
		// System.out.printf("\t Sorted Array A[] : %s \n", Arrays.toString(A));
		System.out.printf("Hash Map of Array A[] : %s \n", Arrays.toString(A));

		//// KP : Create a Hash Map
		int i = 0, j = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int a : A) {
			j = 0;
			if (map.containsKey(a)) {
				j = map.get(a);
				map.put(a, ++j);
				System.out.printf("\t (B) Value of 'a' : %d, 'j' : %d \n", a, j);
			} else {
				map.put(a, ++j);
				System.out.printf("\t (A) Value of 'a' : %d, 'j' : %d \n", a, j);
			}

			// Check if the length
			// if (++i == A.length);
			i++;
		}

		System.out.println("\t Before Sorting:");
		Set set = map.entrySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry me = (Map.Entry) iterator.next();
			System.out.println("\t " + me.getKey() + ": " + me.getValue());
			// System.out.println(me.getValue());
		}

		// KP : Iterate through a Hash Map
		// Map<Integer, String> map = new TreeMap<Integer, String>(hmap);
		// Collections.sort(map);
		// List listMap = Collections.sort(list);
		System.out.println("\t After Sorting:");
		Set set2 = map.entrySet();
		Iterator iterator2 = set2.iterator();
		while (iterator2.hasNext()) {
			Map.Entry me2 = (Map.Entry) iterator2.next();
			System.out.println("\t " + me2.getKey() + ": " + me2.getValue());
			// System.out.println(me2.getValue());
		}

		return j++;
	}

	/*******************************************
	 * Java 8 : Print Top 3 Elements in Array
	 *******************************************/

	/*******************************************
	 * Java 8 : Print FizzBuzz
	 *******************************************/
	public static void FizzBuzz(int n) {
		int x = 1;
		while (x <= n) {
			int r3 = (int) x % 3;
			int r5 = (int) x % 5;

			System.out.printf("%s ", x);

			if (r3 == 0)
				System.out.printf("Fizz");

			if (r5 == 0)
				System.out.printf("Buzz");

			System.out.println("");
			x++;
		}
	}

	/*******************************************
	 * Java 8 : Print FizzBuzz
	 *******************************************/

	/// ************************************Java 8 : Arrays - Duplicates & Smallest
	/// Integers Solution *****************************************///

	/// ************************************Java Abstracts & Extends
	/// *****************************************///
	// Abstract class
	static abstract class Card {
		// Abstract method (Does NOT have a body)
		public abstract void cardType();

		// Regular method (Does have a body)
		public void cardNumber(String num) {
			// The body of CardNumber() is provided here
			System.out.println("\t An Abstract Class Card implements Regular Method Card Number : " + num);
		}
	}

	// Subclass (DebitCard inherit from Card)
	static class DebitCard extends Card {
		@Override
		public void cardType() {
			// The body of CardNumber() is provided here
			System.out.println("\t A 'DebitCard' extendes Abstract Class 'Card' Overide Method 'CardType' : DEBIT");
		}
	}

	// Subclass (CreditCard inherit from Card)
	static class CreditCard extends Card {
		@Override
		public void cardType() {
			// The body of CardNumber() is provided here
			System.out.println("\t A 'CreditCard' extendes Abstract Class 'Card' Overide Method 'CardType' : CREDIT");
		}
	}
	/// ************************************Java Abstracts & Extends
	/// *****************************************///

	/// ************************************Java Functional Interfaces & Implements
	/// *****************************************///
	// Java program to demonstrate lamda expressions to implement
	// a user defined functional interface.

	@FunctionalInterface
	interface Square {
		int calculate(int x);
	}

	/// ************************************Java Functional Interfaces & Implements
	/// *****************************************///

	/// ************************************Java Interfaces & Implements
	/// *****************************************///

	/***
	 * Notes on Interfaces: Like abstract classes, interfaces cannot be used to
	 * create objects (in the example above, it is not possible to create an
	 * "Animal" object in the MyMainClass) Interface methods do not have a body -
	 * the body is provided by the "implement" class On implementation of an
	 * interface, you must override all of its methods Interface methods are by
	 * default abstract and public Interface attributes are by default public,
	 * static and final An interface cannot contain a constructor (as it cannot be
	 * used to create objects)
	 * 
	 * Why And When To Use Interfaces? 1) To achieve security - hide certain details
	 * and only show the important details of an object (interface).
	 * 
	 * 2) Java does not support "multiple inheritance" (a class can only inherit
	 * from one superclass). However, it can be achieved with interfaces, because
	 * the class can implement multiple interfaces. Note: To implement multiple
	 * interfaces, separate them with a comma (see example below).
	 * 
	 * Why And When To Use Abstract Classes and Methods? 1) To achieve security -
	 * hide certain details and only show the important details of an object. /
	 ***/

	// interface
	interface Vehicle {
		public void Wheels(); // interface method (does not have a body)

		public void Axles(); // interface method (does not have a body)
	}

	interface Automobile {
		public void Fuel();
	}

	// Bi-Cycle
	static class BiCycle implements Vehicle {
		@Override
		public void Wheels() {
			// The body of Wheels() is provided here
			System.out.println("\t A BiCycle Class immplements '2' Wheels");
		}

		@Override
		public void Axles() {
			// The body of Axles() is provided here
			System.out.println("\t A BiCycle Class immplements '0' Axles");
		}
	}

	// Car : Multiple Inheritance through Interface Implments
	static class Car implements Vehicle, Automobile {
		@Override
		public void Wheels() {
			// The body of Wheels() is provided here
			System.out.println("\t  A Car Class immplements '4' Wheels");
		}

		@Override
		public void Axles() {
			// The body of Axles() is provided here
			System.out.println("\t  A Car Class immplements '2' Axles");
		}

		@Override
		public void Fuel() {
			// The body of Fuel() is provided here
			System.out.println("\t  A Car Class immplements 'Gas' Fuel");
		}
	}

	// Truck : Multiple Inheritance through Interface Implments
	static class Truck implements Vehicle, Automobile {
		@Override
		public void Wheels() {
			// The body of Wheels() is provided here
			System.out.println("\t  A Truck Class immplements '8' Wheels");
		}

		@Override
		public void Axles() {
			// The body of Axles() is provided here
			System.out.println("\t  A Car Class immplements '4' Axles");
		}

		@Override
		public void Fuel() {
			// The body of Fuel() is provided here
			System.out.println("\t  A Car Class immplements 'Diesel' Fuel");
		}
	}
	/// ************************************Java Interfaces & Implements
	/// *****************************************///

	/// ************************************Java Interfaces & Implements
	/// *****************************************///

	/***
	 * Notes on Interfaces: Like abstract classes, interfaces cannot be used to
	 * create objects (in the example above, it is not possible to create an
	 * "Animal" object in the MyMainClass) Interface methods do not have a body -
	 * the body is provided by the "implement" class On implementation of an
	 * interface, you must override all of its methods Interface methods are by
	 * default abstract and public Interface attributes are by default public,
	 * static and final An interface cannot contain a constructor (as it cannot be
	 * used to create objects)
	 * 
	 * Why And When To Use Interfaces? 1) To achieve security - hide certain details
	 * and only show the important details of an object (interface).
	 * 
	 * 2) Java does not support "multiple inheritance" (a class can only inherit
	 * from one superclass). However, it can be achieved with interfaces, because
	 * the class can implement multiple interfaces. Note: To implement multiple
	 * interfaces, separate them with a comma (see example below).
	 * 
	 * Why And When To Use Abstract Classes and Methods? 1) To achieve security -
	 * hide certain details and only show the important details of an object. /
	 ***/

	// interface
	interface Animal {

		public void animalSound(); // interface method (does not have a body)

		public void sleep(); // interface method (does not have a body)
	}

	// interface
	interface LivingBeing {
		public void canBreath(); // interface method (does not have a body)

		public void willDie(); // interface method (does not have a body)
	}

	// Pig "implements" the Animal interface
	static class Pig implements Animal {
		public void animalSound() {
			// The body of animalSound() is provided here
			System.out.println("\t  The pig says: wee wee");
		}

		public void sleep() {
			// The body of sleep() is provided here
			System.out.println("\t  The pig sleeps: Zzz");
		}
	}

	// Pig "implements" the Animal & LivingBeing interface
	public static class Piglet implements Animal, LivingBeing {
		@Override
		public void animalSound() {
			// The body of animalSound() is provided here
			System.out.println("\t  The piglet says: wee wee");
		}

		@Override
		public void sleep() {
			// The body of sleep() is provided here
			System.out.println("\t  The piglet sleeps: Zzz");
		}

		@Override
		public void canBreath() {
			// TODO Auto-generated method stub
			System.out.println("\t  The piglet canBreath: Breaths - Hence Alive ");

		}

		@Override
		public void willDie() {
			// TODO Auto-generated method stub
			System.out.println("\t  The piglet willDie: Death is the eventual end of life - Hence a Living Being ");

		}
	}
	/// ************************************Java Interfaces & Implements
	/// *****************************************///

	/// ************************************Java Static & Nested Sub-Classes
	/// *****************************************///

	// Static nested class
	public static class NestedStaticClass {

		// Only static members of Outer class
		// is directly accessible in nested
		// static class
		public void printMessage() {

			// Try making 'message' a non-static
			// variable, there will be compiler error
			System.out.println(
					"\t Java Classes can be declared 'Static' only as a 'Sub-Class' in Java! Message from nested static class");
		}
	}
	/// ************************************Java Static & Nested Sub-Classes
	/// *****************************************///

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
