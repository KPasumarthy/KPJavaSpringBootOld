package com.kpjavaspringboot;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class KPJavaInterview {

	public static void main(String[] args) {

		// KP : Debug Print
		System.out.println("KP : KPJavaInterview -  com.kpjavaspringboot : main()");
		
		//KP : Smallest Integer
		//SmallestIntegerInterviewTest();
		
		//KP : Interview Test 
		

	}

	
	
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
		for (int a : A) {
			if (set.add(a) == false) {
				// // your duplicate element
				System.out.printf("\t Duplicate Value of 'a' : %d \n", a);
				dup.add(a);
			}

			System.out.printf("\t Value of 'a' : %d \n", a);

		}

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

	/************************************
	 * Java 8 : Arrays - Duplicates & Smallest Integers Solution
	 *****************************************/

}
