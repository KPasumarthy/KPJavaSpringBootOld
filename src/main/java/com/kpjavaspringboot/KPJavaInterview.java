package com.kpjavaspringboot;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class KPJavaInterview {

	public static void main(String[] args) {

		// KP : Debug Print
		System.out.println("KP : KPJavaInterview -  com.kpjavaspringboot : main()");
		
		// KP : SmallestIntegerInterviewTest
		SmallestIntegerInterviewTest();

		//KP : addDigits
		addDigits(827359);
	}

	
	/*******************************************
	 * Java 8 : Add Digits in an Integer Number
	 *******************************************/
	
	public static int numberOfDigits(int num) {
		///KP : Count Number of Digits in an Number Operator - - Algorithm To Extract Individual Digits
	    int count = 0;
	    //num = 3452;
	
	    while(num != 0)
	    {
	        // num = num/10
	        num /= 10;
	        ++count;
	    }
 	    return count;
	}
		
	public static int addDigits(int num) {
	    
		int rem, sum = 0;
        while (num != 0) {
           	           	
    	    rem = num%10;   //KP : 'rem' is the Remainder after the 'num' Modulus Operation. 
    	    
    	    //Sum = sum + rem;
    	    sum += rem;
    	    System.out.printf("KP : KPJavaInterview - addDigits() - num : '%d', sum : '%d',  Individual Digits 'rem' : '%d' \n", num, sum, rem);
    	    
    	    //num = num /10;
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

	
	/***
	 * 
	 * 		//KP : Smallest Integer
		//SmallestIntegerInterviewTest();
		
		//KP : Interview Test : https://app.codility.com/c/run/demoPXAFZU-G2Y/
		//String S = "ab";
		//int[] C = {1,3};
		
		//KP : Return : 2
		String S = "abccbd";
		int[] C = {0,1,2,3,4,5};
		
		////KP : Return : 3
		//String S = "aabbcc";
		//int[] C = {1,2,1,2,1,2};
		
		////KP : Return : 3+4+5 = 12
		//String S = "aaaa";
		//int[] C = {3,4,5,6};
		
		////KP : Return : 0
		//String S = "ababa";
		//int[] C = {10,5,10,5,10};
				
		//Input String S
		String[] arrS = S.split("");
		
		// KP : Find Duplicate
		Set<String> setIn = new HashSet<String>();
		Set<Integer> set = new HashSet<Integer>();
		Set<Integer> dup = new HashSet<Integer>();
				
		String f = "";
		int i = 0;
		int del = 0;
		for (String s : arrS) {
		
			//KP : Init 
			if (f == "") {
				f = s;
			}
			
			if ( f == s) {
				del = i;
			}
			else {
				f = "";
			}
			
			//if (setIn.add(s) == false) {
				// // your duplicate element
			//	System.out.printf("\t Duplicate Value of 'a' : %d \n", a);
			//	dup.add(a);
			//}

			System.out.printf("\t Value of 'i' : %d, 'del' : %d, 's' : %s, 'f' : %s \n", i, del, s, f);
			i++;

		}
	 * 
	 */
	
	
	/*
	 * 
	 * 		
	public static int addTwoDigits(int num) {
	    
		///KP : Mod Operator - Extract Individual Digits : Steps
		//int u = num%10;
		int u =  ( ( ( num - 0  ) / 1) %10 );	
        int t =	 ( ( ( num - u  ) / 10) % 10 ) % 10;						
	    int h =  ( ( ( num - t  ) / 100) % 100 ) % 10;	
	    int th = ( ( ( num - h  ) / 1000) % 1000 ) % 10;					
	    int tt = ( ( ( num - th ) / 10000) % 10000 ) % 10;		
	    int m =  ( ( ( num - tt ) / 100000) % 100000 ) % 10;		
	    
		// KP : Debug Print
		System.out.printf("KP : KPJavaInterview - addTwoDigits() - num : '%d', u : '%d, t : '%d', h : '%d', th : %d,  tt : %d, m : %d \n", num, u, t, h, th, tt, m);
	 		
		
		///KP : Mod Operator - - Algorithm To Extract Individual Digits
		int tmp =  ( ( ( num - 0  ) / 1) ) %10;
        int count = 0;
        int n = num;
        int r = 0;

        while (n != 0) {
           	    
        	
	        //tmp = num;
	        // num = num/10;
    	    r = n%10;    	    
    	    System.out.printf("KP : KPJavaInterview - addTwoDigits() - n : '%d', r : '%d', num : '%d', count : '%d',  Individual Digits 'tmp' : '%d' \n", n, r, num, count, tmp);
    	    
	        n /= 10;	           	   
    	    ++count;
        }
        
        
		int sum = 0;
	    return sum;
	}
	 * 
	 * */
	
		
}
