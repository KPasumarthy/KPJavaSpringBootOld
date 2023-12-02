package com.kpjavaspringboot.interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class KPTest {

	public KPTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// What Does the 'method(null)' print
		method(null);

		// Eliminate Repetitions
		// int A[] = { 3, 2, 3, 2, 3, 2, 5, 7, 3, 2 };
		int[] A = { -7, -11, -3, 1, 3, 0, 0, 0, 9, 7, 8, 6, 4, 1, 2, 2, -100, 90, 98, 625, -7, -11, 625 };
		getUniqueElements(A);
		getDuplicateInteger(A);
		getUniqueNonDuplicateArray(A);

		// Smallest Positive Integer
		int small = getSmallestPositiveInteger(A);
		System.out.println("\t The Smallest Positive Integer Elements : " + small);

		// Get Sum Of Unique Non-Repetitive Elements
		int sumUnqElem = getSumOfUniqueElements(A);
		System.out.println("\t The Sum of Non-Duplicate & Non-Repetitive Unique Elements : " + sumUnqElem);
		

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
				//System.out.printf("HM : a=%d, i=%d \n", a, i);
			} else {
				i = (int) hm.get(a);
				hm.put(a, ++i);
				//System.out.printf("HM : a=%d, i=%d \n", a, i);
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
			//System.out.println( "The HashMapElement : Key =  " + mapElement.getKey() + " Value = " + mapElement.getValue());

			if (value == 1) {
				
				hsUnq.add(mapElement.getKey());
				sumUnqElem += (int)mapElement.getKey();
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
	
	public static void method(Object o) {
		System.out.println("\t Object method");
	}

	public static void method(String s) {
		System.out.println("\t String method");
	}

}
