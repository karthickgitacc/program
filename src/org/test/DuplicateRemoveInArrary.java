package org.test;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateRemoveInArrary {

	public static void main(String[] args) {
		int[] a = { 10, 20, 50, 50, 20, 80, 90, 40, 80, 70 };
		/*
		 * int b=0; for (int i = 0; i < a.length; i++) { b=a[i];
		 * 
		 * if (a[i] == b) { System.out.println(a[i]); }
		 */
		Set<Object> s = new LinkedHashSet<>();

//		Arrays.sort(a);
//		System.out.println(Arrays.toString(a));
		s.add(a);
		for (Object c : s) {
			
		}
		
		

	}

}
