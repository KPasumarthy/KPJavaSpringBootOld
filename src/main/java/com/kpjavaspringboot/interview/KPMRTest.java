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
		// Eliminate Repetitions
		int A[] = { 3, 2, 3, 2, 3, 2, 5, 7, 3, 2 };
		getUniqueElements(A);

	}

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
				System.out.printf("HM : a=%d, i=%d \n", a, i);
			} else {
				i = (int) hm.get(a);
				hm.put(a, ++i);
				System.out.printf("HM : a=%d, i=%d \n", a, i);
			}

			// i = 0;

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
		Iterator hmIterator = hm.entrySet().iterator();
		HashSet hsUnq = new HashSet();
		HashSet hsRep = new HashSet();
		// Iterate through the hashmap
		while (hmIterator.hasNext()) {
			Map.Entry mapElement = (Map.Entry) hmIterator.next();
			int value = ((int) mapElement.getValue());
			System.out.println(
					"The HashMapElement : Key =  " + mapElement.getKey() + " Value = " + mapElement.getValue());

			if (value == 1) {
				hsUnq.add(mapElement.getKey());
			} else {
				hsRep.add(mapElement.getKey());
			}
		}

		System.out.println("The Unique HashMap : " + hm);
		System.out.println("The Non-Duplicate Unique HashSet : " + hsUnq);
		System.out.println("The Duplicate & Repetitive HashSet : " + hsRep);

		System.out.println("The HashSet: " + hs);
		//System.out.println(hs.toArray().toString());
		// Trial : 1 - Ramani.Mukesh@gmail.com

		/*
		 * ///Hash Sets of Duplicates and Non-Duplicate HashSet set = new HashSet();
		 * Set<Integer> dup = new HashSet<Integer>(); Set<Integer> noDup = new
		 * HashSet<Integer>(); for (int a : A) { if (set.add(a) == false) { // // your
		 * duplicate element System.out.printf("\t Duplicate Value of 'a' : %d \n", a);
		 * dup.add(a); } else { System.out.printf("\t Unique : Value of 'a' : %d \n",
		 * a); noDup.add(a); } }
		 * 
		 * System.out.println("The Duplicate HashSet: " + dup);
		 * System.out.println("The Non-Duplicate HashSet: " + noDup);
		 */
		
		// Creating the array and using toArray() 
        //Integer[] arr = (Integer[]) hsUnq.toArray();
		
	}

}
