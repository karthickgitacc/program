package org.test;

public class StringPrograms {
	public static void main(String[] args) {
		String[] a = "Welcome to java".split(" ");
		for (String string : a) {
			if (string.equals("to")) {
				for (int i = string.length() - 1; i > 0; i--) {
					System.out.println();
				}
			} 
			else {
				System.out.println(string);
			}
		}
	}
}
