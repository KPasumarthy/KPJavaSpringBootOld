package com.kpjavaspringboot.interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class KPMRTest {

	public KPMRTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//What Does the 'method(null)' print
		 method(null);
		
		// Eliminate Repetitions
		int A[] = { 3, 2, 3, 2, 3, 2, 5, 7, 3, 2 };
		getUniqueElements(A);
		//int sumUnqElem = getUniqueElements(A);
		//System.out.println("The Sum of Non-Duplicate & Non-Repetitive Unique Elements : " + sumUnqElem);

	}

	////public static int getUniqueElements(int[] A) {
	public static void getUniqueElements(int[] A) {
		// Trial : 1 - Ramani.Mukesh@gmail.com
		System.out.println("KP : Java Interview Test");

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
		System.out.println("The Input Array : " + Arrays.toString(A));
		Arrays.sort(A);
		System.out.println("The Input Array : " + Arrays.toString(A));
		System.out.println("The HashMap : " + hm);

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

		System.out.println("Unique HashMap : " + hm);
		System.out.println("\t HashSet: " + hs);
		System.out.println("\t Non-Duplicate Unique HashSet : " + hsUnq);
		System.out.println("\t Duplicate & Repetitive HashSet : " + hsRep);
		System.out.println("\t Sum of Non-Duplicate & Non-Repetitive Unique Elements : " + sumUnqElem);

		
		//// Creating an Integer Array of Repetitive (or) Duplicate Elements
		int[] dupArr = new int[hsRep.size()];
		i = 0;
		for (Object a :  hsRep) {
			dupArr[i++] = (int) a;
		}		
		System.out.println("Array - Repetitive-Duplicate Elements : " + Arrays.toString(dupArr));
		
		
		//// Creating an Integer Array of Non-Repetitive Elements
		int[] unqArr = new int[hsUnq.size()];
		i = 0;
		for (Object a :  hsUnq) {
			unqArr[i++] = (int) a;
		}		
		System.out.println("Array - Non-Duplicate Unique Elements : " + Arrays.toString(unqArr));
		

	}

	public static void method(Object o) {
		System.out.println("Object method");
	}

	public static void method(String s) {
		System.out.println("String method");
	}

}
