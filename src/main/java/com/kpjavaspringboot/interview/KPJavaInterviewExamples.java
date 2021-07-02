package com.kpjavaspringboot.interview;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import javax.swing.text.Element;

//import com.kpjavaspringboot.KPJavaSpringBootApplication.NestedStaticClass;


class MyOtherClass {
	MyOtherClass(){}
	FileReader aRd;
}

public class KPJavaInterviewExamples {

	public static void main(String[] args) {
		getInterviewQuestions();		
	}

	public static void getInterviewQuestions() {

		/// ************************************ KP : Interview Questions : Q&A
		/// *****************************************///

		/// KP : Q&A : 1 - Can we add a variable of datatype 'byte'? What will happen if
		/// we do not cast 'addition' operation?
		System.out.println(
				"KP : Can We add a variable of datatype 'byte'? What will happen if we do not cast 'addition' operation?");
		byte b = 10;
		b = (byte) (b + 1);
		System.out.println(
				"\t Value of the 'byte' type variable 'b' resulting in operation cast 'addition' operation? \n \t" + b);
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

		//// KP : Q&A : 5 - Get Java 8 : Arrays - Duplicates & Smallest Integers
		//// Solution
		// KP : Smallest Integer - Write a function: that, given an array A of N
		//// integers,
		// returns the smallest positive integer (greater than 0) that does not occur in
		//// A.
		SmallestIntegerInterviewTest();
		//// KP : Q&A : 5 - Get Java 8 : Arrays - Duplicates & Smallest Integers
		//// Solution

		/// KP : Q&A : 6 - Add Digits in an Integer Number : Q&A
		// KP : Count Number of Digits and Return the Sum
		// System.out.println("KP : Count Number of Digits and Return the Sum?");
		CountAndAddDigitsInANumber();
		/// KP : Q&A : 6 - Add Digits in an Integer Number : Q&A

		/// KP : Q&A : 7 - Check if input String is a Palindrome : Q&A
		CheckPalindrome();
		/// KP : Q&A : 7 - Check if input String is a Palindrome : Q&A

		/// KP : Q&A : 8 - Compute Factorial Recursively : Q&A
		ComputeFactorial();
		/// KP : Q&A : 8 - Compute Factorial Recursively : Q&A

		/// KP : Q&A : 9- All Permutations of a Java String
		String str = "ABCDEF"; /// "XYZ"
		allStringPermute(str);
		/// KP : Q&A : 9 - All Permutations of a Java String

		/// KP : Q&A : 10 - Return Duplicate (or) Repetitive Elements : Q&A
		// Eliminate Repetitions
		// int A[] = { 3, 2, 3, 2, 3, 2, 5, 7, 3, 2 };
		int[] A = { -7, -11, -3, 1, 3, 0, 0, 0, 9, 7, 8, 6, 4, 1, 2, 2, -100, 90, 98, 625, -7, -11, 625 };
		getUniqueElements(A);
		getDuplicateInteger(A);
		getUniqueNonDuplicateArray(A);
		getSumOfUniqueElements(A);
		getSmallestPositiveInteger(A);
		/// KP : Q&A : 10 - Compute Factorial Recursively : Q&A

		/// KP : Q&A : 11 - Mastercard Recursion & Permute Test : Q&A
		masterCardInterviewTest();
		/// KP : Q&A : 11 - Mastercard Recursion & Permute Test : Q&A
		
		/// KP : Q&A : 12 - IKM Test : Q&A
		System.out.println("KP : IKMTest ");
		String[] S = { "-7", "-11", "-3", "100", "90", "625" };
		IKMTest(S);
		/// KP : Q&A : 12 - LKM Test : Q&A
		
		/// KP : Q&A : 13 - CapitalOne Test : Q&A
		//Print a file directory: we have a file directory class:
		printDirNSubDirContents();
		//// KP : Q&A : 13 - CapitalOne Test : Q&A			
		
		/// KP : Q&A : 14 - CapitalOne Test : Q&A
		BubbleSortAlgorithm();
		/// KP : Q&A : 14 - CapitalOne Test : Q&A
		
		/// KP : Q&A : 15 - BalanceParantheses Test : Q&A
		BalanceParantheses();
		/// KP : Q&A : 14 - BalanceParantheses Test : Q&A
		
		
	}
	
	
	/*******************************************
	 * Java 8 : Balance Parentheses
	 ********************************************/
	
