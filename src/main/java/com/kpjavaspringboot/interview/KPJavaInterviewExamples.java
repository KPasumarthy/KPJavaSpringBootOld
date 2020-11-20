package com.kpjavaspringboot.interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//import com.kpjavaspringboot.KPJavaSpringBootApplication.NestedStaticClass;

public class KPJavaInterviewExamples {

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
	}

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

		/// KP : Get Duplicates Array
		// int[] dup = getDuplicateInteger(A);
		// System.out.println("KP : KPJavaInterview - com.kpjavaspringboot : Duplicate
		/// Positive Integer : " + dup);

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

				// System.out.printf("\t (1) Value of 'a' : %d, 'j' : %d \n", a, j);

				if (a > j) {

					return j;
				} else {
					if (a == A[A.length - 1]) {
						j++;
						// System.out.printf("\t (2) Value of 'a' : %d, 'j' : %d \n", a, j);
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

}
