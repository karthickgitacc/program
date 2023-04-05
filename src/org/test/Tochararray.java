package org.test;

public class Tochararray {
	public static void main(String[]args) {
		String word="turkey";
		char[]letters=word.toCharArray();
		for(int i=letters.length-1;i>=0;i--) {
			System.out.println(letters[i]);
		}
	}

}