	public static void BalanceParantheses() {
		System.out.println("KP : Balance Parentheses ");	
		String input = "{{]][]]}}";
		
		boolean result = isBalanceParantheses(input);
		System.out.println("\t Input String " + input + " Balanced  : " +  result );	
						
	}
	
	static boolean isBalanceParantheses(String input) {
		
        // Using ArrayDeque is faster than using Stack class 
        Deque<Character> stack  = new ArrayDeque<Character>(); 
  
        // Traversing the Expression 
        for (int i = 0; i < input.length(); i++)  
        { 
            char x = input.charAt(i); 
  
            if (x == '(' || x == '[' || x == '{')  
            { 
                // Push the element in the stack 
                stack.push(x); 
                continue; 
            } 
  
            // cannot be empty at this point. 
            if (stack.isEmpty()) 
                return false; 
            char check; 
            switch (x) { 
            case ')': 
                check = stack.pop(); 
                if (check == '{' || check == '[') 
                    return false; 
                break; 
  
            case '}': 
                check = stack.pop(); 
                if (check == '(' || check == '[') 
                    return false; 
                break; 
  
            case ']': 
                check = stack.pop(); 
                if (check == '(' || check == '{') 
                    return false; 
                break; 
            } 
        } 
  
        // Check Empty Stack 
        return (stack.isEmpty()); 
  	
		//return true;
	}
	

	/*******************************************
	 * Java 8 : Balance Parentheses
	 ********************************************/
	
	
	/*******************************************
	 * Java 8 : IKM Test 
	 ********************************************/
	/*Java Class Constructors*/
	public KPJavaInterviewExamples() {
		this(10);
	}
		
	public KPJavaInterviewExamples(int data) {
		// TODO Auto-generated constructor stub
		this.data = data;
	}
	
	
	public static void IKMTest(String... s) {
		System.out.println("\t Input Array - s[] : " + Arrays.toString(s)  + ",  s[1] : " + s[1] + ",  s[2] : " + s[2] + ", s[3] : " + s[3] );
		
		/* //KP : IKM Test 1 */
		System.out.println("\t ArrayList() Print Sequence : What is the sequence of letter printed ? ");
		List<String> lst = new ArrayList<String>();
		lst.add("1");
		lst.add("2");
		lst.add(0, "3");
		lst.add(1, "4");
		System.out.print("\t ArrayList() Print Sequence : " );
		lst.forEach(System.out::print);
		
		
		/* //KP : IKM Test 2 */
		//Display()
		int data = 0;
		KPJavaInterviewExamples t = new KPJavaInterviewExamples();
		t.display();
		System.out.println("\t IKMTest - data = " + data);
		
		//HElper
		Helper h = new Helper();
		int d = 2;
		h.bump(d);
		System.out.println("\t IKMTest - h.d : " + h.d + " d : "+ d);
				
	}
	
	
	/*Java Main() Class Constructors*/
	public int data;
	public SortedSet<Element> s = new TreeSet<Element>();
	MyOtherClass myOC = new 	MyOtherClass();
	File aF;
		
	static class Helper{
		private int d = 5;
		public void bump(int inc) {
			inc++;
			d = d + inc;
		}

	}
	/*Java Main() Class Constructors*/
	


	public void display () {
		// TODO Auto-generated constructor stu
		class Decrement{
			public void decrement() {		
				data--;
			}
		}
		Decrement d = new Decrement();
		d.decrement();
		System.out.println("KP : Test - data = " + data);
	}
	/*Java Class Constructors*/
	

	/*Java Class Generics */
	public int getClient(List<Number> myparm) {
		return 0;
	}
		
	public int getClient1(List<?  extends Number> myparm) {
		return 0;
	}
		
	public int getClient2(List<? extends Number> myparm) {
		return 0;
	}
	/*Java Class Generics */


	/*******************************************
	 * Java 8 : IKM Test 
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
	 * Java 8 : Factorial : Recursion
	 *******************************************/

	/***
	 * 
	 * Write a function to compute factorial recursively.
	 * 
	 ***/

	public static void ComputeFactorial() {

		System.out.println("KP : Compute Factorial Recursively ");
		// KP : Compute Factorial
		int num = 27;
		int result = factorial(num);
		System.out.printf("\t Factorial of : '%d' = '%d'\n", num, result);
	}

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
	 * Java 8 : All Permutations of a Java String
	 *******************************************/

	// Java program to print all permutations of a
	// given string.
	public static void allStringPermute(String str) {

		System.out.println("KP : KPJavaInterview : Hello : Permute a String '" + str + "'");

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
			System.out.print("\t" + str);
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
	 * Java 8 : isPalindrome : Check a Variable?
	 *******************************************/

	/***
	 * 
	 * Write a function to check if an Input Variable is a Palindrome?
	 * 
	 ***/

	public static void CheckPalindrome() {
		System.out.println("KP : Check if Input String a Palindrome ");
		// KP : Check Palindrome
		String input = "Madam";
		boolean flag = isPalindrome(input);
		isPalindromeCaseSensitive(input, true);
		isPalindromeCaseSensitive(input, false);
	}

	public static boolean isPalindrome(String str) {

		System.out.printf("\t Input Variable : '%s' \n", str);

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

		System.out.printf("\t Input Variable : '%s'. Ignore Case : '%b' \n", str, ignoreCase);

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
			// System.out.printf("KP : KPJavaInterview - addDigits() - num : '%d', sum :
			// '%d', Individual Digits 'rem' : '%d' \n", num, sum, rem);

			// num = num /10;
			num /= 10;
		}

		return sum;
	}

	/*******************************************
	 * Java 8 : Add Digits in an Integer Number
	 *******************************************/

	/// ************************************Java 8 : Arrays - Duplicates & Smallest
	/// Integers Solution *****************************************///

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

		/// KP : Get Smallest Positive Integer
		int val = getSmallestPositiveInteger(A);
		System.out.println("KP : KPJavaInterview -  com.kpjavaspringboot : Smallest Positive Integer : " + val);

	}

	public static void getUniqueElements(int[] A) {

		System.out.println("KP : Java Interview Test : getUniqueElements()");

		HashMap hm = new HashMap();
		HashSet hs = new HashSet();
		int i = 0;
		for (int a : A) {

			if (hm.get(a) == null) {
				i = 0;
				hm.put(a, ++i);
				// System.out.printf("HM : a=%d, i=%d \n", a, i);
			} else {
				i = (int) hm.get(a);
				hm.put(a, ++i);
				// System.out.printf("HM : a=%d, i=%d \n", a, i);
			}

			if (!hs.contains(a)) {
				hs.add(a);
			}

		}
		System.out.println("\t The Input Array : " + Arrays.toString(A));
		Arrays.sort(A);
		System.out.println("\t The Sorted Input Array : " + Arrays.toString(A));
		System.out.println("\t The HashMap : " + hm);

		// Remove Duplicates & Repetitions
		// Getting an iterator
		int sumUnqElem = 0;
		Iterator hmIterator = hm.entrySet().iterator();
		HashSet hsUnq = new HashSet();
		HashSet hsRep = new HashSet();
		// Iterate through the hashmap
		while (hmIterator.hasNext()) {
			Map.Entry mapElement = (Map.Entry) hmIterator.next();
			int value = ((int) mapElement.getValue());
			// System.out.println( "The HashMapElement : Key = " + mapElement.getKey() + "
			// Value = " + mapElement.getValue());

			if (value == 1) {

				hsUnq.add(mapElement.getKey());
				sumUnqElem += (int) mapElement.getKey();
			} else {
				hsRep.add(mapElement.getKey());
			}
		}

		System.out.println("\t Unique HashMap : " + hm);
		System.out.println("\t HashSet: " + hs);
		System.out.println("\t Non-Duplicate Unique HashSet : " + hsUnq);
		System.out.println("\t Duplicate & Repetitive HashSet : " + hsRep);
		System.out.println("\t Sum of Non-Duplicate & Non-Repetitive Unique Elements : " + sumUnqElem);

		//// Creating an Integer Array of Repetitive (or) Duplicate Elements
		int[] dupArr = new int[hsRep.size()];
		i = 0;
		for (Object a : hsRep) {
			dupArr[i++] = (int) a;
		}
		Arrays.sort(dupArr);
		System.out.println("\t Array - Repetitive-Duplicate Elements : " + Arrays.toString(dupArr));

		//// Creating an Integer Array of Non-Repetitive Elements
		int[] unqArr = new int[hsUnq.size()];
		i = 0;
		for (Object a : hsUnq) {
			unqArr[i++] = (int) a;
		}
		Arrays.sort(unqArr);
		System.out.println("\t Array - Non-Duplicate Unique Elements : " + Arrays.toString(unqArr));

	}

	public static int getSmallestPositiveInteger(int[] A) {

		//// KP : First Sort an Array
		Arrays.sort(A);
		System.out.printf("\t Sorted Array A[] : %s \n", Arrays.toString(A));

		//// KP :
		Set<Integer> set = new HashSet<Integer>();
		for (int a : A) {
			if (a > 0)
				return a;
		}

		return (Integer) null;
	}

	public static int[] getDuplicateInteger(int[] A) {

		System.out.println("KP : KPJavaInterview -  com.kpjavaspringboot : getDuplicateInteger(int[] A)");

		HashMap hm = new HashMap();
		HashSet hs = new HashSet();
		int i = 0;
		for (int a : A) {

			if (hm.get(a) == null) {
				i = 0;
				hm.put(a, ++i);
				// System.out.printf("HM : a=%d, i=%d \n", a, i);
			} else {
				i = (int) hm.get(a);
				hm.put(a, ++i);
				// System.out.printf("HM : a=%d, i=%d \n", a, i);
			}

			if (!hs.contains(a)) {
				hs.add(a);
			}

		}
		System.out.println("\t The Input Array : " + Arrays.toString(A));
		Arrays.sort(A);
		System.out.println("\t The Sorted Input Array : " + Arrays.toString(A));
		System.out.println("\t The HashMap : " + hm);

		// Remove Duplicates & Repetitions
		// Getting an iterator
		int sumUnqElem = 0;
		Iterator hmIterator = hm.entrySet().iterator();
		HashSet hsUnq = new HashSet();
		HashSet hsRep = new HashSet();
		// Iterate through the hashmap
		while (hmIterator.hasNext()) {
			Map.Entry mapElement = (Map.Entry) hmIterator.next();
			int value = ((int) mapElement.getValue());
			// System.out.println( "The HashMapElement : Key = " + mapElement.getKey() + "
			// Value = " + mapElement.getValue());

			if (value == 1) {

				hsUnq.add(mapElement.getKey());
				sumUnqElem += (int) mapElement.getKey();
			} else {
				hsRep.add(mapElement.getKey());
			}
		}

		System.out.println("\t Unique HashMap : " + hm);
		System.out.println("\t HashSet: " + hs);
		System.out.println("\t Non-Duplicate Unique HashSet : " + hsUnq);
		System.out.println("\t Duplicate & Repetitive HashSet : " + hsRep);
		System.out.println("\t Sum of Non-Duplicate & Non-Repetitive Unique Elements : " + sumUnqElem);

		//// Creating an Integer Array of Repetitive (or) Duplicate Elements
		int[] dupArr = new int[hsRep.size()];
		i = 0;
		for (Object a : hsRep) {
			dupArr[i++] = (int) a;
		}
		Arrays.sort(dupArr);
		System.out.println("\t Array - Repetitive-Duplicate Elements : " + Arrays.toString(dupArr));

		//// Creating an Integer Array of Non-Repetitive Elements
		int[] unqArr = new int[hsUnq.size()];
		i = 0;
		for (Object a : hsUnq) {
			unqArr[i++] = (int) a;
		}
		Arrays.sort(unqArr);
		System.out.println("\t Array - Non-Duplicate Unique Elements : " + Arrays.toString(unqArr));

		return dupArr;
	}

	public static int[] getUniqueNonDuplicateArray(int[] A) {

		System.out.println("KP : KPJavaInterview -  com.kpjavaspringboot : getUniqueNonDuplicateArray(int[] A)");

		HashMap hm = new HashMap();
		HashSet hs = new HashSet();
		int i = 0;
		for (int a : A) {

			if (hm.get(a) == null) {
				i = 0;
				hm.put(a, ++i);
				// System.out.printf("HM : a=%d, i=%d \n", a, i);
			} else {
				i = (int) hm.get(a);
				hm.put(a, ++i);
				// System.out.printf("HM : a=%d, i=%d \n", a, i);
			}

			if (!hs.contains(a)) {
				hs.add(a);
			}

		}
		System.out.println("\t The Input Array : " + Arrays.toString(A));
		Arrays.sort(A);
		System.out.println("\t The Sorted Input Array : " + Arrays.toString(A));
		System.out.println("\t The HashMap : " + hm);

		// Remove Duplicates & Repetitions
		// Getting an iterator
		int sumUnqElem = 0;
		Iterator hmIterator = hm.entrySet().iterator();
		HashSet hsUnq = new HashSet();
		HashSet hsRep = new HashSet();
		// Iterate through the hashmap
		while (hmIterator.hasNext()) {
			Map.Entry mapElement = (Map.Entry) hmIterator.next();
			int value = ((int) mapElement.getValue());
			// System.out.println( "The HashMapElement : Key = " + mapElement.getKey() + "
			// Value = " + mapElement.getValue());

			if (value == 1) {

				hsUnq.add(mapElement.getKey());
				sumUnqElem += (int) mapElement.getKey();
			} else {
				hsRep.add(mapElement.getKey());
			}
		}

		System.out.println("\t Unique HashMap : " + hm);
		System.out.println("\t HashSet: " + hs);
		System.out.println("\t Non-Duplicate Unique HashSet : " + hsUnq);
		System.out.println("\t Duplicate & Repetitive HashSet : " + hsRep);
		System.out.println("\t Sum of Non-Duplicate & Non-Repetitive Unique Elements : " + sumUnqElem);

		//// Creating an Integer Array of Repetitive (or) Duplicate Elements
		int[] dupArr = new int[hsRep.size()];
		i = 0;
		for (Object a : hsRep) {
			dupArr[i++] = (int) a;
		}
		Arrays.sort(dupArr);
		System.out.println("\t Array - Repetitive-Duplicate Elements : " + Arrays.toString(dupArr));

		//// Creating an Integer Array of Non-Repetitive Elements
		int[] unqArr = new int[hsUnq.size()];
		i = 0;
		for (Object a : hsUnq) {
			unqArr[i++] = (int) a;
		}
		Arrays.sort(unqArr);
		System.out.println("\t Array - Non-Duplicate Unique Elements : " + Arrays.toString(unqArr));

		return unqArr;
	}

	public static int getSumOfUniqueElements(int[] A) {

		System.out.println("KP : Java Interview Test : getSumOfUniqueElements");

		HashMap hm = new HashMap();
		HashSet hs = new HashSet();
		int i = 0;
		for (int a : A) {

			if (hm.get(a) == null) {
				i = 0;
				hm.put(a, ++i);
				// System.out.printf("HM : a=%d, i=%d \n", a, i);
			} else {
				i = (int) hm.get(a);
				hm.put(a, ++i);
				// System.out.printf("HM : a=%d, i=%d \n", a, i);
			}

			if (!hs.contains(a)) {
				hs.add(a);
			}

		}
		System.out.println("\t The Input Array : " + Arrays.toString(A));
		Arrays.sort(A);
		System.out.println("\t The Input Array : " + Arrays.toString(A));
		System.out.println("\t The HashMap : " + hm);

		// Remove Duplicates & Repetitions
		// Getting an iterator
		int sumUnqElem = 0;
		Iterator hmIterator = hm.entrySet().iterator();
		HashSet hsUnq = new HashSet();
		HashSet hsRep = new HashSet();
		// Iterate through the hashmap
		while (hmIterator.hasNext()) {
			Map.Entry mapElement = (Map.Entry) hmIterator.next();
			int value = ((int) mapElement.getValue());
			// System.out.println( "The HashMapElement : Key = " + mapElement.getKey() + "
			// Value = " + mapElement.getValue());

			if (value == 1) {

				hsUnq.add(mapElement.getKey());
				sumUnqElem += (int) mapElement.getKey();
			} else {
				hsRep.add(mapElement.getKey());
			}
		}

		System.out.println("\t The Unique HashMap : " + hm);
		System.out.println("\t The HashSet: " + hs);
		System.out.println("\t The Non-Duplicate Unique HashSet : " + hsUnq);
		System.out.println("\t The Duplicate & Repetitive HashSet : " + hsRep);
		System.out.println("\t The Sum of Non-Duplicate & Non-Repetitive Unique Elements : " + sumUnqElem);

		return sumUnqElem;

	}

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

	
	/// ************************************Java Capital One Interview Test
	/// *****************************************///

	
	/* 
	Print a file directory: we have a file directory class:
		test
		├── test-a1.log
		├── test-a2.log
		└── test-b
		    ├── test-b1.txt
		    ├── test-b2.txt
		    ├── test-c
		    │   ├── test-c1.log
		    │   └── test-c2.log
		    └── test-d
		        ├── test-d1.log
		        └── test-d2.log
		class FileDir {
		    String type; //File or Dir 
		    String name;
		    List subDir;
		}

	 */
	public static void printDirNSubDirContents() {
		System.out.println("KP : Print Contents of File Directory & Sub-Directory contents: ");	
		
		String pwd = System.getProperty("user.dir");
		File rootDir = new File(pwd);
		System.out.println("\t Root Directory : " + rootDir.toString());
		//rootDir = new File("C:\\Users\\admin\\eclipse-workspace\\KPJavaSpringBoot\\src");
		rootDir = new File(".");
		
		File arr[] = rootDir.listFiles();
		//System.out.println("Files : " + Arrays.toString(arr));
		recursiveDirPrint(arr);
		
	}	
	
	public static void recursiveDirPrint(File arr[]) {
		
		String str = new String("\t");
		for (File path : arr ) {
			
			//System.out.println("Path : " + path.toPath());
			
			if (path.isFile()) {
				//System.out.println("\t File Path : " + path.toPath());
				System.out.println(str + path.toPath());
			}
			
			if (path.isDirectory()) {
				//System.out.println("\t Directory Path : " + path.toPath());
				System.out.println(str + path.toPath());
				str += "\t";
				File arrSub[] = path.listFiles();
				recursiveDirPrint(arrSub);
			} 
			//str += "\t";
		}
	}
	/// ************************************Java Capital One Interview Test
	/// *****************************************///

	
	
	/// ************************************Java MasterCard Interview Test
	/// *****************************************///

	public static void masterCardInterviewTest() {
		System.out.println("KP : Mastercard  Interview - Matching Paranthesis Test");

		int n = 3;

		// KP : Indegineous Solution :
		// GenerateNParentheses(n);

		// KP : Solution Available on Internet :
		// https://leetcode.com/problems/generate-parentheses/solution/
		/*** KP : Brute Force ***/
		List<String> lst = generateParenthesis(n);
		System.out.println("\t Brute Force : " + lst.toString());
		/*** KP : Brute Force ***/

		/*** KP : Back Tracking ***/
		List<String> lstBtrk = generateParenthesisBackTracking(n);
		System.out.println("\t Back Tracking : " + lstBtrk.toString());
		/*** KP : Back Tracking ***/

		/*** KP : Closure Number ***/
		List<String> lstCN = generateParenthesisClosureNumber(n);
		System.out.println("\t Closure Number : " + lstBtrk.toString());
		/*** KP : Closure Number ***/
	}

	/*** KP : Brute Force ***/
	public static List<String> generateParenthesis(int n) {
		List<String> combinations = new ArrayList();
		generateAll(new char[2 * n], 0, combinations);
		return combinations;
	}

	public static void generateAll(char[] current, int pos, List<String> result) {
		if (pos == current.length) {
			if (valid(current))
				result.add(new String(current));
		} else {
			current[pos] = '(';
			generateAll(current, pos + 1, result);
			current[pos] = ')';
			generateAll(current, pos + 1, result);
		}
	}

	public static boolean valid(char[] current) {
		int balance = 0;
		for (char c : current) {
			if (c == '(')
				balance++;
			else
				balance--;
			if (balance < 0)
				return false;
		}
		return (balance == 0);
	}

	public static void GenerateNParentheses(int n) {
		/*
		 * Given 'n' pairs of parentheses, write a function to generate all combinations
		 * of well-formed parentheses.
		 * 
		 * Example 1: Input: n = 3 Output:
		 * ["((()))","(()())","(())()","()(())","()()()"]
		 * 
		 * ()(()) (()(() ) )
		 * 
		 * Example 2: Output: ["(())", "()()"]
		 * 
		 * Input: n = 1 Output: ["()"]
		 * 
		 */

		for (int i = 0; i < n; i++) {
			System.out.print("(");
			GenerateNParentheses(i);
			System.out.print(")");
		}

	}

	/*** KP : Brute Force ***/

	/*** KP : Back Tracking ***/
	public static List<String> generateParenthesisBackTracking(int n) {
		List<String> ans = new ArrayList();
		backtrack(ans, "", 0, 0, n);
		return ans;
	}

	public static void backtrack(List<String> ans, String cur, int open, int close, int max) {
		if (cur.length() == max * 2) {
			ans.add(cur);
			return;
		}

		if (open < max)
			backtrack(ans, cur + "(", open + 1, close, max);
		if (close < open)
			backtrack(ans, cur + ")", open, close + 1, max);
	}

	/*** KP : Back Tracking ***/

	/*** KP : Closure Number ***/
	public static List<String> generateParenthesisClosureNumber(int n) {
		List<String> ans = new ArrayList();
		if (n == 0) {
			ans.add("");
		} else {
			for (int c = 0; c < n; ++c)
				for (String left : generateParenthesisClosureNumber(c))
					for (String right : generateParenthesis(n - 1 - c))
						ans.add("(" + left + ")" + right);
		}
		return ans;
	}
	/*** KP : Closure Number ***/

	/// ************************************Java MasterCard Interview Test
	/// *****************************************///

}
